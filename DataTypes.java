public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        // A byte is an 8-bit signed integer with a range from -128 to 127
        byte smallNumber = 127;
        // A short is a 16-bit signed integer with a range from -32,768 to 32,767
        short shortNumber = 32000;
        // An int is a 32-bit signed integer with a range from -2^31 to 2^31-1
        int intNumber = 100000;
        // A long is a 64-bit signed integer with a range from -2^63 to 2^63-1
        long longNumber = 1000000000L;

        // Floating-point types
        // A float is a 32-bit floating-point number
        float floatNumber = 10.5f;
        // A double is a 64-bit floating-point number
        double doubleNumber = 99.99;

        // Character type
        // A char is a 16-bit Unicode character
        char singleCharacter = 'A';

        // Boolean type
        // A boolean represents true or false values
        boolean isJavaFun = true;

        // Non-Primitive Data Types
        // A String is a sequence of characters
        String message = "Hello, Java!";
        // An array is a collection of similar data types
        int[] numbersArray = {1, 2, 3, 4, 5};

        // Printing values to console along with their sizes and ranges
        System.out.println("Byte Value: " + smallNumber);
        System.out.println("Byte Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Byte Size: " + Byte.BYTES + " bytes");

        System.out.println("Short Value: " + shortNumber);
        System.out.println("Short Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Short Size: " + Short.BYTES + " bytes");

        System.out.println("Integer Value: " + intNumber);
        System.out.println("Integer Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Integer Size: " + Integer.BYTES + " bytes");

        System.out.println("Long Value: " + longNumber);
        System.out.println("Long Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Long Size: " + Long.BYTES + " bytes");

        System.out.println("Float Value: " + floatNumber);
        System.out.println("Float Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Float Size: " + Float.BYTES + " bytes");

        System.out.println("Double Value: " + doubleNumber);
        System.out.println("Double Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Double Size: " + Double.BYTES + " bytes");

        System.out.println("Character Value: " + singleCharacter);
        System.out.println("Character Size: " + Character.BYTES + " bytes");

        System.out.println("Boolean Value: " + isJavaFun);
        System.out.println("Boolean Size: JVM dependent");

        System.out.println("String Value: " + message);
        System.out.println("String Length: " + message.length() + " characters");

        System.out.println("Array Length: " + numbersArray.length + " elements");
        System.out.print("Array Values: ");

        for (int num : numbersArray) {
            System.out.print(num + " ");
        }
    }
}
