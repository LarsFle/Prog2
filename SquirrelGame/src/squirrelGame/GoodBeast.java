package squirrelGame;

public class GoodBeast extends Entity {
	private static final int ENERGY = -10;
	public GoodBeast(int iid, int ienergy, XY ipos) {
		super(iid, ENERGY+ienergy, ipos);
	}
	
	public boolean nextStep() {
		int newposx = (int)(Math.random() * 3) - 2;
		int newposy = (int)(Math.random() * 3) - 2;
		pos = pos.move(newposx,newposy);
		return true;
	}
}
