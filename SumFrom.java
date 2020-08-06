import java.io.*;

public class SumFrom{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("n : ");
        String str = br.readLine();

        int n = Integer.parseInt(str);

        int sum = (n * (n + 1)) / 2;

        System.out.println(sum);
    }
}