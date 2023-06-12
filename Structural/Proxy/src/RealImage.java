
// Sistema A 
public class RealImage extends Image {
    private String filename;
 
    public RealImage(String filename) { 
        this.filename = filename;
        loadImageFromDisk();
    }
 
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
 
    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }
}
 