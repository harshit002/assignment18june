package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copytask {
	FileInputStream fin;
	FileOutputStream fout;
	public void copy1()
	{
		
		File file1=new File("E:\\filehandling\\abc.txt");
		File file2=new File("E:\\filehandling\\xyz.txt");
		
		try
		{
			 fin= new FileInputStream(file1);
			 fout=new FileOutputStream(file2);
			int r;
			while((r=fin.read())!=-1)
				fout.write((char)r);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			try
			{  
				fin.close();
			    fout.close();
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
	
		
	
	

	public static void main(String[] args) {
		
		Copytask obj=new Copytask();
		obj.copy1();
		
	}

}
