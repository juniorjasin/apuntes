class IntRange {

	private int _low, _high;

	public boolean includes (int arg) {
		return arg >= this._low && arg <= this._high;
	}

	//...
}
