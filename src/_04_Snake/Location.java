package _04_Snake;

public class Location {
	private int x; 
	private int y;
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
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
	public boolean equalsLocoVer(Location location) {
		if(this.x == location.getX() && this.y == location.getY()) {
			return true;
		}
		return false;
	}
	public boolean equals(int x, int y) {
		if(this.x == x && this.y == y) {
			return true;
		}
		return false;
	}
}
