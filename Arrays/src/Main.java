import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Arrays in java
        //An array is a collection of data of same data type.
        //It is used to hold multiple values of same type.

        //Declaring Array:
        Scanner in=new Scanner(System.in);
        int[] arr1;
        int arr2[];

        //creating  an array:
        arr1 = new int[5];   // Array of 5 integers.
        System.out.println("default values: " +Arrays.toString(arr1));//[0,0,0,0,0,]

        //Initializing array:
        int[] nums = {10, 20, 30, 40, 50};

        int[] nums2 = new int[3];
        nums2[0] = 2;
        nums2[1] = 7;
        nums2[2] = 22;

        //Accessing array elements:
        System.out.println(nums[0]); //2
        System.out.println(nums[2]);//22

        //Iterating through array:
        //Using for loop:
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("--------");

        //In reverse direction
        for (int i =  nums.length-1; i >=0; i--) {
            System.out.println(nums[i]);
        }
        System.out.println("---------");

        //Using for-each loop:
        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("Length of array: "+nums.length);

        //Giving inputs using for loop
        String names[]=new String[3];
        for(int i=0;i<=names.length-1;i++){
            System.out.println("Enter name:");
            names[i]=in.next();
        }
        System.out.println(Arrays.toString(names));

        //2D arrays:
        int[][] arr2D = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(arr2D[0][1]); //2

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        int[][]nos=new int[2][2];

      //Input to 2D array:
        for (int row = 0; row < nos.length; row++) {
            for (int col = 0; col <nos[row].length; col++) {
                nos[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < nos.length; row++) {
            for (int col = 0; col < nos[row].length; col++) {
                System.out.print(nos[row][col] + " ");
            }
            System.out.println();
        }

        //largest element of an array
                int[] arr3 = {3, 22, 16, 33, 12};
                int largest = arr3[0];

                for (int i = 1; i < arr3.length; i++) {
                    if (arr3[i] > largest) {
                        largest = arr3[i];
                    }
                }

                System.out.println("Largest element: " + largest);
    }
}