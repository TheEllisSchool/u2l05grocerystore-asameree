import java.text.DecimalFormat;

public class Item {
	private int quantity;
	private int order;
	private double unitPrice;
	private String type;
	private double totalCost;
	
	
	public Item (int q, double up,String t) {
		quantity = q;
		
		unitPrice = up;
		type = t;
		
		
	}
	
	public void setTP (double TC) {
		totalCost = TC;
	}
	public double getTP() {
		return totalCost;
	}
	public int getorder () {
		return order;
	}
	
	public void setorder (int o) {
		o = order;
	} 
	public int getQuantity() {
		return quantity;
		}
		
	
	public void setQuantity (int q) {
		quantity = q;
	}
	
	public void setUnitPrice (double n) {
		unitPrice = n;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setType (String p) {
		type = p;
	}
	
	public String getType() {
		return type;
	}
	public String toString() {
		
		return   "You ordered " + type + " which costs " + totalCost + " we now have " + quantity ;  
		}
}
