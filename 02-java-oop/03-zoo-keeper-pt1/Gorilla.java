// TRAVIS JEPSON SEPT 2021
// BASICS TESTER

// CONNECTS TO THE MAMAL CLASS
// USE WORDS EXTENDS
public class Gorilla extends Mammal
{
    public Gorilla()
    {
    // THIS MUST SATISFY THE MAMMAL CLASS REQUIREMENTS
    super("Gorilla",500);    // THIS USES A METHOD THAT IS PART OF THE 
    }

    public void eatBanana()
    {
        System.out.printf("I am a %s eating a banana", this.species);
    }

    // SPECIAL TAKE DAMAGE METHOD SPECIFIC TO THE GORILLA CLASS!  
    // NOW IMPLIMENT AN OVERRIDE!!!!
    // THIS IS IMPORTANT - MUST BE CALLED OVERRIDE!!!!!
    // ONLY APPLY AN OVERRIDE 
    @Override
    public void takeDamage(int damageAmount)
    {
        this.health -= (damageAmount/2);
    }


}