package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController
{
    private String operator;
    private boolean nextNumber;
    private int tempVal = 0;

    @FXML
    private TextField prompt;

    @FXML
    private Button number9;

    @FXML
    private Button number0;

    @FXML
    private Button number3;

    @FXML
    private Button number4;

    @FXML
    private Button number1;

    @FXML
    private Button number2;

    @FXML
    private Button number7;

    @FXML
    private Button number8;

    @FXML
    private Button number5;

    @FXML
    private Button number6;

    @FXML
    private Button divideButton;

    @FXML
    private Button multiplyButton;

    @FXML
    private Button addButton;

    @FXML
    private Button subtractButton;

    @FXML
    void handleNumber2(ActionEvent event)
    {
        prompt.setText(prompt.getText() + "2");
    }

    @FXML
    void handleNumber3(ActionEvent event)
    {
        prompt.setText(prompt.getText() + "3");
    }

    @FXML
    void handleNumber5(ActionEvent event)
    {
        prompt.setText(prompt.getText() + "5");
    }

    @FXML
    void handleNumber6(ActionEvent event)
    {
        prompt.setText(prompt.getText() + "6");
    }

    @FXML
    void handleNumber8(ActionEvent event)
    {
        prompt.setText(prompt.getText() + "8");
    }

    @FXML
    void handleNumber9(ActionEvent event)
    {
        prompt.setText(prompt.getText() + "9");
    }

    @FXML
    void handleNumber4(ActionEvent event)
    {
        prompt.setText(prompt.getText() + "4");
    }

    @FXML
    void handleNumber1(ActionEvent event)
    {
        prompt.setText(prompt.getText() + "1");
    }

    @FXML
    void handleNumber7(ActionEvent event)
    {
        prompt.setText(prompt.getText() + "7");
    }

    @FXML
    void handleNumber0(ActionEvent event)
    {
        prompt.setText(prompt.getText() + "0");
    }

    @FXML
    void multiply(ActionEvent event)
    {
        operator = "*";
        tempVal = Integer.parseInt(prompt.getText());
        prompt.setText("");
    }

    @FXML
    void divide(ActionEvent event)
    {
        operator = "/";
        tempVal = Integer.parseInt(prompt.getText());
        prompt.setText("");
    }

    @FXML
    void subtract(ActionEvent event)
    {
        operator = "-";
        tempVal = Integer.parseInt(prompt.getText());
        prompt.setText("");
    }

    @FXML
    void add(ActionEvent event)
    {
        operator = "+";
        tempVal = Integer.parseInt(prompt.getText());
        prompt.setText("");
    }

    @FXML
    void rest(ActionEvent event)
    {
        operator = "%";
        tempVal = Integer.parseInt(prompt.getText());
        prompt.setText("");
    }

    @FXML
    void equals(ActionEvent event)
    {
        switch (operator)
        {
            case "+": prompt.setText(Integer.toString(tempVal + Integer.parseInt(prompt.getText())));
            break;

            case "-":

            case "*": prompt.setText(Integer.toString(tempVal - Integer.parseInt(prompt.getText())));
                break;

            case "/": prompt.setText(Integer.toString(tempVal / Integer.parseInt(prompt.getText())));
                break;

            case "%": prompt.setText(Integer.toString(tempVal % Integer.parseInt(prompt.getText())));
                break;
        }
    }

    @FXML
    void delete(ActionEvent event)
    {
        prompt.setText("");
    }
}
