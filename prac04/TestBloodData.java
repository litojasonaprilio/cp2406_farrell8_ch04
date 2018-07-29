public class TestBloodData
{
    public static void main(String[] args)
    {
        BloodData blood1 = new BloodData();
        displayBlood(blood1);
        BloodData blood2 = new BloodData("A","-");
        displayBlood(blood2);
        BloodData blood3 = new BloodData();
        blood3.setBloodType("B");
        blood3.setRhFactor("+");
        displayBlood(blood3);
    }

    public static void displayBlood(BloodData blood)
    {
        System.out.println("Blood type: " + blood.getBloodType() +
                "\nRh factor: " + blood.getRhFactor());
    }
}
