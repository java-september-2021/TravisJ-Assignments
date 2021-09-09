// TRAVIS JEPSON SEPT 2021
// BASICS
import java.util.Date;

// This only HOLDS all the quote methods
public class Basics 
{
    //works
    public int[] count255(int totalCount)
    {
        int[] theArray; 
        theArray = new int[totalCount];
        for(int i = 1; i < (totalCount+1); i++)
            {
            theArray[i-1] = i;
            System.out.println(i);
            }
       return theArray;
    }

    //works
    public int[] countOdd255(int totalCount)
    {
        int[] theArray; 
        theArray = new int[totalCount];
        for(int i = 1; i < (totalCount+1); i++)
            {
            theArray[i-1] = i;
            if(i % 2 != 0)
                {
                System.out.println(i);
                }
            }
            return theArray;
    }
    // works woo woo
    public int sumAllNumbersMethod(int incomingNumber)
    {
        int totalSum = 0; 
        for(int i = 1; i <= (incomingNumber+1); i++)
            {
            totalSum +=i;
            }
            return totalSum;
    }  // THIS IS NOT RETURNED TO THE TERMINAL, MAKE SURE TO USE SYS.out

    //
    public int[] customUserArray(int[] usersArray)
    {
        int[] theArray; 
        theArray = new int[usersArray.length];
        for(int i = 1; i < (usersArray.length+1); i++)
            {
            theArray[i-1] = i;
            System.out.println(i);
            }
       return theArray;
    }










}