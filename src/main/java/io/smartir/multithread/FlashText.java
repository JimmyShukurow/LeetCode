package io.smartir.multithread;

//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;

//public class FlashText extends Application {
public class FlashText  {
//    private String text = "";
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        StackPane pane = new StackPane();
//        Label lblText = new Label("Programming is fun");
//        pane.getChildren().add(lblText);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    while (true) {
//                        if (lblText.getText().trim().isEmpty()) {
//                            text = "Welcome";
//                        } else {
//                            text = "";
//                        }
//                        Platform.runLater(new Runnable() {
//                            @Override
//                            public void run() {
//                                lblText.setText(text);
//                            }
//                        });
//                        Thread.sleep(200);
//                    }
//                } catch (InterruptedException e) {
//                    System.out.println("error jimi" + e.getMessage());
//                }
//            }
//        }).start();
//        Scene scene = new Scene(pane, 200, 200);
//        stage.setTitle("Jimi");
//        stage.setScene(scene);
//        stage.show();
//    }
}
