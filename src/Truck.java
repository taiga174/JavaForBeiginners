
public class Truck extends Vehicle{
	//int x,y,vx,vy;
	public Truck (int x,int y,int vx,int vy) {
		super(x,y,vx,vy);
//		this.x=x;
//		this.y=y;
//		this.vx=vx;
//		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x,y,100,30);
		frame.fillOval(x+5,y+30,10,10);
		frame.fillOval(x+15,y+30,10,10);
		frame.fillOval(x+75,y+30,10,10);
		frame.fillRect(x+60,y-10,40,30);
	}

}
