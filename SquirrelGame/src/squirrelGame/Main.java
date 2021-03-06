package squirrelGame;

public class Main {

	public static void main(String[] args) throws Exception {
    EntitySet world = new EntitySet();
    // generiere eine 10x10 Wand aufm Spielfeld
    {
    world.addEntity(0, new XY(0,0), 0);
    world.addEntity(0, new XY(1,0), 0);
    world.addEntity(0, new XY(2,0), 0);
    world.addEntity(0, new XY(3,0), 0);
    world.addEntity(0, new XY(4,0), 0);
    world.addEntity(0, new XY(5,0), 0);
    world.addEntity(0, new XY(6,0), 0);
    world.addEntity(0, new XY(7,0), 0);
    world.addEntity(0, new XY(8,0), 0);
    world.addEntity(0, new XY(9,0), 0);
    
    world.addEntity(0, new XY(1,9), 0);
    world.addEntity(0, new XY(2,9), 0);
    world.addEntity(0, new XY(3,9), 0);
    world.addEntity(0, new XY(4,9), 0);
    world.addEntity(0, new XY(5,9), 0);
    world.addEntity(0, new XY(6,9), 0);
    world.addEntity(0, new XY(7,9), 0);
    world.addEntity(0, new XY(8,9), 0);
    world.addEntity(0, new XY(9,9), 0);
    
    world.addEntity(0, new XY(0,1), 0);
    world.addEntity(0, new XY(0,2), 0);
    world.addEntity(0, new XY(0,3), 0);
    world.addEntity(0, new XY(0,4), 0);
    world.addEntity(0, new XY(0,5), 0);
    world.addEntity(0, new XY(0,6), 0);
    world.addEntity(0, new XY(0,7), 0);
    world.addEntity(0, new XY(0,8), 0);
    world.addEntity(0, new XY(0,9), 0);
    
    world.addEntity(0, new XY(9,1), 0);
    world.addEntity(0, new XY(9,2), 0);
    world.addEntity(0, new XY(9,3), 0);
    world.addEntity(0, new XY(9,4), 0);
    world.addEntity(0, new XY(9,5), 0);
    world.addEntity(0, new XY(9,6), 0);
    world.addEntity(0, new XY(9,7), 0);
    world.addEntity(0, new XY(9,8), 0);
    world.addEntity(0, new XY(9,9), 0);
// Erzeuge das SpielerSquirrel
    world.addEntity(1, new XY(8,8), 0);
// Erzeuge jeweils 5 von jeder Art von NPC-Entity + 10 zuf�llige W�nde
    world.addEntity(0, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(0, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(0, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(0, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(0, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(0, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(0, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(0, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(0, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(0, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    
    world.addEntity(2, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(2, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(2, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(2, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(2, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    
    world.addEntity(3, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(3, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(3, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(3, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(3, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    
    world.addEntity(4, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(4, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(4, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(4, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(4, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    
    world.addEntity(5, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(5, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(5, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(5, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    world.addEntity(5, new XY((int)(Math.random()*9),(int)(Math.random()*9)), 0);
    }
    world.printWorld();
    boolean laufcheck = true;
    while(laufcheck) {
    	
    	world.update();
    	world.printWorld();
    }
	}

}
