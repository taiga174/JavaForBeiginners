
public class DisplayRectsSlow extends MyFrame{
	public void run() {
		int x=30;
		while (x<=170) {
			clear();
			setColor(0,128,0);
			fillOval(x,80,10,100);
			x+=5;
			sleep(0.1);
		}
	}
}
