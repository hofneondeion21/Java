package Sockets;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String args[]) throws Exception {
		// server sides require two sockets
		// 1) accept all requeest
		// 2) accept the client
			// if more than one client, then more than one client
		
		ServerSocket ss = new ServerSocket(9999);
		Socket s = ss.accept(); // server needs to accept request;
	}
}
