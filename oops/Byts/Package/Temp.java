import java.util.Scanner;

class Temp
{
    int rollno;
    String Name;
    public static void main(String[] args) {
        Temp temp = new Temp();
        Scanner scanner = new Scanner(System.in);
        temp.Name="gss";
        temp.rollno=123;

        Temp temp2=new Temp();
        temp2.Name="sudarsanam";
        temp2.rollno=12543;

        System.out.println(temp2.Name);

    }
}