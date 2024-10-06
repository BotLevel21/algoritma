import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menghitung uang kembalian dari pembelian telur
        System.out.print("Jumlah Telur (kg) : ");
        double jumlahTelur = scanner.nextDouble();
        double hargaPerKilo = 28000;
        double totalBayar = hargaPerKilo * jumlahTelur;
        System.out.println("Total Bayar : " + totalBayar);
        
        System.out.print("Uang yang diberikan: ");
        double uangDiberikan = scanner.nextDouble();
        double uangKembalian = uangDiberikan - totalBayar;
        System.out.println("Uang kembalian : " + uangKembalian);

        // Mengonversi suhu dari Celcius ke Fahrenheit
        System.out.print("\nMasukkan suhu dalam Celcius: ");
        double suhuCelcius = scanner.nextDouble();
        double suhuFahrenheit = (suhuCelcius * 9 / 5) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);

        // Menghitung keliling lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        double kelilingLingkaran = 2 * Math.PI * jariJari;
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);

        // Menghitung luas persegi panjang
        System.out.print("\nMasukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();
        double luasPersegiPanjang = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);

        // Menghitung volume kubus
        System.out.print("\nMasukkan sisi kubus: ");
        double sisi = scanner.nextDouble();
        double volumeKubus = Math.pow(sisi, 3);
        System.out.println("Volume kubus: " + volumeKubus);

        scanner.close();
    }
}
