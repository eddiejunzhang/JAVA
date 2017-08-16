//Folder:       Ch1HelloWorld
//Programmer:   Your Name
//Date:         Today's Date
//ClassName:    HelloWorldApplet
//Description:  Display the text "Hello World" in a label.

import java.applet.Applet;
import java.awt.Label;

public class HelloWorldApplet extends Applet
{
	//Create components
	Label lblMessage = new Label("Hello World");

	public void init()
	{
		//Place component on applet panel
		add(lblMessage);
	}
}
