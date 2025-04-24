import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //selection stmnts
        //These allow us to control flow of pgm execution based on condition.
        //if statement:
        //The if statement checks a condition. If it's true, the  code inside if runs.
        // If it's false, it won't run.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=in.nextInt();
        if(age>=22){
            System.out.println("u can vote");
        }

        System.out.println("Enter num: ");
        int num=in.nextInt();
        if(num<=5)
            System.out.println(num);

        //if else stmnt:
        //In this if the condition is true, the if block runs.
        // and if it's false, then else block runs.

        if(age>=18){
            System.out.println("u can apply for driving license");
        }else{
            System.out.println("u can't apply for driving license");
        }

        System.out.println("Enter num1: ");
        int num1=in.nextInt();
        if(num1%2==0)
            System.out.println("Even number");
        else
            System.out.println("odd number");

        //if-else-if:
       //It is Used when we have multiple conditions to check in sequence.

        System.out.println("Enter i2: ");
        int i2=in.nextInt();
        if(i2>0){
            System.out.println(i2 +" is positive num");
        }else if(i2<0){
            System.out.println(i2+" is negative num");
        }else{
            System.out.println(i2 +" is zero");
        }

        //pgm to print grades based on given marks.
        System.out.println("Enter marks: ");
        int marks =in.nextInt();
        if (marks >= 90) {
            System.out.println(" Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        System.out.println("End of pgm");
    }
}