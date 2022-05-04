package TPC;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 9999);

            InputStream is = client.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String msg = br.readLine();
            System.out.println("Mensaje del servidor:" + msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}