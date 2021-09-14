// TRAVIS JEPSON SEPT 2021
// HUMAN ABSTRACT CLASS

//ABSTRACT - this is the blueprint for ALL HUMANS outside the mamal class?
// CONNECTS TO human ABSTRACT CLASS
// TRAVIS IS THE OBJECT that COMES OFF THE HUMAN OBJECT
public class Travis extends Human
{
    
    
    // CONSTRUCTOR
    public Travis()
    {
        super("Has some smarts", true, true);
    }
        public abstract void sleep();
    {
        System.out.println("Sleep is for the weak!  I don't want to....zzzzz...");
    }


    // METHODS 
    public abstract void eat();
    {
        System.out.println("Nom I loves me some good eats.");
    }


}