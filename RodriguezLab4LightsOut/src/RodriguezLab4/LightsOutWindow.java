package RodriguezLab4;
public class LightsOutWindow {

	private boolean lightOn; // indicates if this light is on (true) or off (false)

	// Constructor, first parameter says whether light should be initialized to be
	// on or off
	public LightsOutWindow(boolean l, int r, int c) {
		this.lightOn = l;
	}

	// If the light in the window is on, turn it off. If it is off, turn it on
	// Note that this is actually a setter method (also known as a "mutator").
	public void toggle() {
		this.lightOn = !this.lightOn;
	}

	// getter method (also known as "accessor" method, which returns a boolean
	// indicating if the light is on in this window
	public boolean isLightOn() {
		return lightOn;
	}

}
