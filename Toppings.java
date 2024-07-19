import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Toppings extends JPanel{
	private JCheckBox cheese;
	private JCheckBox pineapple;
	private JCheckBox pepperoni;
	private JCheckBox gold_flakes;
	
	public Toppings()
	{
		cheese = new JCheckBox("Cheese");
		pineapple = new JCheckBox("Pineapple");
		pepperoni = new JCheckBox("Pepperoni");
		gold_flakes = new JCheckBox("Gold Flakes");
		
		TitledBorder title = BorderFactory.createTitledBorder("Topping");
		setBorder(title);
		
		setLayout(new GridLayout(4,1));
		add(cheese);
		add(pineapple);
		add(pepperoni);
		add(gold_flakes);
	}
	
	public double getToppings()
	{
		double price = 0;
		if(cheese.isSelected())
			price = price + 2.0;
		if(pineapple.isSelected())
			price = price + 1.5;
		if(pepperoni.isSelected())
			price = price + 3.0;
		if(gold_flakes.isSelected())
			price = price + 3.5;
		return price;
	}
}
