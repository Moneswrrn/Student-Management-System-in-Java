// Edited by JunRong test Assignment 2 
import javax.swing.*;// Import the Swing package for creating GUI components

public class Main {
    public static void main(String[] args) {
        // Create an instance of the AppGUI class (this will set up the GUI)
        AppGUI window = new AppGUI();
        // Adjust the window size based on its content (preferred size of components)
        window.pack();
     	// Make the window visible to the user
        window.setVisible(true);
    	 // Set the application to exit when the window is closed
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
