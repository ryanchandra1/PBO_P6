import java.util.Scanner;
public class LuasSegitiga {
    private int alas;
    private int tinggi;

    public LuasSegitiga(){
        this.alas = 0;
        this.tinggi = 0;
    }
    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public double Luas(){
        return alas*tinggi/2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LuasSegitiga obj = new LuasSegitiga();
        System.out.println("Masukkan Alas = ");
        obj.alas = input.nextInt();
        System.out.println("Masukkan tinggi = ");
        obj.tinggi= input.nextInt();
        System.out.println("Luas Segitiga = "+obj.Luas());

    }
}
