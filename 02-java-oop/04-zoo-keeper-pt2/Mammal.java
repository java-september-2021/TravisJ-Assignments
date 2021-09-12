// TRAVIS JEPSON SEPT 2021
// ZOO KEEPER
import java.util.Date;

// This is a METHOD
// REMEMBER TO ADD THROUGH IMPLIMENTS
public class Mammal implements Attackable
{

    // CHANGE THIS FROM PRIVATE to PROTECTED to allow for calling this.species in the GORILLA FILE
    protected String species;
    protected int health;


    // CHILD CLASSES THAT TAKE IN ATTRIBUTES OF THE PARENT CLASSES
    public Animal(String species, int health)
    {
        this.type = type;
        this.strength = strength;
        this.speed = speed;
        this.color = color;
    }

    // setters
    public void setSpecies(String species)
    {
        this.species = species;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
    public void takeDamage(int damageAmount)
    {
        this.health -= damageAmount;
    }


    // getter 
    public String getSpecies()
    {
        return this.species;
    }
    public int getHealth()
    {
        return this.health;
    }

    // This allows for classes to be grouped together, this is connected by an INTERFACE
    // public void attack(Mammal target)
    // {
    //     target.health -= 5;
    // }

    public void attack(Attackable target)
    {
        int targetsHealth = target.getHealth();

        target.health -= 5;
        target.setHealth(targetsHealth);
    }













//    private String type;
//    private int strength;
//    private int speed;
//    private String color;
//    private int health = 100;  // THIS IS DEFAULT THAT CAN BE OVERRIDDEN BY A CONSTRUCTOR

//    public Animal(String type, int strength, int speed, String color)
//     {
//         this.type = type;
//         this.strength = strength;
//         this.speed = speed;
//         this.color = color;
//     }
    
//     // setters
//     public void setType(String type)
//     {
//         this.type = type;
//     }
//     public void setStrength(int strength)
//     {
//         this.strength = strength;
//     }
//     public void setSpeed(int speed)
//     {
//         this.speed = speed;
//     }
//     public void setColor(String color)
//     {
//         this.color = color;
//     }
//     public void setHealth(int health)
//     {
//         this.health = health;
//     }

//     // getter 
//     public String getType()
//     {
//         return this.type;
//     }
//     public int getStrength()
//     {
//         return this.strength;
//     }
//     public int getSpeed()
//     {
//         return this.speed;
//     }
//     public int getColor()
//     {
//         return this.color;
//     }
//     public int getHealth()
//     {
//         return this.health;
//     }
    
//     // instance method!! ONLY CALLED IF THE INSTANCE IS CALLED AND FED 
//     public void battle(Animal target, String powerMove)
//     {
//         int damage;
//         if(powerMove.equals("Fireball"))  // COMPARE STRING with .equals, not == or =
//             { damage = 3;}
//         else if(powerMove.equals("Ax Kick"))
//             { damage = 4;}
//         else if(powerMove.equals("Knockout Blow"))
//             { damage = 5;}
//         else(powerMove.equals("Move Not Recognized"))
//             return;
//     }

//     // METHOD VARIABLES = local variables, method descriptors
//     int effectiveDamage = this.strength * damage;

//     int targetsHealth = target.getHealth();
//     targetsHealth -= effectiveDamage;
//     target.setHealth(targetsHealth);

//     System.out.printf("%s attacks!  Hitting %s for %d health points", this.type, target.getType(), effectiveDamage);

}