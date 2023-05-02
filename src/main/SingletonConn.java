
package main;
import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConn {
	private static Connection connection; 
	static{
		try {            
                    //Class.forName("com.mysql.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/glv_db", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// méthode getConnection
	public static Connection getConnection(){
		return connection;
	}
}