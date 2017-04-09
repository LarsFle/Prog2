package squirrelGame;

public class EntitySet {
	Entity[] entityContainer;
	public EntitySet() {
		entityContainer = new Entity[1024];
	}
	
	public Entity checkPosition(XY pos) {
		for(Entity unit:entityContainer) {
			if (unit.getXY().x == pos.x && unit.getXY().y == pos.y) {
				return unit;
			}
		}
		return null;
	}
}
