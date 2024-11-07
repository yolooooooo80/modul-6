import java.util.Scanner;
public class no6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int data = 1;
        System.out.print("Banyak data = ");
        int banyakData = input.nextInt();
        int rataRata,dataInput = 0;
        int jumlah = 0;
        
        while (data <= banyakData) {            
            System.out.print("data " +data+ " : ");
            dataInput = input.nextInt();           
            jumlah += dataInput;
             data++;
        }
                rataRata=jumlah / banyakData;
              
        System.out.println("Rata rata = " +rataRata);
    }
}
