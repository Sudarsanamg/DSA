public class Functionoverloading {

    static void run()
    {
        System.out.println("with out parameters");
    }
    static void run(int a)
    {
        System.out.println("with parameter");
    }
    public static void main(String[] args) {
        run();
        run(5);
    }
}
