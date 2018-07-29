public class SandwichFilling
{
    private String fillingType;
    private int caloriesPerServing;

    public SandwichFilling(String type, int calories)
    {
        fillingType = type;
        caloriesPerServing = calories;
    }
    public String getFillingType()
    {
        return fillingType;
    }
    public int getCaloriesPerServing()
    {
        return caloriesPerServing;
    }
}
