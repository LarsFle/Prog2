package squirrelGame;

public class Wall extends Entity {
	public Wall(int iid, XY ipos) {
		id = iid;
		energy = -10;
		pos = ipos;
	}
}
