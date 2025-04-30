//public class Main {
//    //Scoping in java
//    //Class Scope:can be accessiable anywhere inside cls.
//    String classLevelVar ="Priya";
//    int x=20;//shadowed by meth scope var.
//    public static void main(String[] args) {
//        //System.out.println(s);//CE:Cant access outside method.
//        // can be accessible only inside same  method
//        new Main().display();
//        int a=10;
//        int b=20;
//        shadowing();
//        methodScope();
//
//        //Block Scope:can be acccessible inside block only.
//        {
//            //int a=20; CE:Already defined outside block in same meth.
//            a=20;//reassigns the original val
//            System.out.println("a:"+a);//20
//            int c=30;
//        }
//        System.out.println("a:" +a);//20
//        //System.out.println(c); CE:cant access outside block
//
//        //Scoping in for loop:can be accessiable inside oop only.
//        for(int i=0;i<4;i++){
//            System.out.println("i:"+i);
//            //int a=50;CE:Already defined
//            a=40;
//        }
//        //System.out.println(i);//CE:cant access it outside the loop
//        System.out.println(a);
//
//
//    }
//    //Shadowing:
//    static void shadowing(){
//        int x=30;//shadows cls level var x
//        System.out.println("x: "+x);
//    }
//
//    //cls level
//    void display() {
//        System.out.println(classLevelVar); // accessible
//    }
//
//    // Method Scope:can be accessible inside method only.
//    static void methodScope(){
//        int s=20;
//        System.out.println("s: "+s);
//    }
//
//}