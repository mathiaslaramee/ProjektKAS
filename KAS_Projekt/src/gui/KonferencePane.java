package gui;

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
    private ListView<Konference> lvwKonference;
	
	public KonferencePane(){
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);
		
		Label lblComp = new Label("Konference");
        this.add(lblComp, 0, 0);
		
//        lvwKonference = new ListView<>();
//        this.add(lvwKonference, 0, 1, 1, 3);
//        lvwKonference.setPrefWidth(200);
//        lvwKonference.setPrefHeight(400);
//        lvwKonference.getItems().setAll(Service.getKonference());

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
        
        Label lblHotel = new Label("Employees:");
        this.add(lblHotel, 2, 3);
        
        txaHotel = new TextArea();
        this.add(txaHotel, 2, 4);
        
        Label lblTrip = new Label("Employees:");
        this.add(lblTrip, 3, 3);
        
        txaTrip = new TextArea();
        this.add(txaTrip, 3, 4);
        
        HBox hBoxButtons = new HBox(20);
        this.add(hBoxButtons, 0, 5, 2, 1);
              
        Button btnAddKon = new Button("Add Konference");
        hBoxButtons.getChildren().add(btnAddKon);
        btnAddKon.setOnAction(event -> this.addKonference());

        Button btnUpdate = new Button("Update");
        hBoxButtons.getChildren().add(btnUpdate);
        btnUpdate.setOnAction(event -> this.update());
        
        Button btnAddHotel = new Button("Add Hotel");
        hBoxButtons.getChildren().add(btnAddHotel);
        btnAddHotel.setOnAction(event -> this.addHotel());

        
	}

	//----------------------------------------------------
	
	private void addKonference() {
		
	}

	private void addupdate() {
		
	}

	private void addHotel() {
		
	}
}
