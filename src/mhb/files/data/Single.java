package mhb.files.data;

import java.io.File;

public class Single extends File {

	private static final long serialVersionUID = 1L;

	private static final String path = "";

	private static Single single = new Single(path);

	public Single(String arg0) {
		super(arg0);
	}

	public static Single getSingle() {
		if (single == null) {
			single = new Single(path);
		}
		return single;
	}
}