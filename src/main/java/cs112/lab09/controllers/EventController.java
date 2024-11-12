package cs112.lab09.controllers;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class EventController {

    private RevisedHistoricalEvent redSummerEvent;
    private String location;

    protected void initData(String location, RevisedHistoricalEvent historicalEvent, Image image){
        this.location = location;
        this.redSummerEvent = historicalEvent;

        locationLabel.setText("Location");
        dateLabel.setText(redSummerEvent.getEventDay().toString());
        descriptionLabel.setText(redSummerEvent.getDescription());
        revisedDescriptionLabel.setText(redSummerEvent.getRevisedDescription());
        eventImageView.setImage(image);

    }

    @FXML
    private ImageView eventImageView;

    @FXML
    private Button closeButton;

    @FXML
    private Label locationLabel;

    @FXML
    private Label dateLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label revisedDescriptionLabel;

    @FXML
    protected void onCloseButtonClicked(ActionEvent actionEvent){
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}
