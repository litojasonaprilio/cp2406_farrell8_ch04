public class FormLetterWriter
{
    public static void main(String[] args)
    {
        displaySalutation("Lito");
        displaySalutation();
        displaySalutation("Jason Aprilio", "Lito");
        displaySalutation();
    }
    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " + lastName);
    }
    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName);
    }
    public static void displaySalutation()
    {
        System.out.println("Thank you for your recent order.");
    }
}
