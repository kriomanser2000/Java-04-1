public class Automobile
{
    private String name;
    private String producer;
    private int yearManufact;
    private double engineDispl;
    public Automobile()
    {
        this.name = "Невідомо";
        this.producer = "Невідомо";
        this.yearManufact = 0;
        this.engineDispl = 0.0;
    }
    public Automobile(String name, String producer, int yearManufact, double engineDispl)
    {
        this.name = name;
        this.producer = producer;
        this.yearManufact = yearManufact;
        this.engineDispl = engineDispl;
    }
    public void outputInformation()
    {
        System.out.println("Назва автомобіля: " + name);
        System.out.println("Виробник: " + producer);
        System.out.println("Рік випуску: " + yearManufact);
        System.out.println("Об'єм двигуна: " + engineDispl + " л");
    }
    public String getName()
    {
        return name;
    }
    public void setName(String nazva)
    {
        this.name = name;
    }
    public String getProducer()
    {
        return producer;
    }
    public void setProducer(String producer)
    {
        this.producer = producer;
    }
    public int getYearManufact()
    {
        return yearManufact;
    }
    public void setYearManufact(int yearManufact)
    {
        if (yearManufact > 1885)
        {
            this.yearManufact = yearManufact;
        }
        else
        {
            System.out.println("ERROR");
        }
    }
    public double getEngineDispl()
    {
        return engineDispl;
    }
    public void setEngineDispl(double engineDispl)
    {
        if (engineDispl > 0)
        {
            this.engineDispl = engineDispl;
        }
        else
        {
            System.out.println("Must be greater than zero");
        }
    }
    public void setAutomobile(String name, String producer, double engineDispl)
    {
        this.name = name;
        this.producer = producer;
        this.engineDispl = engineDispl;
    }
    public void setAutomobile(String name, String producer, int yearManufact, double engineDispl)
    {
        this.name = name;
        this.producer = producer;
        this.yearManufact = yearManufact;
        this.engineDispl = engineDispl;
    }
    public static void main(String[] args)
    {
        Automobile auto1 = new Automobile();
        auto1.outputInformation();
        auto1.setName("Tesla Model S");
        auto1.setProducer("Tesla");
        auto1.setYearManufact(2022);
        auto1.setEngineDispl(0.0);
        auto1.outputInformation();
        Automobile auto2 = new Automobile();
        auto2.setAutomobile("BMW X5", "BMW", 2019, 3.0);
        auto2.outputInformation();
    }
}
