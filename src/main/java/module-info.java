module br.com.antoniosouza.servoslider {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;

    opens br.com.antoniosouza.servoslider to javafx.fxml;
    exports br.com.antoniosouza.servoslider;
}