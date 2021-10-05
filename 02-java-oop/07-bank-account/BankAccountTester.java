// TRAVIS JEPSON SEPT 2021
// OBJECT PLAY
// Lecture 9/7/21
import java.util.ArrayList;
import java.util.Arrays;

public class BankAccountTester 
{

    public static void main(String[] args)
    {
      
        BankAccount cheese = new BankAccount();
        cheese.setName("Cheese Pizza");
            String[] cheezeArray = {"Cheese","Sauce"};
            cheese.setToppings(cheezeArray);
        cheese.setSize('S'); 
        cheese.setSlices(10);
        cheese.setType("Pan");


        System.out.println("Pizza Name: " + cheese.getName());
        System.out.println("Pizza Size: " + cheese.getSize());
        System.out.println("Pizza Toppings: " + Arrays.toString(cheese.getToppings()));

        String[] meatToppings = {"Sausage","Bacon","Ham"};  // ADD THE TOPPINGS LIKE THIS
        Pizza meatLovers = new Pizza("Meat Lovers Pizza", meatToppings, 'L', "New York");

        String[] veggieToppings = {"Grass","Flowers","Lettice","Leaves"};  
        Pizza veggiePizza = new Pizza("Veggie", veggieToppings, 'S', "Thin Crust");

        Pizza spinachSpecial = new Pizza("Spinach", new String[] {"Spinach","More Spinach","Cheese","Olives"}, 'L', "Thick Crust", 12);
        

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