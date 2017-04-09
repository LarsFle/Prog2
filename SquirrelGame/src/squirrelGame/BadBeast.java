package squirrelGame;

public class BadBeast extends Entity {
	private static final int ENERGY = -150;
	private static final int EID = 5;
	
	public BadBeast(int iid, int ienergy, XY ipos) {
		super(iid, ENERGY+ienergy, ipos);
		eid = EID;
	}
	
	public boolean nextStep() {
		int newposx = (int)(Math.random() * 3) - 2;
		int newposy = (int)(Math.random() * 3) - 2;
		pos = pos.move(newposx,newposy);
		return true;
	}
	
}
