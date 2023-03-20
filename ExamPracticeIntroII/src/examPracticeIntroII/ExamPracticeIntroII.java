package examPracticeIntroII;

import java.util.ArrayList;

public class ExamPracticeIntroII {

	public static void main(String[] args) {
		Blorp b1 = new Blorp();
		Blorp b2 = new Blorp(20);
		Blorp.glick();
		b1.glick(10);
		b2.glick(5);
		System.out.println(b1);
		System.out.println(b2);
	}

	public class Blorp {
		private static int nerp = 0;
		private static int shlurp = 0;
		private int foo;

		public Blorp() {
			this.foo = 100;
			nerp++;
			shlurp++;
		}

		public Blorp(int s) {
			this.foo = s;
			nerp++;
			shlurp++;
		}

		public static void glick() {
			this.foo++;
			nerp++;
		}

		public static void glick(int up) {
			this.foo += up;
			nerp++;
		}

		public String toString() {
			return "foo: " + this.foo + ", nerp: " + nerp + ", shlurp: " + shlurp;
		}
	}

}
