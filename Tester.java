import javax.swing.SwingUtilities;

public class Tester {
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				OrderCalculation oc = new OrderCalculation();
				oc.setVisible(true);
			}
		});
	}
}
