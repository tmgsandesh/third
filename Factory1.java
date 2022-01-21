import java.net.*;

public class Factory1 {

    public static void main(String[] args) {
        try {
            System.out.println("Here");
            NetworkInterface ni = NetworkInterface.getByName("eth0");
            if (ni == null) {
                System.out.println("No such interface:eth0");
            } else {
                System.out.println(ni);
            }
        } catch (SocketException ex) {
            System.out.println("could not list Sockets.");
        }
    }
}