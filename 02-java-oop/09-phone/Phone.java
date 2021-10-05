// TRAVIS JEPSON SEPT 2021
// OBJECT PLAY
// Lecture 9/7/21
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

// This is a METHOD

// PHONE TEMPLATE WIP!
public class Phone 
{
   
        private String name;
        private String[] toppings;
        private char size;
        private int slices;
        private String type;

       // set to number of accounts
        static int NumberOfPhones;
        
        
        public Phone()
        {
            NumberOfPhones++;
        }
        
        public Phone(String name, String[] toppings, char size, String type, int slices)
        {
            this.name = name;
            this.toppings = toppings;
            this.size = size;
            this.type = type;
            this.slices = slices;
            NumberOfPhones++;
        }
       
    public Phone(String name, char size, String type)
    {
        this.name = name;
        this.toppings = new String[] {"Cheese", "Pepperoni"};
        this.size = size;
        this.type = type;
        this.slices = 10;
        NumberOfPhones++;
    }

    public Phone(String name, char size, String type)
    {
        this.name = name;
        this.toppings = new String[] {"Cheese", "Pepperoni"};
        this.size = size;
        this.type = type;
        this.slices = 10;
        NumberOfPhones++;
    }


    //setters! WATCH LECTURE
    // SETTERS ARE VOID
    public void setName(String name)
    {
        if(name.equals(""))
        {
            System.out.println("You must enter a name for your Phone.");
            return;
        }
        this.name = name;
    }
    public void setToppings(String[] toppings)
    {
        this.toppings = toppings;
    }
    public void setSize(char size)
    {
        this.size = size;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setSlices(int slices )
    {
        this.slices = slices;
    }
    // public void setNumberOfPhones(int totalPhones )
    // {
    //     this.totalPhones = totalPhones;
    // }

    //getters
     public String getName()
     {
         return this.name;
     }
     public String[] getToppings()
     {
        return this.toppings;
     }
     public char getSize()
     {
         return this.size;
     }
     public String getType()
     {
        return this.type;
     }
     public int getSlices()
     {
         return this.slices;
     }
     // ADDED STATIC
     public static int getNumberOfPhones()
    {
        // this.NumberOfPhones;
        return NumberOfPhones;
    }

    
    public static String advertise()
    {
        return "EYYYY we got some Phone ova here!";
    }

    public String displayPhone()
    {
        return String.format("This is a %s with %s toppings %d slices", this.name, 
        Arrays.toString(this.toppings), this.slices);
    }

// THIS METHOD OBJECTS AFFECTS OTHER OBJECTS ATTRIBUTES

    public void PhoneFight(Phone otherPhone)
    {
        int numOfSlices = otherPhone.getSlices();
        numOfSlices -= 1;
        otherPhone.setSlices(numOfSlices);

        System.out.println(this.name + " just pwnt " + otherPhone.getName() + " and " + otherPhone.getName() + " currently has " + otherPhone.getSlices());
    }
}