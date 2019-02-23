// This method gets a random number
import java.util.Random;

// Take in a filename and return Line Array
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Lets the user input a string
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.charset.StandardCharsets;

public class ToolBox{
	

	// This method gets a random number
    static public int randNum(int maxNum){
		Random random = new Random();
	    // Get a random number with maxNum as the upper limit.
	    int result = random.nextInt(maxNum);
		//result += 1;
		return result;
    }// End of this method gets a random number
	
	
	
	// Take in a filename and return Line Array
    static public String[] readLines(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
        return lines.toArray(new String[lines.size()]);
    }// End of take in a filename and return Line Array
	
	
	
	// Write Create or Append to File
    static public void writeLine(String filename, String content) throws IOException {

    try {
      // final Path path = Paths.get("path/to/filename.txt");
      final Path path = Paths.get(filename);
      // Files.write(path, Arrays.asList("New line to append"), StandardCharsets.UTF_8,
      Files.write(path, Arrays.asList(content), StandardCharsets.UTF_8,
      Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
    } catch (final IOException ioe) {
      System.out.println("io Exception in ToolBox.writeLines method");
    } // End Try Catch

  } // End of write Create or Append to File
	
	
}// End of ToolBox
