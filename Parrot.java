public class Parrot implements Pet
{
    private String __name;

    public Parrot(String name)
    {
        this.__name = name;
    }

    @Override
    public String getName()
    {
        return this.__name;
    }

    @Override
    public String getSpecies()
    {
        return "Попугай";
    }

    @Override
    public void feed()
    {
        System.out.println("Попугай покормлен.");
    }
}
