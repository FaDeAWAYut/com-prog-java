import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<String> items;
    protected int Fee = 0;
    
    public ShoppingCart() {
        this.items = new ArrayList<String>();
    }

    public void addItem(String IT) {
        this.items.add(IT);
    }

    public double calculateTotal() {
        double Total = 0.0;
    
        for (String i: items) {
            String[] parts = i.split(":");
            double quantity = Double.parseDouble(parts[1]);
            double Price = Double.parseDouble(parts[2]);

            Total += quantity * Price;
        }

        return Total;
    }

    public void addDeliveryFee(int fee) {
        this.Fee = fee;
    }

    public int getFee() {
        return Fee;
    }

    public double getNetPrice() {
        return calculateTotal() + Fee;
    }

}