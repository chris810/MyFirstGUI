import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.util.Random;

public class Car {

	private int x;
	private int y;
	
	
	public Car(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/////////////Getters and setters///////////////////////////////
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void translate(int deltax, int deltay) {
		x += deltax;
		y += deltay;
	}
	
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Line2D.Double rearWindow = new Line2D.Double(getX() + 10, getY()+10 , getX()+20, getY()+0);
		Line2D.Double frontWindow = new Line2D.Double(getX() +40 ,getY()+0, getX()+ 50, getY()+10);
		Line2D.Double roof = new Line2D.Double(getX() +20, getY()+0, getX()+40, getY()+0);
		Rectangle body = new Rectangle(getX()+0, getY()+10, 60, 10);
		Ellipse2D.Double rearWheel = new Ellipse2D.Double(getX()+10, getY()+20,  10, 10);
		Ellipse2D.Double frontWheel = new Ellipse2D.Double(getX()+40, getY()+20,  10, 10);
		
		g2.draw(rearWindow);
		g2.draw(roof);
		g2.draw(frontWindow);
		g2.draw(body);
		g2.draw(rearWheel);
		g2.draw(frontWheel);
	}

}
