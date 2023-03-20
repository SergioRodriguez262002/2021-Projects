package rodriguezLab7;

public class HockeyPlayer extends Person {

	private int jerseyNum;
	private Position position;

	public enum Position {
		CENTER, RIGHT_WING, LEFT_WING, DEFENDER, GOALIE, NO_POSITION_ASSIGNED;
	}

	public HockeyPlayer() {
		super();
		jerseyNum = -1;
		position = Position.CENTER;

	}

	public HockeyPlayer(String name, int num, Position pos) {
		super(name);
		jerseyNum = num;
		position = pos;
	}

	 //Copy constructor

	public HockeyPlayer(HockeyPlayer other) {
		super(other);
		if (other != null) {
			this.jerseyNum = other.jerseyNum;
			this.position = other.position;
			
			this.name = other.name;

		}

	}
	
	public void setPlayer(String name, int Jersey, Position pos) {
		super(name);
		
	}

}
