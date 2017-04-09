package squirrelGame;

public class MasterSquirrel extends Entity {

	private static final int EID = 1;
	private static final int ENERGY = 1000;
	
	public MasterSquirrel(int iid, int ienergy, XY ipos, char UPKEY, char LEFTKEY, char DOWNKEY, char RIGHTKEY) {
		super(iid, ENERGY+ienergy, ipos);
		eid = EID;
		LEFT_KEY = LEFTKEY;
		UP_KEY = UPKEY;
		DOWN_KEY = DOWNKEY;
		RIGHT_KEY = RIGHTKEY;
	}
/*
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
*/
	public boolean nextStep(){
		return true;
	}
	
}
