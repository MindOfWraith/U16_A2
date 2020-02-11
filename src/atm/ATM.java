/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.util.Scanner; 
/**
 *
 * @author M1804103
 */
public class ATM {
    static boolean exit = false;//creates a variable that is set to be false
    public static int money = 100; //this sets an integer (money) as 100

public static void main(String[] args) {
    Mmenu();
}

static void Mmenu(){

    
    while (exit != true){
        Scanner check = new Scanner(System.in);//this means you want to use a scanner
        System.out.println("Please choose what you would like to do: "//the program prints 
        +"1. Withdraw"
        +"2. Deposit money"
        +"3. Balance money"
        +"4. Help"
        +"5. Exit");
    
        int menu = check.nextInt ();
    
    
    switch (menu){
    case 1:
        ATM Customer=new ATM();
        Customer.withdrawl();
        break;
    case 2:
        ATM Dpst=new ATM() ;
        Dpst.Deposit();
    break;
    case 3:
        ATM Dsply=new ATM();
        Dsply.balance();
    break;
    case 4:
        ATM hlp=new ATM();
        hlp.help();
    break;
    case 5: 
        ATM xt=new ATM();
        exit = true;
    }
    }
}
public void balance() {
    System.out.println("Your account balance is "+money);
    
    
    
             }
public void withdrawl() {
Scanner check = new Scanner(System.in);
System.out.println("1.Withdraw £10"
        + "2.Withdraw £20");
int menuWD = check.nextInt();
switch (menuWD){
    case 1:
        money = money - 10;
        System.out.println(money);
    break;
    case 2:
        money = money - 20;
        System.out.println(money);
    break;


}
}
public void Deposit() {
    System.out.println("How much do you want to deposit?: ");
    Scanner check = new Scanner (System.in);
if((money > 0) && (money < 300)){
    money = money + check.nextInt();
    System.out.println("Your Balance is " + money);
    
 
    
}else System.out.println("Error, please enter amount between 0 and 300");

    
}

public void help(){
        System.out.println("View:1 allows you to see your current balance that you have in your account, "
        +"Deposit enables you to place money into your account"
        +"Withdraw allows you to take the money within your account out"
        +"Help tells you what an ATM does (which is self explanatory)");
    
    }




}


    







        // TODO code application logic here
        
       
        
        
    
    


    
