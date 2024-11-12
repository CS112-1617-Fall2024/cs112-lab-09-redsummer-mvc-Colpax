package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;

public class MapController {

    @FXML
    private Button sanFranciscoCAbutton;

    @FXML
    private Button bisbeeAZbutton;

    @FXML
    protected void sanFranciscoCAbuttonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-view.fxml"));
        Parent eventViewParent = loader.load();

        EventController eventController = loader.getController();
        eventController.initData("San Francisco, CA", new RevisedHistoricalEvent());

        Stage popup = new Stage();
        popup.setScene(new Scene(eventViewParent));
        popup.show();
    }

    @FXML
    protected void bisbeeAZbuttonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-view.fxml"));
        Parent eventViewParent = loader.load();

        Stage popup = new Stage();
        popup.setScene(new Scene(eventViewParent));
        popup.show();
    }
}
