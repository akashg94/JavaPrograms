package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
	
		String filename = "/Users/akashghosh/Desktop/AkashGhosh_CISC3810_TR8_Assn3.txt";
		String text = null;
		
		File file = new File(filename);
		BufferedReader br;
        try {
			 br = new BufferedReader(new FileReader(file));
		 text = br.readLine();
		 
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error.file not found" + filename);
			e.printStackTrace();
			
			
		}
	}

}
