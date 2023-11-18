import java.util.Scanner;
public class Final {
    public static void main(String args[]) throws Exception
    {
        int hour,min,sec;
        Clock c1=new Clock();
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the hour and the minutes");
        System.out.println("Enter the hours you want to enter:");
        hour=kb.nextInt();
        System.out.println("Enter the minutes you want to enter:");
        min=kb.nextInt();
        System.out.println("Enter the Seconds you want to enter:");
        sec=kb.nextInt();
        c1.setTime(hour,min,sec);
      while(true)
        {
            c1.Tick();
            System.out.println(c1.getTime());
            Thread.sleep(1000);
        }
    }
}
