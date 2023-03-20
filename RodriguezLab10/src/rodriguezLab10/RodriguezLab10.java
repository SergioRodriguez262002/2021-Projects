package rodriguezLab10;

public class RodriguezLab10 {

	public static void main(String[] args) {
		String mathjoke1 = "Why is 6 afraid of 7?";
		String mathjoke2 = "Why was math class so long? The teacher kept going off on a tangent.";

		String csjoke1 = "There are 10 types of people in the world: those who understand binary, and those who don't.";
		String csjoke2 = "At a zoo, which animal does a computer like the most? The RAM!";

		Teacher t1 =         new Teacher("Bob", 1);
		MathTeacher t2 =     new MathTeacher("Mary", 2, mathjoke1);
		CompSciTeacher t3 =  new CompSciTeacher("Sue", 3, csjoke1);
		MathTeacher t4 =     new MathTeacher("Mary", 2, mathjoke1);
		Teacher t5 =         null;
		CompSciTeacher t6 =  new CompSciTeacher("Sue", 3, csjoke1);

		Course c1 = new Course(1001, "Intro to Psychology");
		Course c2 = new Course(1345, "Underwater Basket Weaving");
		Course c3 = new Course(3400, "Ancient Greek Calculus");
		Course c4 = new Course(4233, "Underwater Operating Systems");
		Course c5 = new Course(2430, "Graphics for Non-Majors");
		Course c6 = new Course(3200, "Topics in Computer Mice");
		Course c7 = new Course(4233, "Underwater Operating Systems");

		t1.addCourse(c1);
		t1.addCourse(c2);

		t2.addCourse(c3);
		t2.addCourse(c4);

		t3.addCourse(c5);
		t3.addCourse(c6);

		t4.addCourse(c3);
		t4.addCourse(c7);

		CompSciTeacher t7 =  new CompSciTeacher(t6);
		MathTeacher t8 =     new MathTeacher(t4);

		t7.setJoke(csjoke2);
		t8.setJoke(mathjoke2);

		if (t1.equals(t2)) { System.out.println("Something went wrong, t1 and t2 should not be equal!");
		} else { System.out.println("Success! t1 is different from t2!"); }

		if (t2.equals(t3)) { System.out.println("Something went wrong, t2 and t3 should not be equal!");
		} else { System.out.println("Success! t2 is different from t3!"); }

		if (t2.equals(t4)) { System.out.println("Success! t2 and t4 are the same!");
		} else { System.out.println("Something went wrong, t2 and t4 should be equal!"); }

		if (c1.equals(c2)) { System.out.println("Something went wrong, c1 and c2 should not be equal!");
		} else { System.out.println("Success! c1 is different from c2!"); }

		if (c4.equals(c7)) { System.out.println("Success! c4 and c7 are the same!");
		} else { System.out.println("Something went wrong, c4 and c7 should be equal!"); }

		if (t1.equals(c1)) { System.out.println("Something went wrong, t1 and c1 should not be equal!");
		} else { System.out.println("Success! t1 is different from c1!"); }

		if (t2.equals(new MathTeacher(t2))) { System.out.println("Success! t2 is equal to a copy of t2!");
		} else { System.out.println("Something went wrong, a copy of t2 should be equal to t2!"); }

		if (c2.equals(new Course(c2))) { System.out.println("Success! c2 is equal to a copy of c2!");
		} else { System.out.println("Something went wrong, a copy of c2 should be equal to c2!"); }

		if (t1.equals(t5)) { System.out.println("Something went wrong, t1 should not be equal to a null pointer!");
		} else { System.out.println("Success! t1 is not equal to a null pointer!"); }

		if (t3.equals(t6)) { System.out.println("Something went wrong, t3 and t6 should not be equal (they don't have the same courses)!");
		} else { System.out.println("Success! t3 is not equal to t6!"); }

		if(t6.equals(t7)) { System.out.println("Something went wrong, t6 and t7 should not be equal (they have different jokes)!");
		} else { System.out.println("Success! t6 is not equal to t7!"); }

		if(t8.equals(t4)) { System.out.println("Something went wrong, t8 and t4 should not be equal (they have different jokes)!");
		} else { System.out.println("Success! t8 is not equal to t4!"); }

	}

}
