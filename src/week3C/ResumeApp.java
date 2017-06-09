package week3C;

import java.sql.Connection;
import java.sql.DriverManager
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResumeApp {

	   public static void main(String[] args) {
		   Connection conResume = null;
		   Statement stmtResume = null;
		   ResultSet rsResume= null;
		   String sqlApplicant = "select * from Applicant";
		   String sqlEducation = "select * from Education";
		   String sqlExperience = "select * from Experience";
		   String sqlSkills = "select * from Skills";
		   try{
			   	Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/Resume?"
									+ "user=root&password=password")
						stmtResume = conResume.createStatement();
						rsResume = stmtResume.executeQuery(sqlApplicant);
						rsResume = stmtResume.executeQuery(sqlApplicant);
			
		   }
				 
		   
	   

		   
		   for (?? : ??.getSubs()) {
	         System.out.println();
	         
	         for (E?? ?? : ??.getSubordinates()) {
	            System.out.println(??);
	         }
	      }		
	   }
	}