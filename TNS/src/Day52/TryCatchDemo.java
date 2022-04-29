package Day52;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchDemo throws Exception 
{
	public void m1()
	{
		try
		{
		Thread.sleep(200);
		new FileInputStream("c:\\Payal\\Demo.java");
		Class.forName("com.mysql.jdbc.Drive");
		System.in.read();
		}
		/*catch(InterruptedException e) {
			
		}
		catch(FileNotFoundException e) {
			
		}
		catch(ClassNotFoundException e) {
			
		}
		catch(Exception e) {
			
		}*/
		/*catch(Exception e){
			if(e instanceof InterruptedException) {
			
			}
			if(e instanceof FileNotFoundException) {
				
			}if(e instanceof ClassNotFoundException) {
				
			}
			else
			{
				
			}
		}*/
		catch(Exception e) {
			
		}
	    catch(InterruptedException e) {
		
	    }
	    catch(FileNotFoundException e) {
		
	    }
	   catch(ClassNotFoundException e) {
		
	   }
	}
	

}
