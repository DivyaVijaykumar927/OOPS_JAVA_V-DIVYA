// Class demonstrating different access modifiers
class TestModifiers {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40; // default access modifier (package-private)

    // Public method
    public void showPublic() {
        System.out.println("Public Method: publicVar = " + publicVar);
    }

    // Private method
    private void showPrivate() {
        System.out.println("Private Method: privateVar = " + privateVar);
    }

    // Protected method
    protected void showProtected() {
        System.out.println("Protected Method: protectedVar = " + protectedVar);
    }

    // Default/package-private method
    void showDefault() {
        System.out.println("Default Method: defaultVar = " + defaultVar);
    }

    // Accessing private member from inside the class
    public void accessPrivateInside() {
        System.out.println("Accessing privateVar using public method:");
        showPrivate(); // Allowed inside the same class
    }
}

// Subclass to test inheritance of access modifiers
class SubTestModifiers extends TestModifiers {
    public void accessInherited() {
        System.out.println("\n--- Accessing from Subclass ---");
        System.out.println("Inherited protectedVar: " + protectedVar);
        showProtected();

        // The following are not allowed (uncommenting will cause compilation error)
        // System.out.println(privateVar);
        // showPrivate();
    }
}

// Main class to demonstrate access behavior
public class AccessModifierDemo {
    public static void main(String[] args) {
        System.out.println("=== Accessing from Same Package ===");

        TestModifiers obj = new TestModifiers();

        // Public access
        System.out.println("publicVar: " + obj.publicVar);
        obj.showPublic();

        // Private access - not allowed directly
        // System.out.println(obj.privateVar);      // ❌ Compile-time Error
        // obj.showPrivate();                       // ❌ Compile-time Error
        obj.accessPrivateInside();                 // ✅ Accessed via public method

        // Protected and default access (allowed within same package)
        System.out.println("protectedVar: " + obj.protectedVar);
        obj.showProtected();

        System.out.println("defaultVar: " + obj.defaultVar);
        obj.showDefault();

        // Access from subclass
        SubTestModifiers subObj = new SubTestModifiers();
        subObj.accessInherited();
    }
}
