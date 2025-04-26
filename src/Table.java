// Edited by Sharvin A/L S. Ramesg (Assignment 2)
import java.sql.*;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Table {


    DefaultTableModel buildTableModel(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData(); // get metadata from the ResultSet like information about columns

        // Get column names
        int columnCount = metaData.getColumnCount();

        // create a list to store the column names
        Vector<String> columnNames = new Vector<String>();

        // add each of the column names to the list
        for (int i = 1; i <= columnCount; i++) {
            columnNames.add(metaData.getColumnName(i));
        }

        // Get table data
        Vector<Vector<Object>> tableData = new Vector<Vector<Object>>();

        // Iterate through the ResultSet to get row data
        while (resultSet.next()) {
            Vector<Object> row = new Vector<Object>();

            // for each column in the row add the value to the row vector
            for (int i = 1; i <= columnCount; i++) {
                row.add(resultSet.getObject(i));
            }
            tableData.add(row); // add the row to the table data
        }

        return new DefaultTableModel(tableData, columnNames); // create and return a DefaultTableModel using data collected
    }
}
