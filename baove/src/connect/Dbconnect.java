package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Dbconnect {
    public static final String HOSTNAME = "localhost";   
    public static final String PORT = "3306";            
    public static final String DBNAME = "LabAsset_Java2"; 
    public static final String USERNAME = "root";        
    public static final String PASSWORD = "130707";      

	public static Connection getConnection() {

	    // Create a variable for the connection string
		String connectionUrl = "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + DBNAME
		        + "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		
	    try {
	    	Connection conn = DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
	    	System.out.println("Connect sucessfully!");
	    	return conn;
	    } // Handle any errors that may have occurred.
	    catch (SQLException  e) {
	        e.printStackTrace(System.out);
	    }

	    return null;
	}
	
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}