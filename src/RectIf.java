
public class RectIf extends MyFrame{
	public void run() {
		//int x=30;
		//setColor(0,128,0);
		//int i;
		//for( i=0; i<11; i++) {
			
		
			//if(i>=0 || i<=11) {
				//fillRect(x,100,10,100);
			//} else {
				//fillRect(x,80,10,100);
			//}
			//x+=20;
		//}
//		setColor(0,128,0);
//		int x = 30;
//		for(int i=0; i<9; i++) {
//			System.out.println(x);
//				fillRect(x,x*1.5,10,100);
//				x+=20;
//		}
		
//		setColor(0,128,0);
//		int x=30;
//		for(int i=0; i<9; i++) {
//			System.out.println(x);
//			fillRect(x,30,10,x * 1.5);
//			x+=20;
//		}
		
		int x=0;
		int y=0;
		int z=0;
		int t = 30;
		for(int i=0; i<9; i++) {
			System.out.println(t);
			fillRect(t,30,10,100);
			setColor(x,y,z);
			t+=20;
			x+=20;
			y+=20;
			z+=20;
		}
	}
}