import java.util.*;
public class task3 {
    public static void main(String []args){
        ATM atm=new ATM();
        System.out.println("1 : Deposit Money");
        System.out.println("2 : Withdraw Money");
        System.out.println("3 : Check Balance");
        System.out.println("-1 : Exit ATM");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("\nEnter Number as Per Concern : ");
            int n=sc.nextInt();

            switch(n){
                case 1: System.out.print("Enter amount : ");
                        atm.deposit(sc.nextLong());
                        break;

                case 2: System.out.print("Enter amount : ");
                        atm.withdraw(sc.nextLong());
                        break;

                case 3: atm.checkBalance();
                        break;

                case -1: return;

                default:System.out.println("Invalid Number");
                        System.out.println("Choose from following");
                        System.out.println("1 : Create an BankAccount");
                        System.out.println("2 : Deposit Money");
                        System.out.println("3 : Withdraw Money");
                        System.out.println("4 : Check Balance");
                        System.out.println("-1 : Exit ATM");
            }
        }
    }
}

class ATM{
    private BankAccount account;
    ATM(){
        account =new BankAccount();
    }
    class BankAccount{
        private long balance;
        BankAccount(){
            balance=0;
            System.out.println("Account Succesfully Created");
        }
    }
    void checkBalance(){
        System.out.println("Your Balance is : "+account.balance);
    }
    void withdraw(long amount){
        if(amount>account.balance){
            System.out.println("Couldn't Withdraw money");
            System.out.println("You don't have enough Balance");
            return;
        }
        account.balance-=amount;
        System.out.println("Your Amount is Successfully Withdrawed");
        System.out.println("Net Balance : "+account.balance);
    }
    void deposit(long amount){
        if(amount<=0){
            System.out.println("Invalid Amount");
            return;
        }
        account.balance+=amount;
        System.out.println("Your Amount is Successfully deposited");
        System.out.println("Net Balance : "+account.balance);
    }
}


