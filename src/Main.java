// Edited by JunRong for Assignment 2
import javax.swing.*; // Import Swing library for GUI components

public class Main {
    public static void main(String[] args) {

        // Create a new window from the AppGUI class
        AppGUI window = new AppGUI();
    
        // Adjust window size to fit components
        window.pack();
     
        // Display the window on the screen
        window.setVisible(true);
    	
        // Close program when window is closed
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}