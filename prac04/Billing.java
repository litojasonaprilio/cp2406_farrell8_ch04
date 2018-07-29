public class Billing
{
    public static void main(String[] args)
    {
        double price = 100.5;
        int quantity = 5;
        int coupon = 25;
        System.out.println("Price: $" + price +
                "\nQuantity: " + quantity +
                "\nCoupon: $" + coupon);
        computeBill(price);
        computeBill(price, quantity);
        computeBill(price, quantity, coupon);
    }
    public static double computeBill(double price)
    {
        final double TAX = 0.08;
        double totalDue;
        totalDue = price + price * TAX;
        System.out.println("Price with " + (TAX * 100) + "% tax: $" + totalDue);
        return totalDue;
    }
    public static double computeBill(double price, int quantity)
    {
        final double TAX = 0.08;
        double totalPrice;
        double totalDue;
        totalPrice = price * quantity;
        totalDue = totalPrice + totalPrice * TAX;
        System.out.println("Total price of " + quantity + " : $" + totalDue);
        return totalDue;
    }
    public static double computeBill(double price, int quantity, int coupon)
    {
        final double TAX = 0.08;
        double totalPriceWithCoupon;
        double totalDue;
        totalPriceWithCoupon = price * quantity - coupon;
        totalDue = totalPriceWithCoupon + totalPriceWithCoupon * TAX;
        System.out.println("Total price of " + quantity + " with $" + coupon + " coupon: $" + totalDue);
        return totalDue;
    }
}
