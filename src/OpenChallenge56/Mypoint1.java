package OpenChallenge56;

class Mypoint {
	private int x;
	private int y; 
	
	public Mypoint(int x,int y) {
	this.x=x;
	this.y=y;
	}
	
	public String toString() {
		return "Point("+x+","+50+")";
	}
	
}
public class Mypoint1 {

	
	public static void main(String[] args) {
		Mypoint p= new Mypoint(3,50);
		Mypoint q= new Mypoint(4,50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

}
