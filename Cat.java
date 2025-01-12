public class Cat implements Pet
{
    private String __name;

    public Cat(String name)
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
        return "Кошка";
    }

    @Override
    public void feed()
    {
        System.out.println("Кошка покормлена.");
    }
}
