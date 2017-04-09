package squirrelGame;

public class BadPlant extends Entity {
	private static final int ENERGY = -100;
	private static final int EID = 3;
	
	public BadPlant(int iid, int ienergy, XY ipos) {
		super(iid, ENERGY+ienergy, ipos);
		eid = EID;
	}
	
	public boolean nextStep() {
		return true;
	}
}
