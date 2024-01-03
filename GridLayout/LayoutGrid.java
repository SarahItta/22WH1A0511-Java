package cse511;
import java.awt.*;
import java.awt.event.*;

public class LayoutGrid {
	LayoutGrid()
	{
		Frame f = new Frame("Flow Layout");
		Panel p = new Panel();
		Button b1 = new Button("India");
		Button b2 = new Button("Russia");
		Button b3 = new Button("China");
		Button b4 = new Button("Brazil");
		p.setLayout(new GridLayout());
		f.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		f.setSize(300,300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				});
	}
	public static void main(String args[])
	{
		new LayoutGrid();
	}
}

