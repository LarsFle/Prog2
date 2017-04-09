package squirrelGame;

public abstract class Entity {
	int id;
	int energy;
	XY pos;
	int eid;
	
	Entity(int iid, int ienergy, XY ipos) {
		this.id = iid;
		this.energy = ienergy;
		this.pos = ipos;
	}
	
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
	
	public int getEId() {
		return eid;
	}
	
	public boolean setXY(XY newpos) {
		pos = newpos;
		return true;
	}

	public abstract boolean nextStep();
}
