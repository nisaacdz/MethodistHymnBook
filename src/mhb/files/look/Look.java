package mhb.files.look;

import javax.swing.JFrame;

public class Look extends JFrame {

	private static final long serialVersionUID = 1L;

	private static Look look = new Look();

	private Look() {
		
	}

	public static Look getLook() {
		if (look == null) {
			look = new Look();
		}
		return look;
	}
}
