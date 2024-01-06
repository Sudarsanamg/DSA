import java.util.Scanner;

public class Sameword {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String str =sc.nextLine();
     String str2=sc.nextLine();
    //  if(str.equals(str2))
    //  {
    //     System.out.println(true);
    //  }
    //  else
    //  {
    //     System.out.println(false);
    //  }
    //  sc.close();
    
    System.out.println(str.equalsIgnoreCase(str2));
    

    }
    
}
