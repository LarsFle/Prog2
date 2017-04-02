package squirrelGame;

public class GoodPlant extends Entity {
	public GoodPlant(int iid, XY ipos) {
		id = iid;
		energy = 100;
		pos = ipos;
	}
	
	public boolean nextStep() {
		return true;
	}
}
