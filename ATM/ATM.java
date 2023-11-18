public class ATM {
    int pin, balance, withdraw;

    void show_menu() {
        System.out.println("-----------------------------");
        System.out.println("-------------Welcome to Askari Bank----------------");
        System.out.println("-----------------------------");
        System.out.println("------------------Please Enter Your PIN-----------");
        System.out.println("-----------------------------");
        System.out.println("--------------------Thank you !---------");
    }

    void code(int pin) {
        this.pin = pin;
    }

    void getbalance(int balance) {
        this.balance = balance;
    }

    void getwithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    int getremain()
    {
        if(balance>=withdraw) {
            balance = balance - withdraw;
        }
        return balance;
    }
}





