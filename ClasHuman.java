import java.util.Scanner;

public class ClasHuman
{
    private String fullName;
    private String birth;
    private String phone;
    private String city;
    private String country;
    private String address;
    public ClasHuman()
    {
    }
    public ClasHuman(String fullName, String birth, String phone, String city, String country, String address)
    {
        this.fullName = fullName;
        this.birth = birth;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }
    public ClasHuman(String fullName, String phone, String city)
    {
        this.fullName = fullName;
        this.phone = phone;
        this.city = city;
    }
    public void inputClassHumanData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Full Name: ");
        fullName = scanner.nextLine();
        System.out.println("Enter Birth Date: ");
        birth = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        phone = scanner.nextLine();
        System.out.println("Enter City: ");
        city = scanner.nextLine();
        System.out.println("Enter Country: ");
        country = scanner.nextLine();
        System.out.println("Enter Address: ");
        address = scanner.nextLine();
    }
    public void outputClassHumanData()
    {
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Date: " + birth);
        System.out.println("Phone Number: " + phone);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Address: " + address);
    }
    public String getFullName()
    {
        return fullName;
    }
    public String getBirth()
    {
        return birth;
    }
    public String getPhone()
    {
        return phone;
    }
    public String getCity()
    {
        return city;
    }
    public String getCountry()
    {
        return country;
    }
    public String getAddress()
    {
        return address;
    }
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }
    public void setBirth(String birth)
    {
        this.birth = birth;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void outputClassHumanData(String field)
    {
        switch (field.toLowerCase())
        {
            case "fullname":
                System.out.println("Full Name: " + fullName);
                break;
            case "birth":
                System.out.println("Birth Date: " + birth);
                break;
            case "phone":
                System.out.println("Phone Number: " + phone);
                break;
            case "city":
                System.out.println("City: " + city);
                break;
            case "country":
                System.out.println("Country: " + country);
                break;
            case "address":
                System.out.println("Address: " + address);
                break;
            default:
                System.out.println("Invalid field.");
                break;
        }
    }
}
