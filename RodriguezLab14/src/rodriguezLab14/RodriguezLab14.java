package rodriguezLab14;

public class RodriguezLab14 {

	public static void main(String[] args) {
		Art art1 = new Art("The Starry Night", "Van Gogh");
		art1.addTags("#blue");
		Art art2 = new Art("Nighthawks", "Edward Hopper");
		art2.addTags("#blue");
		Art art3 = new Art("Office in a Small City", "Edward Hopper");
		art3.addTags("#grey");

		Gallery gallery = new Gallery();
		gallery.addPiece(art1);
		gallery.addPiece(art2);
		gallery.addPiece(art3);

		gallery.printCollection();
		System.out.println("Number of pieces made by Edward Hopper: " + gallery.numberBy("Edward Hopper"));
		System.out.println("Number of pieces made by Van Gogh: " + gallery.numberBy("Van Gogh"));
		System.out.println("Number of tags matching #blue: " + gallery.numberMatching("#blue"));
		System.out.println("Number of tags matching #grey: " +gallery.numberMatching("#grey"));

	}

}
