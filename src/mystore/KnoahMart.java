package mystore;

// Create one instance of an Apple and one instance of a Windows
// set the price of the Apple to 550.62 and the price of the Windows to 230.99

// Uncomment the code in the main method
// Create a List and add the Apple and Windows that you created
// Add the Android androidPhone and the Iphone iphone to the list
// Create a Cashier
// Pass the List to the Cashier's total method and System.out.println the result

import java.util.ArrayList;
import java.util.List;

public class KnoahMart {
    public static void main(String[] args) {
        Product myApple = new Apple(true, "Macbook Pro");
        myApple.setPrice(550.62);
        Product myWindows = new Windows("Windows Vista", false, "Old old Dell");
        myWindows.setPrice(230.99);


        // DON'T LOOK HERE YET
        Product androidPhone = new Android(30.5, "123-456-7890", "Galaxy S50");
        androidPhone.setPrice(90.30);
        Product iphone = new Iphone(40, "234-567-8901", "iPhone11");
        iphone.setPrice(208.70);


        List<Product> myCart = new ArrayList<>();
        myCart.add(myApple);
        myCart.add(myWindows);
        myCart.add(androidPhone);
        myCart.add(iphone);

        Cashier knoah = new Cashier("Knoah", "Cotto", 28);

        System.out.println("Knoah's cart total is: " + '$' + (knoah.total(myCart)));
    }

}
