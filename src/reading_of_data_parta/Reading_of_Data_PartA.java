
package reading_of_data_parta;

import java.io.*;

public class Reading_of_Data_PartA {
    public static void main(String[] args) throws IOException {
     File outFile = new File("java_practice_ouputfile.txt");
     File inFile  = new File("java_practice_inputfile.txt");
     
        FileWriter out = new FileWriter(outFile);
        BufferedReader in  = new BufferedReader(new FileReader(inFile));
        
        String input = "";
        String newinput;
        //its only the readline method that has the readline method
        while((newinput = in.readLine()) != null)
        {
            input += (newinput + "\r\n");
        }
        
        out.write(input);
        
        out.close();
        in.close();
    }
    
}
