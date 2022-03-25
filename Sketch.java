import java.security.spec.ECPublicKeySpec;
import java.lang.Math;
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
    //for loop to draw the vertical lines
    for (int i = 1; i <=10; i++) {
      int intLinex = i * width/21;
      line(intLinex, 0, intLinex, height/2);

      //nested for loop to draw the horizontal lines
      for (int b = 1; b <=10; b++) {
        int intLiney = b * width/21;
        line(0, intLiney, width/2, intLiney);
  
      }
    }

    //loops to draw the 5x5 grid of circles for quadrant 2 
    stroke(255, 0, 0);

    //nested for loops to calculate position of circle grid, this line calculates the y position
    for (int intCircleY = width/12; intCircleY <= (width/12) * 5; intCircleY += width/12) {

      //this loop calculates the x position 
      for (int intCircleX = width/12; intCircleX <= (width/12) * 5; intCircleX += width/12) {

        ellipse(width/2 + intCircleX, intCircleY, width/15, width/15);
      }
    }

    //draws the gradient in quadrant 4
    for (int i = 0; i<=height/2; i++) {

      //adjusts the color of the lines according to the i value to make a gradient
        stroke(i, i, i);
        int intLineh = i ;
        line(intLineh, height/2, intLineh, height);
    }


    //draws the flower in quadrant 3 
    stroke(0, 0, 0);

    //these lines define the coordinates for the cenger circle
    int intCircleX = width - width/4;
    int intCircleY = height - height/4;
    
    //saves the current origin value 0,0
    pushMatrix();
    
    //translates the origin point to the center of the flower
    translate(intCircleX, intCircleY);

    //for loop draws 8 petals
    for (int i = 0; i <=360; i += 45){

      //rotates the petals 45 degrees each time one is drawn
      rotate(radians(i));      
      ellipse(0,0 - width/15, height/30, height/10);
      
    }

    //restores the matrix to the former saved value of 0,0
    popMatrix();
    
    //draws the center circle
    ellipse(intCircleX, intCircleY, width/15, width/15);

    


  }
  
  // define other methods down here.
} 