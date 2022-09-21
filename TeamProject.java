/*
Project: Team Project
Name: Ryan Gowers
Email: ryangowers1999@gmail.com
Description: Numbers code created to perform certain actions on a list of numbers.
Course: CSIS-1400
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class TeamProject {
   public static void main(String[] args) {   
   Scanner scnr = new Scanner(System.in);
   System.out.println("Input first number to signal the length of array then input numbers to compute");
   final int arrayLength = scnr.nextInt();
   int[] userInput = new int[arrayLength];
   
   System.out.println("Enter your numbers: ");
   for (int i = 0; i < arrayLength; i++) {
      userInput[i] = scnr.nextInt();
   }
   
   System.out.print("Your numbers are: ");
     
   for (int i = 0; i < userInput.length; i++) {
      System.out.print(userInput[i] + ", ");
   }
   System.out.println();
   System.out.println();
   
   System.out.println("MENU");
   System.out.println("m - Get the mode");
   System.out.println("b - Get the median");
   System.out.println("c - Get the mean");
   System.out.println("a - Sort numbers in ascending order");
   System.out.println("d - Sort numbers in descending order");
   System.out.println("q - Quit");
   System.out.println();

   char m; // Switch statement to run the menu options.
   boolean shouldStop = false;
   while (shouldStop == false) {
      System.out.println("Choose an option:");
      m = scnr.next().charAt(0);
      switch(m) {
      
         case 'm':
         System.out.print("The mode of your numbers is: ");
         System.out.println(getMode(userInput, arrayLength));
         break;

         case 'b':
         System.out.print("The median of your numbers is: ");
         System.out.println(getMedian(userInput, arrayLength));
         break;

         case 'c':
         System.out.print("The mean of your numbers is: ");
         System.out.print(getMean(userInput, arrayLength));
         System.out.println(" (Rounded)");
         break;

         case 'a':
         System.out.print("Numbers in ascending order: ");
         getAscending(userInput, arrayLength);
         break;
         
         case 'd':
         System.out.print("Numbers in descending order: ");
         getDescending(userInput, arrayLength);
         break;
         
         case 'q':
         shouldStop = true;
         break;
         
         default:
            System.out.println("Invalid letter choose new letter:");
      }
   
      }
   }


   public static int getMode (int[] userNums, int arrayLength) {
      int i;
      int j;
      int max = 0;
      int maxCount = 0;
         
      for (i = 0; i < arrayLength; i++) {
         int count = 0;
         for (j = 0; j < arrayLength; j++) {
            if (userNums[j] == userNums[i]) {
            ++count;
            }
         if (count > maxCount) {
            maxCount = count;
            max = userNums[i];
         }
      }   
   }
      int getMode = max;
      return getMode;
   }


   public static int getMedian (int[] userNums, int arrayLength) {
      int getMedian = 0;
   
      if (userNums.length % 2 == 0) {
         getMedian = ((int)userNums[userNums.length / 2] + (int)userNums[userNums.length / 2 - 1]) / 2;
      }
      else {
         getMedian = (int) userNums[userNums.length / 2];
      }
      return getMedian;
   }


   public static int getMean (int[] userNums, int arrayLength) {
      int getMean = 0;
      int i;
      int sum = 0;
   
      for (i = 0; i < arrayLength; i++) {
         sum += userNums[i];
      }
   
      getMean = sum / arrayLength;
      return getMean;
   }


   public static int[] getAscending (int[] userNums, int arrayLength) {
      Arrays.sort(userNums);
      for (int userNum : userNums) {
         System.out.print(userNum + ", ");
      }
      System.out.println();
      return userNums;   
   }
   

   public static int[] getDescending (int[] userNums, int arrayLength) {
      Arrays.sort(userNums);
      int temp = 0;
      for (int i = 0; i < userNums.length / 2; i++) {
         temp = userNums[i];
         userNums[i] = userNums[userNums.length - i - 1];
         userNums[userNums.length - i - 1] = temp;
      }
      for (int i = 0; i < userNums.length; i++) {
         System.out.print(userNums[i] + ", ");
      }
      System.out.println();
      return userNums;
   }
}











