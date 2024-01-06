import java.text.SimpleDateFormat;
import java.util.*;

public class Bank {

     static int pin=1234;
     static int balance=0;
     static Scanner sc=new Scanner(System.in);
     boolean pc=false;
     static SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy    HH:mm:ss");

     static void withdraw(List<String> Tot,List<String>type_pf_transaction,List<Integer> Bal)
     {
        System.out.println("Enter the amount to withdraw");
        int amt=sc.nextInt();
        if(amt > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else{
            int temp=balance-amt;
            balance=temp;
            System.out.println("Current Balence is " + balance);
            Date date=new Date();
            Tot.add(formatter.format(date));
            Bal.add(amt);
            type_pf_transaction.add("Debited");

        }
     }
     static void deposit(List<String> Tot,List<String>type_pf_transaction,List<Integer> Bal)
     {
        System.out.println("enter the amount to be deposit");
        int amt=sc.nextInt();
        balance=balance+amt;
        System.out.println("Current Balance "+ balance);
        Date date=new Date();
        Tot.add(formatter.format(date));
        Bal.add(amt);
        type_pf_transaction.add("Creadited");

     }
     static void balance()
     {
        System.out.println("Your balance is " + balance);
     }
     static void pinchange()
     {
        System.out.println("enter Your old pin");
        int o_pin=sc.nextInt();
        if(o_pin == pin){
        System.out.println("Enter your new Pin");
        int new_pin=sc.nextInt();
        System.out.println("Re enter the pin");
        int re_pin=sc.nextInt();
        if(new_pin==re_pin)
        {
            pin=re_pin;
            validatepin(pin);
        }
        else
        {
            System.out.println("Mismatch error");
        }

      }
      else
      {
        System.out.println("Wrong pin");
      }
     }

     static void validatepin(int pin)
     {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.println("Enter your pin");
        int p=sc.nextInt();
        if(p!=pin)
        {
            System.out.println("Wrong pin Terminating");
            System.exit(0);
        }
     }

     static  boolean validatepin(boolean bool,int upin)
     {
         do
        {
            
            if(upin==pin)
            {
                bool=false;
                break;
            }
        }while(bool);
        return bool;
     }

     static void ministmt(List<String> Tot,List<String>type_pf_transaction,List<Integer> Bal)
     {
                System.out.println("Time and Date     &&      Type of Transaction  Balance");
                for (int i = 0; i < Tot.size() ; i++) {

                        System.out.println(Tot.get(i)+" "+type_pf_transaction.get(i)+"    "+Bal.get(i));
                }
            } // Add closing curly brace here

         public static void main(String[] args) {
    boolean flag=true;

    List<String> Tot=new ArrayList<String>();
    List<String> type_of_transcation =new ArrayList<String>();
    List<Integer>Bal=new ArrayList<>(); 

    Bank acc=new Bank();
    System.out.println("enter the pin:");
    int pin=sc.nextInt();
    flag=validatepin(flag,pin);

    System.out.println();

    char whish='y';

        do {    
        
        if(flag==false )
        {
            System.out.println();
            System.out.println("press 1 for deposit");
            System.out.println("press 2 for Withdraw");
            System.out.println("press 3 for Balance enquiry");
            System.out.println("Press 4 for Change Pin");
            System.out.println("press 5 for mini statement ");
            System.out.println();
            int choices=sc.nextInt();

            switch (choices) {
                case 1:
                    deposit(Tot,type_of_transcation,Bal);
                    break;
                case 2:
                    withdraw(Tot,type_of_transcation,Bal);
                    break;
                case 3:
                    balance();
                    break;
                case 4:
                    pinchange();

                    break;
                case 5:
                    ministmt(Tot,type_of_transcation,Bal);
                    break;
                default:
                    break;
            }

            System.out.println("Do you whish to continue(y/n):");
            whish=sc.next().charAt(0);

        }
     }while (whish !='N' && whish!='n');
}

}
