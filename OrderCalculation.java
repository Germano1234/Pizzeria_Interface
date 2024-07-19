import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class OrderCalculation extends JFrame{
	private Crust crustPanel;
	private Toppings toppingsPanel;
	private Drinks drinksPanel;
	
	public OrderCalculation()
	{
		setTitle("Order Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		crustPanel = new Crust();
		toppingsPanel = new Toppings();
		drinksPanel = new Drinks();
		
		add(crustPanel,BorderLayout.WEST);
		add(toppingsPanel,BorderLayout.CENTER);
		add(drinksPanel,BorderLayout.EAST);
		
		JButton calculate = new JButton("Calculate");
		JButton exit = new JButton("Exit");
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(calculate);
		buttonPanel.add(exit);
		add(buttonPanel, BorderLayout.SOUTH);
		
		calculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				double subtotal = crustPanel.getCrust() + toppingsPanel.getToppings() + drinksPanel.getDrink();
				double tax = subtotal * 0.1;
				double total = subtotal + tax;
				
				JOptionPane.showMessageDialog(OrderCalculation.this, "Subtotal: $" + subtotal + "\n"
						+ "Tax: $" + tax + "\n" + "Total: $" + total,"Message", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		pack();
		setLocationRelativeTo(null);
	}
}
