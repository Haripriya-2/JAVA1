import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Switch:
        //It is used to jump into various cases based on the expression.

        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;//used to exit the loop
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Enter valid input");
        }

        //pgm to print result based on the given operator.
        System.out.println("Enter a val: ");
        int a = in.nextInt();
        System.out.println("Enter b val: ");
        int b = in.nextInt();
        System.out.println("Enter operator: ");
        String  operator = in.next();

        switch(operator) {
            case "+":
                System.out.println("result= " + (a + b));
                break;

            case "-":
                System.out.println("result= "+ (a-b));
                break;

            case "*":
                System.out.println("result= " + (a*b));
                break;

            case "/":
                System.out.println("result= " + (a/b));
                break;
            default:
                System.out.println("Invalid operator entered");
        }
        //Nested switch:
        //switch case inside a switch case
        int empId=in.nextInt();
        String dept=in.next();

        switch (empId){
            case 1:
                System.out.println("Priya");
                switch(dept){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "HR":
                        System.out.println("HR department");
                }
                break;
            default:
                System.out.println("Enter valid val");
        }


    }
}