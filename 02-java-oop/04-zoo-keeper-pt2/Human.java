// TRAVIS JEPSON SEPT 2021
// HUMAN ABSTRACT CLASS

//ABSTRACT - this is the blueprint for ALL HUMANS outside the mamal class?
// CONNECTS TO THE MAMAL CLASS
//  THESE ATTRIBUTES MUST ALL BE INCLUDED TO EVEN BE CONSIDERED 
public abstract class Human
{
    //common attributes
    private String intelligence;
    private boolean bipedal;
    private boolean breathe;

    public Human(String intelligence, boolean bipedal, boolean breathe)
    {
        this.intelligence = intelligence;
        this.bipedal = bipedal;
        this.breathe = breathe;
    }

    // this does not create a human object, you create decendants from this object
    // that inherrits these traits
    public abstract void sleep();
    public abstract void eat();






    // // allows you to create an ob
    // private String name;
    // private int health;
    
    // public Barrel (String name)
    // {
    //     this.name = name;
    //     this.health = 30; 
    // }
    

    // public void setHealth(int health)
    // {
    //     this.health = health;
    // }
    // public int getHealth()
    // {
    //     return this.health;
    // }
    
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