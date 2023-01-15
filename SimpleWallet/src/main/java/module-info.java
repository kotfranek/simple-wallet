module com.codeindigo.simplewallet {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.codeindigo.simplewallet to javafx.fxml;
    exports com.codeindigo.simplewallet;
}
