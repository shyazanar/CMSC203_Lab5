
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed. Before
 * beginning to implement, design the structure of your GUI in order to
 * understand what panels go inside which ones, and what buttons or other
 * components go in which panels.
 * 
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	// student Task #2:
	// declare five buttons, a label, and a textfield
	Button helloBtn, howdyBtn, chineseBtn, frenchBtn, clearBtn, exitBtn;
	Label feedbackLbl;
	TextField textFld;
	// declare two HBoxes
	HBox hBox1, hBox2;

	// student Task #4:
	// declare an instance of DataManager
	DataManager dataMgr;
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach. Remember
	 * to wait to add a component to its containing component until the container
	 * has been created. This is the only constraint on the order in which the
	 * following statements appear.
	 */
	FXMainPane() {
		// student Task #2:
		// instantiate the buttons, label, and textfield
		// instantiate the HBoxes
		helloBtn= new Button("Hello");
		howdyBtn = new Button("Howdy");
		chineseBtn = new Button("Chinese");
		frenchBtn = new Button("French");
		clearBtn = new Button("Clear");
		exitBtn = new Button("Exit");
		feedbackLbl = new Label("Feedback");
		textFld = new TextField();
		hBox1 = new HBox();
		hBox2 = new HBox();
		
		// student Task #4:
		// instantiate the DataManager instance
		dataMgr = new DataManager();
		// set margins and set alignment of the components
		hBox1.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);
		HBox.setMargin(feedbackLbl,  new Insets(2, 2, 2, 2));
		HBox.setMargin(textFld,  new Insets(2, 2, 2, 2));
		HBox.setMargin(helloBtn,  new Insets(2, 2, 2, 2));
		HBox.setMargin(howdyBtn,  new Insets(2, 2, 2, 2));
		HBox.setMargin(chineseBtn,  new Insets(2, 2, 2, 2));
		HBox.setMargin(frenchBtn,  new Insets(2, 2, 2, 2));
		HBox.setMargin(clearBtn,  new Insets(2, 2, 2, 2));
		HBox.setMargin(exitBtn,  new Insets(2, 2, 2, 2));
		
		helloBtn.setOnAction(new ButtonHandler());
		howdyBtn.setOnAction(new ButtonHandler());
		chineseBtn.setOnAction(new ButtonHandler());
		frenchBtn.setOnAction(new ButtonHandler());
		clearBtn.setOnAction(new ButtonHandler());
		exitBtn.setOnAction(new ButtonHandler());

		// student Task #3:
		// add the label and textfield to one of the HBoxes
		hBox1.getChildren().addAll(feedbackLbl, textFld);
		// add the buttons to the other HBox
		hBox2.getChildren().addAll(helloBtn, howdyBtn, chineseBtn, frenchBtn, clearBtn, exitBtn);
		// add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hBox1, hBox2);

	}

	// Task #4:
	// create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent e) {
			if (e.getSource() == helloBtn) {
				textFld.setText(dataMgr.getHello());
			}
			
			if (e.getSource() == howdyBtn) {
				textFld.setText(dataMgr.getHowdy());
			}
			
			if (e.getSource() == chineseBtn) {
				textFld.setText(dataMgr.getChinese());
			}
			
			if (e.getSource() == frenchBtn) {
				textFld.setText(dataMgr.getFrench());
			}
			
			if (e.getSource() == clearBtn) {
				textFld.setText("");
			}
			
			if (e.getSource() == exitBtn) {
				System.exit(0);
			}
		}
		
	}
}
