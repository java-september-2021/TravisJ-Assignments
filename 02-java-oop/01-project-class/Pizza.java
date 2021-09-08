// TRAVIS JEPSON SEPT 2021
// OBJECT PLAY
// Lecture 9/7/21
import java.util.Date;
import java.util.ArrayList;

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

    public void setToppings(String name)
    {
        this.toppings = toppings;
    }

    public void setSlices(int slices )
    {
        this.slices = slices;
    }

    public void setType(String type)
    {
        this.type = type;
    }



// Stuff you can do
    // Eat()

    // display()

    // cook()
    // {

    // }
}