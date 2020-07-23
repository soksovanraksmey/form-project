/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxform;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author mac
 */
public class SceneTwoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane thisScene;
    private int count = 0;
    
     @FXML// back button
    void click(ActionEvent event) {
        AnchorPane sceneOne = (AnchorPane) thisScene.getParent();
        sceneOne.getChildren().remove(thisScene);
    }
        @FXML
    private Text text2;
     @FXML
    private VBox vbox;
        @FXML
    void text1(MouseEvent event) {
        count++;
        
        switch(count){
            case 1:
                showText("Hello");
                break;
            case 2:
                showText("World");
                break;
            case 3:
                showText("Welcome");
                break;
            case 4:
                showText("i' am netbean");
                break;
            case 5:
                showText("you in my mine");
                break;
            default:
                showText("Thank U");
                count=0;
                break;
        }
        
        
       
    }
    
    private void showText(String text){
        Label gg = new Label(text);
        vbox.getChildren().add(gg);
        System.out.println(vbox);
    }
   @FXML
    void clear(ActionEvent event) {
        vbox.getChildren().clear();
        //System.out.println("helo");
        count=0;
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
