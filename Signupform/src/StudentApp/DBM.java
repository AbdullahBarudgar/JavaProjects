package StudentApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBM {

Connection con =null;
PreparedStatement pst;

public static Connection database() {
try {
	
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentform","root","");
return conn;
}
catch(Exception e1) {
System.out.println(e1);	
return null;
}
}
}