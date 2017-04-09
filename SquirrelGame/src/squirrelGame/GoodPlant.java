package squirrelGame;

public class GoodPlant extends Entity {
	private static final int ENERGY = 100;
	private static final int EID = 2;
	
	public GoodPlant(int iid, int ienergy, XY ipos) {
		super(iid, ENERGY+ienergy, ipos);
		eid = EID;
	}
	
	public boolean nextStep() {
		return true;
	}
}
