import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class read {

    public static String rot13(String value) {

        char[] values = value.toCharArray();
        for (int i = 0; i < values.length; i++) {
            char letter = values[i];

            if (letter >= 'A' && letter <= 'Z') {
                // Rotate letters to rot13 encode.

                if (letter > 'M') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }
            values[i] = letter;
        }
        // Convert array to a new String.
        return new String(values);
    }


    public static void main(String[] args) throws IOException{
       String content = new String(Files.readAllBytes(Paths.get("temp.txt")));
	
	String rot13 = rot13(content);//encode the string from text file using rot13 method.
	
	System.out.println(content);
	System.out.println(rot13);

	}
}