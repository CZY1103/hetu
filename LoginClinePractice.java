package practice;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class LoginClinePractice {
    public static void main(String[] args) throws IOException {
        while(true) {
            Scanner sc = new Scanner(System.in);
            Socket socket = new Socket("192.168.10.242", 23);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = sc.nextLine();
            bw.write(str);
            bw.flush();//把缓冲区的内容强制的写出。
            socket.shutdownOutput();
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
            bw.close();
            socket.close();
        }
    }
}
