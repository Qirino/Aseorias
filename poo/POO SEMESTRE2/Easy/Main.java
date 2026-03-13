package Easy;
public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(10);
        System.out.println(b1.deposit(5));
        System.out.println(b1.getBalance());
        System.out.println(b1.withdrow(6));
        System.out.println(b1.withdrow(10));
        System.out.println(b1.getBalance());
        System.out.println();
    }
}
