// TRAVIS JEPSON SEPT 2021
// BasicsInstance TESTER

public class BasicsTest 
{
    public static void main(String[] args)
    {
        // This makes an instance that allows you to access all the methods in AlfredQuotes.java
        // the instance here being BasicsInstance
        // IS THIS CORRECT
        Basics BasicsInstance = new Basics();

        int paintTFF = BasicsInstance.count255(255);  //ADD THE INT HERE TO BE PASSED IN Basics.java
        // String nameTest = BasicsInstance.guestGreeting("Bobby Ray", "evening");
        // String setTheDateTest = BasicsInstance.dateAnnouncement(11, 13, 2021);
        // String stringWithAlexisTest = BasicsInstance.respondBeforeAlexis("Is Alexis the best ever?");
        // String stringWithAlfredTest = BasicsInstance.respondBeforeAlexis("Where is Alfred? I need a question answered.");
        // String stringWithNothingTest = BasicsInstance.respondBeforeAlexis("Long ago in a time before I spent money on something that did not have the solution as advertised, I was a bit peeved.");

        System.out.println(paintTFF);
        // System.out.println(nameTest );
        // System.out.println(setTheDateTest);
        // System.out.println(stringWithAlexisTest);
        // System.out.println(stringWithAlfredTest);
        // System.out.println(stringWithNothingTest);
    }
}