package mekaryu.leniatorus.sandbox;

import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

class Button implements ActionListener, Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -9028917349387897732L;

    Button aButton = new Button();

    Button()
    {
    	
    }

    public void actionPerformed(ActionEvent e)
    {
        System.out.println("clicked");
    }
}