package mystore;
// Write a class called Cashier that extends the Person class in the peoplestuff package
// Cashier should have an instance method called total(List<DataType> parameterName)
// The method should accept a List that can contain Androids, Iphones, Windows and Apples
// The cashier should return the total of all items in the List.
// bonus: Overwrite the greetSomeoneElse method from the Person class

import peoplestuff.Person;
import java.util.List;

public class Cashier extends Person {
    public Cashier(String newPersonFirstName, String newPersonLastName, int newPersonAge) {
        super(newPersonFirstName, newPersonLastName, newPersonAge);
    }

    public double total(List<Product> cart){
        double sum = 0;
        //enhanced for loop
        for(Product item :  cart){
            sum += item.getPrice();
        }
        return sum;

        //for loop
//        for(int i = 0; i < cart.size(); i++){
//            sum += cart.get(i).getPrice();
//        }
//        return sum;


    }
}
