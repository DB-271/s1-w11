import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

/*
 * XEyes: 
 * This is the main class of the xeyes project.  To run, create an instance
 * of this class.
 */

public class XEyes extends JPanel implements MouseListener, MouseMotionListener{


    private String fileName = "einstein.jpg";

    private JFrame myFrame;
    private ImageIcon myPic;
    
    // Each eye gets an instance variable.
    private Eye eye_1;
    private Eye eye_2;
    private ArrayList<Eye> eyes = new ArrayList<Eye>();
    

    // Constructor: this loads the image "einstein.jpg" in the "images" directory 
    // within the project
    public XEyes() {
        //A String passed into the JFrame constructor will be used as the title of the JFrame window
        myFrame = new JFrame("XEyes");
        myFrame.add(this);
        
        constructImage(fileName);

        // these eyes fit right on Einstein's head.  
        eye_1 = new Eye(269, 290, 49, 37);
        eye_2 = new Eye(372, 290, 49, 37);
        eyes.add(eye_1);
        eyes.add(eye_2);
        addMouseListener(this);
        addMouseMotionListener(this);
        myFrame.setVisible(true);
        }

        
    // convert the image so that it can be drawn in a JPanel
    private void constructImage(String fileName) {
        File imageFile = new File("./images/" + fileName);
        // an ImageIcon is a class that contains an image and knows how to draw itself
        myPic = new ImageIcon (imageFile.toString());
        // sets the size of the window based on the picture loaded. 
        myFrame.setSize(myPic.getIconWidth(), myPic.getIconHeight() );
    }
           
          
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(myPic.getImage(), 0, 0, this);
        for (Eye eye : eyes){
            eye.draw(g);
        }
    }

    private void updateEyes(MouseEvent event){
        for (Eye eye : eyes){
            eye.movePupil(event.getX(), event.getY());
        }
        repaint();
    }
    
    // move the pupil when the mouse is clicked
    public void mouseClicked (MouseEvent event) {
    }

    public void mouseMoved (MouseEvent event){
        updateEyes(event);
    }

    public void mouseDragged (MouseEvent event){
        eyes.add(new Eye(event.getX(), event.getY(), 20, 15));
        updateEyes(event);
    }
  
    public void mouseReleased (MouseEvent event) {
    }
    
    public void mousePressed (MouseEvent event) {
        for (Eye eye : eyes){
            eye.setLaser(event.getX(), event.getY());
        }
        updateEyes(event);
    }
    
    public void mouseEntered (MouseEvent event) {
    }
    
    public void mouseExited (MouseEvent event) {
    }
    
} // end class