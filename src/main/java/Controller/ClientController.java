package Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
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
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;

public class ClientController extends Thread{
    public ScrollPane TxtMassageShowFeild;
    public VBox VBox;
    /* public static HBox h_box;*/
    public TextField textChat;
    public AnchorPane imogi_pane;
    public Label lbl_name;

    BufferedReader reader;
    PrintWriter writer;
    Socket socket;
    private FileChooser fileChooser;
    private File filePath;

    public void initialize() throws IOException {
        String userName=LoginController.User_name;
        lbl_name.setText(userName);
        try {
            socket = new Socket("localhost", 4500);
            System.out.println("Socket is connected with server!");
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(), true);

            this.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        imogi_pane.setVisible(false);
    }


    public void btn_logout_On_action(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void btn_imogi_on_action(MouseEvent mouseEvent) {

        imogi_pane.setVisible(true);

    }

    public void btn_cam_on_action(MouseEvent mouseEvent) {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        fileChooser = new FileChooser();
        fileChooser.setTitle("Open Image");
        this.filePath = fileChooser.showOpenDialog(stage);
        writer.println(lbl_name.getText() + " " + "img" + filePath.getPath());
    }

    public void btn_massage_send_on_action(MouseEvent mouseEvent) {
        String msg = textChat.getText();
        writer.println(lbl_name.getText() + ": " + msg);

        textChat.clear();

        if(msg.equalsIgnoreCase("BYE") || (msg.equalsIgnoreCase("logout"))) {
            System.exit(0);

        }
    }

    public void emo_pane_on_action(MouseEvent mouseEvent) {

    }

    public void sad(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128546));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void lot_sad(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128554));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void money(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(129297));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void love(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128525));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void green_sad(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128560));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void smile_one_eyy(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128540));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);
    }

    public void cry_yes(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128546));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void cry_head(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128550));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void real_amile(MouseEvent mouseEvent) {
        String emoji =new String(Character.toChars(128514));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void tuin(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128519));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void woow(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128559));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void smile_normal(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128513));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void large_smile(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128522));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void small_smile(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128578));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }

    public void tong_smile(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128539));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);

    }


    public void Mouse_On_Click_Hide_Emogi(MouseEvent mouseEvent) {
        imogi_pane.setVisible(false);
    }

    public void ChatOnAction(ActionEvent event) {
        String msg = textChat.getText();
        writer.println(lbl_name.getText() + ": " + msg);

        textChat.clear();


        if(msg.equalsIgnoreCase("BYE") || (msg.equalsIgnoreCase("logout"))) {
            System.exit(0);

        }

    }
}
