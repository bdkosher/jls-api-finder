package org.washcom.jlsapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/**
 * This class finds all of the types that are directly mentioned in the Java
 * Language specification or are associated with those types (e.g. method
 * argument types, return types, field types, interface types, etc.)
 *
 * <blockquote>
 * As noted above, this specification often refers to classes of the Java SE
 * platform API. In particular, some classes have a special relationship with
 * the Java programming language. Examples include classes such as Object,
 * Class, ClassLoader, String, Thread, and the classes and interfaces in package
 * java.lang.reflect, among others. This specification constrains the behavior
 * of such classes and interfaces, but does not provide a complete specification
 * for them. The reader is referred to the Java SE platform API documentation.
 * </blockquote>
 *
 * @author bdkosher
 */
public class Finder {

    /**
     * This list contains everything we read from the Java Language
     * specification deemed as "special". Although these special classes aren't
     * explicitly enumerated, we can
     */
    static final List<String> specialTypeNames = new ArrayList<String>() {
        {
            add("java.lang.Object");
            add("java.lang.String");
            add("java.lang.Throwable");
            add("java.lang.Error");
            add("java.lang.Exception");
            add("java.lang.RuntimeException");
            add("java.lang.Class");
            add("java.lang.ClassLoader");
            add("java.lang.System");
            add("java.lang.reflect.AnnotatedElement");
            add("java.lang.reflect.GenericArrayType");
            add("java.lang.reflect.GenericDeclaration");
            add("java.lang.reflect.InvocationHandler");
            add("java.lang.reflect.Member");
            add("java.lang.reflect.ParameterizedType");
            add("java.lang.reflect.TypeVariable");
            add("java.lang.reflect.WildcardType");
            add("java.lang.reflect.Array");
            add("java.lang.reflect.Method");
            add("java.lang.reflect.Modifier");
            add("java.lang.reflect.Proxy");
            add("java.lang.reflect.ReflectPermission");
            add("java.lang.reflect.Field");
            add("java.lang.reflect.Type");
            add("java.io.Serializable");
            add("java.lang.Character");
            add("java.lang.Float");
            add("java.lang.Double");
            add("java.lang.Byte");
            add("java.lang.Short");
            add("java.lang.Integer");
            add("java.lang.Long");
            add("java.lang.Math");
            add("java.lang.ArithmeticException");
            add("java.lang.NullPointerException");
            add("java.lang.OutOfMemoryError");
            add("java.lang.IncompatibleClassChangeError");
            add("java.lang.Cloneable");
            add("java.lang.Iterable");
            add("java.lang.ArrayStoreException");
            add("java.lang.annotation.Annotation");
            add("java.lang.annotation.Target");
            add("java.lang.annotation.ElementType");
            add("java.lang.ClassCircularityError");
            
            // Classes listed in Examples
            add("java.util.Vector");
            add("java.util.Collection");
            add("java.lang.ref.Reference");
            add("java.lang.ref.ReferenceQueue");
            add("java.util.Random");
            add("java.util.ArrayList");
            add("java.lang.Comparable");
        }
    };

    static final Set<Class<?>> specialTypes = new TreeSet<>(new Comparator<Class<?>>() {

        @Override
        public int compare(Class<?> o1, Class<?> o2) {
            return o1.getName().compareTo(o2.getName());
        }

    });

    static boolean isPackageName(String special) {
        return special.endsWith("*");
    }

    static void analyzeTypeName(String typeName) {
        try {
            analyzeType(Class.forName(typeName));
        } catch (ClassNotFoundException ex) {
            System.err.println("Could not find class " + typeName);
        }
    }

    static void analyzeTypes(Class<?>[] types) {
        for (Class<?> type : types) {
            analyzeType(type);
        }
    }

    static void analyzeType(Class<?> type) {
        if (type == null || type.isPrimitive() || type.isAnonymousClass()) {
            return;
        } else if (type.isArray()) {
            analyzeType(type.getComponentType());
            return;
        }
        
        if (specialTypes.contains(type)) {
            return;
        }
        specialTypes.add(type);

        analyzeTypes(type.getDeclaredClasses());
        for (Field field : type.getFields()) {
            analyzeType(field.getType());
        }
        for (Method method : type.getMethods()) {
            analyzeType(method.getReturnType());
            analyzeTypes(method.getParameterTypes());
            analyzeTypes(method.getExceptionTypes());
        }
        for (Constructor constructor : type.getConstructors()) {
            analyzeTypes(constructor.getParameterTypes());
            analyzeTypes(constructor.getExceptionTypes());
        }
    }

    public static void main(String... args) {
        for (String special : specialTypeNames) {
            analyzeTypeName(special);
        }
        for (Class<?> type : specialTypes) {
            String delim = type.isInterface() ? "_" : "";
            System.out.println("* " + delim + type.getName() + delim);
        }
        System.out.println(specialTypes.size() + " types in total.");
    }

}
