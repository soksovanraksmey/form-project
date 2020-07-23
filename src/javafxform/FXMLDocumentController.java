/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxform;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import javafx.scene.layout.AnchorPane;

/**
 *
 * @author mac
 */
public class FXMLDocumentController implements Initializable {
    
      @FXML
    private AnchorPane secne1;

//    @FXML
//    private Label label;
//    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
//  @FXML
//    private VBox vbox;
//
//
//    @FXML
//    void gg(MouseEvent event) {
//            //System.out.println("hello");
//            //vbox.label("hello world");
//            Label label= new Label("hello");
//            vbox.getChildren().add(label);
//            
//    }
//     @FXML
//    void clear(MouseEvent event) {
//         System.out.println("helo");
//         vbox.getChildren().clear();
//    }
      
@FXML  // go to scene2
    void enter(ActionEvent event) {
        //current.getchild.add(sceen())
        secne1.getChildren().add(this.scene());

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
    private AnchorPane scene(){
        try {
           Parent sceneTwo = FXMLLoader.load(getClass().getResource("sceneTwo.fxml"));
           
           return (AnchorPane) sceneTwo;
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
