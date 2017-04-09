package squirrelGame;

import java.util.*;

public class EntitySet {
	List<Entity> entityContainer;
	int idCount = 1;
	
	public EntitySet() {
		entityContainer = new ArrayList<Entity>();
	}
	
	
	public Entity checkPosition(XY pos) {
		for(Entity unit:entityContainer) {
			if (unit.getXY().x == pos.x && unit.getXY().y == pos.y) {
				return unit;
			}
		}
		return null;
	}
	
	
	public boolean addEntity(int type, XY pos) {
		if (checkPosition(pos) != null) {
			Entity newentity;
			switch (type) {
			default:
				newentity = new Wall(idCount, pos);
				break;

			case 1:
				newentity = new MasterSquirrel(idCount, pos, 'w', 'a', 's', 'd');
				break;
				
			case 2:
				newentity = new GoodPlant(idCount, pos);
				break;
				
			case 3:
				newentity = new BadPlant(idCount, pos);
				break;
				
			case 4:
				newentity = new GoodBeast(idCount, pos);
				break;
				
			case 5:
				newentity = new BadBeast(idCount, pos);
				break;
				
			}
			idCount++;
			entityContainer.add(newentity);
			return true;
		} else { 
			return false;
		}
		
	}
}
