package squirrelGame;

public abstract class Entity {
	private int id;
	private int energy;
	private XY pos;
	
	
	public int getId() {
		return id;
	}
	public int getEnergy() {
		return energy;
	}
	public boolean updateEnergy(int amount) {
		energy += amount;
		if (energy >= 0) {
			return true;
		} else {
			energy = 0;
			return false;
		}
	}
	public XY getXY() {
		return pos;
	}
	public boolean setXY(XY newpos) {
		pos = newpos;
		return true;
	}
	
}
