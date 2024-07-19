import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

public class Drinks extends JPanel{
	private JRadioButton coke;
	private JRadioButton dietc;
	private JRadioButton sweett;
	private JSpinner nDrinks;
	
	public Drinks()
	{
		coke = new JRadioButton("Coke");
		dietc = new JRadioButton("Diet Coke");
		sweett = new JRadioButton("Sweet Tea");
		nDrinks = new JSpinner(new SpinnerNumberModel(0,0,10,1));
		
		
		ButtonGroup drinks = new ButtonGroup();
		drinks.add(coke);
		drinks.add(dietc);
		drinks.add(sweett);
		
		TitledBorder title = BorderFactory.createTitledBorder("Drinks");
		setBorder(title);
		
		setLayout(new GridLayout(4,1));
		add(coke);
		add(dietc);
		add(sweett);
		add(nDrinks);
	}
	
	public double getDrink()
	{
		double drink;
		if(coke.isSelected())
			drink = 4.0;
		if(dietc.isSelected())
			drink = 4.5;
		if(sweett.isSelected())
			drink = 3.5;
		else
			drink = 0;
		return (Integer)nDrinks.getValue()*drink;
	}
}
