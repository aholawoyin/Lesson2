package com.techhub;

public class Loops {
    // For Loop
    ///   for (initilalization; condition; increment ; )

   public static void main(String [] args){
   // Loop1();
   // Loop2();
   // Loop3();
     //  Loop4();
    //   Loop5();
       Loop6();
   }

   public static  void Loop1(){
       int sum =0;
       // counter = counter  + 1;
       // count++
       //  counter += 1;
       for( int counter = 1; counter <= 50; counter++){
           sum = sum + counter;
       }

       System.out.println("Sum = "+ sum);
   }

   public static  void Loop2(){
        // break and continue
       int sum =0;
       //  compute only even numbers
       for (int counter =1; counter <= 50; counter++){

           if (counter % 2 == 0){
               // this is an even number
               sum = sum + counter;
           }

       }
       System.out.println("Sum of even numbers = "+ sum);
   }

   public static  void Loop3(){
        // using break and continue operators
       // stop the addition when the counter reaches 45  and exlude 20,39,30
       int sum = 0;
       for (int counter =0; counter <=50; counter++){

           if (counter == 20 || counter == 30 || counter == 39){
               continue;
           }

           if (counter == 45) break;

           System.out.println(counter);
       }
   }

   public static  void Loop4(){
        // Infinity loop  with break
       int counter = 1;
       for (;;){

           if(counter == 20)break;
           System.out.println("Counter = "+counter);
           counter = counter + 1;
       }
   }

   public  static  void Loop5(){
        // While loop
       boolean isCompleted = false;
       int sum = 10;
       while (!isCompleted){
           sum = sum * 24 + 15;

           if(sum > 50000){
               isCompleted = true;
           }
       }

       System.out.println("Computation result = "+ sum);
   }

   public  static  void Loop6(){
        // while infinite loop with break;

       int gameCounter = 1;
       while (true){
          // Generate Game
          gameCounter = gameCounter + 34;
          System.out.println("Game Engine "+ gameCounter+" Genarted!");

          if (gameCounter >= 50000) break;
       }

   }
}
