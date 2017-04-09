package squirrelGame;

public final class XY {
	final private int x;
	final private int y;
	public XY(int xx, int yy) {
		x = xx;
		y = yy;
	}
	public XY move(int nx, int ny) {
		if (x+nx < 0) nx = 0;
		if (x+nx >= 12) nx = 0;
		if (y+ny < 0) ny = 0;
		if (y+ny >= 12) ny = 0;
		
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
