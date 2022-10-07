import java.util.Scanner;
public class Telepon {
    private int jam1,menit1,detik1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Telepon obj = new Telepon();
        System.out.println("Program Tarif Telepon");
        System.out.println("Waktu Awal ");
        System.out.println("JAM   : ");
        obj.jam1 = input.nextInt();
        System.out.println("MENIT : ");
        obj.menit1 = input.nextInt();
        System.out.println("DETIK :");
        obj.detik1 = input.nextInt();

        Telepon obj2 = new Telepon();
        System.out.println("Waktu Akhir ");
        System.out.println("JAM   : ");
        obj2.jam1 = input.nextInt();
        System.out.println("MENIT : ");
        obj2.menit1 = input.nextInt();
        System.out.println("DETIK :");
        obj2.detik1 = input.nextInt();

        if(obj2.jam1<obj.jam1){
            System.out.println("Tidak bisa");
        }else{
            Telepon hg = obj.Hitung(obj2);
            int harga1 = (obj.jam1*3600)+(obj.menit1*60)+obj.detik1;
            int harga2 = harga1 * 30;
            System.out.println("Biaya : Rp. "+harga2);
        }

    }
    public Telepon Hitung(Telepon a){
        Telepon harga = new Telepon();
        int waktu1;
       waktu1 = (a.jam1 - this.jam1)*3600 + (a.menit1 - this.menit1)*60 + (a.detik1-this.detik1);
       harga.jam1 = waktu1 / 3600;
        waktu1 = waktu1 % 3600;
        harga.menit1 = waktu1 / 60;
        waktu1 = waktu1 % 60;
        harga.detik1 = waktu1;
        return harga;
    }
}
