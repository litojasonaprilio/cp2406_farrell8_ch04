public class TestBread
{
    public static void main(String[] args)
    {
        Bread bread1 = new Bread("Rye", 65);
        displayBread(bread1);
        Bread bread2 = new Bread("Wonder Classic White", 65);
        displayBread(bread2);
        Bread bread3 = new Bread("Whole Wheat", 70);
        displayBread(bread3);
    }
    public static void displayBread(Bread bread)
    {
        System.out.println("Bread type: " + bread.getBreadType());
        System.out.println("Calories per slice: " + bread.getSliceCalories());
        System.out.println(bread.MOTTO);
    }
}
