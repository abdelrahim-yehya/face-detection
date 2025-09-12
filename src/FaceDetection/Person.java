
package FaceDetection;

import javafx.scene.image.Image;

public class Person {
    private String name;
    private Image image;
    

    public Person(String name,Image image) {
        this.name =name;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public Image getImage() {
        return image;
    }
    
    
}
