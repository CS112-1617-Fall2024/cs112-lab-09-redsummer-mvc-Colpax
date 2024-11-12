package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import cs112.lab09.models.Date;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
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
        eventController.initData("San Francisco, CA",
                new RevisedHistoricalEvent("San Francisco event DESCRIPTION",
                        new Date(5, 15, 1919),
                        "San Francisco event REVISED DESCRIPTION",
                        "citation"),
                new Image(getClass().getResourceAsStream("/images/sanfrancisco.jpg")));

        Stage popup = new Stage();
        popup.setScene(new Scene(eventViewParent));
        popup.show();
    }

    @FXML
    protected void bisbeeAZbuttonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-view.fxml"));
        Parent eventViewParent = loader.load();

        EventController eventController = loader.getController();
        eventController.initData("Bisbee, AZ",
                new RevisedHistoricalEvent("Bisbee event DESCRIPTION",
                        new Date(7, 13, 1919),
                        "Bisbee event REVISED DESCRIPTION",
                        "citation"),
                new Image(getClass().getResourceAsStream("/images/bisbee.png")));

        Stage popup = new Stage();
        popup.setScene(new Scene(eventViewParent));
        popup.show();
    }
}
