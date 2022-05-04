package TPC;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);

            System.out.println("El servidor espera a que el cliente se adapte");
            Socket client = server.accept();
            System.out.println("La adaptación del cliente fue exitosa");

            System.out.println("El servidor envió un mensaje al cliente");
            OutputStream os = client.getOutputStream();
            String msg = "Mensajes del servidor";
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
            pw.println(msg);
            pw.flush();

            while(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
