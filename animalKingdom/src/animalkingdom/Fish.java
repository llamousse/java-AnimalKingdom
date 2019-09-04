package animalkingdom;

public class Fish extends Animals
{

    public Fish(String name, int year)
    {
        super(name, year);
    }

    // bring abstract methods from Animals
    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breathe()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "\nFish{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}