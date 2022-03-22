import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
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
    for (int i = 1; i <=10; i++) {
      int linex = i * 20;
      line(linex, 0, linex, height/2);

      for (int b = 1; b <=10; b++) {
        int liney = b * 20;
        line(0, liney, width/2, liney);
  
      }
    }

    //loops to draw the 5x5 grid of circles for quadrant 2 
    for (int circleY = 35; circleY <= 175; circleY += 35) {
      for (int circleX = 35; circleX <= 175; circleX += 35) {
        ellipse(width/2 + circleX, circleY, width/15, width/15);
      }
    }


  }
  
  // define other methods down here.
}