public class Sandwich
{
    private Bread bread;
    private SandwichFilling sandwichFilling;

    public Sandwich(String breadType, int breadCal, String fillingType, int fillingCal)
    {
        bread = new Bread(breadType, breadCal);
        sandwichFilling = new SandwichFilling(fillingType, fillingCal);
    }
    public Bread getBread()
    {
        return bread;
    }
    public SandwichFilling getSandwichFilling()
    {
        return sandwichFilling;
    }
}
