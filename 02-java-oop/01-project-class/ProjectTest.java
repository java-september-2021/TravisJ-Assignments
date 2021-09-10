// TRAVIS JEPSON SEPT 2021
// PROJECT CLASS

import java.util.ArrayList;
import java.util.Arrays;

public class ProjectTest

    public static void main(String[] args)
    {
       
        Pizza cheese = new Pizza();
        cheese.setName("Cheese Pizza");
            String[] cheezeArray = {"Cheese","Sauce"};
            cheese.setToppings(cheezeArray);
        cheese.setSize('S'); 
        cheese.setSlices(10);
        cheese.setType("Pan");


        // cheese.toppings.add("Pepper Jack");

        // IS THIS DEAD SINCE THE CONSTRUCTOR IS NOW SET? ^

        // Because thesea private you now use getName, etc etc
        // Make sure when using the getName to ADD two parenthesees
        System.out.println("Pizza Name: " + cheese.getName());
        System.out.println("Pizza Size: " + cheese.getSize());
        System.out.println("Pizza Toppings: " + Arrays.toString(cheese.getToppings()));

        // ADD THE ARRAY WITHT HE SQUARE BRACKETS
        // Pizza meatLovers = new Pizza("Meat Lovers Pizza", String[] meatToppings {"Sausage","Bacon","Ham"}, 'L', "New York");

        String[] meatToppings = {"Sausage","Bacon","Ham"};  // ADD THE TOPPINGS LIKE THIS
        Pizza meatLovers = new Pizza("Meat Lovers Pizza", meatToppings, 'L', "New York");

        String[] veggieToppings = {"Grass","Flowers","Lettice","Leaves"};  
        Pizza veggiePizza = new Pizza("Veggie", veggieToppings, 'S', "Thin Crust");

        // String[] spinachToppings = {"Grass","Flowers","Lettice","Leaves"};  // DONT NEED ANYMORE
        // NOW YOU CAN MAKE THE ARRAY IN ONE LINE!
        Pizza spinachSpecial = new Pizza("Spinach", new String[] {"Spinach","More Spinach","Cheese","Olives"}, 'L', "Thick Crust", 12);
        
        // THIS WILL NOT WORK BASED ON CURRENT constructor
        // Pizza spinachSpecial = new Pizza(new String[] {"Spinach","More Spinach","Cheese","Olives"}, "Spinach", 'L', "Thick Crust");

        System.out.print("Pizza Name: " + meatLovers.getName() + "   ");
        System.out.print("Pizza Size: " + meatLovers.getSize() + "   ");
        System.out.println("Pizza Toppings: " + Arrays.toString(meatLovers.getToppings())+ "\n");

        System.out.println("Pizza Name: " + veggiePizza.getName());
        System.out.println("Pizza Size: " + veggiePizza.getSize());
        System.out.println("Pizza Toppings: " + Arrays.toString(veggiePizza.getToppings())+ "\n");

        //CHECK TOTAL PIZZAS MADE        
        System.out.println("Total Pizzas Made: " + Pizza.getNumberOfPizzas()+ "\n");
        System.out.println(Pizza.advertise());
    }
}