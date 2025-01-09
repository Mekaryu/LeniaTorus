package mekaryu.leniatorus.discreteflat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameOfLifePlayground {

	public GameOfLifePlayground() {
		super();
	}
	
	public static void createWindow() {
        JFrame frame = new JFrame("TopLevelDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(new Color(255, 255, 255));
        label.setPreferredSize(new Dimension(1080, 1080));
        frame.getContentPane().add(label, BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
}
