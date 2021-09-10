// TRAVIS JEPSON SEPT 2021
// BASICS TESTER

// CONNECTS TO THE MAMAL CLASS
public class Barrel implements Attackable
{
    // allows you to create an ob
    private String name;
    private int health;
    
    public Barrel (String name)
    {
        this.name = name;
        this.health = 30; 
    }
    

    public void setHealth(int health)
    {
        this.health = health;
    }
    public int getHealth()
    {
        return this.health;
    }
    
    //public Gorilla()
    // {
    // // THIS MUST SATISFY THE MAMMAL CLASS REQUIREMENTS
    // super("Gorilla",500);    // THIS USES A METHOD THAT IS PART OF THE 
    // }

    // public void eatBanana()
    // {
    //     System.out.printf("I am a %s eating a banana", this.species);
    // }

}