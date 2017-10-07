import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Zadatak4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Add subPanel");
        btn.setMinWidth(225);
        btn.setMinHeight(27);
        Button btn1 = new Button();
        btn1.setText("remove me");
        btn1.setMinWidth(100);

        Button btn2 = new Button();
        btn2.setText("remove me");
        btn2.setMinWidth(100);
        Button btn3 = new Button();
        btn3.setText("remove me");
        btn3.setMinWidth(100);
        Button btn4 = new Button();
        btn4.setText("Remove all");
        btn4.setMinWidth(225);
        btn4.setMinHeight(27);        
        Text tf = new Text();
        Text tf1 = new Text();
        Text tf2 = new Text();
        tf.setText("Hello subPanel(): 12");
        tf1.setText("Hello subPanel(): 13");
        tf2.setText("Hello subPanel(): 15");
        
        GridPane root = new GridPane();
        GridPane inner = new GridPane();
        inner.setPadding(new Insets(0, 0, 8, 6));
        inner.setHgap(8);
        inner.setVgap(8);
      
        inner.add(tf,0,1);
        inner.add(btn1,1,1);
        inner.add(tf1,0,2);
        inner.add(btn2,1,2);
        inner.add(tf2,0,3);
        inner.add(btn3, 1, 3);
        
        root.add(btn, 0, 0);
        root.add(inner,0,2);
        root.add(btn4,0,3);
        
        Scene scene = new Scene(root, 225, 161);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
