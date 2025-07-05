package Chapter11;

import java.sql.*;

public class ConnectToDB {
    public static void main(String[] args) {
        //get a connection string
        String connectionString = "";

        try{
            //create a connection
            Connection myConnection = DriverManager.getConnection(connectionString);
            //create a statement object
            Statement stm = myConnection.createStatement();
            String cmdSelect = "SELECT * FROM Customers";
            ResultSet results = stm.executeQuery(cmdSelect);

            while(results.next()){
                System.out.println(results.getString("CustomerID") + "  -  " + results.getString(2));
            }

            myConnection.close();

        }catch (SQLException ex){
            System.err.println(ex.getMessage());
        }


    }
}
