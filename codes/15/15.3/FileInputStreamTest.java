import java.io.IOException;
import java.io.FileInputStream;

public class FileInputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		//创建字节输入流
		var fis = new FileInputStream("FileInputStreamTest.java");
		var bbuf = new byte[1024];
		var hasRead = 0;
		while ((hasRead = fis.read(bbuf)) > 0)
		{
			System.out.print(new String(bbuf, 0, hasRead));
		}
		fis.close();
	}
}
