package gui;

import javafx.geometry.Insets;
import application.Conference;
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

public class OverviewPane extends GridPane{
	private TextArea txaDeltagere; 
	private ListView<Conference> lvwConference;

	public OverviewPane(){
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);
		
		Label lblComp = new Label("Conference");
        this.add(lblComp, 0, 0);
		
        lvwConference = new ListView<>();
        this.add(lvwConference, 0, 1, 1, 3);
        lvwConference.setPrefWidth(200);
        lvwConference.setPrefHeight(400);
        //lvwConference.getItems().setAll(Service.getKonference());
        
        Label lblDeltagere = new Label("Deltagere:");
        this.add(lblDeltagere, 1, 0);
        
        txaDeltagere = new TextArea();
        this.add(txaDeltagere, 1, 1);
        txaDeltagere.setPrefWidth(200);
		txaDeltagere.setPrefHeight(100);
		txaDeltagere.setEditable(false);
        
		//TEST github
	}
	
	// ---------------------------------------------------
	
	public void updateControls(){
		
	}
}
