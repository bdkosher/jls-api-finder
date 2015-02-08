# Java Language vs. Platform
Where is the dividing line between the [Java Language Specification](http://docs.oracle.com/javase/specs/jls/se7/jls7.pdf) 
and the Java Platform API? As the specification states in section 1.4:

> As noted above, this specification often refers to classes of the Java SE
> platform API. In particular, some classes have a special relationship with
> the Java programming language. Examples include classes such as Object,
> Class, ClassLoader, String, Thread, and the classes and interfaces in package
> java.lang.reflect, among others. This specification constrains the behavior of
> such classes and interfaces, but does not provide a complete specification for them.
> The reader is referred to the Java SE platform API documentation.

This project attempts to draw a line by noting the types directly mentioned in the specification and determining 
the types that they are related to via field, constructor, and method references. The set of direct and indirect
types referenced by the specification can be considered the "core" part of the platform API inextricably tied
to the Java language itself.

## TODO
* Don't differentiate classes and interfaces in output list
* Exclude primitives from output
* Better handling of array types
* Ignore private inner types, especially anonymous ones
* Configurable input list of type names
* Screen scrape the HTML specification to locate directly-referenced types

## The Results (so far)
* java.io.Console
* java.io.Console$LineReader
* java.io.File
* java.io.File$TempDirectory
* java.io.FileDescriptor
* _java.io.FileFilter_
* java.io.FileNotFoundException
* _java.io.FilenameFilter_
* java.io.IOException
* java.io.InputStream
* java.io.OutputStream
* java.io.PrintStream
* java.io.PrintWriter
* java.io.Reader
* _java.io.Serializable_
* java.io.SyncFailedException
* java.io.UnsupportedEncodingException
* java.io.Writer
* java.lang.AbstractStringBuilder
* _java.lang.Appendable_
* java.lang.ArithmeticException
* java.lang.ArrayIndexOutOfBoundsException
* java.lang.ArrayStoreException
* java.lang.Byte
* java.lang.Byte$ByteCache
* _java.lang.CharSequence_
* java.lang.Character
* java.lang.Character$CharacterCache
* java.lang.Character$Subset
* java.lang.Character$UnicodeBlock
* java.lang.Character$UnicodeScript
* java.lang.Class
* java.lang.Class$EnclosingMethodInfo
* java.lang.Class$MethodArray
* java.lang.ClassCircularityError
* java.lang.ClassLoader
* java.lang.ClassLoader$NativeLibrary
* java.lang.ClassLoader$ParallelLoaders
* java.lang.ClassNotFoundException
* _java.lang.Cloneable_
* _java.lang.Comparable_
* java.lang.Double
* java.lang.Enum
* java.lang.Error
* java.lang.Exception
* java.lang.Float
* java.lang.IllegalAccessException
* java.lang.IllegalArgumentException
* java.lang.IncompatibleClassChangeError
* java.lang.InstantiationException
* java.lang.Integer
* java.lang.Integer$IntegerCache
* java.lang.InterruptedException
* _java.lang.Iterable_
* java.lang.Long
* java.lang.Long$LongCache
* java.lang.Math
* java.lang.NegativeArraySizeException
* java.lang.NoSuchFieldException
* java.lang.NoSuchMethodException
* java.lang.NullPointerException
* java.lang.NumberFormatException
* java.lang.Object
* java.lang.OutOfMemoryError
* java.lang.Package
* _java.lang.Runnable_
* java.lang.RuntimeException
* java.lang.SecurityException
* java.lang.SecurityManager
* java.lang.Short
* java.lang.Short$ShortCache
* java.lang.StackTraceElement
* java.lang.String
* java.lang.String$CaseInsensitiveComparator
* java.lang.StringBuffer
* java.lang.StringBuilder
* java.lang.System
* java.lang.Thread
* java.lang.Thread$Caches
* java.lang.Thread$State
* _java.lang.Thread$UncaughtExceptionHandler_
* java.lang.Thread$WeakClassKey
* java.lang.ThreadGroup
* java.lang.Throwable
* java.lang.Throwable$PrintStreamOrWriter
* java.lang.Throwable$SentinelHolder
* java.lang.Throwable$WrappedPrintStream
* java.lang.Throwable$WrappedPrintWriter
* _java.lang.annotation.Annotation_
* java.lang.annotation.ElementType
* _java.lang.annotation.Target_
* java.lang.ref.Reference
* java.lang.ref.Reference$Lock
* java.lang.ref.Reference$ReferenceHandler
* java.lang.ref.ReferenceQueue
* java.lang.ref.ReferenceQueue$Lock
* java.lang.ref.ReferenceQueue$Null
* java.lang.reflect.AccessibleObject
* _java.lang.reflect.AnnotatedElement_
* java.lang.reflect.Array
* java.lang.reflect.Constructor
* java.lang.reflect.Field
* _java.lang.reflect.GenericArrayType_
* _java.lang.reflect.GenericDeclaration_
* _java.lang.reflect.InvocationHandler_
* java.lang.reflect.InvocationTargetException
* _java.lang.reflect.Member_
* java.lang.reflect.Method
* java.lang.reflect.Modifier
* _java.lang.reflect.ParameterizedType_
* java.lang.reflect.Proxy
* java.lang.reflect.ReflectPermission
* _java.lang.reflect.Type_
* _java.lang.reflect.TypeVariable_
* _java.lang.reflect.WildcardType_
* java.net.ContentHandler
* _java.net.ContentHandlerFactory_
* _java.net.FileNameMap_
* java.net.InetAddress
* java.net.InetAddress$Cache
* java.net.InetAddress$Cache$Type
* java.net.InetAddress$CacheEntry
* java.net.MalformedURLException
* java.net.NetworkInterface
* java.net.Proxy
* java.net.Proxy$Type
* java.net.SocketAddress
* java.net.SocketException
* java.net.URI
* java.net.URI$Parser
* java.net.URISyntaxException
* java.net.URL
* java.net.URLConnection
* java.net.URLStreamHandler
* _java.net.URLStreamHandlerFactory_
* java.net.UnknownHostException
* java.nio.Buffer
* java.nio.ByteBuffer
* java.nio.ByteOrder
* java.nio.CharBuffer
* java.nio.DoubleBuffer
* java.nio.FloatBuffer
* java.nio.IntBuffer
* java.nio.LongBuffer
* java.nio.MappedByteBuffer
* java.nio.ShortBuffer
* java.nio.channels.AsynchronousFileChannel
* _java.nio.channels.Channel_
* _java.nio.channels.CompletionHandler_
* java.nio.channels.FileChannel
* java.nio.channels.FileChannel$MapMode
* java.nio.channels.FileLock
* _java.nio.channels.ReadableByteChannel_
* _java.nio.channels.SeekableByteChannel_
* _java.nio.channels.WritableByteChannel_
* java.nio.charset.CharacterCodingException
* java.nio.charset.Charset
* java.nio.charset.CharsetDecoder
* java.nio.charset.CharsetEncoder
* java.nio.charset.CoderResult
* java.nio.charset.CoderResult$Cache
* java.nio.charset.CodingErrorAction
* java.nio.file.AccessMode
* _java.nio.file.CopyOption_
* _java.nio.file.DirectoryStream_
* _java.nio.file.DirectoryStream$Filter_
* java.nio.file.FileStore
* java.nio.file.FileSystem
* java.nio.file.LinkOption
* _java.nio.file.OpenOption_
* _java.nio.file.Path_
* _java.nio.file.PathMatcher_
* _java.nio.file.WatchEvent$Kind_
* _java.nio.file.WatchEvent$Modifier_
* _java.nio.file.WatchKey_
* _java.nio.file.WatchService_
* _java.nio.file.Watchable_
* _java.nio.file.attribute.BasicFileAttributes_
* _java.nio.file.attribute.FileAttribute_
* _java.nio.file.attribute.FileAttributeView_
* _java.nio.file.attribute.FileStoreAttributeView_
* java.nio.file.attribute.FileTime
* java.nio.file.attribute.FileTime$DaysAndNanos
* _java.nio.file.attribute.GroupPrincipal_
* _java.nio.file.attribute.UserPrincipal_
* java.nio.file.attribute.UserPrincipalLookupService
* java.nio.file.spi.FileSystemProvider
* java.security.CodeSigner
* java.security.CodeSource
* java.security.InvalidKeyException
* java.security.NoSuchAlgorithmException
* java.security.NoSuchProviderException
* java.security.Permission
* java.security.PermissionCollection
* _java.security.Principal_
* java.security.ProtectionDomain
* java.security.ProtectionDomain$Key
* _java.security.PublicKey_
* java.security.SignatureException
* java.security.Timestamp
* java.security.cert.CertPath
* java.security.cert.CertPath$CertPathRep
* java.security.cert.Certificate
* java.security.cert.Certificate$CertificateRep
* java.security.cert.CertificateEncodingException
* java.security.cert.CertificateException
* java.util.ArrayList
* java.util.ArrayList$Itr
* java.util.ArrayList$ListItr
* java.util.ArrayList$SubList
* _java.util.Collection_
* _java.util.Comparator_
* java.util.Date
* _java.util.Enumeration_
* java.util.InvalidPropertiesFormatException
* _java.util.Iterator_
* _java.util.List_
* _java.util.ListIterator_
* java.util.Locale
* java.util.Locale$Builder
* java.util.Locale$Cache
* java.util.Locale$Category
* java.util.Locale$LocaleKey
* java.util.Locale$LocaleNameGetter
* _java.util.Map_
* _java.util.Map$Entry_
* java.util.MissingResourceException
* java.util.Properties
* java.util.Properties$LineReader
* java.util.Random
* _java.util.Set_
* _java.util.SortedMap_
* java.util.Vector
* java.util.Vector$Itr
* java.util.Vector$ListItr
* _java.util.concurrent.Callable_
* java.util.concurrent.ExecutionException
* _java.util.concurrent.ExecutorService_
* _java.util.concurrent.Future_
* java.util.concurrent.TimeUnit
* java.util.concurrent.TimeoutException
* java.util.spi.LocaleNameProvider
