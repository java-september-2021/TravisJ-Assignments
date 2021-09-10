// TRAVIS JEPSON SEPT 2021
// BASICS TESTER


public class AnimalController 
{

    // ALL THE METHODS ARE HERE!!
    public static void main(String[] args)
    {
        
        Animal dragon = new Animal("Dragon", 10, 4. "Blue");
        Animal unicorn = new Animal("Unicorn", 20, 3. "Pink");

        // goes into the constructor!!! 
        System.out.println("Current health of " unicorn.getType() + " is " + unicorn.getHealth());
        dragon.battle(unicorn, "Fireball");
        System.out.println(unicorn.getHealth());

        System.out.println("Current health of " dragon.getType() + " is " + dragon.getHealth());
        unicorn.battle(dragon, "Ax Kick");
        System.out.println(dragon.getHealth());
    }
}