package Delegacje;

public class SpaceShip extends SpaceShipControls{
	private String name;
	public SpaceShip(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public static void main(String[] args) {
		SpaceShip destroyer = new SpaceShip("Destroyer");
		destroyer.forward(100);
	}
}
