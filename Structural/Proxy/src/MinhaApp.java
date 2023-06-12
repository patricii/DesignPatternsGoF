
public class MinhaApp {

	public static void main(String[] args) {
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        
        image1.displayImage();
        image2.displayImage();
        
        image1.displayImage();
	}

}
