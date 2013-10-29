import java.awt.*;
import java.applet.*;

public class Flag extends Applet {
	
	private AmericanFlag flag;

	public void init() {
		flag = new AmericanFlag(494, 260, 1.0);
		
	}

	public void paint(Graphics g) {
		flag.draw(g);
	}

}