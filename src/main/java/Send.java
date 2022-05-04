import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Send {
    public static void main(String[] args) throws IOException {
        System.out.println("------------ Remitente -------------");
        // 1. Use DatagramSocket (int port) para definir el final de envío
        DatagramSocket send=new DatagramSocket(8888);
        // 2. Prepara los datos
        byte[] arr="Crayon Shinchan".getBytes();
        // 3 paquetes
        DatagramPacket data=new DatagramPacket(arr,0, arr.length, new InetSocketAddress("localhost",6666));
        // 4. Enviar datos
        send.send(data);
        // 5. Cerrar
        send.close();
    }
}