package pl.edu.pjwstk.poj.products;

/**
 * Created by L on 22.03.2016.
 */
public interface ICanCalculateSpecialOffer {
    boolean canCalculate(Cart cart);
    void calculateOffer(Cart cart);


}
