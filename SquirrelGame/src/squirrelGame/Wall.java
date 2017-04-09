package squirrelGame;

public class Wall extends Entity {
	private static final int ENERGY = -10;
	private static final int EID = 0;
	
	public Wall(int iid, int ienergy, XY ipos) {
		super(iid, ENERGY+ienergy, ipos);
		eid = EID;
	}
	
	public boolean nextStep() {
		return true;
	}
}
