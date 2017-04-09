package squirrelGame;

public class XY {
	final private int x;
	final private int y;
	public XY(int xx, int yy) {
		x = xx;
		y = yy;
	}
	public XY move(int nx, int ny) {
		XY newpos = new XY(x+nx, y+ny);
		return newpos;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
