package mhb.files.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mhb.files.data.Single;
import mhb.files.look.Look;

public class Listener implements ActionListener {

	private static Look look;
	private static Single single;
	private static Listener listener;

	private Listener(Look look, Single single) {
		Listener.look = look;
		Listener.single = single;
	}

	public static Listener getListener(Look look, Single single) {
		if (listener == null) {
			listener = new Listener(look, single);
		}
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(look);
		System.out.println(single);
	}
}