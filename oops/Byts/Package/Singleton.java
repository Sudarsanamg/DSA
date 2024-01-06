public class Singleton {
    // Private static instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Initialization code, if needed
    }

    // Public method to provide the global point of access to the instance
    public static Singleton getInstance() {
        // If the instance is not created yet, create it
        if (instance == null) {
            instance = new Singleton();
        }
        // Return the instance
        return instance;
    }
     public static void main(String[] args) {
        // Get the instance of the Singleton
        Singleton singletonInstance = Singleton.getInstance();

        // Use the instance as needed
        System.out.println("Singleton instance created");

        // Get the instance again, it will be the same instance
        Singleton anotherInstance = Singleton.getInstance();

        // Check if both instances are the same
        System.out.println(singletonInstance == anotherInstance); // Should print true
    }
}
