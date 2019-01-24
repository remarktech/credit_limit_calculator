package credit_limit_calculator;
import java.util.*;
public class Credit_limit_calculator {
    
     private int accountNum, balanceStartOfMonth, itemsCharged, totalCredits, creditLimit, newBalance;
             public Credit_limit_calculator(int account, int balance, int items, int totalcred, int limit, int newBalance)
        {
            accountNum = account;
            balanceStartOfMonth = balance;
            itemsCharged = items;
            totalCredits = totalcred;
            creditLimit = limit;
            newBalance = newBalance;
        }
 
        public int setAccount(int account)
        {
            accountNum = account;
            return accountNum;
        }
 
        public int setBalance(int balance)
        {
            balanceStartOfMonth = balance;
            return balanceStartOfMonth;
        }
 
        public int setItems(int items)
        {
            itemsCharged = items;
            return itemsCharged;
        }
 
        public int setTotalCredit(int totalcred)
        {
            totalCredits = totalcred;
            return totalCredits;
        }
 
        public int setCreditLimit(int limit)
        {
            creditLimit = limit;
            return creditLimit;
        }
 
        public int setNewBalance()
        {
            newBalance = newBalance;
            newBalance = balanceStartOfMonth + itemsCharged - totalCredits;
            return newBalance;
        }   
    public static void main(String[] args) {
            Credit_limit_calculator calculator = new Credit_limit_calculator(0,0,0,0,0,0);
 
            Scanner input = new Scanner(System.in);
 
            int account = 1; //setting account to 1 here so it will be initialized in the while loop
            int balance;
            int items;
            int totalcred;
            int limit;
            int newbalance;
 
            while (calculator.setAccount(account) != 0) //As long as the account number is not set to 0 program will continue to loop
            {
                System.out.println("Enter the customers account number: ");
                account = input.nextInt();
                calculator.setAccount(account);    //prompts user for account number
 
                System.out.println("Enter the customers balance at the start of the month: ");
                balance = input.nextInt();
                calculator.setBalance(balance);  //prompts user for balance
 
                System.out.println("Enter the total amount of charges: ");
                items = input.nextInt();
                calculator.setItems(items);     //prompts user for total amount of charges
 
                System.out.println("Enter the total amount of credits: ");
                totalcred = input.nextInt();
                calculator.setTotalCredit(totalcred);   //prompts user for total credit
                 
                System.out.println("Enter the credit limit: ");
                limit = input.nextInt();
                calculator.setCreditLimit(limit);   //prompts the user for credit limit
 
                System.out.println("The customers new balance is " + calculator.setNewBalance());   //prints the new balance
 
                if (calculator.setBalance(balance) > calculator.setCreditLimit(limit))
                {
                    System.out.println("Credit Limit Exceeded");   //if balance is greater limit will print this
                    break;    //stops loop
                }
 
            }
    }
    
}
