package application;

import draftProject.Manager;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NFLDraftApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		// create login scene
		StackPane pane = new StackPane();
		Scene loginpage = new Scene(pane, 650, 600);
		primaryStage.setTitle("Welcome to the NFL Draft App");
		primaryStage.setScene(loginpage);
		primaryStage.show();
		// background
		Image lgin = new Image(
				"http://www.wkyc.com/img/resize/content.wkyc.com/photo/2016/04/14/635772342385883779-Browns2_1460679062198_1629326_ver1.0.JPG?preset=534-401");
		ImageView background = new ImageView(lgin);
		background.setFitHeight(600);
		background.setFitWidth(650);
		pane.getChildren().add(background);

		// login credentials entry pane
		FlowPane creds = new FlowPane();
		// login button
		Button login = new Button("Log in");
		creds.setOrientation(Orientation.VERTICAL);
		creds.setPadding(new Insets(11, 12, 13, 14));
		creds.setHgap(5);
		creds.setVgap(5);
		creds.getChildren().addAll(new Label("Username"), new TextField());
		creds.getChildren().addAll(new Label("Password"), new TextField(), login);
		creds.setAlignment(Pos.CENTER);
		pane.getChildren().add(creds);

		// page function
		// go back button
		Button goBack = new Button("Go Back");

		// headquarters scene
		// creates headquarters page, login button action

		// creates headquarters scene and button action
		Button availPlayers = new Button("Available Players"), roster = new Button("My Roster");
		// set background
		Image hQ = new Image("https://s3media.247sports.com/Uploads/Assets/461/948/4948461.jpg");
		ImageView hQbackground = new ImageView(hQ);

		// add buttons
		StackPane buttons = new StackPane();
		Scene headquarters = new Scene(buttons, 600, 650);
		login.setOnAction(e -> primaryStage.setScene(headquarters));
		buttons.getChildren().add(hQbackground);
		VBox hqbutton = new VBox();
		hqbutton.getChildren().addAll(availPlayers, roster);
		buttons.getChildren().add(hqbutton);
		buttons.setAlignment(Pos.CENTER);
		hqbutton.setAlignment(Pos.CENTER);

		// Available Players Scene creation and button action
		Pane availplayers = new Pane();
		Button hquarters = new Button("Go back to Headquarters");
		Image Ap = new Image("https://pbs.twimg.com/media/C-bTmxLWsAEkJyF.jpg");
		ImageView Apbackground = new ImageView(Ap);

		// Add Offensive Players to Available Players scene
		Text player = new Text();
		Manager availableplayers = new Manager();
		player.setText(Manager.roster.get(0) + "\n");
		Text player2 = new Text();
		player2.setText(Manager.roster.get(1) + "\t");
		Group players = new Group();
		TilePane playerBox = new TilePane();
		playerBox.setOrientation(Orientation.HORIZONTAL);
		ObservableList<Node> list = players.getChildren();
		list.add(player);
		Button select = new Button("Select");
		select.setAlignment(Pos.BOTTOM_CENTER);
		playerBox.getChildren().addAll(player2, select);
		playerBox.getChildren().add(player);

		// add nodes
		availplayers.getChildren().add(Apbackground);
		availplayers.getChildren().add(playerBox);
		availplayers.getChildren().add(hquarters);
		Scene availablePlayers = new Scene(availplayers, 600, 650);

		hquarters.setOnAction(e -> primaryStage.setScene(headquarters));
		availPlayers.setOnAction(e -> primaryStage.setScene(availablePlayers));

		// creates roster scene and button action
		GridPane Roster = new GridPane();
		Scene rster = new Scene(Roster, 600, 650);
		roster.setOnAction(e -> primaryStage.setScene(rster));
		// roster background
		Image rst = new Image("https://pbs.twimg.com/media/CXzgVplUwAAm-yb.jpg:large");
		ImageView rstbackground = new ImageView(rst);
		Roster.getChildren().add(rstbackground);
		Roster.getChildren().add(goBack);
		goBack.setOnAction(e -> primaryStage.setScene(headquarters));
		// page design

		// Page function

		// roster scene

		// page function

	}

	public static void main(String[] args) {
		launch(args);
	}
}
