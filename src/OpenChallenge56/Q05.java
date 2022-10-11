package OpenChallenge56;

import java.awt.Point;

public class Q05 {
	 
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
 
}
 
 
class ColorPoint extends Point{
    private String Color;
    
    public ColorPoint(int x, int y, String Color) {
        super(x,y);
        this.Color = Color;
    }
    
    public void setXY(int x, int y) {
        this.move(x,y);
    }
    public void setColor(String Col) {
        this.Color = Col;
    }
    public String getColor() {
        return Color;
    }
    public String toString() {
        String str = getColor()+"색의 ("+getX()+","+getY()+")의 점";
        return str;
    }
}
