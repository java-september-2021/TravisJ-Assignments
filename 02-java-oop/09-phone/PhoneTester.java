// TRAVIS JEPSON SEPT 2021
// OBJECT PLAY
// Lecture 9/7/21
import java.util.ArrayList;
import java.util.Arrays;



// PHONE TEMPLATE WIP!
public class PhoneTester 
{

    public static void main(String[] args)
    {
      
        Phone cheese = new Phone();
        cheese.setName("Cheese Phone");
            String[] cheezeArray = {"Cheese","Sauce"};
            cheese.setToppings(cheezeArray);
        cheese.setSize('S'); 
        cheese.setSlices(10);
        cheese.setType("Pan");


        System.out.println("Phone Name: " + cheese.getName());
        System.out.println("Phone Size: " + cheese.getSize());
        System.out.println("Phone Toppings: " + Arrays.toString(cheese.getToppings()));

        String[] meatToppings = {"Sausage","Bacon","Ham"};  // ADD THE TOPPINGS LIKE THIS
        Phone meatLovers = new Phone("Meat Lovers Phone", meatToppings, 'L', "New York");

        String[] veggieToppings = {"Grass","Flowers","Lettice","Leaves"};  
        Phone veggiePhone = new Phone("Veggie", veggieToppings, 'S', "Thin Crust");

        Phone spinachSpecial = new Phone("Spinach", new String[] {"Spinach","More Spinach","Cheese","Olives"}, 'L', "Thick Crust", 12);
        

        System.out.print("Phone Name: " + meatLovers.getName() + "   ");
        System.out.print("Phone Size: " + meatLovers.getSize() + "   ");
        System.out.println("Phone Toppings: " + Arrays.toString(meatLovers.getToppings())+ "\n");

        System.out.println("Phone Name: " + veggiePhone.getName());
        System.out.println("Phone Size: " + veggiePhone.getSize());
        System.out.println("Phone Toppings: " + Arrays.toString(veggiePhone.getToppings())+ "\n");

        //CHECK TOTAL PhoneS MADE        
        System.out.println("Total Phones Made: " + Phone.getNumberOfAccounts()+ "\n");
        System.out.println(Phone.advertise());
    }
}