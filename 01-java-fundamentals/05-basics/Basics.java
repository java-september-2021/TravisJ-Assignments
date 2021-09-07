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

    public int sumAllNumbersMethod(int incomingNumber)
    {
        int totalSum = 0; 
        for(int i = 1; i <= (incomingNumber+1); i++)
            {
            totalSum +=i;
            }
            return totalSum;
    }  // THIS IS NOT RETURNED TO THE TERMINAL, MAKE SURE TO USE SYS.out

    


















    //Assuming dayPeriod comes from util.Date...
    //Not sure if parameters taken in need to be redefined 
    public String guestGreeting(String name, String dayPeriod)
    {
        return "Good " + dayPeriod + " " + name + ".  How are you today?";
    }

    // is this correct?
    // NOT FOLLOWING THE util.DATE, just using the method
    public String dateAnnouncement(int month, int day, int year)
    {
        return "Greetings! Today's date is " + month + "/" + day + "/" + year + ".";
    }

    public String respondBeforeAlexis(String conversation)
    {
        if(conversation.indexOf("Alfred") > 0)
        {
            return "At your service, allow me to assist you.";
        }
        else if(conversation.indexOf("Alexis") > 0)
        {
            return "Eww. Alexis is gross. Allow a real AI service to solve your problem.";
        }
        else
        {
            return "Indeed. With that, I will sign off for the day.";
        }
    }
}