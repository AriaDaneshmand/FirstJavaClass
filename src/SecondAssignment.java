public class SecondAssignment {
    public static void main(String[] args) {
        // Task 1: Declare int, float, and double variables following naming convention
        int myInt;
        float myFloat;
        double myDouble;

        // Task 2: Initialize a byte variable with a value 76543
        // Task 3: Find the right data type for 76543 and assign it
        // The value 76543 is out of the range of a byte, so we should use a larger data type, like int.
        int myByteValue = 76543;

        // Task 5: Declare int variables a=6, b=3, c=9, and calculate the result of the expression
        int a = 6;
        int b = 3;
        int c = 9;

        int result = a + (b * c) / (a - b) + (c / b);

        // Print the result
        System.out.println("Result of the expression: " + result);
    }
}