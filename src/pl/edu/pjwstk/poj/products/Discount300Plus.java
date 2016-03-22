package pl.edu.pjwstk.poj.products;

/**
 * Created by L on 22.03.2016.
 */
public class Discount300Plus implements ICanCalculateSpecialOffer{


    public boolean canCalculate(Cart cart) {
        return cart.getTotalPrice()>300;
    }


    public void calculateOffer(Cart cart) {
        for(Product product : cart.getProducts()){
            double price = product.getPrice();
            product.setDiscountPrice(0.95*price);
        }
    }
}
