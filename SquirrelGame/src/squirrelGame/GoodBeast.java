package squirrelGame;

public class GoodBeast extends Entity {
	public GoodBeast(int iid, XY ipos) {
		id = iid;
		energy = 200;
		pos = ipos;
	}
	
	public boolean nextStep() {
		int newposx = (int)(Math.random() * 3) - 2;
		int newposy = (int)(Math.random() * 3) - 2;
		pos.move(newposx,newposy);
		return true;
	}
}
