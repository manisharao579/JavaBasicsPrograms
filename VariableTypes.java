// Class to demonstrate all types of variables in Java
public class VariableTypes {

    // 1. Instance variable (Non-static variable) 
    int instanceVar = 50;

    // 2. Static variable (Class-level variable)
    static String staticVar = "I am a static variable";

    // 3. Final variable (Constant, cannot be changed)
    final double PI = 3.14159;

    // Method demonstrating local variables
    public void showVariables() {
        // 4. Local Variable (Declared inside method, has no default value)
        int localVar = 10;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Final Variable (Constant): " + PI);
    }

    public static void main(String[] args) {
        // Creating object to access instance variables and methods
        VariableTypes obj = new VariableTypes();

        // Calling method to display all variables
        obj.showVariables();

        // Accessing Static variable directly (No object needed)
        System.out.println("Accessing Static Variable directly: " + staticVar);
    }
}