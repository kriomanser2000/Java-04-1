public class City
{
    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private String postalCode;
    private String phoneCode;
    public City()
    {

    }
    public City(String cityName)
    {
        this.cityName = cityName;
    }
    public City(String cityName, String countryName)
    {
        this.cityName = cityName;
        this.countryName = countryName;
    }
    public City(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode)
    {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }
    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }
    public void setRegionName(String regionName)
    {
        this.regionName = regionName;
    }
    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }
    public void setPopulation(int population)
    {
        this.population = population;
    }
    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }
    public void setPhoneCode(String phoneCode)
    {
        this.phoneCode = phoneCode;
    }
    public String getCityName()
    {
        return cityName;
    }
    public String getRegionName()
    {
        return regionName;
    }
    public String getCountryName()
    {
        return countryName;
    }
    public int getPopulation()
    {
        return population;
    }
    public String getPostalCode()
    {
        return postalCode;
    }
    public String getPhoneCode()
    {
        return phoneCode;
    }
    public void printCityInfo()
    {
        System.out.println("City: " + cityName);
        System.out.println("Region: " + regionName);
        System.out.println("Country: " + countryName);
        System.out.println("Population: " + population);
        System.out.println("Postal Index: " + postalCode);
        System.out.println("Phone: " + phoneCode);
    }
    public void printCityInfo(String cityName)
    {
        System.out.println("City: " + cityName);
    }
    public void printCityInfo(String cityName, String countryName)
    {
        System.out.println("City: " + cityName);
        System.out.println("Country: " + countryName);
    }
    public static void main(String[] args)
    {
        City city1 = new City("Кривий Ріг");
        city1.printCityInfo(city1.getCityName());
        City city2 = new City("Кривий Ріг", "Україна");
        city2.printCityInfo(city2.getCityName(), city2.getCountryName());
        City city3 = new City("Кривий Ріг", "Дніпропетровська область", "Україна", 624750, "50002", "564");
        city3.printCityInfo();
    }
}
