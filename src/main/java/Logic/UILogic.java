package Logic;

import org.apache.commons.dbcp2.BasicDataSource;

public class UILogic {

   public static BasicDataSource dataSource = new BasicDataSource();

   static String url = "jdbc:mysql://localhost:3306/sakila";
   static String userName = "root";
   static String password = System.getenv("SQL_PASSWORD");

   public static void setDataSource() {
	  dataSource.setUrl(url);
	  dataSource.setUsername(userName);
	  dataSource.setPassword(password);
   }

   public static void processHomeScreen() {

   }

}
