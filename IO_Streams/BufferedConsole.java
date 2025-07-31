package IO_Streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class BufferedConsole {
	public static void main(String args[]) {
		String fileName="user_info.txt";
		try(
				BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
				FileWriter writer=new FileWriter(fileName,true);//append mode
				
				){
			System.out.println("Enter your name: ");
			String name=reader.readLine();
			
			System.out.println("Enter your age");
			String age=reader.readLine();
			
			System.out.println("Enter your prefered programmng language");
			String language=reader.readLine();
			
			//Write to the file
			writer.write("Name:"+name+"\n");
			writer.write("Age: "+age+"\n");
			writer.write("Favourite Language: "+language+"\n");
			writer.write("----\n");
			
			System.out.println("User information saved to "+fileName);
		}catch(IOException e) {
			System.out.println("An error occured while processing input/output"+e.getMessage());
		}
	}
}
