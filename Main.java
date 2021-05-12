import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        Write a program to sum all the values of a given Array in Java.
        What is the output?
        */

        // Create array for exercise
        ArrayList<Integer> intArr = new ArrayList<Integer>(List.of(10, 20, 30, 40, 50));

        // Write a program to sum all integers in the array

        // Create a sum variable which the sum will be saved to
        int sum = 0;

        // Loop through the array and add each number to the sum variable
        for (int i = 0; i < intArr.size(); i++) {
            sum += intArr.get(i);
        }

        System.out.printf("Array: %s\n", intArr);
        System.out.printf("Sum of Array: %s\n", sum);

    }
}