package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Recive {
    public static void main(String[] args) throws IOException {
        System.out.println("------------Extremo de recepción-----------");
        // 1. Definir el extremo receptor new DatagramSocket (6666);
        DatagramSocket receive=new DatagramSocket(6666);
        // 2. Prepara el paquete y recibe los datos
        byte[] car=new byte[1024*60];
        //DatagramPacket(byte[] buf, int length)
        DatagramPacket packet=new DatagramPacket(car,car.length);
        // 3. Recibir
        receive.receive(packet);
        //Procesamiento de datos
        byte[] arr=packet.getData();
        int len=packet.getLength();
        System.out.println(new String(arr,0,len));

        // 4. Cerrar
        receive.close();
    }
}
