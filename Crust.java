import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Crust extends JPanel{
	private JRadioButton thin;
	private JRadioButton raised;
	
	public Crust()
	{
		thin = new JRadioButton("Thin");
		raised = new JRadioButton("Raised");
		
		ButtonGroup crust = new ButtonGroup();
		crust.add(thin);
		crust.add(raised);
		
		TitledBorder title = BorderFactory.createTitledBorder("Base");
		setBorder(title);
		
		JPanel options = new JPanel(new GridLayout(2,1));
		options.add(thin);
		options.add(raised);
		
		add(options, BorderLayout.NORTH);
	}
	
	public double getCrust()
	{
		if(thin.isSelected())
			return 4.0;
		if(raised.isSelected())
			return 5.0;
		else
			return 0;
	}
}
