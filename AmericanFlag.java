import java.awt.Color;
import java.awt.Graphics;

public class AmericanFlag {

	private Rectangle union;
	private Rectangle background;
	private Rectangle whiteStripe;
	private Rectangle whiteStripe2;
	private Rectangle whiteStripe3;
	private Rectangle whiteStripe4;
	private Rectangle whiteStripe5;
	private Rectangle whiteStripe6;
	private Rectangle[] stripes;
	private double height;
	private double width;
	private Color color;
	private double scale;
	// private Star[] stars;
	
	public AmericanFlag(int width, int height, double scale) {
		this.height = height * scale;
		this.width = width * scale;
		this.background = new Rectangle(new Point(0,0), this.width, this.height, Color.RED);
		this.whiteStripe = new Rectangle(new Point(0,((int)this.height/13)*1), this.width, (this.height/13), Color.WHITE);
		this.whiteStripe2 = new Rectangle(new Point(0,(int)(this.height/13)*3), this.width, (this.height/13), Color.WHITE);
		this.whiteStripe3 = new Rectangle(new Point(0,(int)(this.height/13)*5), this.width, (this.height/13), Color.WHITE);
		this.whiteStripe4 = new Rectangle(new Point(0,(int)(this.height/13)*7), this.width, (this.height/13), Color.WHITE);
		this.whiteStripe5 = new Rectangle(new Point(0,(int)(this.height/13)*9), this.width, (this.height/13), Color.WHITE);
		this.whiteStripe6 = new Rectangle(new Point(0,(int)(this.height/13)*11), this.width, (this.height/13), Color.WHITE);

		this.union = new Rectangle(new Point(0,0), ((this.height * 0.76)), ((this.height*0.5385)), Color.BLUE);
	}

	public void draw(Graphics g) {
		background.paint(g);
		whiteStripe.paint(g);
		whiteStripe2.paint(g);
		whiteStripe3.paint(g);
		whiteStripe4.paint(g);
		whiteStripe5.paint(g);
		whiteStripe6.paint(g);
		union.paint(g);
	}

}