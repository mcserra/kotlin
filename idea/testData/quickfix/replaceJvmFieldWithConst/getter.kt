// "Replace '@JvmField' with 'const'" "false"
// WITH_RUNTIME
// ERROR: This annotation is not applicable to target 'top level property without backing field or delegate'
// ACTION: Make internal
// ACTION: Make private
// ACTION: Remove explicit type specification
<caret>@JvmField val number: Int
    get() = 42