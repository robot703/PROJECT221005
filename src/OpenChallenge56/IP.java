package OpenChallenge56;

public class IP {
	 
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        
        iptv.printProperty();
    }
 
}
 
class IPTV extends ColorTV{
    private String IP;
    public IPTV(String IP,int size, int numColor) {
        super(size, numColor);
        this.IP = IP;
    }
    @Override
    public void printProperty() {
        System.out.println("나의 IPTV는 "+IP+" 주소의 "+getSize()+"인치 "+getColor()+"컬러");
        //앞의 ColorTV 클래스의 printProperty를 출력하는 방법도 있습니다! 그게 더 깔끔하겠네요.
    }
}

