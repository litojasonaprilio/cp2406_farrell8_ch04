public class TestSandwichFilling
{
    public static void main(String[] args)
    {
        SandwichFilling sandwichFilling1 = new SandwichFilling("Egg salad", 350);
        displaySandwichFilling(sandwichFilling1);
        SandwichFilling sandwichFilling2 = new SandwichFilling("Ham", 200);
        displaySandwichFilling(sandwichFilling2);
        SandwichFilling sandwichFilling3 = new SandwichFilling("Nutella", 200);
        displaySandwichFilling(sandwichFilling3);
    }
    public static void displaySandwichFilling(SandwichFilling filling)
    {
        System.out.println("Sandwich Filling Type: " + filling.getFillingType());
        System.out.println("Calories per Serving: " + filling.getCaloriesPerServing());
    }
}
