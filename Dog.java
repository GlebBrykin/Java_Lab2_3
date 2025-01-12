public class Dog implements Pet
{
    private String __name;

    public Dog(String name)
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
        return "Собака";
    }

    @Override
    public void feed()
    {
        System.out.println("Собака покормлена.");
    }
}
