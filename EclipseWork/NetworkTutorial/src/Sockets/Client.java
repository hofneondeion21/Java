package Sockets;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String args[]) throws Exception {
		// @param - IP Address
		// @param - Port Number
		String ip = "localhost"; // client IP 
		// if server ==> mention the server port;
		int port = 9999; // 0-1023 to 65535
		Socket s = new Socket(ip, port);
		
		String str = "Haku Ready";
		
		// trying to send data to server side;
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
			// @Param --> need to mention from where do you want to send the data
			// s.outputStreamSOcket --> is from the socket's output port;
		
		PrintWriter out = new PrintWriter(os);
		os.write(str);
		
	}
}
