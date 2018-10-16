/*
  @author:alphaomega325
  @date:10/12/18
  Purpose is to create a simple xor generator for machine learning testing

*/

import java.io.Writer;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class csvgen {


    public static void main(String [] args)
    {

	Scanner in = new Scanner(System.in);
	
	System.out.println("How many lines do you want for the csv file");

	String input = in.next();

	String output = "";

	float length = Float.parseFloat(input);
	
	try {
	    PrintWriter writer = new PrintWriter("xorgen.csv", "UTF-8");

	    //writer.print("first,second,result\n");
		Random rand = new Random();

		output = output + "first,second,resut\n";

	    
	    for(float i = 0; i < length; i++)
		{
		    int x1 = rand.nextInt(2);
		    int x2 = rand.nextInt(2);
		    int y = x1^x2;
		    
		    //writer.print(x1+","+x2+","+y+"\n");

		    output = output + x1 + "," + x2 + "," + y + "\n";

		    if(output.length() > 10000)
			{
			writer.write(output);
			output = "";
			}
		    
		}

	    writer.write(output);
	    
	    writer.close();
	    
	} catch (IOException x) {

	    System.err.println(x);
	    
	}


    }





}
