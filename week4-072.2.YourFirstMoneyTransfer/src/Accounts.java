
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account Matt = new Account("Matt's account", 1000);
        Account My = new Account("My account", 0);
        Matt.withdrawal(100.0);
        My.deposit(100.0);
        System.out.println(Matt);
        System.out.println(My);
    }

}
