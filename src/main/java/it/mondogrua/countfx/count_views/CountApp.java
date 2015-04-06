package it.mondogrua.countfx.count_views;

import it.mondogrua.countfx.counts.Count;
import it.mondogrua.countfx.counts.DateCount;
import javafx.application.Application;
import javafx.stage.Stage;

public class CountApp extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Count<?> count = new DateCount();
		CountViewContainer countViewContainer = new CountViewContainer();
		countViewContainer.openOn(count, "DateCount Example", primaryStage);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
