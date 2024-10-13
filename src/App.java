import java.util.Scanner;

public class App{
    public static void main (String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        double jumlahTelur, uangDiberikan, uangKembalian,totalBelanja,hargaPerKilo,diskon,totalBayar ;
        System.out.println("Masukkan jumlah telur yang dibeli (kg): ");
        jumlahTelur = inputan.nextDouble();
        System.out.println("Masukkan uang yang diberikan: ");

        uangDiberikan = inputan.nextDouble();
        hargaPerKilo = 28000;
        totalBelanja = jumlahTelur * hargaPerKilo;
        uangKembalian = uangDiberikan - totalBelanja;
       
         if (jumlahTelur > 3){
                diskon = 10.0/100*totalBelanja;
            }else{
                diskon=0.0;
            }
            totalBayar = totalBelanja - diskon;
            System.out.println("Jumlah Telur(kg) : " + jumlahTelur );
            System.out.println( " Diskon:" +diskon);
            System.out.println("Total Belanja : " + totalBelanja);
            System.out.println("Uang yang diberikan = " + uangDiberikan);
            System.out.println("Uang kembalian : " + uangKembalian);
            System.out.println("Uang bayar : " + totalBayar);
            

    
        inputan.close();
    }
}