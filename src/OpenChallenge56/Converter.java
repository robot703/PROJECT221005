package OpenChallenge56;



public class Converter {
	 
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
 
    }
 
}
 
class TV{
    private int size;
    public TV(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}
 
class ColorTV extends TV{
    private int numColor;
    
    public ColorTV(int size, int numColor) {
        super(size);
        this.numColor = numColor;
    }
    
    public void printProperty() {
        System.out.println("나의 IPTV는 "+getSize()+"인치 "+numColor+"컬러");
    }
    //2번에서 컬러수 리턴할때 쓰입니다.
    public int getColor() {
        return numColor;
    }
}
