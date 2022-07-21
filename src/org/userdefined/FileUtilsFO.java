package org.userdefined;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtilsFO 
{
public static void main(String[] args) throws IOException 
{
	File file=new File("C:\\Users\\SHAIK\\Documents\\sample");
	FileUtils.write(file,"Welcome java class",true);
	
	
}
}
