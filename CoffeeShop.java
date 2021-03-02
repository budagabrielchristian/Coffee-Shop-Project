public class CoffeeShop {

	String nameOfProduct;
	int price;
	Boolean hasMilk;
//-----------------------------------
	CoffeeShop(){
		this.nameOfProduct=null;
		this.price=0;
	}
	CoffeeShop(String nameOfProduct, int price, Boolean hasMilk){
		this.nameOfProduct=nameOfProduct;
		this.price=price;
		this.hasMilk=hasMilk;
	}
	//----------------------------------------------------------------
	
	//Setters:
	
	protected void setProd(String nameOfProduct) {
		this.nameOfProduct=nameOfProduct;
	}
	protected void setPrice(int price) {
		this.price=price;
	}
	protected void setMilk(Boolean hasMilk) {
		this.hasMilk= hasMilk;
	}
	//--------------------------------------------------------------
	
	//Getters:
	
	protected String getName() {
		return "Name Of The Item: "+this.nameOfProduct;
	}
	
	protected String getPrice() {
		return "The price for a "+this.nameOfProduct+": "+this.price+'';
	}
	protected String getMilk() {
		if(hasMilk==true) {
			return nameOfProduct+" contains Milk";
		}else{
			return nameOfProduct+" does not contains Milk";
		}
	}
	
	//--------------------------------------------------------------
	
	protected void printData() {
		System.out.println("-------------------------------------------------");
		System.out.println("Name Of The product: "+nameOfProduct+';');
		System.out.println("The price for a "+nameOfProduct+": "+price+'$'+';');
		if(nameOfProduct=="Coffee") {
		if(hasMilk==true) {
			System.out.println("Contains Milk;");
		}else if(hasMilk==false){
			System.out.println("Does not contain Milk;");
		}
		}else if(nameOfProduct=="Milk Tea"){
			if(hasMilk==true){
				 System.out.println("Contains Milk;");
				}else if(hasMilk==false){
				 System.out.println("Does Not Contain Milk;");
				}
				}
		System.out.println("--------------------------------------------------");
		System.out.println(' ');
	}

	//--------------------------------------------------------------


}
