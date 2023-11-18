import java.util.Scanner;
public class main3 {
    public static void main(String args[]) {

        int x, z,option;
        Scanner kb = new Scanner(System.in);
        drinks d1 = new drinks();
        d1.show_menu();
        System.out.println("1-----enter the price");
        System.out.println("2-------Enter the balance");
        System.out.println("3-------collect your drink");
        System.out.println("4------take your change back");
        while (true) {
            System.out.println("Enter the option:");
            option=kb.nextInt();
            switch (option){
                case 1:
                {
                    System.out.println("Enter the ticket price:");
                    x=kb.nextInt();
                    d1.getprice(x);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the balance:");
                    z=kb.nextInt();
                    d1.getbalance(z);
                    break;
                }
                case 3:
                {
                    d1.getdrinks();
                    break;
                }
                case 4:
                {
                    System.out.println("your remaining change is:"+d1.getremain());
                    break;
                }
            }
        }
    }
}