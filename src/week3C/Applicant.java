package week3C;

import java.util.ArrayList;
//import java.util.List;

public class Applicant {


   private String ApfName, AplName;
   private String ApEmail;
   private ArrayList<Applicant> ApSubs;
 //  ArrayList<String>Education = new ArrayList<String>();

   // constructor
   public Applicant(String ApfName, String AplName, String ApEmail) {
      this.ApfName = ApfName;
      this.AplName = AplName;
      this.ApEmail = ApEmail;
      ApSubs = new ArrayList<Applicant>();
   }

   public void add(Applicant c) {
      ApSubs.add(c);
   }

   public void remove(Applicant c) {
      ApSubs.remove(c);
   }

   public ArrayList<Applicant> getSubs(){
     return ApSubs;
   }

   public String toString(){
      return ("\t\r\n" + ApfName + "\t\r\n" + AplName );
   }   
}