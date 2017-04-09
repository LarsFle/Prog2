package squirrelGame;

public class Wall extends Entity {
	private static final int ENERGY = -10;
	public Wall(int iid, int ienergy, XY ipos) {
		super(iid, ENERGY+ienergy, ipos);
	}
	
}
