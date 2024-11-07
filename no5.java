
public class no5 {
    public static void main(String[] args) {
        int liter = 0;
        int  total = 0;
       int harga = 6500;
       
        System.out.println("Jumlah liter" + "\t \t \t" + "harga (Rp)");
        System.out.println("===========================================");
        
        while(liter <= 20){
            total = liter * harga;
            System.out.println(+liter+ "\t \t \t"   +total);
            liter+= 1;
        }
           System.out.println("========================================");
    }
}
