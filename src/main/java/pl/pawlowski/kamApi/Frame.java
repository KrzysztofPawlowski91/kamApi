package pl.pawlowski.kamApi;

import com.github.sarxos.webcam.Webcam;
import java.awt.image.BufferedImage;

public class Frame {
    public BufferedImage getImage() {
        webcam.open();
       return this.image= webcam.getImage();
    }


    private BufferedImage image;           /* = webcam.getImage();*/
    Webcam webcam = Webcam.getDefault();

    public Frame() {
    }

// get image

}
