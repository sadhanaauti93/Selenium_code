package org.Paumard.FirstApplication;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import jdk.internal.org.objectweb.asm.Label;
import org.graalvm.compiler.phases.common.NodeCounterPhase.Stage;
public class FirstApplication extends Application {
	public void start(Stage stage) {
	Label label = new Label("Hello word");	
		label.setFont(new Font(50));
		Scene scene = new Scene(label);
		stage.setScene(scene);
		stage.setTitle("Hello world");
		stage.show();
	}
	public static void main(String[] args) {
		launch();	
	}
}
