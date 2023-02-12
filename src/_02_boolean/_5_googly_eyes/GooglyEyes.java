package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;

/*
  Goal: Put googly eyes on a face!
  Instructions:
  1. Find an image on the Internet and drop it into the /images folder at the
     top level of this module. It can be anything as long as it has large eyes!
  2. Declare a variable for the image:
     PImage face;
  3. In your setup() method, import your image using the following code:
     face = loadImage("face.jpg");
  4. Resize your face image to the size of the window using the resize() method.
  5. In the draw() method, place a white ellipse over the left eye of your image.
      HINT: To find out where to put it, add code to print the mouseX and
      mouseY where you click the mouse.
  6. Now add a pupil (the black part) to the left eye.
  7. Use mouseX and mouseY to move the left pupil where the mouse moves.
  8. Repeat the same steps for the right eye.
  9. Add a right pupil and make it move by using
     mouseX + [distance from left eye] and mouseY + [distance from left eye].
  10.Here’s the tricky part: stop the pupils from going outside of the white
     circles! To do this, imagine a rectangle that the pupil should stay
     within. When mouseX and mouseY goes outside of these bounds, set it back
     to the boundary. Put this code before you draw the pupils.
     +92 +3
*/





public class GooglyEyes extends PApplet {
    static final int WIDTH = 612;
    static final int HEIGHT = 408;
    
    PImage face;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    
    @Override
    public void setup() {
    	face = loadImage("gettyimages-609216111-612x612.jpeg");
    	size(612,408);
    	face.resize(WIDTH, HEIGHT); 
    }

    @Override
    public void draw() {
    	int lefteyeX = mouseX;
    	int lefteyeY = mouseY;
    	int righteyeX = mouseX;
    	int righteyeY = mouseY;
    	if(mouseY <= 136) {
    		lefteyeY = 136;
    	}
    	if(mouseX <= 230) {
    		lefteyeX = 230;
    	}
    	if(mouseY >= 169) {
    		lefteyeY = 169;
    	}
    	if(mouseX >= 264) {
    		lefteyeX = 264;
    	}
    	if(mouseY <= 139) {
    		righteyeY = 139;
    	}
    	if(mouseX <= 322) {
    		righteyeX = 322;
    	}
    	if(mouseY >= 172) {
    		righteyeY = 172;
    	}
    	if(mouseX >= 355) {
    		righteyeX = 355;
    	}
    	image(face,0,0);
    	println(mouseX, mouseY);
    	fill(255,255,255);
    	ellipse(246,152,60,60);
    	fill(255,255,0);
    	ellipse(lefteyeX,lefteyeY,25,25);
    	fill(255,255,255);
    	ellipse(338,155,60,60);
    	fill(255,255,0);
    	ellipse(righteyeX,righteyeY,25,25);
    	
    }

    static public void main(String[] args) {
        PApplet.main(GooglyEyes.class.getName());
    }
}
