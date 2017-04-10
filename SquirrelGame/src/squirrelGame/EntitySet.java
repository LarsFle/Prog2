package squirrelGame;

import java.util.*;

public class EntitySet {
	List<Entity> entityContainer;
	int idCount = 1;
	
	public EntitySet() {
		entityContainer = new ArrayList<Entity>(); // ins Array
	}
	
	public int getPositionIndex(XY pos) {
		for(Entity unit:entityContainer) {
			if (unit.getXY().getX() == pos.getX() && unit.getXY().getY() == pos.getY()) {
				return entityContainer.indexOf(unit);
			}
		}
		return -1;
	}
	
	public int getPositionEId(XY pos) {
		for(Entity unit:entityContainer) {
			if (unit.getXY().getX() == pos.getX() && unit.getXY().getY() == pos.getY()) {
				return unit.getEId();
			}
		}
		return -1;
	}
	
	public void collectEntity(int mastersquirrelindex, int collectindex) {
		Entity mastersquirrel = entityContainer.get(mastersquirrelindex);
		Entity collection = entityContainer.get(collectindex);
		mastersquirrel.updateEnergy(collection.getEnergy());
		removeEntity(collectindex);
	}
	
	public boolean addEntity(int type, XY pos, int ne) {
		if (getPositionIndex(pos) == -1) {
			Entity newentity;
			switch (type) {
			default:
				newentity = new Wall(idCount, ne, pos);
				break;

			case 1:
				newentity = new MasterSquirrel(idCount, ne, pos, 'w', 'a', 's', 'd', 'x');
				break;
				
			case 2:
				newentity = new GoodPlant(idCount, ne, pos);
				break;
				
			case 3:
				newentity = new BadPlant(idCount, ne, pos);
				break;
				
			case 4:
				newentity = new GoodBeast(idCount, ne, pos);
				break;
				
			case 5:
				newentity = new BadBeast(idCount, ne, pos);
				break;
				
			case 6:
				newentity = new MiniSquirrel(idCount, ne, pos);
				break;
				
			}
			idCount++;
			entityContainer.add(newentity);
			return true;
		} else { 
			return false;
		}
	}
	
	public void removeEntity(Entity unit) { // entsprechend um�ndern
		
		entityContainer.remove();
		}
		
	
	public void update() throws Exception {
		List<Integer> handOperatedList = new ArrayList<Integer>();
		for (Entity unit:entityContainer) {
			unit.nextStep();
			if (unit.getEId() == 1) {
				handOperatedList.add(entityContainer.indexOf(unit));
			}
		}
		for (int unit:handOperatedList) {
			HandOperatedMasterSquirrel(unit);
		}
	}
	
	public boolean HandOperatedMasterSquirrel(int index) throws Exception { // ineigene Klasse einbauen + Eich�rnchen vererben
		char c;
		boolean hasMoved = false;
		Entity squirrel = entityContainer.get(index);
		XY newXY = new XY(squirrel.pos.getX(), squirrel.pos.getY());
		while (( c = (char)System.in.read()) != '\n') {
			if (!hasMoved) {
				if (c == squirrel.SQUIRREL_KEY) {
					Entity newentity = new MiniSquirrel(squirrel.getId(), 100, newXY);
					entityContainer.add(newentity);
					squirrel.minis.add(idCount);
					squirrel.updateEnergy(-100);
				}
				
				
			if (c == squirrel.LEFT_KEY) {
				newXY = new XY(squirrel.pos.getX()-1, squirrel.pos.getY());
				hasMoved = true;
				} else if (c == squirrel.UP_KEY) {
					newXY = new XY(squirrel.pos.getX(), squirrel.pos.getY()-1);
					hasMoved = true;
				} else if (c == squirrel.DOWN_KEY) {
					newXY = new XY(squirrel.pos.getX(), squirrel.pos.getY()+1);
					hasMoved = true;
				} else if (c == squirrel.RIGHT_KEY) {
					newXY = new XY(squirrel.pos.getX()+1, squirrel.pos.getY());
					hasMoved = true;
				}
			}
		}
		if (hasMoved) {
		int targetEntity = getPositionEId(newXY);
		if (targetEntity == 0) {
			return false;
		} else if (targetEntity == -1) {
			squirrel.pos = newXY;
		} else if (targetEntity != -1) {
			collectEntity(index, getPositionIndex(newXY));
			squirrel.pos = newXY;
			
		}
		}
		return true;
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
				
			case 6:
				symbol = 's';
				break;
				
			}
			fieldArray[unit.getXY().getY()][unit.getXY().getX()] = symbol;
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
