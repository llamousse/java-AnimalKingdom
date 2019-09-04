package animalkingdom;

public class Birds extends Animals
{
    // private String name;
    // private int year;

    public Birds(String name, int year)
    {
        super(name, year);
    }

    // bring abstract methods from Animals
    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "\nBirds{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}