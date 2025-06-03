
public class DisplayFaceObject extends MyFrame{
	public void run() {	
//		Face face1 = new Face(100,100,10,10);
//		face1.draw(this);
//		
//		Face face2 = new Face(300,300,-10,-10);
//		face2.draw(this);

//		for (int i=0; i<30; i++) {
//			clear();
//			face1.draw(this);練習6.1
//			face2.draw(this);
//			face1.move();
//			face2.move();
//			sleep(0.1);
//		}
//	}練習6.2
		Face[] faces = new Face[5];
		faces[0] = new Face(50,50,10,5);
		faces[1] = new Face(200,100,-10,-5);
		faces[2] = new Face(0,100,5,0);
		faces[3] = new Face(200,100,-5,0);
		faces[4] = new Face(100,0,0,5);
		
		for (int i=0; i<30; i++) {
			clear();
			for (int j=0; j<faces.length; j++) {
				faces[j].draw(this);
				faces[j].move();
			}
			
		}
	}
}
