package pl.pawlowski.kamApi;

import com.github.sarxos.webcam.WebcamPanel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.ds.dummy.WebcamDummyDriver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


@SpringBootApplication
public class KamApiApplication {


	public static void main(String[] args) throws  HeadlessException{
		SpringApplication.run(KamApiApplication.class, args);




				// get default webcam and open it
				/*Webcam webcam = Webcam.getDefault();
				webcam.open();

				// get image
				BufferedImage image = webcam.getImage();*/

				/*// save image to PNG file
		try {
			ImageIO.write(image, "PNG", new File("test.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}




