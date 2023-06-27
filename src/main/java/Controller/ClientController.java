package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientController {

//
//    public javafx.scene.control.ScrollPane TxtMassageShowFeild;
//
//    public TextField textChat;
//    public ImageView lbl_name;
//
//    @FXML
//    private VBox VBox;
//
//    @FXML
//    private AnchorPane imogi_pane;

    public ScrollPane TxtMassageShowFeild;
    public VBox v_box;
    public TextField TxtMassageTypeFeild;
    public AnchorPane imogi_pane;
    public Label lbl_name;


    BufferedReader reader;
    PrintWriter writer;
    Socket socket;
    private FileChooser fileChooser;
    private File filePath;


    public void emo_pane_on_action(MouseEvent mouseEvent) {

    }

    public void sad(MouseEvent mouseEvent) {

    }

    public void lot_sad(MouseEvent mouseEvent) {

    }

    public void money(MouseEvent mouseEvent) {

    }

    public void love(MouseEvent mouseEvent) {

    }

    public void green_sad(MouseEvent mouseEvent) {

    }

    public void smile_one_eyy(MouseEvent mouseEvent) {

    }

    public void cry_yes(MouseEvent mouseEvent) {

    }

    public void cry_head(MouseEvent mouseEvent) {

    }

    public void real_amile(MouseEvent mouseEvent) {

    }

    public void tuin(MouseEvent mouseEvent) {

    }

    public void woow(MouseEvent mouseEvent) {

    }

    public void smile_normal(MouseEvent mouseEvent) {

    }

    public void large_smile(MouseEvent mouseEvent) {

    }

    public void small_smile(MouseEvent mouseEvent) {

    }

    public void tong_smile(MouseEvent mouseEvent) {

    }

    public void btn_logout_On_action(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void ChatOnAction(ActionEvent event) {
        String msg = TxtMassageTypeFeild.getText();
        writer.println(lbl_name.getText() + ": " + msg);

        TxtMassageTypeFeild.clear();


        if(msg.equalsIgnoreCase("BYE") || (msg.equalsIgnoreCase("logout"))) {
            System.exit(0);

        }

    }

    public void btn_imogi_on_action(MouseEvent mouseEvent) {
        imogi_pane.setVisible(true);

    }

    public void btn_cam_on_action(MouseEvent mouseEvent) {
        FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        String file = dialog.getDirectory()+dialog.getFile();
        dialog.dispose();
        //sendImage(file);
        System.out.println(file + " chosen.");

    }

    public void btn_massage_send_on_action(MouseEvent mouseEvent) {

    }

    public void Mouse_On_Click_Hide_Emogi(MouseEvent mouseEvent) {
        imogi_pane.setVisible(false);
    }
}
