package squirrelGame;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {
	private int id;
	private int energy;
	private XY pos;
	private int eid;
	
	Entity(int iid, int ienergy, XY ipos) {
		this.id = iid;
		this.energy = ienergy;
		this.pos = ipos;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Entity) {
			if (this.id == ((Entity)(obj)).getId()) {
			return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "EID: " + eid + "| Energie: " + energy + "|ID: " + id;
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
