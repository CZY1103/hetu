package practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginServerPractice {
    public static void main(String[] args) throws IOException {
        while(true) {
            Scanner sc = new Scanner(System.in);
            ServerSocket ss = new ServerSocket(23);
            Socket soc = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String line = br.readLine();
            while(line!=null){
                System.out.println(line);
                line = br.readLine();
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())) ;
            String str = sc.nextLine();
            bw.write(str);
            bw.flush();
            bw.close();
            br.close();
            soc.close();
            ss.close();
        }

    }
}
