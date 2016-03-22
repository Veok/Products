package pl.edu.pjwstk.poj.products;

/**
 * Created by L on 22.03.2016.
 */
public class ApplyDiscountThirdForFree implements ICanCalculateSpecialOffer{

    public boolean canCalculate(Cart cart) {
        return cart.getProducts().size() == 3;
    }


    public void calculateOffer(Cart cart) {
        Product cheapest = ProductManager.getCheapest(cart.getProducts());
        cheapest.setDiscountPrice(0);
        }
    }

