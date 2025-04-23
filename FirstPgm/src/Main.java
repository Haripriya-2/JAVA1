public class Main {
    public static void main(String[] args) {
        //Primitive data types in java
        byte byte1 = 100;
        short s= 10000;
        int i = 100000;
        long l = 10000000000L;
        float f = 5.75f;
        double d = 19.99;
        char letter = 'A';
        boolean istrue = true;

        System.out.println("byte: " + byte1);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + istrue);
        System.out.println("-------------");

        //operators in java
        //operators are used to perform operations on variables and values

        // Arithmetic operators
        int p= 10, q=5;
        System.out.println(p+q); // 15
        System.out.println(p-q); // 5
        System.out.println(p*q); // 50
        System.out.println(p/q); // 2
        System.out.println(p%q); // 0
        System.out.println("-------------");

        //Relational operators
        System.out.println(p == q); // false
        System.out.println(p!=q); // true
        System.out.println(p>q);  // true
        System.out.println(p<q);  // false
        System.out.println(p>=q);  // true
        System.out.println(p<=q);  //false
        System.out.println("-------------");

        //Logical operators
        boolean x = true;
        boolean y = false;
        //Logical AND
        System.out.println(x && y); // false
        //Logical OR
        System.out.println(x || y); // true
        //Logical NOT
        System.out.println(!x);     // false
        System.out.println("-------------");

        //Assignment operators
        int h = 10;
        h += 5; // h = h+5
        System.out.println(h);//15
        h-= 5; // h = h-5
        System.out.println(h);//10
        h *= 5; // x = h*5
        System.out.println(h);//50
        h /= 5; // x = h/5
        System.out.println(h);//10
        h %= 5; // x = h%5
        System.out.println(h);//0
        System.out.println("-------------");

        //Unary operators in java
        int a = 5;
        int b = 10;
        // Pre-increment
        System.out.println("++a: " + (++a));

        // Post-increment
        System.out.println("a++: " + (a++));

        // Pre-decrement
        System.out.println("--b: " + (--b));

        // Post-decrement
        System.out.println("b--: " + (b--));
    }
}