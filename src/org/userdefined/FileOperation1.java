package org.userdefined;

import java.io.File;
import java.io.IOException;

public class FileOperation1
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\SHAIK\\Documents\\sample");
		/*//Folder creation
		boolean mkdir = file.mkdir();
		System.out.println(mkdir);
		//Folders creation
		boolean mkdirs = file.mkdirs();
		System.out.println(mkdirs);*/
		//new file creation:
		//boolean createNewFile = file.createNewFile();
		//System.out.println(createNewFile);
		//boolean checkfile = file.isFile();
		//System.out.println(checkfile);
		//boolean directory = file.isDirectory();
		//System.out.println(directory);
		boolean canRead = file.canRead();
		System.out.println(canRead);
		boolean canwrite = file.canRead();
		System.out.println(canwrite);
		boolean canExecute = file.canExecute();
		System.out.println(canExecute);
		
	}
}
