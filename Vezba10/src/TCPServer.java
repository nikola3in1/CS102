import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String [] args){
        try {
            String clientMsg;
            String converted="";
            ServerSocket serverSocket = new ServerSocket(1421);

            while (true){
                Socket connectionSocket = serverSocket.accept();
                BufferedReader inputClient= new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                DataOutputStream forClient = new DataOutputStream(connectionSocket.getOutputStream());
                try {
                    clientMsg = inputClient.readLine();
                    System.out.println("Msg recieved from client "+ clientMsg);
                    char temp;
                    for (int i = 0; i<clientMsg.length();i++ ){
                        if(clientMsg.charAt(i) >64 && clientMsg.charAt(i) < 91){
                            temp = (char) (clientMsg.charAt(i)+32);
                            converted+=temp;
                        }else if(clientMsg.charAt(i) >96 && clientMsg.charAt(i) < 123){
                            temp = (char) (clientMsg.charAt(i)-32);
                            converted+=temp;
                        }
                    }
                    converted+='\n';
                    System.out.println(converted);
                    forClient.writeBytes(converted);
                    converted="";
                    forClient.close();
                }catch (Exception e){break;}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
