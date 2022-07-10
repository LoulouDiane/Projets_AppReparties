package Sockets.Socket_Java.src;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;



public class Serveur {

	public static void main(String[] zero) {
		
		ServerSocket socketserver;
		Socket socketduserveur;
		try {
			socketserver = new ServerSocket(2009);
			socketduserveur = socketserver.accept();
			System.out.println("Un zero s'est connecte !");
			socketserver.close();
			socketduserveur.close();
		    }
		
		catch (IOException e) {
			e.printStackTrace(); }
	}
}