package com.company;

public class Shelf {

    void addProduct(String pro) {
        if(pro.equals("DVD")){
            DVD d=new DVD();
            d.add(pro);
        }
        else if(pro.equals("Book")){
            Books b=new Books();
            b.add(pro);
        }

    }
}
