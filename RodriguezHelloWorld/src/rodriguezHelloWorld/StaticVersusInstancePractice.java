package rodriguezHelloWorld;

public class StaticVersusInstancePractice {
	private static int v1 = 0;
	private int v2;

	public StaticVersusInstancePractice() {
		v1++;
		this.v2 = 0;
	}

	public StaticVersusInstancePractice(int v) {
		v1++;
		this.v2 = v;
	}

	public void grow() {
		this.v2++;
	}

	public void grow(int inc) {
		this.v2 += inc;
	}

	public int getv1() {
		return v1;
	}
	
	public int getv2() {
		return v2;
	}
}