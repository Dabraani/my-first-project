/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banksys;

/**import java.util.scanner;
 *
 * @author HC
 */

import java.util.Scanner;
public class Banksys {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String accountName,accountPassword;
        int accountBalance = 0;
        String currency = "dollar";
        String thankyou = "thank you for using tawakal bank";
        String motto = "always your service";
        int selectedOption,depositAmount,withdrawAmount;
        System.out.println();
                System.out.println();
        System.out.println("==========WELCOME TO TAWAK BANK");
        System.out.println("select from the optionbelow what service you would like to use");
        System.out.println("1.DEPOSIT MONEY");
        System.out.println("2.WITHDRAW MONEY");
        System.out.println("3.CHECK BALANCE");
        System.out.println("4.CREATE A NEW ACCOUNT");
        System.out.println();
        System.out.println(" Enter your selectoin---");
        selectedOption = scn.nextInt();
        if(selectedOption == 1){
            System.out.println("Enter amount to deposit");
            depositAmount = scn.nextInt();
            System.out.println("you have seccusfully deposited"+depositAmount+ currency);
            System.out.println(thankyou);
           System.out.println(motto);
        }
        else if(selectedOption ==2){
           System.out.println("Enter amount to withdraw...."); 
            withdrawAmount = scn.nextInt();

            System.out.println("you have succesfully  withdrawn"+ withdrawAmount + currency);
            
             System.out.println(thankyou); 
             System.out.println(motto);
              System.out.println("Enter name of account=======");
              accountName = scn.next();
               System.out.println("Enter password");
               accountPassword = scn.next();
             System.out.println(thankyou);
             System.out.println(motto);
        }else if(selectedOption ==3){
            
            System.out.println("Enter your account");
            accountName = scn.next();
            System.out.println("enter passward");
            accountPassword = scn.next();
                        System.out.println(accountName +"your balance is" +accountBalance);

                        
            System.out.println(thankyou);
            System.out.println(motto);
        }
        else if(selectedOption ==4){
            System.out.println("======create account=====");
            System.out.println("Enter your name");
            accountName = scn.next();
            System.out.println("create passward");
            accountPassword = scn.next();
                               System.out.println(accountName.toUpperCase()+ " you have created account with password " +accountPassword);
     
            System.out.println(thankyou);
            System.out.println(motto);
        }
        else{
            System.out.println("you have selected invalid");



               

              

             



       

        }

                
        
    }
}
