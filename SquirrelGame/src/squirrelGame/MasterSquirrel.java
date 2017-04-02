package squirrelGame;

public class MasterSquirrel extends Entity {
	char LEFT_KEY;
	char UP_KEY;
	char DOWN_KEY;
	char RIGHT_KEY;
	public MasterSquirrel(int iid, XY ipos, char UPKEY, char LEFTKEY, char DOWNKEY, char RIGHTKEY) {
		id = iid;
		energy = 1000;
		pos = ipos;
		LEFT_KEY = LEFTKEY;
		UP_KEY = UPKEY;
		DOWN_KEY = DOWNKEY;
		RIGHT_KEY = RIGHTKEY;
	}
	
	
}
