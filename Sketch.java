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
	  

  //for loops to draw a grid of lines for quadrant 1 
    for (int i = 1; i <=9; i++) {
      int linex = i * 20;
      line(linex, 0, linex, height/2);

      for (int b = 1; b <=9; b++) {
        int liney = b * 20;
        line(0, liney, width/2, liney);
  
      }
    }

    


  }
  
  // define other methods down here.
}