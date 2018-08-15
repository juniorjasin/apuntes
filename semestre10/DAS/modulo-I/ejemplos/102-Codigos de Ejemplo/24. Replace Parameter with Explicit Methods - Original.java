public void setValue (String name, int value) {
	if (name.equals("height"))
		_height = value;
	else if (name.equals("width"))
		_width = value;
	Assert.shouldNeverReachHere();
}
