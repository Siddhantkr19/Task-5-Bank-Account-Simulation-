import java .util.*;
public class BankAccountSimulation {
    public static void showMenu(){
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4 :Apply for laon");
        System.out.println("5 : Cheak Balance");
        System.out.println(" 6 :see all user");
        System.out.println(" 7 : Exit");
    }

 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     Bank  bank = new Bank("PNB Bank", new ArrayList<>());
        System.out.println("Welcome to " + bank.getBankName());


        while (true) {
            showMenu();
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            
            switch (choice) {
                case 1:
                    System.out.print(" Creating Account");
                    System.out.println("Enter your first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print(" Enter your last name: ");
                    String lastName = scanner.nextLine();
                     System.out.print(" Choose Account type saving or current");               
                    String accountType = scanner.nextLine();                 
                    System.out.print(" Enter initial deposit amount: ");
                    double initialDeposit = Double.parseDouble(scanner.nextLine());
                    CreateAccount(firstName, lastName,accountType, initialDeposit,0.0);
                    continue ;

                    case   2 : 
                    System.out.print(" Deposit Money");
                    System.out.print(" Enter Account Number: ");
                    String depositerAccountNumber = scanner.nextLine();
                    depositMoney(depositerAccountNumber);
                    continue;
                    case 6 :
                    System.out.println(" List of all users:");
                    for(User user : Bank.getUser()){
                        System.out.println("Account Number: " + user.getAccountNumber() + ", Name: " + user.getFirstName() + " " + user.getlastName() + ", Balance: " + user.getBalance());
                        continue;
                    }
                    case 7 :
                        System.out.println("Thanks for coming bank");
                         return ;
                         default :
                           System.out.println( "unknown errror occured");
                           break ;
                    
        
            }
        }
       

 }   

    public  static void depositMoney( String accountNumber){
        System.out.println(" Depositing money to account number: " + accountNumber);

         try {
            for(User user : Bank.getUser()){
                if(user.getAccountNumber().equals(accountNumber)){
                    System.out.println("Enter deposite Money");
                    double depositAmount =  Double.parseDouble((new Scanner(System.in).nextLine()));
                    double balance  =  user.getBalance() + depositAmount;
                    if(balance > 0){
                              user.setBalance(balance);
                        System.out.println("Amount deposited - >" + balance);
                       
                    } else{
                        System.out.println("enter correct account  number");
                        return ;
                    }
              

                }


             }
        } catch (Exception e) {
            System.out.println(" An error occurred while depositing money: " + e.getMessage());
           
        }
    }





 public static void CreateAccount(String firstName, String lastName,String accountType, double initialDeposit,double loanAmount){
    String uudiDigit = UUID.randomUUID().toString().replaceAll("[^0-9]", "");

    String accountNumber = uudiDigit.substring(0, 12);   

    User newUser = new User(firstName, lastName, accountNumber, accountType, initialDeposit,loanAmount);
    System.out.println("Account created successfully!");
    System.out.println("Account Number: " + newUser.getAccountNumber());
    System.out.println("Account Holder: " + newUser.getFirstName() + " " + newUser.getlastName());
    System.out.println("Account Type: " + newUser.getAccountType());
    System.out.println("Balance: " + newUser.getBalance());
 }

}
 class User{

    private static String firstName;
    private static String lastName;
    private static String accountNumber;
    private static String accountType;
    private static double balance;
    private static double loanAmount;
    public User(String firstName, String lastName, String accountNumber, String accountType, double balance,double loanAmount){ {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.loanAmount= loanAmount ;
    }

    }
 

  


    public String getFirstName() {
        return firstName;
    }   
    public String getlastName(){
        return lastName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountType(){
        return accountType;
    }
    public double getBalance(){
        return balance;
    }
        public double getloanAmount(){
            return loanAmount;
        }


    //       public void setBalance(double balance2) {
    //     try {
    //        balance2 = balance; 
    //     } catch (Exception e) {
    //           throw new UnsupportedOperationException("Unimplemented method 'setBalance'");
    //     }
    // }

    public void setBalance( double balance2){
        this.balance = balance2 ;
    }

     public void setloanAmount(double loanAmount){
  this.setloanAmount(loanAmount);
 }

 }



 
class Bank{
    private static String bankName ;
    private static  ArrayList<User> user = new ArrayList<>();

    public Bank(String bankName, ArrayList<User> user){
        this.bankName = bankName;
        this.user = user;
    

    }
    public String getBankName(){
        return bankName;
    }
    public static ArrayList<User> getUser(){
        return user;
    }
    public void addUser(User newUser){
        user.add(newUser);
    }
    
    }


