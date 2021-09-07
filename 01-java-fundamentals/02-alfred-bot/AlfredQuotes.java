// TRAVIS JEPSON SEPT 2021
// ALFREDBOT
import java.util.Date;

// This only HOLDS all the quote methods
public class AlfredQuotes 
{
    //No need for code here, this is just a method that returns the following text.
    public String basicGreeting()
    {
        return "Hello there, its lovely to see you.  How are you today?";
    }

    //Assuming dayPeriod comes from util.Date...
    //Not sure if parameters taken in need to be redefined 
    public String guestGreeting(String name, String dayPeriod)
    {
        return "Good " + dayPeriod + " " + name ".  How are you today?";
    }

    // is this correct?
    // NOT FOLLOWING THE util.DATE, just using the method
    public String dateAnnouncement(Int month, Int day, Int year)
    {
        return "Greetings! Today's date is " + month + "/" + day + "/" + year ".";
    }

    public String respondBeforeAlexis(String conversation)
    {
        if(a = conversation.indexOf("Alfred") > 0)
        {
            return "At your service, allow me to assist you.";
        }
        else if(a = conversation.indexOf("Alexis") > 0)
        {
            return "Eww. Alexis is gross. Allow a real AI service to solve your problem.";
        }
        else
        {
            return "Indeed. With that, I will sign off for the day.";
        }
    }
}