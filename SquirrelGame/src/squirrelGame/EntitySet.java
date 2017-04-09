package squirrelGame;

import java.util.*;

public class EntitySet {
	List<Entity> entityContainer;
	int idCount = 1;
	
	public EntitySet() {
		entityContainer = new ArrayList<Entity>();
	}
	
	
	public int checkPosition(XY pos) {
		for(Entity unit:entityContainer) {
			if (unit.getXY().getX() == pos.getX() && unit.getXY().getY() == pos.getY()) {
				return unit.getId();
			}
		}
		return -1;
	}
	
	
	public boolean addEntity(int type, XY pos) {
		if (checkPosition(pos) == -1) {
			Entity newentity;
			switch (type) {
			default:
				newentity = new Wall(idCount, 0, pos);
				break;

			case 1:
				newentity = new MasterSquirrel(idCount, 0, pos, 'w', 'a', 's', 'd');
				break;
				
			case 2:
				newentity = new GoodPlant(idCount, 0, pos);
				break;
				
			case 3:
				newentity = new BadPlant(idCount, 0, pos);
				break;
				
			case 4:
				newentity = new GoodBeast(idCount, 0, pos);
				break;
				
			case 5:
				newentity = new BadBeast(idCount, 0, pos);
				break;
				
			}
			idCount++;
			entityContainer.add(newentity);
			return true;
		} else { 
			return false;
		}
	}
	public boolean removeEntity(int id) {
		int target = -1;
		for (Entity unit:entityContainer) {
			if (unit.getId() == id) {
				target = entityContainer.indexOf(unit);
			}
		}
		if (target != -1) {
			entityContainer.remove(target);
			return true;
		} else {
			return false;
		}
	}
	
	public void update() {
		for (Entity unit:entityContainer) {
			unit.nextStep();
			if (unit.getEId() == 1) {
				unit.HandOperatedMasterSquirrel();
			}
		}
	}
	
	public void printWorld() {
		char[][] fieldArray = new char[12][12];
		for (Entity unit:entityContainer) {
			char symbol = '#';
			switch (unit.getEId()) {
			default:
				symbol = '#';
				break;

			case 1:
				symbol = 'S';
				break;
				
			case 2:
				symbol = '+';
				break;
				
			case 3:
				symbol = 'f';
				break;
				
			case 4:
				symbol = 'O';
				break;
				
			case 5:
				symbol = 'X';
				break;
				
			}
			fieldArray[unit.getXY().getX()][unit.getXY().getY()] = symbol;
		}
		for (char[] row:fieldArray) {
			for (char sym:row) {
				System.out.print(sym);
			}
			System.out.println();
		}
		System.out.println("# : Wand");
		System.out.println("S : Spieler");
		System.out.println("+ : GoodPlant");
		System.out.println("f : BadPlant");
		System.out.println("O : GoodBeast");
		System.out.println("X : BadBeast");
	}
	
	
	
}
