// Class name should start with a capital letter (CamelCase naming convention)
class  HelloWorld{
    // A class is a blueprint for objects that share common properties and methods.

    public static void main(String[] args) {
        // The main method has a fixed prototype that cannot be changed.
        // `public` ensures JVM can call the method from outside the class.
        // `static` allows JVM to call the main method without creating an object.
        // `void` means the method does not return any value.
        // `String[] args` allows passing command-line arguments as an array.

        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
        // `System` is a predefined class in Java.
        // `out` is a reference variable that refers to the PrintStream class.
        // `println` prints text and moves the cursor to the next line.
        // `print` prints text without moving to the next line.
    }
}