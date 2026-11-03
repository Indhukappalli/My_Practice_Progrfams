package com.practice.corejavabasics;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Serialization{
	public static void main(String[] args)throws IOException {
		Socket csoc = new Socket(" 10.248.87.222",4000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Messege");
		String msg = sc.nextLine();
		dos.writeUTF(msg);
		
		
		
	}
}
