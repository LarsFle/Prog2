package squirrelGame;

import java.util.ArrayList;
import java.util.List;

public class MasterSquirrel extends Entity {

	private static final int EID = 1;
	private static final int ENERGY = 1000;
	List<Integer> minis= new ArrayList<Integer>(); // ins MasterDquirrel
	char SQUIRREL_KEY;
	char LEFT_KEY;
	char UP_KEY;
	char DOWN_KEY;
	char RIGHT_KEY;		
	public MasterSquirrel(int iid, int ienergy, XY ipos, char UPKEY, char LEFTKEY, char DOWNKEY, char RIGHTKEY, char SQUIRREL) {
		super(iid, ENERGY+ienergy, ipos);
		eid = EID;
		SQUIRREL_KEY = SQUIRREL;
		LEFT_KEY = LEFTKEY;
		UP_KEY = UPKEY;
		DOWN_KEY = DOWNKEY;
		RIGHT_KEY = RIGHTKEY;
	}

	public boolean checkOwnSquirrel(Entity testSquirrel) {
		for(int id:minis) {
			if (testSquirrel.getId() == id) {
				return true;
				}
		}
		return false;
	}
	
	public boolean nextStep(){
		System.out.println("Dieses Eichhörnchen hat " + energy + " Energie");
		return true;
	}
	
}
