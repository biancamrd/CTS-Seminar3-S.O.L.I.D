package ro.ase.acs.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface TableBuilder {
    void createTable(Connection connection) throws SQLException;
}
