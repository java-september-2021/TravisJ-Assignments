// TRAVIS JEPSON SEPT 2021
// PROJECT CLASS

import java.util.ArrayList;
import java.util.Arrays;

public class ProjectTest

    public static void main(String[] args)
    {
        Project shadowHat = new Project();
        shadowHat.setName("Shadow Hat Network");
        shadowHat.setDescription("A fun socal experiment.");
        shadowHat.setInitialCost(980000.33); 

        System.out.println("Project Name: " + shadowHat.getName());
        System.out.println("Project Description: " + shadowHat.getDescription());
        System.out.println("Project Projected Initial Cost: " + shadowHat.getInitialCost());

        Project firstFlight = new Project("First Flight", "Raise enough money to launch over 9000 paper airplanes all at once.", 9001.00);
        Project quakeHour = new Project("Quake Hour");
        Project echoPhoenix = new Project("Echo Phoenix", "Hear the echo and rise again.  Stronger, faster, better.", 1337133766.11);
        
        System.out.print("Project Name: " + firstFlight.getName() + "   ");
        System.out.print("Project Description: " + firstFlight.getSize() + "   ");
        System.out.println("Project Cost: " + firstFlight.getToppings()+ "\n");

        System.out.print("Project Name: " + quakeHour.getName() + "   ");
        System.out.print("Project Description: " + quakeHour.getSize() + "   ");
        System.out.println("Project Cost: " + quakeHour.getToppings() + "\n");


        System.out.println("Project Name: " + echoPhoenix.getName());
        System.out.println("Project Description: " + echoPhoenix.getSize());
        System.out.println("Project Cost: " + echoPhoenix.getToppings() + "\n");

        //CHECK TOTAL PROJECTS MADE        
        System.out.println("Total Projects Made: " + Project.getNumberOfProjects()+ "\n");
        System.out.println(Project.elivatorPitch());
    }