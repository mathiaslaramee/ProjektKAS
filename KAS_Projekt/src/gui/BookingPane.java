package gui;

import application.Hotel;
import application.Participant;
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

public class BookingPane extends GridPane{
	private TextField txfLedsager, txfPris, txfHotel;
	private TextArea txaConference;
	private ListView<Participant> lvwParticipant;
	
	public BookingPane(){
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);
		
		Label lblParticipant = new Label("Participant Liste");
		this.add(lblParticipant, 0, 0);

		lvwParticipant = new ListView<>();
		this.add(lvwParticipant, 0, 1, 1, 3);
		lvwParticipant.setPrefWidth(200);
		lvwParticipant.setPrefHeight(400);
		//lvwParticipant.getItems().setAll(Service.getParticipant());

		Label lblLedsager = new Label("Ledsager");
		this.add(lblLedsager, 1, 0);
		
        txfLedsager = new TextField();
        this.add(txfLedsager, 2, 0);
        txfLedsager.setEditable(false);
		
        Label lblHotel = new Label("Hotel");
        this.add(lblHotel, 1, 1);
        
        txfHotel = new TextField();
        this.add(txfHotel, 2, 1);
        txfHotel.setEditable(false);
        
        Label lblPris = new Label("Pris");
        this.add(lblPris, 1, 2);
        
        txfPris = new TextField();
        this.add(txfPris, 2, 2);
        txfPris.setEditable(false);
		     
        Label lblConference = new Label("Tilmeldte conference");
        this.add(lblConference, 1, 3);
        
        txaConference = new TextArea();
        this.add(txaConference, 2, 3);
        txaConference.setPrefWidth(200);
		txaConference.setPrefHeight(100);
		txaConference.setEditable(false);
        
		HBox hBoxButtons = new HBox(20);
		this.add(hBoxButtons, 1, 6, 2, 1);
		hBoxButtons.setAlignment(Pos.CENTER);
		
		Button btnAddParticipant = new Button("Add Participant");
		hBoxButtons.getChildren().add(btnAddParticipant);
		btnAddParticipant.setOnAction(event -> this.addParticipant());

		Button btnUpdate = new Button("Update");
		hBoxButtons.getChildren().add(btnUpdate);
		btnUpdate.setOnAction(event -> this.update());

		
		
	}
	

	//----------------------------------------

	private void addParticipant(){

	}

	private void update(){

	}
	
	//------------------------------------------
	public void updateControls(){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
