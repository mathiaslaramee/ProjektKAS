package gui;

import javafx.geometry.Insets;
import application.model.Company;
import application.service.Service;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class KonferencePane extends GridPane{
	private TextField txfName, txfHours;
    private TextArea txaPar, txaHotel;
    private ListView<Konference> lvwKonference;
	
	public KonferencePane(){
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);
		
		Label lblComp = new Label("Konference");
        this.add(lblComp, 0, 0);
		
        lvwKonference = new ListView<>();
        this.add(lvwKonference, 0, 1, 1, 3);
        lvwKonference.setPrefWidth(200);
        lvwKonference.setPrefHeight(400);
        lvwKonference.getItems().setAll(Service.getKonference());

        Label lblStartDato = new Label("Start Dato");
        
        Label lblSlutDato = new Label("Slut Dato");
        
        Label lblLecturer = new Label("Lecture");
        
        
	}


}
