package week3C;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

import java.util.Scanner;

public class ResumeApp {
	
  //  private String fName, lName;
//	private String eMail;
//	private String answer;

	   public static void main(String[] args) {
		   String fName, lName;
		   String eMail;
		   String answer;
		   boolean result;
		   
		   Connection conResume = null;
		   PreparedStatement stmtResume = null;
		   ResultSet rsApplicant = null;
		   ResultSet rsEducation = null;
		   ResultSet rsExperience = null;
		   ResultSet rsSkills = null;

		   String sqlEducation = "select * from Education";
		   String sqlExperience = "select * from Experience";
		   String sqlSkills = "select * from Skills";
		   
		   Scanner  scanner = new Scanner(System.in);   
				   
		   System.out.print("Enter your first name: ");
		   fName = scanner.nextLine();

		   System.out.print("Enter your last name: ");
		   lName = scanner.nextLine();
		   
			do{
				System.out.print("Enter your email: ");
				eMail = scanner.nextLine();
				
				if (eMail == null)
					result = false;
			}while(eMail == null);

			String updApplicant = "insert into Applicant(ApplId,FirstName,LastName, Email) values(?,?,?,?)";
			System.out.print(updApplicant);
	
		   try{
			   	//Class.forName("com.mysql.jdbc.Driver");
			   	conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
									+ "user=root&password=password");

				stmtResume = conResume.prepareStatement(updApplicant);
		   
				stmtResume.setInt(1,103); 
				stmtResume.setString(2,fName);
				stmtResume.setString(3,lName);
				stmtResume.setString(4,eMail);

				stmtResume.executeUpdate();
	
		   }	catch  (SQLException e) {
						e.printStackTrace();
		   			}
		   		finally{
		   			
		   		}
	   
				/**try{
					
					
				
				
				
			   		   
				//		rsApplicant = stmtResume.executeQuery(sqlApplicant);

			
						stmtResume = conResume.prepareStatement(sqlEducation);
						rsEducation = stmtResume.executeQuery(sqlEducation);
						stmtResume = conResume.prepareStatement(sqlExperience);
						rsExperience = stmtResume.executeQuery(sqlExperience);
						stmtResume = conResume.prepareStatement(sqlSkills);
						rsSkills = stmtResume.executeQuery(sqlSkills);
						while(rsApplicant.next()){
							System.out.println("Hello");
						}

						}catch (SQLException e) {
								e.printStackTrace();
						}catch (ClassNotFoundException e){
								e.printStackTrace();
		   		}	finally{
		   			
		   				try{
		   					rsApplicant.close();
		   					rsEducation.close();
		   					rsExperience.close();
		   					rsSkills.close();
		   				}catch(SQLException e){
		   					e.printStackTrace();
		   				}			
				}*/	   
	   }
}
				 
	   
	   
		   
		   
		   
		

		   
/**		   for (?? : ??.getSubs()) {
	         System.out.println();
	         
	         for (E?? ?? : ??.getSubordinates()) {
	            System.out.println(??);
	         }
	      }		
	   }
	}*/