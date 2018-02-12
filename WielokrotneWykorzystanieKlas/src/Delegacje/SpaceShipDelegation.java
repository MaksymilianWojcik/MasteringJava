package Delegacje;

public class SpaceShipDelegation extends SpaceShipControls{
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	
	@Override
	void back(int velocity) {
		// TODO Auto-generated method stub
		controls.back(velocity);
	}
	
	@Override
	void down(int velocity) {
		// TODO Auto-generated method stub
		controls.down(velocity);
	}
	
	@Override
	void up(int velocity) {
		// TODO Auto-generated method stub
		controls.up(velocity);
	}
	
	@Override
	void left(int velocity) {
		// TODO Auto-generated method stub
		controls.left(velocity);
	}
	
	@Override
	void right(int velocity) {
		// TODO Auto-generated method stub
		controls.right(velocity);
	}

	@Override
	void forward(int velocity) {
		// TODO Auto-generated method stub
		controls.forward(velocity);
	}
	
	@Override
	void turboBoost() {
		// TODO Auto-generated method stub
		controls.turboBoost();
	}
}
