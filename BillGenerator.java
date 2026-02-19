class BillGenerator {

    void generateBill(int itemTotal) {

        System.out.println("Customer Type: Regular");
        System.out.println("Total Bill Amount Rs: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {

        System.out.println("Customer Type: Privileged");

        int FA = itemTotal - discount;

        System.out.println("Discount is: " + discount);
        System.out.println("Final Amount Rs: " + FA);
    }

    void generateBill(int itemTotal, double discountPercent) {

        System.out.println("Customer Type: Festive Offer");

        double disAmount = itemTotal * discountPercent / 100;
        double FA = itemTotal - disAmount;

        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Final Amount Rs: " + FA);
    }

    public static void main(String[] args) {

        BillGenerator bg = new BillGenerator();

        bg.generateBill(1000);

        System.out.println();

        bg.generateBill(1000, 200);

        System.out.println();

        bg.generateBill(1000, 10.0);
