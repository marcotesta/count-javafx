package it.mondogrua.countfx.count_views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import it.mondogrua.countfx.counts.Count;
import it.mondogrua.countfx.ui.Button;
import it.mondogrua.countfx.ui.ConstraintFrame;
import it.mondogrua.countfx.ui.DisplayBox;
import it.mondogrua.utils.PluggableAdaptor;

public class CountViewContainer extends GridPane {

	public CountViewContainer() {
		setAlignment(Pos.CENTER);
		setHgap(10);
		setVgap(10);
		setPadding(new Insets(25, 25, 25, 25));
	}

	public void openOn(final Count<?> count, String title, Stage primaryStage) {
		buildViewsOn(count);
		Scene scene = new Scene(this, 300, 150);
		primaryStage.setScene(scene);
		primaryStage.setTitle(title);
	}

	private void buildViewsOn(final Count<?> count) {
		addDisplayBoxOn(count);
		addIncrementButtonOn(count);
		addDecrementButtonOn(count);
		addResetButtonOn(count);
	}

	private void addDisplayBoxOn(final Count<?> count) {
		DisplayBox displayBox = makeDisplayBoxOn(count);
		ConstraintFrame constraintFrame = new ConstraintFrame(1, 0);
		add(displayBox, constraintFrame);
	}

	private void addResetButtonOn(final Count<?> count) {
		Button buttonReset = makeButtonOn(count, "Reset", "reset");
		ConstraintFrame constraintFrame = new ConstraintFrame(2, 2);
		add(buttonReset, constraintFrame);
	}

	private void addDecrementButtonOn(final Count<?> count) {
		Button buttonDecrement = makeButtonOn(count, "Decrement", "decrement");
		ConstraintFrame constraintFrame = new ConstraintFrame(1, 2);
		add(buttonDecrement, constraintFrame);
	}

	private void addIncrementButtonOn(final Count<?> count) {
		Button buttonIncrement = makeButtonOn(count, "Increment", "increment");
		ConstraintFrame constraintFrame = new ConstraintFrame(0, 2);
		add(buttonIncrement, constraintFrame);
	}

	private Button makeButtonOn(final Count<?> count, String label, String action) {
		return new Button(label, new PluggableAdaptor(count , action, new Object[]{}));
	}

	private DisplayBox makeDisplayBoxOn(final Count<?> count) {
		return new DisplayBox(count);
	}

	private void add(Node node, ConstraintFrame constraintFrame) {
		add(node, constraintFrame.getX(), constraintFrame.getY());
	}

}
