public class Flower extends Item {

	private double totalPrice;
	
	
	public Flower(int q,int order, double up, String t) {
		super(q,up,t);
		totalPrice = up *  order;
	}

	
	public double getTotalPrice() {
		return totalPrice;
	}
	public String toString() {
		
		return  "flowers costs " + totalPrice;  
		}
}
