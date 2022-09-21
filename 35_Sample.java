package calculator;
import java.io.*;
class Sample
{
     String number;
     Sample(String a){
         this.number=a;   
     }
     public String digit()
	{
		return this.number;
	}
	public String writeInFile()
	{
		return this.number;
	}
	public void saveObject(String fileName) throws IOException
	{
		File f = new File(fileName);
		System.out.println(f.exists());
		FileWriter fw = new FileWriter(fileName);
		fw.write(this.writeInFile());
		fw.close();
}
}