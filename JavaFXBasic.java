import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import java.io.*;
import java.util.Scanner;



import javax.swing.*;

//public class JavaFXBasic extends Application implements EventHandler<ActionEvent> {
//
//    public static void main(String []args){
//        launch(args);
//    }
//    @Override
//    public void start(Stage stage){
//        Button bt = new Button("_Click Me");
//        // set the tip for the button which indicates what this button can do;
//        Tooltip tp  = new Tooltip("Click button for save data");
//        bt.setTooltip//        stage.show();p(tp);
//        //  setTextFill is used to set the color of the text;
//        bt.setTextFill(Color.WHITE);
//        // setMnemonicParsing is used to set the shortCut and used by alt key
//        // it took one boolean value at time either it take true or false;
//        bt.setMnemonicParsing(true);
//        bt.setStyle("-fx-border-color:white;-fx-background-color:black;");
//        Alert a = new Alert(Alert.AlertType.INFORMATION,"Button is clicked");
//        bt.setOnAction(e->a.show());
//        FlowPane fp = new FlowPane();
//        fp.getChildren().add(bt);
//        Scene sc = new Scene(fp,400,400);
//        stage.setScene(sc);
//    }
//}








//     Method1 :  USing EventHandler and ActionHandler
//    Button b;
//    private int count = 0;
//    @Override
//    public void start(Stage stage) throws Exception {
//        b = new Button("Counter:0");
//        b.setPrefSize(100,30);
//        b.setOnAction(this);
//        b.setStyle("-fx-background-color:yellow;-fx-padding: 20;-fx-alignment:center;");
//        FlowPane fp = new FlowPane();
//        fp.getChildren().add(b);
//        fp.setStyle("-fx-alignment:center;-fx-background-color:black;-fx-padding:20px;");
//        Scene sc = new Scene(fp,400,400);
//        stage.setTitle("Counter");
//        stage.setScene(sc);
//        stage.show();
//
//    }
//
//    @Override
//    public void handle(ActionEvent actionEvent) {
//        count++;
//        b.setText(""+count);
//    }
//}





// Method 2: Using the anonymous function;
//public class JavaFXBasic extends Application {
//    public static void main(String []args){
//        launch(args);
//    }
//    private int count = 0;
//    public void start(Stage stage){
//        Button b = new Button("Counter :0");
//        b.setPrefSize(100,30);
//        b.setStyle("-fx-text-fill:white;-fx-background-color:black;-fx-alignment:center");
//        b.setOnAction( new EventHandler<ActionEvent>(){
//            public void handle(ActionEvent actionevent){
//                count++;   e->{count++; b.setText(""+count);
//                b.setText(""+count);
//            }
//        });
//        FlowPane fp = new FlowPane();
//        fp.getChildren().add(b);
//        fp.setStyle("-fx-alignment:center;-fx-background-color:yellow;-fx-padding:20px;");
//        Scene sc = new Scene(fp,400,400);
//        stage.setScene(sc);
//        stage.show();
//
//    }
//}




// Method 3 : Using lambda Expression
// public class JavaFXBasic extends Application{
//    public static void main(String []args){
//        launch(args);
//    }
//    private int count = 0;
//    public void start(Stage stage){
//        Button b = new Button("Counter:0");
//        b.setPrefSize(100,30);
//        b.setStyle("-fx-border-width: 2px; -fx-border-color: pink;");
//        b.setOnAction(e->{count++;b.setText(""+count);});
//        FlowPane fp = new FlowPane();
//        fp.getChildren().add(b);
//        fp.setStyle("-fx-alignment:center;-fx-padding:20px;");
//        Scene sc  = new Scene(fp,400,400);
//        stage.setScene(sc);
//        stage.setTitle("Counter");
//        stage.show();
//    }
//}



//
//public class JavaFXBasic extends Application implements EventHandler<ActionEvent>{
//    public static void main(String[]args){
//        launch(args);
//    }
//    RadioButton r1,r2,r3;
//    CheckBox c1,c2,c3;
//      Text t;
//      ChoiceBox<Integer> cb ;
//      @Override
//    public void start(Stage stage){
//         t = new Text("Hello World");
//          t.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20));
//         HBox b = new HBox();
//         b.getChildren().add(t);
//        r1 = new RadioButton("Red");
//        r2 = new RadioButton("Blue");
//        r3 = new RadioButton("Green");
//        ToggleGroup g1 = new ToggleGroup();
////        g1.getToggles().addAll(r1,r2,r3);
//          r1.setToggleGroup(g1);
//          r1.setOnAction(this);
//          r2.setToggleGroup(g1);
//          r2.setOnAction(this);
//          r3.setToggleGroup(g1);
//          r3.setOnAction(this);
//
//        HBox b1 = new HBox(r1,r2,r3);
//        b1.setSpacing(15);
//        b1.setPadding(new Insets(10));
//
//        c1 = new CheckBox("Normal");
//        c2 = new CheckBox("Bold");
//        c3 = new CheckBox("Italic");
//        HBox b2 = new HBox(c1,c2,c3);
//        c1.setOnAction(this);
//        c2.setOnAction(this);
//        c3.setOnAction(this);
//        b2.setPadding(new Insets(10));
//        b2.setSpacing(15);
//
//        cb = new ChoiceBox<>();
//        cb.getItems().addAll(10,20,30,40,50);
//        cb.setValue(20);
//        cb.setOnAction(this);
//        HBox b3 = new HBox();
//        b3.getChildren().add(cb);
//
//        VBox containBox = new VBox();
//        containBox.getChildren().addAll(b,b1,b2,b3);
//        containBox.setSpacing(15);
//        containBox.setPadding(new Insets(10));
//        Scene sc = new Scene(containBox,600,600);
//        stage.setScene(sc);
//        stage.show();
//    }
//
//    @Override
//    public void handle(ActionEvent actionEvent) {
//        FontPosture fp = FontPosture.REGULAR;
//        FontWeight fw = FontWeight.NORMAL;
//        if(r1.isSelected()){
////            t.setStyle("-fx-text-fill:red");
//            t.setFill(Paint.valueOf("RED"));
//        }
//
//        if(r2.isSelected()){
////            t.setStyle("-fx-text-fill:blue");
//            t.setFill(Paint.valueOf("BLUE"));
//        }
//
//        if(r3.isSelected()){
////            t.setStyle("-fx-text-fill:green");
//            t.setFill(Paint.valueOf("GREEN"));
//        }
//        if(c2.isSelected()){
//            fw = FontWeight.BOLD;
//        }
//        if(c3.isSelected()){
//            fp = FontPosture.ITALIC;
//        }
//        t.setFont((Font.font("Times New Roman",fw,fp,cb.getValue())));
//
//    }
//}
//
//public class JavaFXBasic extends Application {
//    public static void main(String []args){
//        launch(args);
//    }
//    public void start(Stage stage){
//        TextArea ta = new TextArea();
//        ta.setPrefColumnCount(30);
//        ta.setPrefRowCount(100);
//
//        Slider sl = new Slider(10,100,2);
//        sl.valueProperty().addListener(e->ta.setFont(Font.font(sl.getValue())));
//        DatePicker dp = new DatePicker();
//        dp.setShowWeekNumbers(true);
//        dp.setOnAction(e->ta.setText("Date"+dp.getValue()+"\n"+ta.getText()));
//        ColorPicker cp = new ColorPicker();
//        cp.setOnAction(e->{
//            ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8)+";");
////            ta.setStyle(ta.getText());
//        });
//        Button bt = new Button("Choose File");
//        bt.setOnAction(e->{
//            FileChooser fc = new FileChooser();
//            File file = fc.showOpenDialog(stage);
//            try{
//                StringBuilder str = new StringBuilder();
//                Scanner sc  = new Scanner(new FileInputStream(file));
//                while(sc.hasNext()){
//                 str.append(sc.nextLine()).append("\n");
//                ta.setText(str.toString());}
//            }
//            catch(Exception r){
//                System.err.println(" Not a Valid file");
//            }
//        });
//        VBox vb = new VBox();
//        vb.getChildren().addAll(ta,sl,dp,cp,bt);
//        vb.setAlignment(Pos.TOP_CENTER);
//        Scene sc = new Scene(vb,500,500);
//        stage.setScene(sc);
//        stage.show();
//
//
//    }
//    ChoiceBox<String> cb;
//    public void start (Stage stage){
//        TextArea ta = new TextArea();
//        ta.setPrefColumnCount(30);
//        ta.setPrefRowCount(100);
//        HBox b2 = new HBox(ta);
//
//        Label label = new Label("File Operation");
//        cb = new ChoiceBox<>();
//        cb.setPrefWidth(20);
//
////        Button bt1 = new Button("Open File");
////        Button bt2 = new Button("Change Size");
////        Button bt3 = new Button("BackGround_Colour_Changer");
////        FlowPane fp = new FlowPane();
////        fp.getChildren().addAll(bt1,bt2,bt3);
//        cb.getItems().addAll("Open_File","Change_Size","Text_Color_Changer");
//        cb.setOnAction(e->{
//            if(cb.getValue().equals("Open_File")){
//                FileChooser fc = new FileChooser();
//                try{
//                    File file = fc.showOpenDialog(stage);
//                    Scanner sc = new Scanner(new FileInputStream(file));
//                    StringBuilder str = new StringBuilder();
//                    while(sc.hasNext()){
//                        str.append(sc.nextLine()).append("\n");
//                        ta.setText(str.toString());
//                    }
//                }
//                catch(Exception e1){
//                    System.err.println(e1.getMessage());
//                }
//
//            }
//            if(cb.getValue().equals("Text_Color_Changer")){
//                ColorPicker cp = new ColorPicker();
//                cp.setOnAction(q->{
//                    ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8)+";");
//                });
//                Stage colorStage = new Stage();
//                VBox colorLayout = new VBox(10, new Label("Pick Text Color:"), cp);
//                Scene colorScene = new Scene(colorLayout, 300, 200);
//                colorStage.setTitle("Select Text Color");
//                colorStage.setScene(colorScene);
//                colorStage.show();
//            }
//        });
//        HBox b1 = new HBox(label,cb);
//        VBox root = new VBox(b1,b2);
//        Scene sc = new Scene(root,400,400);
//        stage.setScene(sc);
//        stage.show();
//    }
//}



public class JavaFXBasic extends Application{
    public static void main(String []args){
        launch(args);
    }

    private File currentFile = null;
    public void start(Stage stage){
        TextArea ta = new TextArea();
        ta.setPrefColumnCount(50);
        ta.setPrefRowCount(50);
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        MenuItem changeSize = new MenuItem("Change_Size");
        MenuItem changeTextColor = new MenuItem("TextColor");
        MenuItem saveText = new MenuItem("Save");
        MenuItem killButton = new MenuItem("Kill Button");
        MenuItem background_color = new MenuItem("Background_color");
        fileMenu.getItems().addAll(openItem,changeSize,changeTextColor,saveText,killButton,background_color);
        menuBar.getMenus().add(fileMenu);
        openItem.setOnAction(e->{
            FileChooser fc = new FileChooser();
            try{
                File file = fc.showOpenDialog(stage);
                currentFile = file;
                StringBuilder st = new StringBuilder();
                Scanner sc = new Scanner(new FileInputStream(file));
                while(sc.hasNext()){
                    st.append(sc.nextLine()).append("\n");
                    ta.setText(st.toString());
                }
            }
            catch(Exception e1){
                System.err.println();
            }
        });
        changeTextColor.setOnAction(e->{
            ColorPicker cp = new ColorPicker();
            Stage colorPanel = new Stage();
            cp.setOnAction(e1->{
                ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8)+";");
                colorPanel.close();
            });

            VBox v1 = new VBox(10,new Label("Pick TextColor"),cp);
            Scene colorPanelScene = new Scene(v1,300,200);
            colorPanel.setTitle("Select Color");
            colorPanel.setScene(colorPanelScene);
            colorPanel.show();
        });
        saveText.setOnAction(e->{
            if(currentFile==null){
                FileChooser fc = new FileChooser();
                currentFile = fc.showSaveDialog(stage);
                fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
            }
            if(currentFile!=null){
            try{
                FileWriter writer = new FileWriter(currentFile);
                writer.write(ta.getText());
            }
            catch(Exception e1){
                System.out.println();}
            }
        });
        changeSize.setOnAction(e->{
            Slider sl = new Slider(10,100,10);
            sl.setShowTickLabels(true);
            sl.setShowTickMarks(true);
            sl.setMajorTickUnit(10);
            sl.setBlockIncrement(1);
            sl.setMajorTickUnit(100);
            sl.setMinorTickCount(10);
            Stage sliderStage = new Stage();
            sl.valueProperty().addListener(e1->{
                ta.setFont(Font.font(sl.getValue()));
                sliderStage.close();
            });
            VBox sliderVBox = new VBox(10, new Label("Adjust Font Size"),sl);
            Scene sliderScene = new Scene(sliderVBox, 300, 100);
            sliderStage.setTitle("Adjust_The_Size");
            sliderStage.setScene(sliderScene);
            sliderStage.show();

        });
        killButton.setOnAction(e->{
            stage.close();
        });
        background_color.setOnAction(e->{
            ColorPicker cp = new ColorPicker();
            Stage backGroundColorStage = new Stage();
            cp.setOnAction(e1->{
                ta.setStyle("-fx-control-inner-background:#"+cp.getValue().toString().substring(2,8)+";");
                backGroundColorStage.close();
            });
            VBox v1 = new VBox(10, new Label("Choose BackgroundColor"),cp);
            Scene backgroundColorScene = new Scene(v1,400,400);
            backGroundColorStage.setTitle("Choose BackGroundColor");
            backGroundColorStage.setScene(backgroundColorScene);
            backGroundColorStage.show();
        });
        MenuBar menubar_1 = new MenuBar();
        Menu ToSeeAmazing = new Menu("ToSeeAmazing");
        MenuItem KillButton = new MenuItem("_Kill_Button");
        KillButton.setOnAction(e->{
            stage.close();
        });

        ToSeeAmazing.getItems().addAll(KillButton);
        menubar_1.getMenus().addAll(ToSeeAmazing);
        HBox box_menu = new HBox(menuBar,menubar_1);
        VBox v1 = new VBox(box_menu,ta);
        Scene sc = new Scene(v1);
        stage.setScene(sc);
        stage.show();
    }
}

