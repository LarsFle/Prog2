package squirrelGame;

public class BadBeast extends Entity {
	public BadBeast(int iid, XY ipos) {
		id = iid;
		energy = -150;
		pos = ipos;
	}
	
	public boolean nextStep() {
		int newposx = (int)(Math.random() * 3) - 2;
		int newposy = (int)(Math.random() * 3) - 2;
		pos.move(newposx,newposy);
		return true;
	}
	
}
