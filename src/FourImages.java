/*
 * Name: Four Images
 * Author: Leah Boalich
 * Date: September 24, 2024
 * Assignment: Chapter 14 Excercise 1
 * Description: This program uses a grid pane to display four images.
 */

// Imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

// Display four images in a grid pane
public class FourImages extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane to hold the texts
        GridPane pane = new GridPane();
        // Add padding
        pane.setPadding(new Insets(5, 5, 5, 10));
        // Center align
        pane.setAlignment(Pos.CENTER);
        // Set horizontal and vertical gaps
        pane.setHgap(10.0);
        pane.setVgap(10.0);
        

        // Create 4 images
        ImageView flag1 = new ImageView("Images/flag2.gif");
        ImageView flag2 = new ImageView("Images/flag7.gif");
        ImageView flag3 = new ImageView("Images/flag6.gif");
        ImageView flag4 = new ImageView("Images/flag1.gif");

        // Set all flags height to half the grid height minus padding and hgap
        flag1.fitHeightProperty().bind(pane.heightProperty().divide(2).subtract(15));
        flag2.fitHeightProperty().bind(pane.heightProperty().divide(2).subtract(15));
        flag3.fitHeightProperty().bind(pane.heightProperty().divide(2).subtract(15));
        flag4.fitHeightProperty().bind(pane.heightProperty().divide(2).subtract(35)); // Subtract extra from last flag

        // Set flags width to half the grid width minus padding and vgap
        flag1.fitWidthProperty().bind(pane.widthProperty().divide(2).subtract(20));
        flag2.fitWidthProperty().bind(pane.widthProperty().divide(2).subtract(80)); // Subtract extra from second flag
        flag3.fitWidthProperty().bind(pane.widthProperty().divide(2).subtract(20));
        flag4.fitWidthProperty().bind(pane.widthProperty().divide(2).subtract(20));

        // Add images to grid
        pane.add(flag1, 0, 0);
        pane.add(flag2, 1, 0);
        pane.add(flag3, 0, 1);
        pane.add(flag4, 1, 1);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_01"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    // Launch the program
    public static void main(String[] args) {
          Application.launch(args);
    }
}
