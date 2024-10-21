public class Fract
{
    private int numerator;
    private int denominator;
    public Fract()
    {
        this.numerator = 0;
        this.denominator = 1;
    }
    public Fract(int numerator, int denominator)
    {
        this.numerator = numerator;
        setDenominator(denominator);
    }
    public Fract(int numerator)
    {
        this.numerator = numerator;
        this.denominator = 1;
    }
    public Fract(String fraction)
    {
        String[] parts = fraction.split("/");
        if (parts.length == 2)
        {
            this.numerator = Integer.parseInt(parts[0]);
            setDenominator(Integer.parseInt(parts[1]));
        }
        else
        {
            throw new IllegalArgumentException("ERROR");
        }
    }
    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator)
    {
        if (denominator != 0)
        {
            this.denominator = denominator;
        }
        else
        {
            throw new IllegalArgumentException("The denominator cannot be 0");
        }
    }
    public int getNumerator()
    {
        return numerator;
    }
    public int getDenominator()
    {
        return denominator;
    }
    public void printFraction()
    {
        System.out.println(numerator + "/" + denominator);
    }
    public Fract add(Fract other)
    {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fract(newNumerator, newDenominator).simplify();
    }
    public Fract add(int wholeNumber)
    {
        int newNumerator = this.numerator + wholeNumber * this.denominator;
        return new Fract(newNumerator, this.denominator).simplify();
    }
    public Fract subtract(Fract other)
    {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fract(newNumerator, newDenominator).simplify();
    }
    public Fract subtract(int wholeNumber)
    {
        int newNumerator = this.numerator - wholeNumber * this.denominator;
        return new Fract(newNumerator, this.denominator).simplify();
    }
    public Fract multiply(Fract other)
    {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fract(newNumerator, newDenominator).simplify();
    }
    public Fract multiply(int wholeNumber)
    {
        int newNumerator = this.numerator * wholeNumber;
        return new Fract(newNumerator, this.denominator).simplify();
    }
    public Fract divide(Fract other)
    {
        if (other.numerator == 0)
        {
            throw new IllegalArgumentException("Cannot be divided by 0");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fract(newNumerator, newDenominator).simplify();
    }
    public Fract divide(int wholeNumber)
    {
        if (wholeNumber == 0)
        {
            throw new IllegalArgumentException("Cannot be divided by 0");
        }
        int newDenominator = this.denominator * wholeNumber;
        return new Fract(this.numerator, newDenominator).simplify();
    }
    public Fract simplify()
    {
        int gcd = gcd(numerator, denominator);
        return new Fract(numerator / gcd, denominator / gcd);
    }
    private int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args)
    {
        Fract fraction1 = new Fract(3, 4);
        Fract fraction2 = new Fract(2, 5);
        Fract fraction3 = new Fract(5);
        Fract fraction4 = new Fract("7/8");
        System.out.print("Addition: ");
        fraction1.add(fraction2).printFraction();
        System.out.print("Subtraction: ");
        fraction1.subtract(fraction2).printFraction();
        System.out.print("Multiplication: ");
        fraction1.multiply(fraction2).printFraction();
        System.out.print("Division: ");
        fraction1.divide(fraction2).printFraction();
        System.out.print("Adding fractions and integers: ");
        fraction1.add(2).printFraction();
        System.out.print("Multiplying a fraction by an integer: ");
        fraction1.multiply(3).printFraction();
    }
}
