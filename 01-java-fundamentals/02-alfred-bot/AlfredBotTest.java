// TRAVIS JEPSON SEPT 2021
// ALFREDBOT TESTER

public class AlfredBotTest 
{
    public static void main(String[] args)
    {
        // This makes an instance that allows you to access all the methods in AlfredQuotes.java
        // the instance here being alfredBot
        // IS THIS CORRECT
        AlfredQuotes alfredBot = new AlfredQuotes();

        String greetingTest = alfredBot.basicGreeting();
        String nameTest = alfredBot.guestGreeting("Bobby Ray", "evening");
        String setTheDateTest = alfredBot.dateAnnouncement(11, 13, 2021);
        String stringWithAlexisTest = alfredBot.respondBeforeAlexis("Is Alexis the best ever?");
        String stringWithAlfredTest = alfredBot.respondBeforeAlexis("Where is Alfred? I need a question answered.");
        String stringWithNothingTest = alfredBot.respondBeforeAlexis("Long ago in a time before I spent money on something that did not have the solution as advertised, I was a bit peeved.");

        System.out.println(greetingTest);
        System.out.println(greetingTest);
        System.out.println(nameTest );
        System.out.println(setTheDateTest);
        System.out.println(stringWithAlexisTest);
        System.out.println(stringWithAlfredTest);
        System.out.println(stringWithNothingTest);
    }
}