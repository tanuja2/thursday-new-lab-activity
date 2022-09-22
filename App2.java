//program to show the use of DataInputStream and DataOutputStream classes for reading and writing primitive data type
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
class App2
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javafile.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(400);
		dos.writeShort(240);
		dos.writeByte(14);
		dos.writeChar(65);
		dos.close();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\javafile.txt");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println("Int :"+dis.readInt());
		System.out.println("Short :"+dis.readShort());
		System.out.println("Byte :"+dis.readByte());
		System.out.println("Char :"+dis.readChar());
		dis.close();
	}
}