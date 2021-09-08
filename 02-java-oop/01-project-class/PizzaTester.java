// TRAVIS JEPSON SEPT 2021
// OBJECT PLAY
// Lecture 9/7/21
import java.util.ArrayList;
import java.util.Arrays;

public class PizzaTester 
{

    // ALL THE METHODS ARE HERE!!
    public static void main(String[] args)
    {
        // This makes an instance that allows you to access all the methods in AlfredQuotes.java
        // the instance here being BasicsInstance
        //
        Pizza cheese = new Pizza();
        cheese.name = "Cheese Pizza";
            String[] cheeze = {"Cheese","Sauce"};
            cheese.toppings = cheeze;
        cheese.size = 'S';
        cheese.slices = 10;
        cheese.type = "Pan";
        // cheese.toppings.add("Pepper Jack");

        System.out.println("Pizza Name: " + cheese.name);
        System.out.println("Pizza Size: " + cheese.size);
        System.out.println("Pizza Toppings; " + Arrays.toString(cheese.toppings));
    }
}