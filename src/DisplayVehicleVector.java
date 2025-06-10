import java.util.Vector;

public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle>vehicles = new Vector<Vehicle>();
		vehicles.add(new Car(10,30,3,0));
		vehicles.add(new Car(10,100,-3,0));
		vehicles.add(new Train(10,180,7,0));
		vehicles.add(new Train(10,250,-3,0));
		vehicles.add(new Truck(10,300,11,0));
		vehicles.add(new Truck(10,350,13,0));
		
		for(int i=0; i<30; i++) {
			clear();
			for(int j=0; j<vehicles.size(); j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}
}
