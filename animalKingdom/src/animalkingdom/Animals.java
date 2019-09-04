package animalkingdom;

public abstract class Animals
{
    // each animal is assigned a unique number, a name, and year
    int number;
    String name;
    int year;

    public Animals(String name, int year)
    {
        this.name = name;
        this.year = year;
    }

    // abstract methods - passed down to child
    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    // methods return a string saying how that animal implements the action
    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }
}