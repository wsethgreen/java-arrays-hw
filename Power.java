import java.util.*;

public class Power {

    public static void main(String[] args) {

        ArrayList<Integer> test1 = Power.toPower(5, 2);
        System.out.println(test1);

        ArrayList<Integer> test2 = Power.toPower(10, 3);
        System.out.println(test2);
    }

    /*
    Write a public static method called "toPower" that takes in as parameters two integers called size and power. The method should return an array of size "size" with each array index raised to the value of "power." So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].
    */
    
    public static ArrayList<Integer> toPower(int size, int power) {

        // Create array of integers and another array for the "powered" ints
        ArrayList<Integer> intArr = new ArrayList<>();
        ArrayList<Integer> intPowers = new ArrayList<>();

        // Use for loop to fill array based on the "size" parameter
        for (int i = 0; i < size; i++) {
            intArr.add(i);
        }

        // // Test to make sure for loop is correctly adding indices to array
        // System.out.println(intArr);

        // Use for loop to multiply each element to the power provided and
        // add the result to a new array.
        for (int i = 0; i < intArr.size(); i++) {
            int number = intArr.get(i);
            int numPower = (int) Math.pow(number, power);
            intPowers.add(numPower);
        }

        // // Test to make sure for loop is correctly 
        // System.out.println(intPowers);

        // Return the array of "powered" numbers
        return intPowers;
    }
    
}
