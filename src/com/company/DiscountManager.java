package com.company;
public class DiscountManager {
    BookDiscount disc;
    void processBookDiscount(String discount){
        System.out.println("----Discount section----");
        if(discount.equals("cook")){
            CookbookDiscount cb= new CookbookDiscount();
            System.out.println(cb.getBookDiscount());
        }
        else if(discount.equals("bio")){
            BiographyDiscount bc= new BiographyDiscount();
            System.out.println(bc.getBookDiscount());
        }
        else{
            System.out.println("No discount");
        }
    }
}
