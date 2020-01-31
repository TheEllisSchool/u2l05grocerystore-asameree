public class Produce extends Item {

	private double totalCost;
	private int weight;
	
	public Produce(int q, double up, String t, int w) {
		super(q,up,t);
		weight=w;
		
		setTotalPrice(up,weight);
		
	}
	
	public void setTotalPrice (double up, int weight) {
		totalCost = up * weight;
	}
	
	public double getTotalPrice() {
		return totalCost;
	}
	public void setweight (int w) {
		weight = w;
	}
	
	public int getweight() {
		return weight;
	}
	public String toString() {
		
		return "You ordered " + weight + " pounds of Produce which costs " + totalCost;  
		}
}
