package assignment2.pkg2018;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Calum
 */
public class GameLibraryController implements Initializable {

    //objects
    @FXML private TextField gameNameTextField;
    @FXML private ComboBox<String> gameGenreComboBox;
    @FXML private ComboBox<String> gameAgeRatingComboBox;
    @FXML private Spinner gameStarRatingSpinner;
    @FXML private Label errorMsgLabel;
    
    //when pushed, it "tries" to get information, prints to .txt file, and prints to the console
    public void newGameButtonPushed() throws IOException {
        try{           
            GameLibrary newGameLibrary = new GameLibrary(this.gameNameTextField.getText(),
            this.gameGenreComboBox.getValue().toString(), this.gameAgeRatingComboBox.getValue().toString(), 
            (int) this.gameStarRatingSpinner.getValue());
            
        BufferedWriter writer = new BufferedWriter(new FileWriter("GameLibrary.txt", true));
        writer.write(newGameLibrary.toString());
        writer.close();
            System.out.printf("Game Added: %s %n", newGameLibrary);
        }
        //if unable to obtain information, it will catch
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
            this.errorMsgLabel.setText(e.getMessage());
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //creates a Listed Array including the number of genres available in the ComboBox
        List genre = Arrays.asList("Action", "Adventure", "RPG", "Platformer", "Survival", 
        "Shooter", "Horror", "Survival");
        this.gameGenreComboBox.getItems().addAll(genre);
        gameGenreComboBox.setValue("Action");
        
        //creates a Listed Array including the number of Age Ratings available in the ComboBox
        List rating = Arrays.asList("Everyone [E]", "Teen [T]", "Mature [M]");
        this.gameAgeRatingComboBox.getItems().addAll(rating);
        gameAgeRatingComboBox.setValue("Everyone [E]");
        
        //
        //creates the spinnervaluefacotry object and adds the range of 1, 10
        SpinnerValueFactory<Integer> weekValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10);
        this.gameStarRatingSpinner.setValueFactory(weekValueFactory);
    }    
    
}
