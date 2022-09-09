package Week4;

public class ul72 {
    public static void main(String[] args) {
        Account A = new Account("A account", 100);
        Account B = new Account("B account", 0);
        Account C = new Account("C account", 0);


        System.out.println("Initial state");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println("Final state");
        System.out.println();
        System.out.println();
    }

    public static void transter(Account from, Account to, double amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }
}