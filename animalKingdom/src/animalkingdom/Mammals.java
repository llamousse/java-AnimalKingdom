package animalkingdom;

public class Mammals extends Animals
{
    public Mammals(String name, int year)
    {
        super(name, year);
    }

    // bring abstract methods from Animals
    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }

    @Override
    public String toString()
    {
        return "\nMammals{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}