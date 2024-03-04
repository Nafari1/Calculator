module javaFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens lab.jfx to javafx.graphics, javafx.fxml;
}
