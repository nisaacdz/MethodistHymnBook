package mhb.files.main;

import mhb.files.data.Single;
import mhb.files.listeners.Listener;
import mhb.files.look.Look;

public class Main {

	public static void main(String[] args) {
		Single single = Single.getSingle();
		Look look = Look.getLook();
		Listener listener = Listener.getListener(look, single);
	}

}
