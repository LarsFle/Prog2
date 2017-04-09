package squirrelGame;

public class XY {
	private int x;
	private int y;
	public XY(int xx, int yy) {
		x = xx;
		y = yy;
	}
	public void move(int nx, int ny) {
		x += nx;
		y += ny;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
