package it.mondogrua.countfx.ui;


import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.scene.control.Label;

public class DisplayBox extends Label {

	public DisplayBox(ObjectProperty<?> count) {
		textProperty().bind(Bindings.convert(count));
	}
}
