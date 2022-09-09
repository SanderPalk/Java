package Week4;

public class ul72 {
    public static void main(String[] args) {
        Account mattsAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);

        System.out.println("Initial state");
        System.out.println(mattsAccount);
        System.out.println(myAccount);

        mattsAccount.withdrawal(100);
        myAccount.deposit(100);

        System.out.println("Final state");
        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }
}