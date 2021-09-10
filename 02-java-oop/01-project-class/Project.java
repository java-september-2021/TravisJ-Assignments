// TRAVIS JEPSON SEPT 2021
// PROJECT CLASS

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

// This is a METHOD
public class Project 
{
    //attributes
    // CHANGE TO PRIVATE SHORTLY??
    // SO GETTERS AND SETTERS ARE HOW YOU ACCESS THEM
        private String name;
        private String[] toppings;
        // public String[] toppings = new String[] = {"Cheese","Sauce"}; // sets default ASK IF CORRECT
        // public ArrayList<String> toppings;  // MORE DYNAMIC SEE LINE 20
        private char size;
        private int slices;
        private String type;

        // ALL OF THESE ATTRIBUTES ARE EMPTY BUT THEIR TYPE IS SOLID
        // all of these can be assigned a default value, THESE ARE OVERRIDDEN BY THE CONSTRUCTOR(s)

        // keep track of all pizzas sold
        // if this is PRIVATE
        // THIS IS STATIC BECAUSE IT IS BELONGING OT THE CLASS RATHER THAN THE OBJECT 
        // keep track of more general attributes
        static int numberOfPizzas;
        
        // THIS IS FOR cheese empty default pizza 26-33
        //NOTHING HERE - THIS IS THE BEAN!
        public Pizza()
        {
            numberOfPizzas++;
        }
        // MAKE SURE THIS IS ACCURATELY CALLED ETC
        // its this.ATTRIBuTE because it links in the given situation?

        //THIS METHOD IS CLASS SPECIFIC
        // AKA A constructor type default
        // public is the access modifier
        // THIS IS FOR THE SPECIFIC CONSTRUCTOR
        public Pizza(String name, String[] toppings, char size, String type, int slices)
        {
            this.name = name;
            this.toppings = toppings;
            this.size = size;
            this.type = type;
            this.slices = slices;
            numberOfPizzas++;
        }
        //THIS METHOD IS CLASS SPECIFIC
    // public is the access modifier
    // removed TOPPINGS AREA for this constructor
    // this will take over for DEFAUL
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