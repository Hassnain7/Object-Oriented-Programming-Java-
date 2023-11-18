import java.util.Scanner;
public class main2 {
    public static void main(String args[]) {
        int a, p, z, x;
        Scanner kb = new Scanner(System.in);
        ATM a1 = new ATM();
        int option;
        while (true) {
            a1.show_menu();
            System.out.println("select the option:");
            option=kb.nextInt();
            System.out.println("1------Enter your PIN");
            System.out.println("2-----tell your balance");
            System.out.println("3------add amount you want to withdraw");
            System.out.println("4------check your remaining balance");
          switch(option){
              case 1:
              {
                  System.out.println("Enter your PIN:");
                  a = kb.nextInt();
                  a1.code(a);
              }
              case 2:
              {
                  System.out.println("tell your balance:");
                  p= kb.nextInt();
                  System.out.println("Your balance is:");
                  a1.getbalance(p);
              }
              case 3:
              {
                  System.out.println("tell the amount you want to withdraw:");
                  z=kb.nextInt();
                  System.out.println("The withdraw amount is:");
                  a1.getwithdraw(z);
              }
              case 4:
              {
                  System.out.println("The remaining is:"+a1.getremain());
              }
          }
        }
    }
}