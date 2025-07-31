package IO_Streams;

import java.io.*;
public class FileStream {
	public static void main(String args[]) {
		try(
				FileInputStream fis=new FileInputStream("Src.txt");
				FileOutputStream fos=new FileOutputStream("Output.txt")){
			int byteData;
			while((byteData=fis.read())!=-1) {
				fos.write(byteData);
			}
			System.out.println("File copied Successfully");
		}
		catch(IOException e) {
			e.printStackTrace();;
		}
	}
}
