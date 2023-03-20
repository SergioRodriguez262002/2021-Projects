package rodriguezLab10;

public class CompSciTeacher extends Teacher {
	private String speciality;
	private String bestComputerJoke;

	public CompSciTeacher(String n, int i, String joke) {
		super(n, i);
		this.speciality = "Computer Science";
		this.bestComputerJoke = joke;
	}

	public CompSciTeacher(CompSciTeacher t) {
		super(t);
		this.speciality = new String(t.speciality);
		this.bestComputerJoke = new String(t.bestComputerJoke);
	}

	public void setJoke(String j) {
		this.bestComputerJoke = new String(j);
	}

	// TODO: Implement an equals method
	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}

		if (this == other) {
			return true;
		}

		if (!this.getClass().equals(other.getClass())) {
			return false;
		}

		CompSciTeacher otherCompSciTeacher = (CompSciTeacher) other;

		return super.equals(other) && this.speciality.equals(otherCompSciTeacher.speciality)
				&& this.bestComputerJoke.equals(otherCompSciTeacher.bestComputerJoke);

	}

}