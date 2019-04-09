package Javapack;

import java.io.File;
import java.io.IOException;
 
public class HiddenPropertyCheck
{
 
    public static void main(String[] args) throws IOException, SecurityException
    {	
    	// Provide the complete file path here
    	File file = new File("F:\\Testing\\JAVA IO\\Myfile.txt");
 
    	if(file.isHidden()){
    		System.out.println("The specified file is hidden");
    	}else{
    		System.out.println("The specified file is not hidden");
    	}
    }
}