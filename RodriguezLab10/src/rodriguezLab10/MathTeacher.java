package rodriguezLab10;

public class MathTeacher extends Teacher {
	private String speciality;
	private String bestMathJoke;

	public MathTeacher(String n, int i, String joke) {
		super(n, i);
		this.speciality = "Mathematics";
		this.bestMathJoke = joke;
	}

	public MathTeacher(MathTeacher t) {
		super(t);
		this.speciality = new String(t.speciality);
		this.bestMathJoke = new String(t.bestMathJoke);
	}

	public void setJoke(String j) {
		this.bestMathJoke = new String(j);
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

		MathTeacher otherMathTeacher = (MathTeacher) other;
		
		return super.equals(otherMathTeacher) 
				&& this.speciality.equals(otherMathTeacher.speciality) 
				&& this.bestMathJoke.equals(otherMathTeacher.bestMathJoke);

	}

}