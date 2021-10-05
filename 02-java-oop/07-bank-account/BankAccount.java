// TRAVIS JEPSON SEPT 2021
// OBJECT PLAY
// Lecture 9/7/21
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

// This is a METHOD

// CONVERT FROM PIZZA TO BANK ACCOUNT
public class BankAccount 
{
   
        private String name;
        private String[] toppings;
        private char size;
        private int slices;
        private String type;

       // set to number of accounts
        static int numberOfPizzas;
        
        
        public Pizza()
        {
            numberOfPizzas++;
        }
        
        public Pizza(String name, String[] toppings, char size, String type, int slices)
        {
            this.name = name;
            this.toppings = toppings;
            this.size = size;
            this.type = type;
            this.slices = slices;
            numberOfPizzas++;
        }
       
    public Pizza(String name, char size, String type)
    {
        this.name = name;
        this.toppings = new String[] {"Cheese", "Pepperoni"};
        this.size = size;
        this.type = type;
        this.slices = 10;
        numberOfPizzas++;
    }

    public Pizza(String name, char size, String type)
    {
        this.name = name;
        this.toppings = new String[] {"Cheese", "Pepperoni"};
        this.size = size;
        this.type = type;
        this.slices = 10;
        numberOfPizzas++;
    }


    //setters! WATCH LECTURE
    // SETTERS ARE VOID
    public void setName(String name)
    {
        if(name.equals(""))
        {
            System.out.println("You must enter a name for your Pizza.");
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
    // public void setNumberOfPizzas(int totalPizzas )
    // {
    //     this.totalPizzas = totalPizzas;
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
     public static int getNumberOfPizzas()
    {
        // this.numberOfPizzas;
        return numberOfPizzas;
    }

    
    public static String advertise()
    {
        return "EYYYY we got some Pizza ova here!";
    }

    public String displayPizza()
    {
        return String.format("This is a %s with %s toppings %d slices", this.name, 
        Arrays.toString(this.toppings), this.slices);
    }

// THIS METHOD OBJECTS AFFECTS OTHER OBJECTS ATTRIBUTES

    public void pizzaFight(Pizza otherPizza)
    {
        int numOfSlices = otherPizza.getSlices();
        numOfSlices -= 1;
        otherPizza.setSlices(numOfSlices);

        System.out.println(this.name + " just pwnt " + otherPizza.getName() + " and " + otherPizza.getName() + " currently has " + otherPizza.getSlices());
    }
}