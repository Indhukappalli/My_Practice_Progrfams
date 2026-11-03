import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class MultipleClientCode1 {
	public static void main(String[] args)throws IOException {
		Socket csoc = new Socket(" 10.248.87.222",4000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		InputStream is = csoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		for(int i=1;i<=5;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Messege");
			String message = sc.nextLine();
			dos.writeUTF(message);
		    message = dis.readUTF();
			System.out.println(message);
			
			
		}
	
		
		
		
	}

}
