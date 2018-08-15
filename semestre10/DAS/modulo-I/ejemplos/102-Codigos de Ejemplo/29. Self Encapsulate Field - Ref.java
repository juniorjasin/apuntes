class IntRange {
	private int _low, _high;

	public int getLow() {
		return this._low;
	}

	public int getHigh() {
		return this._high;
	}

	public boolean includes (int arg) {
		return arg >= this.getLow() && arg <= this.getHigh();
	}

	//...
}
