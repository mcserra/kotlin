// FILE: A.java
public enum A {
    ENTRY,
    ANOTHER;
    
    public String s() {
        return "";
    }
}

// FILE: test.kt

package vvv

fun main() {
    val c = A.ENTRY
    c.s()
}
