public class Bread
{
    private String breadType;
    private int sliceCalories;
    public final static String MOTTO = "The staff of life";

    public Bread(String type, int calories)
    {
        breadType = type;
        sliceCalories = calories;
    }
    public String getBreadType()
    {
        return breadType;
    }
    public int getSliceCalories()
    {
        return sliceCalories;
    }
}
