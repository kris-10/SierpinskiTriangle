import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {


public void setup()
{
	size(1500,800);
          frameRate(2);


}
public void draw()
{    

        
        
        background(255);
        sierpinski((int)(Math.random()*1500),(int)(Math.random()*800),(int)(Math.random()*900));

}

public void sierpinski(int x, int y, int len) 
{
  fill(0,(int)(Math.random()*50));

	//noStroke();
        strokeWeight(2);
        stroke(255);
	if(len>=20)
	{
		sierpinski(x,y,len/2);
                sierpinski(x+len/2,y,len/2);
                sierpinski(x+len/4,y-len/2, len/2);
	}

	else 
		{
		triangle(x,y,x+len,y,x+len/2,y-len);
		}

}

/*
----------------------------------------------
1. Fork and clone down this repository (Optional: Create your own repository from scratch. Look at the bottom of this page for instructions)
2. Write the `sierpinski` function:

    * If `len` is greater than 20 (or some variable) 
        * recursively call the `sierpinksi` function to draw a triangle with the 
        left corner at (`x`,`y`) and a base and height equal to `len/2`.
        * Again, call the `sierpinksi` function a second time to draw another triangle a distance 
        of `len/2` to the right of the first triangle.
        * Now, call the `sierpinksi` function a third time to draw a triangle a distance of `len/4` to the right 
        and `len/2` up from the first triangle. This triangle should "sit on top" of the first two.
    * else
        * Draw a triangle with the left corner at (`x`,`y`) and a base and height equal to `len`.
3. Once you have the `sierpinksi` function completed, call it once in `draw()` to start the process. 
You can change the number and size of the triangles by changing the limit in the `if` from 20 to some 
variable and adjusting the value of the variable. One way to make the program interactive is to use `mouseDragged` 
to change the limit.
4. Feel free to create your own inidividual variation of the Sierpinski triangle. [Your recursive triangle doesn't have to look like any other](http://www.google.com/search?q=variations+on+a+theme+of+sierpinski&safe=active&es_sm=122&source=lnms&tbm=isch&sa=X&ei=Ku-uVP7vEJecoQSvwoCADg&ved=0CAoQ_AUoAw&biw=1280&bih=856&surl=1#safe=active&tbm=isch&q=variations+on+sierpinski+triangle&imgdii=_). The mathematically adventurous might want to check out [the sierpinski triangle page to end most sierpinski triangle pages \u2122](http://www.oftenpaper.net/sierpinski.htm).
5. You could also create a [Sierpinski carpet](http://en.wikipedia.org/wiki/Sierpinski_carpet) as an alternative to the Sierpinski Triangle.
*/
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
