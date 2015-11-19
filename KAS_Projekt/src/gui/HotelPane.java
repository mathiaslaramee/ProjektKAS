package gui;

import javafx.geometry.Insets;
import application.Hotel;
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

public class HotelPane extends GridPane{
	private ListView<Hotel> lvwHotel;
	private TextArea txaServiceYd, txaDeltagere;

	public HotelPane(){
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);

		Label lblHotel = new Label("Hotel Liste");
		this.add(lblHotel, 0, 0);

		lvwHotel = new ListView<>();
		this.add(lvwHotel, 0, 1, 1, 3);
		lvwHotel.setPrefWidth(200);
		lvwHotel.setPrefHeight(400);
		lvwHotel.getItems().setAll(Service.getHotel());

		Label lblServiceYd = new Label("ServiceYdelser:");
        this.add(lblServiceYd, 3, 3);
        
        txaServiceYd = new TextArea();
        this.add(txaServiceYd, 3, 4);
        txaServiceYd.setPrefWidth(200);
		txaServiceYd.setPrefHeight(100);
		txaServiceYd.setEditable(false);
        
        Label lblDeltagere = new Label("Deltagere:");
        this.add(lblDeltagere, 3, 5);
        
        txaDeltagere = new TextArea();
        this.add(txaDeltagere, 3, 6);
        txaDeltagere.setPrefWidth(200);
		txaDeltagere.setPrefHeight(100);
		txaDeltagere.setEditable(false);
        
		HBox hBoxButtons = new HBox(20);
		this.add(hBoxButtons, 0, 6, 2, 1);

		Button btnAddHotel = new Button("Add Hotel");
		hBoxButtons.getChildren().add(btnAddHotel);
		btnAddHotel.setOnAction(event -> this.addHotel());

		Button btnUpdate = new Button("Update");
		hBoxButtons.getChildren().add(btnUpdate);
		btnUpdate.setOnAction(event -> this.update());


	}

	//----------------------------------------

	private void addHotel(){

	}

	private void update(){

	}


}
