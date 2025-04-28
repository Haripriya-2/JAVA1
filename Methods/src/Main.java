public class Main {
    //Methods
    //A method is a block of code which only runs when it is called.
    //Non-parameterized method:
    //we use this when we dont want to pass any input.
    static  void greet() {
        System.out.println("Hii priya");
    }
    //parameterized method
    //In this input is passed to perform operations.

    static void greetings(String name){
        System.out.println("Hello "+ name);
    }

    //void methods:
    // //we use this when we dont want to ret any val
    void sum(int a,int b){
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        int sum=a+b;
        System.out.println("sum: "+ sum);
    }

    //Returning methods:
    //We use this if we want to ret a val.
    int difference(int s,int t){
        System.out.println("a: "+ s);
        System.out.println("b: "+ t);
        int difference=s-t;
        //System.out.println("difference: "+ difference);
        return difference;
    }

    int meth1(int c,int d){
        System.out.println("c: "+c);
        System.out.println("d: " +d);
        return 100;
    }

    String meth2(String s){
        System.out.println("s: "+s);
        int h=new Main().meth1(10,40);
        System.out.println("h:"+h);
        return "Hello";
    }

    public static void main(String[] args) {
        //calling method
        greet();
        greetings("Priya");
        greetings("Zoya");
        //creating an obj
        Main obj=new Main();
        //calling method with the help of obj ref
        obj.sum(10,20);
        new Main().difference(20,5);
        //printing the val that is ret from the method
        System.out.println("difference: "+obj.difference(20,10));
        System.out.println(obj.meth2("Priya"));

    }
}