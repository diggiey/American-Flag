import java.awt.Color;
import java.awt.Graphics;

public class Rectangle {

	private Point point;
	private double width;
	private double height;
	private Color color;

	public Rectangle(Point point, double width, double height, Color color) {
		this.point = point;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void paint(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.point.getX(), this.point.getY(), (int)width, (int)height);
	}

	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}
}