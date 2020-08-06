import java.io.*;

import javax.imageio.stream.ImageInputStream;

public class game1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int hitNumber;
        int n = -1 ;
        int count;

        hitNumber = (int)(Math.random() * 100) + 1;

        while( hitNumber != n ){

            System.out.print("1~100 n:");
            n = Integer.parseInt(br.readLine());

            if(hitNumber < n)
                System.out.println("hitNumber < n");
            
            else if(hitNumber > n)
                System.out.println("hitNumber > n");
            
            else System.out.println("hitNumber == n");

        }
        System.out.println("-----------------");
    }
}