package squirrelGame;

public class MiniSquirrel extends MasterSquirrel { // Die Vererbung ganz schlechte idee

	private static final int EID = 6;
	private static final int ENERGY = -1000;
	
	public MiniSquirrel(int iid, int ienergy, XY ipos) {
		super(iid, ENERGY+ienergy, ipos, '~', '~', '~', '~', '~');
		eid = EID;
	}

	public boolean nextStep(){
		System.out.println("Dieses Mini-Eichhörnchen hat " + energy + " Energie");
		return true;
	}
	
}
