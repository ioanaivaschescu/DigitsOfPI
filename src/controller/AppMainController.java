package controller;

import bench.IBenchmark;
import bench.cpu.CPUDigitsOfPI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import logging.ConsoleLogger;
import logging.ILog;
import logging.TimeUnit;
import timing.ITimer;
import timing.Timer;



public class AppMainController {

    @FXML
    public TextField EnterDigits;
    public Text TextWarmUp;
    public Text time;
    @FXML
    Button close = new Button();

    public void warmup() {

        for (int i = 1; i <= 100000; i++) {
            for (int j = 1; j <= 100000; j++) {
                for (int k = 1; k <= 100000; k++) ;
            }

        }
        TextWarmUp.setText("All warmed up and ready to go!!!");
    }
    public void cancelButton(ActionEvent event) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }



    public void getDigitsOfPi(){
        int n;
        ITimer timer = new Timer();
        ILog log = new ConsoleLogger();
        if (EnterDigits.getText().isEmpty()){
            time.setText("Please enter a number of digits");
        }
        else{
            try{
                n = Integer.parseInt(EnterDigits.getText());
                TimeUnit timeUnit = TimeUnit.Micro;
                IBenchmark bench = new CPUDigitsOfPI();

                bench.initialize(n);

                for (int i = 0; i < 1; i++) {
                    timer.start();
                    bench.run();
                    time.setText(log.writeTime(timer.stop(), timeUnit));
                }
            }
            catch (NumberFormatException e){
                time.setText("Please enter an integer value");
            }

        }

        log.close();
    }
}
