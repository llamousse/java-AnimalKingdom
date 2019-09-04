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

        // call birds - instantiate
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        System.out.println("*** LIST OF BIRDS ***");
        System.out.println("Name: " + pigeon.getName() + " Year Named: " + pigeon.getYear());
        System.out.println("Name: " + peacock.getName() + " Year Named: " + peacock.getYear());
        System.out.println("Name: " + toucan.getName() + " Year Named: " + toucan.getYear());
        System.out.println("Name: " + parrot.getName() + " Year Named: " + parrot.getYear());
        System.out.println("Name: " + swan.getName() + " Year Named: " + swan.getYear());

        System.out.println();

        // call fish - instantiate
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        System.out.println("*** LIST OF FISH ***");
        System.out.println("Name: " + salmon.getName() + " Year Named: " + salmon.getYear());
        System.out.println("Name: " + catfish.getName() + " Year Named: " + catfish.getYear());
        System.out.println("Name: " + perch.getName() + " Year Named: " + perch.getYear());

        // create ArrayList
        ArrayList<Animals> myList = new ArrayList<Animals>();

        // add all animals to ArrayList
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        // print out array for testing
        // System.out.println();
        // System.out.println(myList.toString());
        // System.out.println();

        System.out.println("*** USING LAMBDA EXPRESSIONS ***");

        // list all the animals in descending order by year named
        System.out.println("List animals by year (descending order)");
        myList.sort((v1, v2) -> v2.getYear() - v1.getYear());
        myList.forEach((v) -> System.out.println(v));
        System.out.println();

        // list animals in ABCs
        System.out.println("List animals alphabetically");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach((v) -> System.out.println(v));
        System.out.println();

        // list animals by how they move
        System.out.println("List animals by how they move");
        myList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        myList.forEach((v) -> System.out.println(v));
        System.out.println();

        // list only animals that breathe with lungs
        System.out.println("Only list animals that breathe with lungs");
        printAnimals(myList, v -> v.breathe().equals("lungs"));
        System.out.println();

        // list only animals that breathe with lungs and named in 1758
        System.out.println("Only list animals that breathe with lungs and named in 1758");
        printAnimals(myList, v -> v.breathe().equals("lungs") && v.getYear() == 1758);
        System.out.println();

        // list only animals that lay eggs and breathe with lungs
        System.out.println("Only list animals that lay eggs and breathe with lungs");
        printAnimals(myList, v -> v.reproduce().equals("eggs") && v.breathe().equals("lungs"));
        System.out.println();

        // list alphabeticallys only animals that were named in 1758
        System.out.println("List alphabetically only animals that were named in 1758");
        myList.sort((v1 ,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        printAnimals(myList, v -> v.getYear() == 1758);
        System.out.println();
    }
}