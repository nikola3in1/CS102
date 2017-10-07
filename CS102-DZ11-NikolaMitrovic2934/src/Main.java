import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    Label l1=new Label("naziv:");
    TextField tf1=new TextField();
    Label l2=new Label("br. telefona:");
    TextField tf2=new TextField();
    Label l3=new Label("radno vreme:");
    TextField tf3=new TextField();
    Label l4=new Label("lokacija");
    TextField tf4=new TextField();
    Label l5=new Label("Ukloni/Izmeni firmu(naziv):");
    TextField tf5=new TextField();
    Button btn = new Button("Dodaj");
    Button btn1=new Button("Ukloni");
    Button btn2=new Button("Izmeni");
    Button btn3=new Button("Prikazi sve");
    TextArea ta=new TextArea();
    @Override
    public void start(Stage primaryStage) {
        HBox h=new HBox();
        VBox v=new VBox();
        ta.setEditable(false);
        GridPane gp=new GridPane();
        gp.setPadding(new Insets(5));
        gp.add(l1, 0, 0);
        gp.add(tf1, 1, 0);
        gp.add(l2, 0, 1);
        gp.add(tf2, 1, 1);
        gp.add(l3, 0, 2);
        gp.add(tf3, 1, 2);
        gp.add(l4, 0, 3);
        gp.add(tf4, 1, 3);

        h.getChildren().addAll(btn,btn1,btn2,btn3);
        v.getChildren().addAll(gp,h,l5,tf5,ta);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Restoran r=new Restoran();
                r.setNaziv(tf1.getText());
                r.setRadnoVreme(tf2.getText());
                r.setBroj(tf3.getText());
                r.setLokacija(tf4.getText());

                Baza.addKontakt(r);
            }
        });
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Baza.deleteKontakt(tf5.getText());
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Baza.editKontakt(tf5.getText(), tf1.getText(), tf2.getText(), tf3.getText());
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                ta.setText("");
                ArrayList<Restoran>a=(ArrayList<Restoran>) Baza.getAllKontakt();
                for(Restoran ak:a){
                    ta.setText(ta.getText()+ak.toString()+"\n");
                }
            }
        });
        Scene scene = new Scene(v, 270, 450);

        primaryStage.setTitle("Zadatak15");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}