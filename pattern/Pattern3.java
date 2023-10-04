package pattern;
import java.io.*;

class Pattern3{
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number greater than zero :");
        int n = Integer.parseInt(br.readLine());

        Pattern1 obj = new Pattern1();
        obj.pattern(n);
    }

    void pattern(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}