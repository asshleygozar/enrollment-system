package EnrollmentSystem.SourceCode;

import java.util.HashMap;

public class Credentials{

   protected static HashMap<Integer, Object> studentCredentials = new HashMap<>();
   protected static HashMap<Integer, Object> adminCredentials;

   private static int adminAccountID;
   private static Object adminPassword;


   Credentials(){

      adminCredentials.put(54321, "fefri");
      adminCredentials.put( 9876, "Hello");
      adminCredentials.put(8888, "World");
   }

    public static void addAdminAccount(int ID, Object password){
      
      adminAccountID = ID;
      adminPassword = password;

      adminCredentials.put(ID, password);
   }

   public static int checkAdminAccount(){

      return adminAccountID;
   }

   public static Object getAdminData(){

      return adminCredentials;
   }

   public Object adminPassword(Object password){

      return adminCredentials.get(adminPassword);
   }
}