package gui;

import application.Conference;
import javafx.geometry.Insets;
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
	private TextField txfLecture, txfStartDato, txfSlutDato, txfAddresse;
    private TextArea txaTrip, txaHotel;
    private ListView<Conference> lvwConference;
	
	public KonferencePane(){
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);
		
		Label lblComp = new Label("Konference");
        this.add(lblComp, 0, 0);
		
        lvwConference = new ListView<>();
        this.add(lvwConference, 0, 1, 1, 3);
        lvwConference.setPrefWidth(200);
        lvwConference.setPrefHeight(400);
        lvwConference.getItems().setAll(Service.getKonference());

        Label lblLecturer = new Label("Lecture");
        txfLecture = new TextField();
        this.add(lblLecturer, 2, 0);
        txfLecture.setEditable(false);
        
        Label lblAddresse = new Label("Addresse");
        txfAddresse = new TextField();
        this.add(lblAddresse, 2, 1);
        txfAddresse.setEditable(false);
  
        Label lblStartDato = new Label("Start Dato");
        txfStartDato = new TextField();
        this.add(lblStartDato, 3, 1);
        txfStartDato.setEditable(false);
        
        Label lblSlutDato = new Label("Slut Dato");
        txfSlutDato = new TextField();
        this.add(lblSlutDato, 3, 2);
        txfSlutDato.setEditable(false);
        
        Label lblHotel = new Label("Hotel:");
        this.add(lblHotel, 2, 3);
        
        txaHotel = new TextArea();
        this.add(txaHotel, 2, 4);
        txaHotel.setPrefWidth(200);
		txaHotel.setPrefHeight(100);
		txaHotel.setEditable(false);
        
        Label lblTrip = new Label("Trip:");
        this.add(lblTrip, 3, 3);
        
        
        txaTrip = new TextArea();
        this.add(txaTrip, 3, 4);
        txaTrip.setPrefWidth(200);
		txaTrip.setPrefHeight(100);
		txaTrip.setEditable(false);
		
        HBox hBoxButtons = new HBox(20);
        this.add(hBoxButtons, 0, 5, 2, 1);
              
        Button btnAddKon = new Button("Add Konference");
        hBoxButtons.getChildren().add(btnAddKon);
        btnAddKon.setOnAction(event -> this.addKonference());

        Button btnUpdate = new Button("Update");
        hBoxButtons.getChildren().add(btnUpdate);
        btnUpdate.setOnAction(event -> this.update());
        
        Button btnConnectHotel = new Button("Add Hotel");
        hBoxButtons.getChildren().add(btnConnectHotel);
        btnConnectHotel.setOnAction(event -> this.connectHotel());

        
	}

	//----------------------------------------------------
	
	private void addKonference() {
		
	}

	private void update() {
		
	}

	private void connectHotel() {
		
	}
}
