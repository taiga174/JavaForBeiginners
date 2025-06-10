
public class DisplayCarTrain extends MyFrame{
	public void run() {
		Vehicle[] Vehicle = new Vehicle[6];
		Vehicle[0] = new Car(10,30,3,0);
		Vehicle[1] = new Car(10,100,-3,0);
		Vehicle[2] = new Train(10,180,7,0);
		Vehicle[3] = new Train(10,250,-3,0);
		Vehicle[4] = new Truck(10,300,11,0);
		Vehicle[5] = new Truck(10,350,13,0);
		for (int i=0; i<30; i++) {
			clear();
			for (int j=0; j<Vehicle.length; j++) {
				Vehicle[j].draw(this);
				Vehicle[j].move();
			}
			sleep(0.1);
		}
//		Car car1 = new Car(10,50,3,0);
//		car1.draw(this);
//		Train train1 = new Train(30,150,3,0);
//		train1.draw(this);
	
	}
}
