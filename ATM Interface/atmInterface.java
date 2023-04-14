import java.util.Scanner;
/**
 *
 * created by Pratik
 */
class BankAccount{
    String name;
    String username;
    String Password;
    String accountNo;
    float balance =0f;
    int transactions = 0;
    String transactionHistory = " ";
    public void register(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Your name: ");
        this.name=sc.nextLine();
        System.out.print("\nEnter Your UserName: ");
        this.username=sc.nextLine();
        System.out.print("\nEnter Your Password: ");
        this.Password =sc.nextLine();
        System.out.print("\nEnter Your Account Number: ");
        this.accountNo =sc.nextLine();
        System.out.print("\nRegistration is now completed now kindly login\n");
    }
    public boolean login(){
        boolean isLogin = false;
        Scanner sc=new Scanner(System.in);
        while (!isLogin){
            System.out.print("\nEnter Your Username - ");
            String Username = sc.nextLine();
            if (Username.equals(username)){
                while (!isLogin){
                    System.out.print("\nEnter Your Password - ");
                    String Password= sc.nextLine();
                    if (Password.equals(Password)){
                        System.out.print("\nLogin succesful!!  ");
                        isLogin = true;
                    }
                    else{
                        System.out.print("\nIncorrect Password ");
                    }
                }
            }
            else{
                System.out.print("\nUsername not found");
            }
        }
        return isLogin;
    }
    public void withdraw(){
        System.out.print("\nEnter amount to withdraw -");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        try {
            if (balance>= amount){
                transactions++;
                balance -= amount;
                System.out.print("\nWithdraw Successfully-");
                String str = amount + "Rs Withdrawed\n" ;
                transactionHistory = transactionHistory.concat(str);
            }
            else{
                System.out.print("\nInsufficient balance");
            }
        }
        catch ( Exception e){
        }
    }
    public void deposit(){
        System.out.print("\nEnter amount to deposit -");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        try {
            if (amount <= 100000f) {
                transactions++;
                balance += amount;
                System.out.print("\nDeposited Successfully-");
                String str = amount + "Rs deposited\n" ;
                transactionHistory = transactionHistory.concat(str);
            }
            else {
                System.out.println("\nSorry......Limit exceeds");
            }
        }
        catch (Exception e){
        }
    }
    public void transfer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Receipent's Name -");
        String recepient =sc.nextLine();
        System.out.print("\nEnter amount to transfer -");
        float amount = sc.nextFloat();
        try {
            if ( balance >= amount ){
                if (amount <= 50000f){
                    transactions++;
                    balance -= amount;
                    System.out.print("\nSuccessfully Transferred to " + recepient);
                    String str = amount + " Rs transfred to "+ recepient +"\n";
                    transactionHistory = transactionHistory.concat (str);
                }
                else {
                    System.out.println("\nSorry...Limit is 50000.00");
                }
            }
            else{
                System.out.println("\nInsufficient Balance");
            }
        }
        catch (Exception e) {
        }
    }
    public void checkbalance(){
        System.out.println("\n"+balance+ " Rs");
    }
    public void transactionHistory(){
        if (transactions== 0){
            System.out.println("\nEmpty");
        }
        else {
            System.out.println("\n"+ transactionHistory);
        }
    }
}
public class atmInterface{
    public static int takeIntegerInput(int limit){
        int input =0;
        boolean flag = false;
        while (!flag){
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                flag = true;
                if (flag && input>limit || input <1){
                    System.out.println("Choose the number betweenn1 to" +limit);
                    flag = false;
                }
            }
            catch (Exception e){
                System.out.println("Enter only integer value");
                flag = false;
            }
        };
        return input;
    }
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("Welcome TO ATM");
        System.out.println("================\n");
        System.out.println("Kindly register yourself");
        System.out.println("________________________\n");
        System.out.println("1.Register ");
        System.out.println("2.Exit");
        System.out.println("Enter your choice -");
        int choice = takeIntegerInput(2);
        if (choice == 1){
            BankAccount b = new BankAccount();
            b.register();
            while (true){
                System.out.println("\n");
                System.out.println("1.Login");
                System.out.println("2.Exit");
                System.out.println("Enter your choice -");
                int ch = takeIntegerInput(2);
                if (ch== 1){
                    if (b.login()) {
                        System.out.println("\n\nWelcome Back" +b.name + "\n");
                        boolean isFinished = false;
                        while (!isFinished){
                            System.out.println("What would you like to do..\nChoose from below options");
                            System.out.println("\n1.Withdraw \n2.Deposit \n3.Transfer \n4.Check balance \n5.Transaction History \n6.Login Page");
                            int c= takeIntegerInput(6);
                            switch (c){
                                case 1:
                                    b.withdraw();
                                    break;
                                case 2:
                                    b.deposit();
                                    break;
                                case 3:
                                    b.transfer();
                                    break;
                                case 4:
                                    b.checkbalance();
                                    break;
                                case 5:
                                    b.transactionHistory();
                                    break;
                                case 6:
                                    isFinished= true;
                                    break;
                            }
                        }
                    }
                }
                else{
                    System.exit(0);
                }
            }

        }
    }
}
