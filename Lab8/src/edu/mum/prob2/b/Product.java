package edu.mum.prob2.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {
    final String title;
    final double price;
    final int model;

    public static void main(String[] args) {
        Product a = new Product("Milk",4.3,1);
        Product b = new Product("Coffie",3.5,1);
        Product c = new Product("Avocado",1.9,1);
        Product d = new Product("Bread",1.9,1);
        Product e = new Product("Chicken",1.89,1);
        Product f = new Product("CranBerry",5.94,1);
        Product g = new Product("Protein Shake",2.4,1);
        Product h = new Product("Carrot",0.8,1);
        Product i = new Product("Tomatoes",2.3,1);
        List<Product> products = new ArrayList<Product>();
        products.add(a);
        products.add(b);
        products.add(c);
        products.add(d);
        products.add(e);
        products.add(f);
        products.add(g);
        products.add(h);
        products.add(i);
        List sortedList = Product.Sort(products);
        System.out.println(sortedList);

    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getModel() {
        return model;
    }

    public Product(String title, Double price, int model) {
        this.title = title;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("\n %s : %s : %s", title, price, model);
    }

    public static List<Product> Sort(List<Product> productList) {
        class ProductTitleComparator implements Comparator<Product> {

            @Override
            public int compare(Product o1, Product o2) {
                return o1.title.compareTo(o2.title);
            }
        }
        Collections.sort(productList,new ProductTitleComparator());
        return productList;
    }
}
