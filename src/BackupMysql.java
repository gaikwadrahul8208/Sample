import java.io.IOException;

public class BackupMysql {
	
	public static void main(String[] args) throws IOException, InterruptedException{
		  try {
		  System.out.println("database connect");
		  Runtime rt = Runtime.getRuntime();
		  rt.exec("C:\\\\Program Files\\\\MySQL\\\\MySQL Server 5.7\\\\bin\\\\mysqldump -uroot -proot my_tutor_db -r "
		 		+ "G:\\\\backup11.sql");
		  } 
		 catch(IOException ioe) 
		  {
		   ioe.printStackTrace();
		  }
		  catch(Exception e) {
		  e.printStackTrace();
		 }
	}

}
