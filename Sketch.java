import java.security.spec.ECPublicKeySpec;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    

  //for loops to draw a 10x10 grid of lines for quadrant 1
  stroke(0, 0, 0);
 
    for (int i = 1; i <=10; i++) {
      int linex = i * width/21;
      line(linex, 0, linex, height/2);

      for (int b = 1; b <=10; b++) {
        int liney = b * width/21;
        line(0, liney, width/2, liney);
  
      }
    }

    //loops to draw the 5x5 grid of circles for quadrant 2 
    stroke(255, 0, 0);

    for (int circleY = width/12; circleY <= (width/12) * 5; circleY += width/12) {
      for (int circleX = width/12; circleX <= (width/12) * 5; circleX += width/12) {
        ellipse(width/2 + circleX, circleY, width/15, width/15);
      }
    }

    //draws the gradient in quadrant 4

    for (int i = 0; i<=height/2; i++) {
        stroke(i, i, i);
        int lineh = i ;
        line(lineh, height/2, lineh, height);
    }



  }
  
  // define other methods down here.
}