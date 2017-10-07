import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
    public static void main(String[] args){
        String sentence;
        String modifiedSentence;
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try (Socket clientSocket = new Socket("localhost",1421)){
                DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
                BufferedReader inFromServer= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                sentence = userInput.readLine();
                if (sentence != null && !sentence.equals("")){
                    outToServer.writeBytes(sentence+'\n');
                    modifiedSentence = inFromServer.readLine();
                    System.out.println("From server :"+modifiedSentence);
                    outToServer.close();;
                }else {
                    break;
                }


            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
