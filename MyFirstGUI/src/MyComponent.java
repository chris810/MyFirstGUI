import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	private Car topLeftCar = new Car(0,0);
	private Car bottomRightCar = new Car (this.getWidth() - 60, this.getHeight() - 30);
	//private Car randomCar = new Car (rand.nextInt(this.getWidth()-60), rand.nextInt(this.getHeight()-30));
	private static Random rand;
	public MyComponent() {
		rand = new Random();
	
	topLeftCar = new Car(0,0);
	bottomRightCar = new Car (this.getWidth() - 60, this.getHeight() - 30);
	//randomCar = new Car (rand.nextInt(this.getWidth()-60), rand.nextInt(this.getHeight()-30));
	}
	public boolean reachedRightEdge(Car c) {
//		if(c.getX()+60 >this.getWidth()) {
//			return true;
//			
//		}
//		else { return false;
//				
//		}
		return(c.getX()+60 >this.getWidth());
	}
	public void paintComponent (Graphics g) {
		if(!(this.reachedRightEdge(topLeftCar))) {
			topLeftCar.translate(5, 0);
		}
		
		Car randomCar = new Car (rand.nextInt(this.getWidth()-60), rand.nextInt(this.getHeight()-30));
		
		randomCar.draw(g);
		topLeftCar.draw(g);
		bottomRightCar.draw(g);
	}
}
		