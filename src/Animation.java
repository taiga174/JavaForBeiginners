
public class Animation extends MyFrame{
	public void run() {
//	int y=100;
//	while (y>=200) {
//		clear();
//		setColor(0,128,0);
//		fillOval(30,y,10,100);
//		y+=5;
//		sleep(0.1);
//	}
	
//	int y=100;
//	int x=30;
//	while (y>=200) {
//		clear();
//		setColor(0,128,0);
//		fillOval(x,y,10,100);
//		x+=5;
//		y+=5;
//		sleep(0.1);
//		}


//		int y=100;
//		int x=30;
//	
//		while (y>=30) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			y-=5;
//			sleep(0.1);
//			}
//
//		while (x>=30) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x+=5;
//			sleep(0.1);
			
		
//		int y=100;
//		int x=30;
//		while (y<=200) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x+=5;
//			y+=5;
//			sleep(0.1);
//			}
//		
//		while (x>=10) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x-=5;
//			sleep(0.1);
//			}
//		
//		while (y>=150) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x+=5;
//			y-=5;
//			sleep(0.1);
//			}
		
		int y=100;
		int x=30;
		for (int i = 0; i < 3;i++) {
		while (x<=170) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.1);
			}

		while (x>=30) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x-=5;
			sleep(0.1);
			}
		}
	}
}


