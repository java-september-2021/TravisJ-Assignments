// TRAVIS JEPSON SEPT 2021
// BASICS TESTER

public class BasicsTest 
{
    public static void main(String[] args)
    {
        // This makes an instance that allows you to access all the methods in AlfredQuotes.java
        // the instance here being BasicsInstance
        //
        Basics BasicsInstance = new Basics();

        int[] countTFF =  BasicsInstance.count255(255);  // takes in user number counts them all
        int[] countOddTFF =  BasicsInstance.countOdd255(255); // takes in number and returns odd
        
        int sumEmAll =  BasicsInstance.sumAllNumbersMethod(255); // takes in number and adds all numbers counting up to that point
        System.out.println(sumEmAll);
        
        int[] userArray = {1,2,3,4,5,6,7,8,9,0,8,6,5,4,4,6,78,8,5,1337,9001};
        int[] customArrayInstance =  BasicsInstance.customUserArray(userArray);  // takes in user number counts them all

     






        // int countOddTFF =  BasicsInstance.count255(255);
        // BasicsInstance.count255(255);  //ADD THE INT HERE TO BE PASSED IN Basics.java
        // BasicsInstance.countOdd255(255);




        // String nameTest = BasicsInstance.guestGreeting("Bobby Ray", "evening");
        // String setTheDateTest = BasicsInstance.dateAnnouncement(11, 13, 2021);
        // String stringWithAlexisTest = BasicsInstance.respondBeforeAlexis("Is Alexis the best ever?");
        // String stringWithAlfredTest = BasicsInstance.respondBeforeAlexis("Where is Alfred? I need a question answered.");
        // String stringWithNothingTest = BasicsInstance.respondBeforeAlexis("Long ago in a time before I spent money on something that did not have the solution as advertised, I was a bit peeved.");

        // System.out.println(printTFF + "  END OF 255 COUNT \n");
        // System.out.println(printOddTFF + "\n");

        // System.out.println(setTheDateTest);
        // System.out.println(stringWithAlexisTest);
        // System.out.println(stringWithAlfredTest);
        // System.out.println(stringWithNothingTest);
    }
}