package Zad3;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {

    public static void main(String[] args){
        try {
            System.out.println("Server is running...");
            while(true) {
                ServerSocket server = new ServerSocket(3000);
                Socket socket = server.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());
                String text = in.readUTF();
                String[] words = text.split(" ");

                Arrays.sort(words);
                String matchWord = "";
                int maxmatch=0;
                int match=0;
                for (int i =0; i<words.length;i++){
                    for (int j=0; j<words.length;j++){
                        if(words[i].equals(words[j])){
                            match++;
                            if (match > maxmatch) {
                                maxmatch = match;
                                matchWord=words[i];
                            }
                        }else {
                            match=0;
                        }
                    }
                }

                System.out.println(matchWord+" "+maxmatch);
                in.close();
                server.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
