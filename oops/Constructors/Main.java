package oops.Constructors;

public class Main {
    static  int count;
    //instance block it will execute everytime when object is created
    {
        ++count;
    }
    Main() {
    }

    Main(String  name)
    {
    }
    public static void main(String[] args) {
        Main main = new Main();
        Main main1 =new Main("Sudarsanam");
        Main main2 =new Main();
        System.out.println(count);

    }
}
