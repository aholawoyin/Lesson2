package com.techhub;

public class ArrayProject {
    // introduction to an array

   public static void main(String[] args){
       //ArrayManipulations();
      // MultiDimensionalArray();
       MultiDimensionalArray2();
   }

   public static void ArrayManipulations(){
       int[] scores = {45,66,90,67,34,78,66,81,49,77};
       System.out.println("Total number of score ="+ scores.length);
       System.out.println("First score of the array is ="+ scores[0]);
       System.out.println("Last score of the array is ="+ scores[scores.length - 1]);
       // change the score at the 6th position to 100
       scores[5] =100;
       // print the array using for loop

       for (int i=0; i< scores.length; i++){
           System.out.print(scores[i] +",");
       }

       // printing array using for-each loop
       System.out.print("\n\n");
       // using special characters
       System.out.println(" name:\"james\" \"fred\" ");
       for(int score : scores){
           System.out.print(score+",");
       }

   }

   public static void MultiDimensionalArray(){
       int[][] schoolScores = {{45,68,79},{56,88,120},{56,78,45}};

       int[] jss1Scores = schoolScores[0];
       int[] jss2Scores = schoolScores[1];
       int[] jss3Scores = schoolScores[2];

       // print the jss 1 result
       System.out.println("Jss 1 Scores");
       for (int score : jss1Scores){
           System.out.print(score+",");
       }

       System.out.println("\nJss 2 Scores");
       for (int score : jss2Scores){
           System.out.print(score+",");
       }

       System.out.println("\nJss 3 Scores");
       for (int score : jss3Scores){
           System.out.print(score+",");
       }
   }

   public static  void MultiDimensionalArray2(){
       int[][] schoolScores = {{45,68,79},{56,88,120},{56,78,45}};
       int classCounter = 1;
       for (int[] classScores : schoolScores){
           System.out.println("\nScore for Jss "+ classCounter);
           for (int score: classScores){
               System.out.print(score+",");
           }
           classCounter++;
       }
   }
}
