// TRAVIS JEPSON SEPT 2021
// BASICS TESTER
import java.util.ArrayList;

// also called ZooController
public class ZooKeeperTester 
{

    // ALL THE METHODS ARE HERE!!
    public static void main(String[] args)
    {
        // This makes an instance that allows you to access all the methods in AlfredQuotes.java
        // the instance here being BasicsInstance
        //
        Mammal matthew = new Mammal("human", 100);
        Gorilla dk = new Gorilla();   // THIS EXTENDS THE MAMMALS 

        Barrel b1 = new Barrel("Barrel");

        ArrayList<Mammal> myMammals = new ArrayList<Mammal>();
        myMammals.add(matthew);
        myMammals.add(dk);

        for (Mammal m : myMammals)
        {
            System.out.println(m.getSpecies());
        }

    }
}