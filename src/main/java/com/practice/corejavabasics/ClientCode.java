package com.practice.corejavabasics;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ClientCode {
		public static void main(String[] args)throws IOException{
			ServerSocket listerner =  new ServerSocket();
			System.out.println("Hello,The Server is Ready!!!");
			Socket ssoc = listerner.accept();
			InputStream is = ssoc.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String messege = dis.readUTF();
			System.out.println(messege);
		}

	}

