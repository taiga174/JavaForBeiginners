
public class Face {
	int x,y,vx,vy;
	public Face (int x,int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
//		frame.fillOval(x, y, 50,100);
//		frame.fillOval(x+100, y, 50,100);
//		frame.fillRect(x, y+160, 150,10);
		//int x=30;
		frame.fillOval(x+10,y+30,50,50);
		frame.fillOval(x+90,y+30,50,50);
		frame.fillRect(x,y,150,50);
		frame.fillRect(x+25,y-40,100,60);//練習6.2
		

	}
	public void move() {
		x+=vx;
		y+=vy;
	}
}
