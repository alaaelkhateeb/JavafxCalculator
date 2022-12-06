/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.final_calculator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Alaa Elkhateeb
 */
public class CalculatorController implements Initializable {

    @FXML
    private Button ebutton;
    @FXML
    private TextField results;
    @FXML
    private TextField operation;
    @FXML
    private Button ex;
    @FXML
    private Button c;
    @FXML
    private Button rem;
    @FXML
    private Button div4;
    @FXML
    private Button log1;
    @FXML
    private Button fac;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button mult;
    @FXML
    private Button ln1;
    @FXML
    private Button s1;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button add;
    @FXML
    private Button pow1;
    @FXML
    private Button c1;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button sub;
    @FXML
    private Button ep1;
    @FXML
    private Button t1;
    @FXML
    private Button zero;
    @FXML
    private Button dot;
    @FXML
    private Button eq;
    @FXML
    private Button r1;
    @FXML
    private Button Hswitch;
    /**
     * Initializes the controller class.
     *
     */
    private int operator;

    double a, b, result;

    String prevStr = "";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void exit(ActionEvent event) {
        /*for exiting app*/
        Platform.exit();
    }

    @FXML
    private void clear(ActionEvent event) {
        /*setting all text fields with nothing to clear them */
        operation.setText("");
        results.setText("");
        prevStr = "";
    }

    @FXML
    private void remaning(ActionEvent event) {
        try {
            a = Double.parseDouble(operation.getText());///parsing the first string from pressed number int double
            operator = 5;                               ///seting variable to be controlled when the equal button will be pressed
            results.setText(prevStr + "%");                 ///to show in each operand besides operator 
            prevStr = results.getText();                        //saving the first operand and operator into string which will be concatinated with = and final result 
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");                                  ///after operation clear the text field to get next instruction 
        }
    }

    @FXML
    private void division(ActionEvent event) {
        try {
            a = Double.parseDouble(operation.getText());            ///parsing the first string from pressed number into double
            operator = 4;                                             ///seting variable to be controlled when the equal button will be pressed
            results.setText(prevStr + "/");                             ///to show in each operand besides operator
            prevStr = results.getText();                                 //saving the first operand and operator into string which will be concatinated with = and final result 
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");                                       ///after operation clear the text field to get next instruction 
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        /**
         * this method is used to get each number pressed in gui saving it into
         * string then setting it into the text field*
         */
        String str = ((Labeled) event.getSource()).getText();
        operation.setText(operation.getText() + str);
        results.setText(prevStr + str);             ///extra numbers are like 12  1 then 2 are concatinating together
        prevStr = results.getText();
    }

    @FXML
    private void multiplication(ActionEvent event) {
        try {
            a = Double.parseDouble(operation.getText());                    ///parsing the first string from pressed number into double
            operator = 3;                                                        ///seting variable to be controlled when the equal button will be pressed
            results.setText(prevStr + "*");                                         ///to show in each operand besides operator
            prevStr = results.getText();                                            //saving the first operand and operator into string which will be concatinated with = and final result
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");      ///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void addition(ActionEvent event) {
        try {
           a = Double.parseDouble(operation.getText());                    ///parsing the first string from pressed number into double
            operator = 1;                                                        ///seting variable to be controlled when the equal button will be pressed
            results.setText(prevStr + "+");                                         ///to show in each operand besides operator
            prevStr = results.getText();                                            //saving the first operand and operator into string which will be concatinated with = and final result
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void subtraction(ActionEvent event) {
        try {
           a = Double.parseDouble(operation.getText());                    ///parsing the first string from pressed number into double
            operator = 2;                                                        ///seting variable to be controlled when the equal button will be pressed
            results.setText(prevStr + "-");                                         ///to show in each operand besides operator
            prevStr = results.getText();                                            //saving the first operand and operator into string which will be concatinated with = and final result
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");          ///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void equality(ActionEvent event) {
        try {
            b = Double.parseDouble(operation.getText());                ///get the second operand from button pressed

            double inRadians = Math.toRadians(b);                       ///for calculting rad from degree in angles calculations
            switch (operator) {
                case 1:
                    result = a + b;                         
                    operation.setText("" + result);                 ///print the result 
                    break;
                case 2:
                    result = a - b;
                    operation.setText("" + result);
                    break;
                case 3:
                    result = a * b;
                    operation.setText("" + result);
                    break;
                case 4: 
                 try {
                    result = a / b;
                    operation.setText("" + result);
                } catch (Exception e) {
                    operation.setText("Error");
                }
                case 5:
                    result = a % b;
                    operation.setText("" + result);
                    break;
                case 6:
                    result = (float) Math.log10(b);

                    operation.setText("" + result);
                    break;
                case 7:
                    result = (float) Math.log(b);

                    operation.setText("" + result);
                    break;
                case 8:
                    result = (float) Math.exp(b);

                    operation.setText("" + result);
                    break;
                case 9:
                    result = Math.pow(a, b);
                    operation.setText("" + result);
                    break;
                case 10:
                    result = (long) Math.sqrt(b);
                    operation.setText("" + result);
                    break;
                case 11:

                    result = (float) Math.sin(inRadians);
                    operation.setText("" + result);
                    break;
                case 12:
                    result = (float) Math.cos(inRadians);
                    operation.setText("" + result);
                    break;
                case 13:
                    result = (float) Math.tan(inRadians);
                    operation.setText("" + result);
                    break;
                case 14:
                    result = 1;
                    for (int i = 1; i <= b; i++) {
                        result *= i;
                    }
                    operation.setText("" + result);
                    break;
            }
            results.setText(prevStr + "=" + result);                ///showing the whole calculation 

        } catch (NumberFormatException e) {
            System.out.println("Select values First");
        }
    }

    @FXML
    private void log(ActionEvent event) {
        try {
            results.setText("log");                     
            operator = 6;
            prevStr = results.getText();
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");          ///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void ln(ActionEvent event) {
        try {
            results.setText("ln");
            operator = 7;
            prevStr = results.getText();
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");  ///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void power(ActionEvent event) {
        try {

            a = Double.parseDouble(operation.getText());
            operator = 9;
            results.setText(prevStr + " ^");
            prevStr = results.getText();
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void epower(ActionEvent event) {
        try {
            results.setText("e^");

            operator = 8;

            prevStr = results.getText();
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");      ///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void sqRoot(ActionEvent event) {
        try {
            results.setText("√");
            operator = 10;
            prevStr = results.getText();
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void factorial(ActionEvent event) {
        try {
            results.setText("!");
            operator = 14;
            prevStr = results.getText();
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void sin(ActionEvent event) {
        try {
            results.setText("sin(");

            operator = 11;

            prevStr = results.getText();
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void cos(ActionEvent event) {
        try {
            results.setText("cos(");
            operator = 12;
            prevStr = results.getText();
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");      ///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void tan(ActionEvent event) {
        try {
            results.setText("tan(");
            operator = 13;
            prevStr = results.getText();
        } catch (NumberFormatException e) {
            System.out.println("Enter value First");
        } finally {
            operation.setText("");  ///after operation clear the text field to get next instruction
        }
    }

    @FXML
    private void hardwareSwitch(ActionEvent event) throws IOException {
//        File file = new File(
//                "C:\\Users\\Alaa Elkhateeb\\Desktop\\file.txt");
//
//        FileInputStream fis = null;
//
//        // Note:  Double backquote is to avoid compiler
//        // interpret words
//        // like \test as \t (ie. as a escape sequence)
//        // Creating an object of BufferedReader class
//        BufferedReader br
//                = new BufferedReader(new FileReader(file));
//
//        // Declaring a string variable
//        String st;
//        // Condition holds true till
//        // there is character in a string
//        while ((st = br.readLine()) != null) {
//
//        }
    }
}
/*
operation steps
1. pressing button 1 for set 1 as first operand 
we have two text fields one get each input ,the other get this input from the prev text field then adding the next input to it until the whole operation is done 
2.the first text field which is called operation holds number 1 as string 
3.if we enter another number it will be concatinated with the prev one
4. if we entered operator like + then we have a variable holds number related to this operation will be used on pressing equal,other thing this 
step does is that it takes the first operand(from the text field) and switch its type to double  and stores it in variable a
/// a and + is shifted to other text field called results
5. the second operand is now pressed stored as string in text field operation 
6. on = press we switch on operator variable value then doing operation + and showing the whole operation 








*/