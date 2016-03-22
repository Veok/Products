package pl.edu.pjwstk.poj.products;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by L on 15.03.2016.
 */
public class Cart {

    private List<Product> products;

    public Cart(){
        products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(Product product : products){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }


    public List<Product> getProducts(){
        return products;
    }


    public void applyVoucher(Product product){

        double price = product.getPrice();
        product.setDiscountPrice(0.7*price);
        }



    public void printCart(){
        for(Product product : products){
            System.out.println(product);
        }
    }

public void applyDiscount(ICanCalculateSpecialOffer specialOffer){
    if (specialOffer.canCalculate(this)){
        specialOffer.calculateOffer(this);
    }
}

}

