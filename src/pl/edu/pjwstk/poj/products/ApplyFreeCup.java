package pl.edu.pjwstk.poj.products;

/**
 * Created by L on 22.03.2016.
 */
public class ApplyFreeCup implements ICanCalculateSpecialOffer{

    public boolean canCalculate(Cart cart) {
        return cart.getTotalPrice()>200;
    }


    public void calculateOffer(Cart cart) {
        if(cart.getTotalPrice() > 200) {
            Product product4 = new Product();
            product4.setCode("code4");
            product4.setName("Cup");
            product4.setPrice(0);
            cart.getProducts().add(product4);
        }
    }
}
