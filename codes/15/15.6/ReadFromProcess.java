import java.lang.Runtime;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromProcess
{
	public static void main(String[] args) throws IOException
	{
		Process p = Runtime.getRuntime().exec("javac");
		try(var br = new BufferedReader(new InputStreamReader(p.getInputStream())))
		{
			String buff = null;
			while ((buff = br.readLine()) != null)
			{
				System.out.println(buff);
			}
		}
	}
}
