package squirrelGame;

public class BadPlant extends Entity {
	private static final int ENERGY = -10;
	public BadPlant(int iid, int ienergy, XY ipos) {
		super(iid, ENERGY+ienergy, ipos);
	}
	
	public boolean nextStep() {
		return true;
	}
}
