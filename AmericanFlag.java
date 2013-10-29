import java.awt.Color;
import java.awt.Graphics;

public class AmericanFlag {

	private Rectangle union;
	private Rectangle background;
	private Rectangle whiteStripe;
	private Rectangle whiteStripe2;
	private Rectangle[] stripes;
	private double height;
	private double width;
	private Color color;
	private double scale;
	// private Star[] stars;
	
	public AmericanFlag(int height, int width, double scale) {
		this.height = height * scale;
		this.width = width * scale;
		this.background = new Rectangle(new Point(0,0), this.height, this.width, Color.RED);
		this.whiteStripe = new Rectangle(new Point(0,((int)this.height/13)*2), this.width, (this.height/13), Color.WHITE);
		this.whiteStripe2 = new Rectangle(new Point(0,(int)(height/13)*3), this.width, (this.height/13), Color.WHITE);

		this.union = new Rectangle(new Point(0,0), ((this.height * 0.76)), ((this.height/13)), Color.BLUE);
	}

	public void draw(Graphics g) {
		background.paint(g);
		// whiteStripe.paint(g);
		union.paint(g);
	}

}