import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);

        for(int i=2; i<=100; i++){
            int k=0;
            for(int n=1;n<=i;n++){
                if(i%n==0){
                    k++;
                    System.out.println(k);
                }
            }if(k==2){
                System.out.print(i+" a");
            }
        }
    }
}