import java.awt.*;
import java.awt.event.*;

class FlagMaker1 extends Frame {
	
	/* Flag drawing program		J M Bishop April 2000
	 * --------------------
	 * Illustrates colour and simple graphic output
	 */
	 
	FlagMaker1() {
		add("Center", new Flag());
		// Enable the program to end when the window is closed
		addWindowListener(new WindowAdapter () {
			 public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// Set the frame's title and size and activate the drawing
		// described by the paint method.
		setTitle ("A Flag");
		setSize (300,200);
		setVisible (true);
	}
	
	public static void main (String [ ] args) {
		new FlagMaker1();
	}
}

class Flag extends Canvas {
	public void paint (Graphics g) {
		// Draw the flag using coloured recctangles
		g.setColor (Color.black);
		g.fillRect (40,40,200,40);
		g.setColor (Color.red);
		g.fillRect (40,80,200,40);
		g.setColor (Color.yellow);
		g.fillRect (40,120,200,40);
		
		// Label the drawing
		g.setColor (Color.black);
		g.drawString ("Germany",100,180);
	}
}