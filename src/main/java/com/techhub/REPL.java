package com.techhub;

import java.util.Scanner;

public class REPL {

    public static void main(String[] args){
        DisplayGreeting();
        DisplayMenu();
        RunLoan();
    }

    public static  void DisplayGreeting(){
        System.out.println("========== Welcome to TechHub Loan Calculator ===========");
        System.out.println("========== The Program help you to select different loan options===========");
        System.out.println("\n===== MENU ======");
    }

    public static  void DisplayMenu(){
        System.out.println("Options: type 1 to appy for general loan\tType 2 for standard loan\tType 3 for Mega loan\tType 0 to quit the program");
    }

    public  static  void RunLoan(){
        Scanner scanner = new Scanner(System.in);

      while(true){

          int input = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Input = "+input);
          if (input==0)break;

          switch (input){
              case 1:
                  System.out.println("Option 1");
                  break;
              case 2:
                  System.out.println("Option 2");
                  break;
              case 3:
                  System.out.println("Option 3");
                  break;
              default:
                  System.out.println("Invalid Option ");
                  break;

          }

          DisplayMenu();

      }

    }
}
