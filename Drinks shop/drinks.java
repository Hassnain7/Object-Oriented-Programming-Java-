public class drinks {
    int price,balance,a;
    void show_menu(){
        System.out.println("----------------------------------");
        System.out.println("-----Welcome to Qazi Drink store-----------------------------");
        System.out.println("----------------------------------");
        System.out.println("---------------Select the drink-------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
    }
    void getprice(int price)
    {
        this.price=price;
    }
    void getbalance(int price)
    {
        this.balance=balance;
    }
    void getdrinks()
    {
        if(price>=30){
            System.out.println("collect your PEPSI");
        }
        if(price>=40)
        {
            System.out.println("collect your SPRITE");
        }
        if(price>=50)
        {
            System.out.println("collect your String");
        }
        if(price>=60)
        {
            System.out.println("collect your MOUNTAIN DEW");
        }
        if(price>=70)
        {
            System.out.println("collect your FANTA");
        }
        balance=balance-price;
    }
    int getremain()
    {
        int a;
        a=balance;
        balance=0;
        return a;
    }
}
