public class TestSandwich
{
    public static void main(String[] args)
    {
        Sandwich sandwich1 = new Sandwich("Rye", 65,"Egg salad", 350);
        displaySandwich(sandwich1);
        Sandwich sandwich2 = new Sandwich("Wonder Classic White", 65,"Ham", 200);
        displaySandwich(sandwich2);
        Sandwich sandwich3 = new Sandwich("Whole Wheat", 70,"Nutella", 200);
        displaySandwich(sandwich3);
    }
    public static void displaySandwich(Sandwich sandwich)
    {
        final int SLICE_OF_BREAD = 2;
        Bread bread = sandwich.getBread();
        SandwichFilling sandwichFilling = sandwich.getSandwichFilling();
        System.out.println("Sandwich consist of:" +
                "\nBread type: " + bread.getBreadType() +
                "\nBread calories per slice: " + bread.getSliceCalories() +
                "\nFilling type: " + sandwichFilling.getFillingType() +
                "\nFilling calories per serving: " + sandwichFilling.getCaloriesPerServing());
        int totalCal;
        totalCal = SLICE_OF_BREAD * bread.getSliceCalories() + sandwichFilling.getCaloriesPerServing();
        System.out.println("Total calories in this sandwich: " + totalCal);
    }
}
