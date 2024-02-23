public class ShoppingCartDecorator extends ShoppingCart {
    protected ShoppingCart Cart;

    public ShoppingCartDecorator(ShoppingCart Cart) {
        this.Cart = Cart;

    }

    public double calculateTotal() {
        return Cart.calculateTotal();
    }

    public int getFee() {
        return Cart.getFee();
    }

}





class DiscountByPercentDecorator extends ShoppingCartDecorator {
    private double discount;

    public DiscountByPercentDecorator(ShoppingCart Cart, double discount) {
        super(Cart);
        this.discount = discount;
    
    }

    public double getNetPrice() {
        return (Cart.getNetPrice() - Cart.Fee) * (1-(discount/100)) + Cart.getFee();
    }

}



class DiscountByAmountDecorator extends ShoppingCartDecorator {
    private double discount;

    public DiscountByAmountDecorator(ShoppingCart Cart, double discount) {
        super(Cart);
        this.discount = discount;
    
    }

    public double getNetPrice() {
        return ((Cart.getNetPrice() - Cart.Fee) - discount ) + Cart.getFee();
    }
}






class FreeDeliveryDecorator extends ShoppingCartDecorator {
    
    public FreeDeliveryDecorator(ShoppingCart Cart) {
        super(Cart);
        
    }

    public double getNetPrice() {
        return (Cart.getNetPrice() - Cart.getFee());
    }
}



