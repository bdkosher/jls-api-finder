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

## The Results (so far, slightly cleaned up)

class java.nio.file.AccessMode;
class java.nio.file.CopyOption;
class java.nio.file.LinkOption;
class java.nio.file.OpenOption;
class java.nio.file.WatchEvent$Kind;
class java.nio.file.WatchEvent$Modifier;
class java.nio.file.attribute.FileAttribute;
class java.security.CodeSigner;
class java.security.Principal;
class java.security.cert.Certificate;
class java.io.Console
class java.io.Console$LineReader
class java.io.File
class java.io.File$TempDirectory
class java.io.FileDescriptor
class java.io.FileNotFoundException
class java.io.IOException
class java.io.InputStream
class java.io.OutputStream
class java.io.PrintStream
class java.io.PrintWriter
class java.io.Reader
class java.io.SyncFailedException
class java.io.UnsupportedEncodingException
class java.io.Writer
class java.lang.AbstractStringBuilder
class java.lang.ArithmeticException
class java.lang.ArrayIndexOutOfBoundsException
class java.lang.ArrayStoreException
class java.lang.Byte
class java.lang.Byte$ByteCache
class java.lang.Character
class java.lang.Character$CharacterCache
class java.lang.Character$Subset
class java.lang.Character$UnicodeBlock
class java.lang.Character$UnicodeScript
class java.lang.Class
class java.lang.Class$EnclosingMethodInfo
class java.lang.Class$MethodArray
class java.lang.ClassCircularityError
class java.lang.ClassLoader
class java.lang.ClassLoader$NativeLibrary
class java.lang.ClassLoader$ParallelLoaders
class java.lang.ClassNotFoundException
class java.lang.Double
class java.lang.Enum
class java.lang.Error
class java.lang.Exception
class java.lang.Float
class java.lang.IllegalAccessException
class java.lang.IllegalArgumentException
class java.lang.InstantiationException
class java.lang.Integer
class java.lang.Integer$IntegerCache
class java.lang.InterruptedException
class java.lang.Long
class java.lang.Long$LongCache
class java.lang.NegativeArraySizeException
class java.lang.NoSuchFieldException
class java.lang.NoSuchMethodException
class java.lang.NullPointerException
class java.lang.NumberFormatException
class java.lang.Object
class java.lang.OutOfMemoryError
class java.lang.Package
class java.lang.RuntimeException
class java.lang.SecurityException
class java.lang.SecurityManager
class java.lang.Short
class java.lang.Short$ShortCache
class java.lang.StackTraceElement
class java.lang.String
class java.lang.String$1
class java.lang.String$CaseInsensitiveComparator
class java.lang.StringBuffer
class java.lang.StringBuilder
class java.lang.System
class java.lang.Thread
class java.lang.Thread$Caches
class java.lang.Thread$State
class java.lang.Thread$WeakClassKey
class java.lang.ThreadGroup
class java.lang.Throwable
class java.lang.Throwable$1
class java.lang.Throwable$PrintStreamOrWriter
class java.lang.Throwable$SentinelHolder
class java.lang.Throwable$WrappedPrintStream
class java.lang.Throwable$WrappedPrintWriter
class java.lang.annotation.ElementType
class java.lang.ref.Reference
class java.lang.ref.Reference$1
class java.lang.ref.Reference$Lock
class java.lang.ref.Reference$ReferenceHandler
class java.lang.ref.ReferenceQueue
class java.lang.ref.ReferenceQueue$1
class java.lang.ref.ReferenceQueue$Lock
class java.lang.ref.ReferenceQueue$Null
class java.lang.reflect.Array
class java.lang.reflect.Constructor
class java.lang.reflect.Field
class java.lang.reflect.InvocationTargetException
class java.lang.reflect.Method
class java.lang.reflect.Modifier
class java.lang.reflect.Proxy
class java.net.ContentHandler
class java.net.InetAddress
class java.net.InetAddress$Cache
class java.net.InetAddress$Cache$Type
class java.net.InetAddress$CacheEntry
class java.net.MalformedURLException
class java.net.NetworkInterface
class java.net.Proxy
class java.net.Proxy$Type
class java.net.SocketAddress
class java.net.SocketException
class java.net.URI
class java.net.URI$Parser
class java.net.URISyntaxException
class java.net.URL
class java.net.URLConnection
class java.net.URLStreamHandler
class java.net.UnknownHostException
class java.nio.Buffer
class java.nio.ByteBuffer
class java.nio.ByteOrder
class java.nio.CharBuffer
class java.nio.DoubleBuffer
class java.nio.FloatBuffer
class java.nio.IntBuffer
class java.nio.LongBuffer
class java.nio.MappedByteBuffer
class java.nio.ShortBuffer
class java.nio.channels.AsynchronousFileChannel
class java.nio.channels.FileChannel
class java.nio.channels.FileChannel$MapMode
class java.nio.channels.FileLock
class java.nio.charset.CharacterCodingException
class java.nio.charset.Charset
class java.nio.charset.CharsetDecoder
class java.nio.charset.CharsetEncoder
class java.nio.charset.CoderResult
class java.nio.charset.CoderResult$Cache
class java.nio.charset.CodingErrorAction
class java.nio.file.FileStore
class java.nio.file.FileSystem
class java.nio.file.attribute.FileTime
class java.nio.file.attribute.FileTime$1
class java.nio.file.attribute.FileTime$DaysAndNanos
class java.nio.file.attribute.UserPrincipalLookupService
class java.nio.file.spi.FileSystemProvider
class java.security.CodeSource
class java.security.Permission
class java.security.PermissionCollection
class java.security.ProtectionDomain
class java.security.ProtectionDomain$Key
class java.util.ArrayList
class java.util.ArrayList$1
class java.util.ArrayList$Itr
class java.util.ArrayList$ListItr
class java.util.ArrayList$SubList
class java.util.InvalidPropertiesFormatException
class java.util.Locale
class java.util.Locale$1
class java.util.Locale$Builder
class java.util.Locale$Cache
class java.util.Locale$Category
class java.util.Locale$LocaleKey
class java.util.Locale$LocaleNameGetter
class java.util.MissingResourceException
class java.util.Properties
class java.util.Properties$LineReader
class java.util.Random
class java.util.Vector
class java.util.Vector$Itr
class java.util.Vector$ListItr
class java.util.concurrent.ExecutionException
class java.util.concurrent.TimeUnit
class java.util.concurrent.TimeoutException
class java.util.spi.LocaleNameProvider
interface java.io.FileFilter
interface java.io.FilenameFilter
interface java.io.Serializable
interface java.lang.Appendable
interface java.lang.CharSequence
interface java.lang.Cloneable
interface java.lang.Comparable
interface java.lang.Iterable
interface java.lang.Runnable
interface java.lang.Thread$UncaughtExceptionHandler
interface java.lang.annotation.Annotation
interface java.lang.annotation.Target
interface java.lang.reflect.AnnotatedElement
interface java.lang.reflect.GenericArrayType
interface java.lang.reflect.GenericDeclaration
interface java.lang.reflect.InvocationHandler
interface java.lang.reflect.Member
interface java.lang.reflect.ParameterizedType
interface java.lang.reflect.Type
interface java.lang.reflect.TypeVariable
interface java.lang.reflect.WildcardType
interface java.net.ContentHandlerFactory
interface java.net.FileNameMap
interface java.net.URLStreamHandlerFactory
interface java.nio.channels.Channel
interface java.nio.channels.CompletionHandler
interface java.nio.channels.ReadableByteChannel
interface java.nio.channels.SeekableByteChannel
interface java.nio.channels.WritableByteChannel
interface java.nio.file.DirectoryStream
interface java.nio.file.DirectoryStream$Filter
interface java.nio.file.Path
interface java.nio.file.PathMatcher
interface java.nio.file.WatchKey
interface java.nio.file.WatchService
interface java.nio.file.Watchable
interface java.nio.file.attribute.BasicFileAttributes
interface java.nio.file.attribute.FileAttributeView
interface java.nio.file.attribute.FileStoreAttributeView
interface java.nio.file.attribute.GroupPrincipal
interface java.nio.file.attribute.UserPrincipal
interface java.util.Collection
interface java.util.Comparator
interface java.util.Enumeration
interface java.util.Iterator
interface java.util.List
interface java.util.ListIterator
interface java.util.Map
interface java.util.Map$Entry
interface java.util.Set
interface java.util.SortedMap
interface java.util.concurrent.Callable
interface java.util.concurrent.ExecutorService
interface java.util.concurrent.Future
