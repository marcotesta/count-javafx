package it.mondogrua.countfx.counts;

import javafx.beans.property.SimpleObjectProperty;

public abstract class Count<T> extends  SimpleObjectProperty<T> {
	
	private SimpleObjectProperty<T> _value;
	private T _resetValue;

	public Count() {
		_value = new SimpleObjectProperty<T>();
	}
	
	public void setValue(T aValue) {
		_value.setValue(aValue); 
	}

	public T getResetValue() {
		return _resetValue;
	}

	public void setResetValue(T aResetValue) {
		_resetValue = aResetValue;
	}

	
	protected void initialize() {
		reset();
		bind(this._value);
	}

	public void reset() {
		setValue(_resetValue);
	}
	
	abstract public void increment();
	
	abstract public void decrement();

}
