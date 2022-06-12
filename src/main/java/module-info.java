module com.servicedb {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires org.postgresql.jdbc;
    requires jakarta.persistence;
    requires java.naming;
    requires java.persistence;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires java.desktop;





    opens com.servicedb to javafx.fxml;
    opens com.servicedb.MVC.Entities to org.hibernate.orm.core;
    opens com.servicedb.MVC.PumpStationScreen.Controllers to javafx.fxml;

    exports com.servicedb;
    exports com.servicedb.MVC.Entities;

    exports com.servicedb.MVC;
    opens com.servicedb.MVC to javafx.fxml;
    exports com.servicedb.MVC.MenuScreen;
    opens com.servicedb.MVC.MenuScreen to javafx.fxml;

    opens com.servicedb.MVC.PumpsWindow.Controllers to javafx.fxml;
    exports com.servicedb.MVC.PumpStationScreen.Controllers;
    exports com.servicedb.MVC.PumpsWindow.Controllers;

}