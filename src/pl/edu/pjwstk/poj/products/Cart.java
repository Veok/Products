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

    public void applyDiscountThirdForFree(){
        if(products.size() == 3){
            Product cheapest = ProductManager.getCheapest(products);
            cheapest.setDiscountPrice(0);
        }
    }

    public void applyFreeCup(){

        if(getTotalPrice() > 200) {
            Product product4 = new Product();
            product4.setCode("code4");
            product4.setName("Cup");
            product4.setPrice(0);
            products.add(product4);
        }
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

