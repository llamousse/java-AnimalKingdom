package animalkingdom;

import java.util.*;

public class Main 
{
    public static void printAnimals(ArrayList<Animals> animals, CheckAnimal tester)
    {
        for (Animals v : animals)
        {
            if (tester.test(v))
            {
                System.out.println(v.getName() + " " + v.getYear());
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println();
        
        // call mammals - instantiate
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);
        
        System.out.println("*** LIST OF MAMMALS ***");
        System.out.println("Name: " + panda.getName() + " Year Named: " + panda.getYear());
        System.out.println("Name: " + zebra.getName() + " Year Named: " + zebra.getYear());
        System.out.println("Name: " + koala.getName() + " Year Named: " + koala.getYear());
        System.out.println("Name: " + sloth.getName() + " Year Named: " + sloth.getYear());
        System.out.println("Name: " + armadillo.getName() + " Year Named: " + armadillo.getYear());
        System.out.println("Name: " + raccoon.getName() + " Year Named: " + raccoon.getYear());
        System.out.println("Name: " + bigfoot.getName() + " Year Named: " + bigfoot.getYear());

        System.out.println();


    }
}