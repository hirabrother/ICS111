// Toru Hirano, lab section 1

	import java.awt.Color;
	import java.awt.Graphics;
	import javax.swing.JFrame;
	import java.util.Random;

	public class Circles {
		public static void draw (Graphics g) {
			// Set color for the large circle
			g.setColor(Color.magenta);
			
			// Draw the large circle
			g.fillOval(10, 10, 40, 40);
			
			// Create random object
			Random random = new Random();
			
			// Variable to hold the top-left y-coordinate of the circle
			int y = 0;
			
			// Draw a grid of smaller circle
			for (int r = 0; r < 10; r++) {
				// Variable to hold the top-left x-coordinate 
				int x = 0;
				
				// Variable for column
				int c = 0;
				
				// Check if r is less 2
				if (r < 2) {
					x = 80;
					c = 2;
				}
				for (; c < 10; c++) {
					// Create color for the circle
					Color newColor = new Color (random.nextFloat(), random.nextFloat(), random.nextFloat());
					
					//  Set color for the small circle
					g.setColor(newColor);
					
					// Draw the small circle
					g.fillOval(x, y, 10, 10);
					
					// Increment x
					x += 40;
				}
			    // Increment y
				y += 40;
			}
		}
		
		public static void main (String [] a) {
			// Create JFrame object
			JFrame frame = new JFrame();
			
			// Variable to hold width and height
			int frameWidth = 400;
			int frameHeight = 400;
			
			// Set flame size
			frame.setSize(frameWidth, frameHeight);
			
			// Set action when x button is clicked
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// Create component
			javax.swing.JComponent component = new javax.swing.JComponent() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public void paintComponent(Graphics graph) {
					draw (graph);
				}
			};
			
			// Add frame
			frame.add(component);
			
			// Set frame visible
			frame.setVisible(true);
			
		}
	}