package PROJECT1;

import java.awt.Point;

class Point{
	private int x,y;
	public void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint();{
		System.out.print("("+x+","+y+")");
	}
}

class ColorPoint5 extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx5 {
	public static void main(String [] args) {
		Point p=new Point ();
		p.set(1,2);
		p.showPoint();
		
		SuperEx cp=new SuperEx();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}
