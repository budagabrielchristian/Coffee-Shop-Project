public class blin{

    public static void main(String[] args) {

    	CoffeeShop prod1= new CoffeeShop("Coffee", 5, false);
    	CoffeeShop prod2= new CoffeeShop("Milk Tea", 5,true);
    	SweetsFromCoffeeShop s1= new SweetsFromCoffeeShop("Biscuits",120);
    	
    	s1.printData();
    	s1.deliverSweet(20);
    	s1.printData();
    	System.out.println(s1.getSweets());
    }
} 