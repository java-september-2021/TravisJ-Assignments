// TRAVIS JEPSON SEPT 2021
// PROJECT CLASS

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class Project 
{
        private String name;
        private String description;
        private double initialCost;

        // Static to track of project total
        static int numberOfProjects;
       
        // Java Bean and To Track Number of Projects
        public Project()
        {
            numberOfProjects++;
        }
        
        // Constructor 1
        public Project(String name, String description, double initialCost)
        {
            this.name = name;
            this.description = description;
            this.initialCost = initialCost;
            numberOfProjects++;
        }
        
        // Constructor 2
        public Project(String name)
        {
            this.name = name;
            this.description = "No description provided.  This must be TOP SECRET.";
            numberOfProjects++;
        }

    // Setters
    public void setName(String name)
    {
        if(name.equals(""))
        {
            System.out.println("You must enter a name for your project.  Please try again.");
            return;
        }
        this.name = name;
    }
    public void setDescription(String description)
    {
        if(name.equals(""))
        {
            System.out.println("You must enter a description for your project.  Please try again.");
            return;
        }
        this.description = description;
    }
    public void setInitialCost(double initialCost)
    {
        if(name.equals(""))
        {
            System.out.println("Please provide a cost estimate for your project.");
            return;
        }
        this.initialCost = initialCost;
    }
   
    // Getters
     public String getName()
     {
         return this.name;
     }
     public String getDescription()
     {
        return this.description;
     }
     public double getInitialCost()
     {
         return this.initialCost;
     }
     
     // ADDED STATIC
     public static int getNumberOfProjects()
    {
        return numberOfProjects;
    }

    public static String elivatorPitch()
    {
        return "This project is called: " + this.name + this.description;
    }
}