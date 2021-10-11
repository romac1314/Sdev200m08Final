package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import java.io.*;
import java.util.Scanner;
import javafx.scene.layout.StackPane;

public class GetTireSize extends Application {
	//set text fields and buttons for the tire sizes
	private TextField width1 = new TextField();
	private TextField aspectRatio1 = new TextField();
	private TextField diameter1 = new TextField();
	
	
	private TextField width2 = new TextField();
	private TextField aspectRatio2 = new TextField();
	private TextField diameter2 = new TextField();
	
	private Button btnCalculate1 = new Button("Calculate Overall Diameter");
	private Button btnCalculate2 = new Button("Calculate Circumference Difference");
	private Button btnCalculate3 = new Button("Calculate Speedometer Difference at 60mph");
	
	protected TextField OverallDiameter = new TextField();
	protected TextField tireCircumference = new TextField();
	protected TextField Speedometer = new TextField();

	@Override 
	public void start(Stage primaryStage) {
		// create interface for the tire size labels and text boxes
		GridPane pane = new GridPane();
		pane.setVgap(10);
		pane.setHgap(10);
		pane.add(new Label("Enter Tire Width 1:"), 0, 0);
		pane.add(width1, 1, 0);
		pane.add(new Label("Enter Aspect Ratio 1:"), 2, 0);
		pane.add(aspectRatio1, 3, 0);
		pane.add(new Label("Enter Diameter 1:"), 4, 0);
		pane.add(diameter1, 5, 0);
		pane.add(new Label(" Enter Tire width 2:"), 0, 3);
		pane.add(width2, 1, 3);
		pane.add(new Label(" Enter Aspect Ratio 2:"), 2, 3);
		pane.add(aspectRatio2, 3, 3);
		pane.add(new Label("Enter Diameter 2:"), 4, 3);
		pane.add(diameter2, 5, 3);
		//buttons
		pane.add(btnCalculate1, 1, 6);
		pane.add(OverallDiameter, 1, 7);
		pane.add(btnCalculate2, 3, 6);
		pane.add(tireCircumference, 3, 7);
		pane.add(btnCalculate3, 5, 6);
		pane.add(Speedometer, 5, 7);
		

		// set ui positioning 
		pane.setAlignment(Pos.CENTER);
		width1.setAlignment(Pos.BOTTOM_RIGHT);
		aspectRatio1.setAlignment(Pos.BOTTOM_RIGHT);
		diameter1.setAlignment(Pos.BOTTOM_RIGHT);
		width2.setAlignment(Pos.BOTTOM_RIGHT);
		aspectRatio2.setAlignment(Pos.BOTTOM_RIGHT);
		diameter2.setAlignment(Pos.BOTTOM_RIGHT);
		GridPane.setHalignment(btnCalculate1, HPos.RIGHT);
		pane.setPadding(new Insets(10, 10, 10, 10));

		//Set button Events
		btnCalculate1.setOnAction(e -> overallDiameter());
		btnCalculate2.setOnAction(e -> tireCircumference());
		btnCalculate3.setOnAction(e -> Speedometer());
		
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Tire Size Calculator"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
	
	public void overallDiameter(){
		double AspectRatio1 = Double.valueOf(aspectRatio1.getText());
		double AspectRatio2 = Double.valueOf(aspectRatio1.getText());
		
		double Diameter1 = Double.valueOf(diameter1.getText());
		double Diameter2 = Double.valueOf(diameter2.getText());
		
        double overallDiameter1 = (Diameter1 + (2 * AspectRatio1));
        double overallDiameter2 = (Diameter2 + (2 * AspectRatio2));
        
        OverallDiameter.setText(overallDiameter1, overallDiameter2); 
        
	}

	public void tireCircumference() {

		double tireCircumference1 = overallDiameter1 * 3.14; 
		double tireCircumference2 = overallDiameter2 * 3.14;
	}

	private void Speedometer () {
		
	}


	public static void main(String[] args) {
		launch(args);
	}

}
