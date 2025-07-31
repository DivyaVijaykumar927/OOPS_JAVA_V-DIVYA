import java.util.Scanner;

public class DataOperationsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==== Integer and Arithmetic Operations ====
        System.out.println("=== Integer and Arithmetic Operations ===");
        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        System.out.println("Sum        : " + (a + b));
        System.out.println("Difference : " + (a - b));
        System.out.println("Product    : " + (a * b));
        System.out.println("Quotient   : " + (a / b));
        System.out.println("Remainder  : " + (a % b));

        // ==== Floating Point Operations ====
        System.out.println("\n=== Floating Point Operations ===");
        System.out.print("Enter a float: ");
        float f = scanner.nextFloat();

        System.out.print("Enter a double: ");
        double d = scanner.nextDouble();

        double floatSum = f + d;
        System.out.println("Sum of float and double: " + floatSum);

        // ==== Character and ASCII ====
        System.out.println("\n=== Character and ASCII ===");
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("ASCII value of '" + ch + "' is: " + (int) ch);

        // ==== Boolean Logic ====
        System.out.println("\n=== Boolean Logic ===");
        System.out.print("Enter true or false: ");
        boolean flag = scanner.nextBoolean();
        System.out.println("Negation of input: " + !flag);

        // ==== Bitwise Operations ====
        System.out.println("\n=== Bitwise Operations ===");
        byte byte1 = 0b00001100; // 12 in binary
        byte byte2 = 0b00000101; // 5 in binary
        System.out.println("Bitwise AND (&) : " + (byte1 & byte2));
        System.out.println("Bitwise OR  (|) : " + (byte1 | byte2));
        System.out.println("Bitwise XOR (^) : " + (byte1 ^ byte2));

        // ==== Relational & Logical Operations ====
        System.out.println("\n=== Relational & Logical Operations ===");
        System.out.println("Is a > b?                  : " + (a > b));
        System.out.println("Is a == b AND flag is true: " + ((a == b) && flag));
        System.out.println("Is a < b OR flag is false : " + ((a < b) || !flag));

        // ==== Type Casting ====
        System.out.println("\n=== Type Casting ===");
        double casted = (double) a;
        System.out.println("Integer a casted to double: " + casted);

        // ==== Short and Long Types ====
        System.out.println("\n=== Short and Long Types ===");
        short s = 30000;
        long l = 9_000_000_000L; // Using underscores for readability
        System.out.println("Short value: " + s);
        System.out.println("Long value : " + l);

        // ==== Ternary Operator ====
        System.out.println("\n=== Ternary Operator ===");
        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println("Result: " + result);

        // ==== String Input & Operations ====
        System.out.println("\n=== String Operations ===");
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.println("Name in uppercase : " + name.toUpperCase());
        System.out.println("Length of your name: " + name.length());

        scanner.close();
    }
}
