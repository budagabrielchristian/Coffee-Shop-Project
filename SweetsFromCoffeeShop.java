public class SweetsFromCoffeeShop {
	int numberOfSweets;
	String sweet;
	
	SweetsFromCoffeeShop(){
		this.numberOfSweets=0;
		this.sweet=null;
	}
	SweetsFromCoffeeShop(String sweet, int numberOfSweets){
		this.numberOfSweets=numberOfSweets;
		this.sweet=sweet;
	}
	

	protected String deliverSweet(int cookiesToDeliver) {
		if(this.numberOfSweets>=numberOfSweets) {
			this.numberOfSweets-=cookiesToDeliver; 
			return "Number Of "+sweet+" Left: "+(this.numberOfSweets);
		}else{
			return "Not Enough "+sweet+'!';
	}
		}
//---------------------------------------------------------
		//Setters:
		protected void setSweet(int numberOfSweets) {
			this.numberOfSweets=numberOfSweets;
		
		//Work In Progress
		}
//---------------------------------------------------------
		//Getters:
	
	protected String getSweets() {
		return "Number Of "+sweet+':'+this.numberOfSweets;		
	}
	
	protected String getName() {
			return "Name Of The Sweet: "+sweet;
		}
//---------------------------------------------------------
		
	
	protected void printData() {
		System.out.println(' ');
		System.out.println("----------------------------------------------------------");
		System.out.println("Name Of The Sweet: "+sweet);
		System.out.println(sweet+" in stock: "+numberOfSweets+';');
		System.out.println("----------------------------------------------------------");
		System.out.println(' ');
	}
}
