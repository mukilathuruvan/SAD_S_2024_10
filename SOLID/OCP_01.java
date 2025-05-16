package SOLID;

public class OCP_01 {

    /*
     * TASK:
     * How to add a new discount type (customerType) without
     * violating OCP (Open/Closed Principle)?
     */
    
    // this interface is closed for modification but it's implementations are open for extension
    public interface DiscountScheme{
        double calculateDiscount(double amount);
    }

    public static class RegularCustomerScheme implements DiscountScheme {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.1;
        }
    }

    public static class PremiumCustomerScheme implements DiscountScheme {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.2;
        }
    }

    public static class VIPCustomerScheme implements DiscountScheme {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.5;
        }
    }


    public static class DiscountCalculator{
        private DiscountScheme discountScheme;

        public DiscountCalculator(DiscountScheme discountScheme){
            this.discountScheme=discountScheme;
        }

        public double calculateDiscount(double amount){
            double calculated_amount = this.discountScheme.calculateDiscount(amount);
            return calculated_amount;
        }
    }

    public static void main(String[] args) {

        RegularCustomerScheme regularCustomer=new RegularCustomerScheme();
        DiscountCalculator regularCalculator = new DiscountCalculator(regularCustomer);
        double regularDiscount = regularCalculator.calculateDiscount(100.0);
        System.out.println("Regular Discount: " + regularDiscount);

        PremiumCustomerScheme premiumCustomer=new PremiumCustomerScheme();
        DiscountCalculator premiumCalculator = new DiscountCalculator(premiumCustomer);
        double premiumDiscount = premiumCalculator.calculateDiscount(100.0);
        System.out.println("Premium Discount: " + premiumDiscount);


        VIPCustomerScheme vipCustomer=new VIPCustomerScheme();
        DiscountCalculator vipCalculator = new DiscountCalculator(vipCustomer);
        double vipDiscount = vipCalculator.calculateDiscount(100.0);
        System.out.println("VIP Discount: " + vipDiscount);
    }
}
