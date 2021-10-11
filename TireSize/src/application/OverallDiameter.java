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

public class OverallDiameter extends GetTireSize {
	double AspectRatio1 = Double.valueOf(aspectRatio1.getText());
	double AspectRatio2 = Double.valueOf(aspectRatio1.getText());
	
	double Diameter1 = Double.valueOf(diameter1.getText());
	double Diameter2 = Double.valueOf(diameter2.getText());
	
    double overallDiameter1 = (Diameter1 + (2 * AspectRatio1));
    double overallDiameter2 = (Diameter2 + (2 * AspectRatio2));
}