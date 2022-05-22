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
    opens com.servicedb.Entities to org.hibernate.orm.core;
    opens com.servicedb.Controllers to javafx.fxml;

    exports com.servicedb;
    exports com.servicedb.Entities;
    exports com.servicedb.Controllers;
}