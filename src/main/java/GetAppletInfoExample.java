import java.applet.Applet;
import java.awt.Graphics;
 
public class GetAppletInfoExample extends Applet{
 
        @Override
	public void paint(Graphics g){
		
		String info = getAppletInfo();
		g.drawString(info,50,50);
	}
	
	/*
	 * Applet class provides default implementation of getAppletInfo()
	 * method which returns null.
	 * 
	 * Your Applet class should override this method to provide useful
	 * information like applet name,author name and copyright information.
	 */
	
	public String getAppletInfo(){
		String info = "";
		
		info = info + "GetAppletInfoExample";
		info = info + "@java-examples.com";
		
		return info;
	}
}