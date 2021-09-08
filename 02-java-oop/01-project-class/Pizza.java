// TRAVIS JEPSON SEPT 2021
// OBJECT PLAY
// Lecture 9/7/21
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

// This is a METHOD
public class Pizza 
{
    //attributes
    // CHANGE TO PRIVATE SHORTLY??
        public String name;
        public String[] toppings;
        // public String[] toppings = new String[] = {"Cheese","Sauce"}; // sets default ASK IF CORRECT
        // public ArrayList<String> toppings;  // MORE DYNAMIC SEE LINE 20
        public char size;
        public int slices;
        public String type;

        // keep track of all pizzas sold
        // if this is PRIVATE
        static int numberOfPizzas;

// constructor type default
// public is the access modifier
    public Pizza(String name, String[] toppings, Char size, String type)
    {
        this.name = name;
        this.toppings = toppings;
        this.size = size;
        this.type = type;
        this.slices = 10;
        numberOfPizzas++;
    }

    // constructor new type!
    // public is the access modifier
    // removed TOPPINGS AREA for this constructor
    public Pizza(String name, Char size, String type)
    {
        this.name = name;
        this.toppings = new String[] {"Cheese", "Pepperoni"};
        this.size = size;
        this.type = type;
        this.slices = 10;
        numberOfPizzas++;
    }

    //setters! WATCH LECTURE
    public void setName(String name)
    {
        if(name.equals(""))
        {
            System.out.println("You must enter a name for your Pizza.")
            return;
        }
        this.name = name;
    }
    public void setToppings(String[] name)
    {
        this.toppings = toppings;
    }
    public void setType(char size)
    {
        this.size = size;
    }
    public void setSize(int slices )
    {
        this.slices = slices;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setSlices(int slices )
    {
        this.slices = slices;
    }

    //getters
    public void setName(String name)
    {
        if(name.equals(""))
        {
            System.out.println("You must enter a name for your Pizza.")
            return;
        }
        this.name = name;
    }
    public void setToppings(String[] name)
    {
        this.toppings = toppings;
    }
    public void setType(char size)
    {
        this.size = size;
    }
    public void setSize(int slices )
    {
        this.slices = slices;
    }
    public String getType
    {
        return this.type;
    }
    public void setSlices(int slices )
    {
        this.slices = slices;
    }

    
    public static String advertise()
    {
        return "EYYYY we got some Pizza ova here!";
    }

    public String displayPizza()
    {
        return String.format("This is a %s with %s toppings %d slices", this.name, Arrays.toString(this.toppings), this.slices)
    }

// THIS METHOD OBJECTS AFFECTS OTHER OBJECTS ATTRIBUTES

public void pizzaFight(Pizza otherPizza)
{
    int numOfSlices = otherPizza.getSlices();
    numOfSlices -= 1;
    otherPizza.setSlices(numOfSlices);

    System.out.println(this.name + " just pwnt " + otherPizza.getName() + " and " + otherPizza.getName() + " currently has " + otherPizza.getSlices())
}



}