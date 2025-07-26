public class Strings {
    public static void main(String[] args) {
        String name = "VYOM";
        String fname = "vyom";

        System.out.println(name==fname);//if they have same literal then they have same string pool reference
        System.out.println(name.charAt(3));
        System.out.println(name.compareToIgnoreCase(fname));

        name = name + " gupta".toUpperCase();
        System.out.println(name);
        //StringBuffer
        StringBuffer name2 = new StringBuffer("VYOM");
        name2.append("Guptaaaaaaaaaaaaaa");
        System.out.println(name2.capacity());
//        Initial Capacity vs Content Length
//        When you create a StringBuilder:
//        javaStringBuilder sb = new StringBuilder("vyom");
//        What actually happens:
//
//        The string "vyom" has length 4
//        But StringBuilder's initial capacity is still 16 (default)
//        The content "vyom" takes up 4 positions in the 16-character array
//
//        Internal array: [v,y,o,m,_,_,_,_,_,_,_,_,_,_,_,_]
//                 ↑             ↑
//        content      unused space
//                length=4     capacity=16
//        The capacity is NOT 20
//        The capacity doesn't become 20 just because you initialize with "vyom". It remains 16 (the default).
//        What happens when you append
//        Case 1: Adding content that fits within capacity 16
//        javaStringBuilder sb = new StringBuilder("vyom");  // length=4, capacity=16
//        sb.append("hello world");  // total length = 4+11=15, still fits!
//        Result: Same internal array, no reallocation needed
//[v,y,o,m,h,e,l,l,o, ,w,o,r,l,d,_]
//        Case 2: Adding content that exceeds capacity 16
//        javaStringBuilder sb = new StringBuilder("vyom");  // length=4, capacity=16
//        sb.append("this is a very long string");      // total would be 4+26=30
//        Since 30 > 16, StringBuilder creates a new, larger array:
//
//        New capacity = (16 + 1) × 2 = 34
//        Copies existing content to new array
//        Adds the new content
//
//        Important Corrections
//
//        It's not about the string pool - StringBuilder doesn't use the string pool at all. It uses heap memory with regular arrays.
//                The threshold is capacity, not 16 specifically - If you had set initial capacity to 50, then it would reallocate when you exceed 50 characters total.
//        It's not a "new position in pool" - It's a completely new character array in heap memory.
//
//        Real Example
//        javaStringBuilder sb = new StringBuilder("vyom");
//        System.out.println("Initial capacity: " + sb.capacity()); // 16
//        System.out.println("Initial length: " + sb.length());     // 4
//
//        sb.append("short");  // total length = 9, fits in capacity 16
//        System.out.println("After short append - capacity: " + sb.capacity()); // still 16
//
//        sb.append("this makes it longer than sixteen characters");
//        System.out.println("After long append - capacity: " + sb.capacity()); // now 34 (or similar)
//        Memory Layout
//        Before exceeding capacity:
//        Heap memory: [v,y,o,m,s,h,o,r,t,_,_,_,_,_,_,_] ← same array
//        After exceeding capacity:
//        Old array: [v,y,o,m,s,h,o,r,t,_,_,_,_,_,_,_] ← becomes garbage
//        New array: [v,y,o,m,s,h,o,r,t,t,h,i,s, ,m,a,k,e,s,...] ← new larger array
//        So the key point is: it's about total content length vs current capacity, not about individual append sizes or the string pool!


    }
}
