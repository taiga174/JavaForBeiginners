
public class DisplayCarObject extends MyFrame{
	public void run() {
		Face[] faces = new Face[5];
		faces[0] = new Face(50,50,10,5);
		faces[1] = new Face(100,100,10,10);
		faces[2] = new Face(150,150,10,20);
//		faces[3] = new Face(200,200,10,25);
//		faces[4] = new Face(250,250,10,30);
//		faces[5] = new Face(300,300,10,40);
		
		for (int i=0; i<30; i++) {
			clear();
			for (int j=0; j<faces.length; j++) {
				faces[j].draw(this);
				faces[j].move();
			}
			
		}
	}
}

