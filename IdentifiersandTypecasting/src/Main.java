public class Main {
    public static void main(String[] args) {
        //Variables
        //A variable is a container that holds a value.
        int age = 23;
        String name = "Haripriya";
        float marks = 87.5f;
        boolean isPassed = true;
        System.out.println(age);
        System.out.println(name);
        System.out.println(marks);

        //Identifiers
        //Identifiers are the names used to identify
        //variables, methods, classes and objects in Java.

        int num = 20;             // "num" is an identifier
        String fname = "Priya";   // "fname"is an identifier
        class Student { }// "Student" is an identifier
        //String 1name="Priya"; Error bcz we cant start an identifier with a num.
        int num4= 22;
        char $ch= 's';
        //char &ch='p'; Error bcz we cant use any special char except $ and _ in identifier.
        //String full name="Priya"; Error bcz Spaces are not allowed



        //Type Casting
        //It is a process of converting one DT to another DT.
        //Implicit Type casting
        // Done by Java compiler automatically.
        char c='a';
        int b=c; //char -> int
        System.out.println("c: " + c);//a
        System.out.println("b: " + b);//97

        int a = 10;
        double d = a;  // int -> double
        System.out.println("a: "+ a); //10
        System.out.println("d: "+ d); // 10.0

        //Explicit Type casting
        //Done by the programmer Explicitely
        double p = 10.99;
        int q= (int) a; // double -> int
        System.out.println("p: "+ p);
        System.out.println("q: "+q); //10

        int i=500;
        byte b1=(byte)i;
        System.out.println("i: "+i);//500
        System.out.println("b1: "+b1);//-12
    }
}
