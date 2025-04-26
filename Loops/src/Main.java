import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //loops: loops are used to repeat a block of code multiple times.
        //for loop:Repeats a block of code a specific number of times.

        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello.. Count: " + i);
        }

        for (int i=5;i>=1;i--){
            System.out.println(i);
        }

        for (int i = 1; i <= 4; i++) {//outer loop for rows
            // Inner loop controls the columns
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();//for moving to next line after inner loop
        }

        //while loop
        //used when we dont know no.of iterations.

        Scanner in =new Scanner(System.in);
        int w=in.nextInt();
        while(w<=4){
            System.out.println("w value "+w);
            w++;
        }
        System.out.println("..............");

       int b = in.nextInt();
        while (b >= 1) {
            System.out.println("b value " + b);
            b--;
        }

        int i = 1;
        while (i <= 3) { // Outer while loop for rows
            int j = 1;
            while (j <= 4) { // Inner while loop for columns
                System.out.print(j + " ");
                j++;
            }
            System.out.println(); // Move to next line after loop
            i++;
        }

        //do-while loop:
        // The code inside do will run at least once,
        // even if the condition is false at starting only.
        // So first it executes, then it checks the condition.
        int p = 6;
        do {
            System.out.println("Value of p: " + p);
            p++;
        } while (p<= 5);
    }

}
