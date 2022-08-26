package com.buildappswithpaulo.com.models;

import com.buildappswithpaulo.com.DevStoreCatalog;
import com.buildappswithpaulo.com.GeekyStoreCatalog;
import com.buildappswithpaulo.com.Product;

import java.util.Iterator;

public class Seller {
    Catalog geekyStoreCatalog;
    Catalog devStoreCatalog;

    public Seller(Catalog geekyStoreCatalog, Catalog devStoreCatalog) {
        this.geekyStoreCatalog = geekyStoreCatalog;
        this.devStoreCatalog = devStoreCatalog;
    }


    public void printCatalog() {
        Iterator geekyStoreIterator = geekyStoreCatalog.createIterator();
        System.out.println("Printing Geeky Catalog: ");
        printCatalog(geekyStoreIterator);

        System.out.println("Printing Dev Catalog: ");

        Iterator devStoreIterator = devStoreCatalog.createIterator();
        printCatalog(devStoreIterator);

    }

    private void printCatalog(Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product)iterator.next();
            System.out.print(product.getName() + ", ");
            System.out.print(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }
    }
//    private void printCatalog(GeekyStoreIterator iterator) {
//        while (iterator.hasNext()) {
//            Product product = (Product)iterator.next();
//            System.out.print(product.getName() + ", ");
//            System.out.print(product.getDescription() + " ");
//            System.out.println(product.getPrice());
//        }
//
//    }
}
