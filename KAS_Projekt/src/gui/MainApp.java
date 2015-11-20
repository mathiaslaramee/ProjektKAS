package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application{

	public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() {
        //Service.initStorage();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Architecture Demo");
        BorderPane pane = new BorderPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    
//-----------------------------------------------------
    private void initContent(BorderPane pane) {
        TabPane tabPane = new TabPane();
        this.initTabPane(tabPane);
        pane.setCenter(tabPane);
    }

    private void initTabPane(TabPane tabPane) {
        tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        
        Tab tabKonference = new Tab("Konference");
        tabPane.getTabs().add(tabKonference);

        KonferencePane konferencePane = new KonferencePane();
        tabKonference.setContent(konferencePane);
        tabKonference.setOnSelectionChanged(event -> konferencePane.updateControls());

        Tab tabBooking = new Tab("Booking");
        tabPane.getTabs().add(tabBooking);

        BookingPane bookingPane = new BookingPane();
        tabBooking.setContent(bookingPane);
        tabBooking.setOnSelectionChanged(event -> bookingPane.updateControls());

        Tab tabHotels = new Tab("Hotel");
        tabPane.getTabs().add(tabHotels);

        HotelPane hotelPane = new HotelPane();
        tabHotels.setContent(hotelPane);
        tabHotels.setOnSelectionChanged(event -> hotelPane.updateControls());
        
        Tab tabOverview = new Tab("Overview");
        tabPane.getTabs().add(tabOverview);

        OverviewPane overviewPane = new OverviewPane();
        tabOverview.setContent(overviewPane);
        tabOverview.setOnSelectionChanged(event -> overviewPane.updateControls());
   
    }
    
}
