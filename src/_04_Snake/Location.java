package _04_Snake;

public class Location {
	static int x; 
	static int y;
	
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	public boolean equals(int x, int y) {
		if(Location.x == x && Location.y == y) {
			return true;
		}
		return false;
	}
}
