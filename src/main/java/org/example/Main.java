package org.example;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Botón para cambiar texto");
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label texto = new Label("Introduce el texto: ");
        TextField textField = new TextField();
        grid.add(texto,0,0);
        grid.add(textField,1,0);

        Button boton = new Button("Borrar texto");
        grid.add(boton,0,1);

        Label labelTextoResultado = new Label();
        grid.add(labelTextoResultado,0,2);

        boton.setOnAction(e -> {
            if(textField.getText().isEmpty()){
                labelTextoResultado.setText("Introduce un mensaje");
            } else {
                labelTextoResultado.setText("");
                textField.clear();
            }
        });
        Scene scene = new Scene(grid,300,150);
        stage.setScene(scene);
        stage.show();
    }
}
