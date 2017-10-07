package zad9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main<T, V> extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static boolean integer = false;
    public static boolean doubler = false;
    public static boolean string = false;

    public Storage<T> storage;

    @Override
    public void start(Stage primaryStage) {
        storage = new Storage<>();

        VBox root = new VBox();
        HBox box = new HBox();

        final ToggleGroup group = new ToggleGroup();
        RadioButton rb = new RadioButton("Integer");
        RadioButton rb1 = new RadioButton("Double");
        RadioButton rb2 = new RadioButton("String");
        rb.setToggleGroup(group);
        rb.setSelected(true);
        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);


//        RadioButton rb1 = new RadioButton("Calendar");

//        RadioButton rb3 = new RadioButton("Contacts");


        TextField input = new TextField();

        Button submit = new Button("submit");
        box.getChildren().addAll(input, submit, rb, rb1, rb2);
        root.getChildren().add(box);


        rb.setOnAction(actionEvent -> {
            Integer i = 1;
            storage.init((T) i);
            System.out.println(Integer.TYPE);
            integer = true;
            doubler = false;
            string = false;


        });

        rb1.setOnAction(actionEvent -> {
            Double d = 12.32;
            storage.init((T) d);
            doubler = true;
            integer = false;
            string = false;

        });

        rb2.setOnAction(actionEvent -> {
            storage.init((T) new String());
            string = true;
            integer = false;
            doubler = false;

        });

        submit.setOnMouseClicked(mouseEvent -> {
            if(string) {
                storage.addToList((T) input.getText());
            }else if(integer){
                Double d = Double.parseDouble(input.getText());
                storage.addToList((T)d);

            }else if(doubler){
                Integer i = Integer.parseInt(input.getText());
                storage.addToList((T)i);
            }

            ArrayList<String> lista = storage.print();
            for (String s :
                    lista) {
                root.getChildren().add(new Text(s));
            }
        });

        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();

    }

}
