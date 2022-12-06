module com.mycompany.final_calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.final_calculator to javafx.fxml;
    exports com.mycompany.final_calculator;
}
