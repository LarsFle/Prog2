package squirrelGame;

public class MasterSquirrel extends Entity {
	final char LEFT_KEY;
	final char UP_KEY;
	final char DOWN_KEY;
	final char RIGHT_KEY;
	private static final int ENERGY = -10;
	public MasterSquirrel(int iid, int ienergy, XY ipos, char UPKEY, char LEFTKEY, char DOWNKEY, char RIGHTKEY) {
		super(iid, ENERGY+ienergy, ipos);
		LEFT_KEY = LEFTKEY;
		UP_KEY = UPKEY;
		DOWN_KEY = DOWNKEY;
		RIGHT_KEY = RIGHTKEY;
	}
	
	public boolean HandOperatedMasterSquirrel() throws Exception {
		char c;
		while (( c = (char)System.in.read()) != '\n') {
			if (c == LEFT_KEY) {
				pos = pos.move(-1, 0);
				} else if (c == UP_KEY) {
				pos = pos.move(0, -1);;
				} else if (c == DOWN_KEY) {
				pos = pos.move(0, 1);
				} else if (c == RIGHT_KEY) {
				pos = pos.move(1, 0);
				}
			}
		return true;
	}
	
	public boolean nextStep() {
		return true;
	}
	
}
