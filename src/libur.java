import java.util.Scanner ;

public class libur {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new
        Scanner(System.in);
        System.out.println("Masukan hari: ");
        String hari = inputan.nextLine();
        hari = hari.toLowerCase();

        if (hari.equals("sabtu") || hari.equals("minggu")) {
            System.out.println("hari libur");
        } else {
            System.out.println("Hari kerja");
        }
        inputan.close();
    }
}
