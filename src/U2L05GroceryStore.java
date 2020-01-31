import javax.swing.JOptionPane;

public class U2L05GroceryStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalCost = 0;
		
		String input = JOptionPane.showInputDialog(null, "How many cans of beans do you want?");
		int order = Integer.parseInt(input);
		
		String input1 = JOptionPane.showInputDialog(null, "How many sunflowers do you want do you want?");
		int order1 = Integer.parseInt(input);
		
		String input2 = JOptionPane.showInputDialog(null, "How many pounds of papaya do you want?");
		int order2 = Integer.parseInt(input);
		
		
		Item beans = new Item(10, 5.50, "beans");
		Flower sunflowers = new Flower(50, order1, .50, "sunflowers");
		Produce papaya = new Produce(50, 15, "papaya");
	
		papaya.setweight(order2);
		papaya.setTotalPrice(15,order2);
		
		beans.setorder(order);
		
		beans.setQuantity(beans.getQuantity()-order);
		
	
		beans.setTP( totalCost + order * beans.getUnitPrice());


		
		

	
		papaya.setweight(papaya.getweight()*order2);
		
		
		
		System.out.println(" "+ beans +". " +sunflowers+ ". "+ papaya);
		//System.out.println(beans.getTP());
	}
}

