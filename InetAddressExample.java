import java.io.*;
import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) {
        String host = "google.com";
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local Host:" + localhost);
            InetAddress[] iAddresses = InetAddress.getAllByName(host);
            for (InetAddress ipAddress : iAddresses) {
                System.out.println(ipAddress.toString());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}