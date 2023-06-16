module com.valantic.sti.tutorial {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.valantic.sti.tutorial to javafx.fxml;
    exports com.valantic.sti.tutorial;
}