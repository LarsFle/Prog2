package squirrelGame;

public class GoodPlant extends Entity {
	private static final int ENERGY = -10;
	public GoodPlant(int iid, int ienergy, XY ipos) {
		super(iid, ENERGY+ienergy, ipos);
	}
	
	public boolean nextStep() {
		return true;
	}
}
