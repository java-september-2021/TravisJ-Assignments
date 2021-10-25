// TRAVIS JEPSON SEPT 2021
// PUZZLE JAVA

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PuzzleJava 
{
    public static void main(String[] args)
    {
       int[] puzzleArray = {};
       int[] array1 = {};
       int[] array2 = {};
       int[] testArray = {1,3,6,2,9,7,4,3,5,45,876,978,567,34,345,45,453,543,56,768,9};

       String[] names = {"Dave", "Jenny", "Alex", "BillyRay", "Emma"};
       // System.out.println(Arrays.toString(shuffleAndShow(names)));
       // alphabetScramble();
       // Random r = new Random();
       // System.out.println(r.nextInt(45) + 55); 
       // System.out.println(Arrays.toString(randomTen())); 
       // sortAndDisplay();
       // System.out.println(randomString());
       System.out.println(Arrays.toString(randomArrayOfStrings()));

   }

   // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
   // Print the sum of all numbers in the array. 
   // Also have the function return an array that only includes numbers that are greater than 10 
   // (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
   public static Object[] printSumReturnBig(int[] arr) {
       ArrayList<Integer> newArr = new ArrayList<Integer>();
       int sum = 0;
       for (int i=0; i<arr.length; i++) {
           sum+=arr[i];
           if (arr[i] > 10) {
               newArr.add(arr[i]);
           }
       }
       System.out.println(sum);
       return newArr.toArray();
   }

   // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
   // Shuffle the array and print the name of each person. 
   // Have the method also return an array with names that are longer than 5 characters.
   public static Object[] shuffleAndShow(String[] arr) {
       ArrayList<String> newArr = new ArrayList<String>();
       List<String> nameList = new ArrayList<String>();
       for (int i=0; i<arr.length; i++) {
           nameList.add(arr[i]);
       }
       Collections.shuffle(nameList);
       for (int i=0; i<nameList.size(); i++) {
           System.out.println(nameList.get(i));
           if (nameList.get(i).length() > 5) {
               newArr.add(nameList.get(i));
           }
       }
       return newArr.toArray();
   }

   // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
   // Shuffle the array and, after shuffling, display the last letter from the array. 
   // Have it also display the first letter of the array. 
   // If the first letter in the array is a vowel, have it display a message.
   public static void alphabetScramble() {
       ArrayList<Character> alphabet = new ArrayList<Character>();
       for (char i = 'a'; i <= 'z'; i++) {
           alphabet.add(i);
       }
       Collections.shuffle(alphabet);
       System.out.println(alphabet);
       System.out.println(alphabet.get(alphabet.size()-1));
       System.out.println(alphabet.get(0));
       if(alphabet.get(0) == 'a' || alphabet.get(0) == 'e' || alphabet.get(0) == 'i' || alphabet.get(0) == 'o' || alphabet.get(0) == 'u') {
           System.out.println("It's a vowel!!");
       }
   }
   
   // Generate and return an array with 10 random numbers between 55-100.
   public static int[] randomTen() {
       int[] randomArr = new int[10];
       Random r = new Random();
       for (int i = 0; i < randomArr.length; i++) {
           randomArr[i] = r.nextInt(45) + 55; 
       }
       return randomArr;
   }

   // Generate and return an array with 10 random numbers between 55-100 and have it be sorted 
   // (showing the smallest number in the beginning). 
   // Display all the numbers in the array. 
   // Next, display the minimum value in the array as well as the maximum value.
   public static Object[] sortAndDisplay() {
       int[] randomArr = randomTen();
       List<Integer> sortedList = new ArrayList<Integer>();
       for (int i=0; i<randomArr.length; i++) {
           sortedList.add(randomArr[i]);
       }
       Collections.sort(sortedList);
       System.out.println(sortedList);
       //MAX
       int max = sortedList.get(0);
       for (int i=1; i<sortedList.size(); i++) {
           if (sortedList.get(i) > max) {
               max = sortedList.get(i);
           }
       }
       System.out.println("Maximum Value is: " + max);
       //MIN
       int min = sortedList.get(0);
       for (int i=1; i<sortedList.size(); i++) {
           if (sortedList.get(i) < min) {
               min = sortedList.get(i);
           }
       }
       System.out.println("Minimum Value is: " + min);
       return sortedList.toArray();
   }

   // Create a random string that is 5 characters long.
   public static String randomString() {
       ArrayList<Character> randomCharArr = new ArrayList<Character>();
       ArrayList<Character> alphabet = new ArrayList<Character>();
       for (char i = 'a'; i <= 'z'; i++) {
           alphabet.add(i);
       }
       Collections.shuffle(alphabet);
       for (int i = 0; i<5; i++) {
           randomCharArr.add(alphabet.get(i));
       }
       // System.out.println(randomCharArr);
       StringBuilder randomStr = new StringBuilder();
       for (char randomChar : randomCharArr) {
               randomStr.append(randomChar);
           }
       return randomStr.toString();
   }

   // Generate an array with 10 random strings that are each 5 characters long
   public static String[] randomArrayOfStrings() {
       String[] randomArrayOfStrings = new String[10];
       for (int i=0; i<10; i++) {
           randomArrayOfStrings[i] = randomString();
       }
       return randomArrayOfStrings;


    }
}