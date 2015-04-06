package it.mondogrua.countfx.counts;


public class IntegerCount extends Count<Number> {

	
	public IntegerCount() {
		initialize();
	}

	@Override
	protected void initialize() {
		setResetValue(0);
		super.initialize();
	};

	@Override
	public void increment() {
		setValue(getValue().intValue() + 1);		
	}

	@Override
	public void decrement() {
		setValue(getValue().intValue() - 1);		
	}

}
