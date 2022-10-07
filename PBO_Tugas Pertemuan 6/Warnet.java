import java.util.Scanner;
public class Warnet {
    private double internet,ketik,game;
    private double scan,printW,printhp,tehb;

    public Warnet(){
        this.internet = 0;
        this.ketik = 0;
        this.game = 0;
        this.scan = 0;
        this.printW = 0;
        this.printhp = 0;
        this.tehb = 0;
    }

    public double getInternet() {
        return internet;
    }

    public void setInternet(double internet) {
        this.internet = internet;
    }

    public double getKetik() {
        return ketik;
    }

    public void setKetik(double ketik) {
        this.ketik = ketik;
    }

    public double getGame() {
        return game;
    }

    public void setGame(double game) {
        this.game = game;
    }

    public double getScan() {
        return scan;
    }

    public void setScan(double scan) {
        this.scan = scan;
    }

    public double getPrintW() {
        return printW;
    }

    public void setPrintW(double printW) {
        this.printW = printW;
    }

    public double getPrinthp() {
        return printhp;
    }

    public void setPrinthp(double printhp) {
        this.printhp = printhp;
    }

    public double getTehb() {
        return tehb;
    }

    public void setTehb(double tehb) {
        this.tehb = tehb;
    }

    /*public double Hitung(){
        double total,internet1,ketik1,game1,scan1,printW1,printhp1,tehb1;
        internet1 = (this.internet/60)*4000;
        ketik1 = (this.ketik/60)*2000;
        game1 = (this.game/60)*5000;
        scan1 = this.scan*1000;
        printW1 = this.printW*500;
        printhp1 = this.printhp*300;
        tehb1 = this.tehb*3000;
        total = internet1+ketik1+game1+scan1+printW1+printhp1+tehb1;
        return Hitung();
    }*/
    public double hitung1(){
        double internet1;
        internet1 = (this.internet/60)*4000;
        return internet1;
    }
    public double hitung2(){
        double ketik1;
        ketik1 = (this.ketik/60)*2000;
        return ketik1;
    }
    public double hitung3(){
        double game1;
        game1 = (this.game/60)*5000;
        return game1;
    }
    public double hitung4(){
        double scan1;
        scan1 = this.scan*1000;
        return scan1;
    }
    public double hitung5(){
        double printW1;
        printW1 = this.printW*500;
        return printW1;
    }
    public double hitung6(){
        double printhp1;
        printhp1 = this.printhp*300;
        return printhp1;
    }
    public double hitung7(){
        double tehb1;
        tehb1 = this.tehb*3000;
        return tehb1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Warnet obj = new Warnet();
        System.out.println("--------------------------------------");
        System.out.println("      ||HARGA RENTAL WARNET||    ");
        System.out.println("--------------------------------------");
        System.out.println("Internet            = Rp 4000/jam ");
        System.out.println("Mengetik            = Rp 2000/jam");
        System.out.println("Game Online         = Rp 5000/jam");
        System.out.println("Scan                = Rp 1000/file");
        System.out.println("Print Warna         = Rp 500/lembar");
        System.out.println("Print Hitam Putih   = Rp 300/lembar");
        System.out.println("Teh Botol           = Rp 3000/botol");
        System.out.println("--------------------------------------");
        System.out.println("                |BAYAR|");
        System.out.println("--------------------------------------");
        System.out.println("Internet/menit              =");
        obj.internet = input.nextDouble();
        System.out.println("Mengetik/menit              =");
        obj.ketik = input.nextDouble();
        System.out.println("Game Online/menit           =");
        obj.game = input.nextDouble();
        System.out.println("Scan/file                   =");
        obj.scan = input.nextDouble();
        System.out.println("Print Warna/lembar          =");
        obj.printW = input.nextDouble();
        System.out.println("Print Hitam-Putih/lembar    =");
        obj.printhp = input.nextDouble();
        System.out.println("Teh Botol/botol");
        obj.tehb = input.nextDouble();
        double total1 = obj.hitung1() + obj.hitung2() + obj.hitung3() + obj.hitung4() + obj.hitung5() + obj.hitung6()+ obj.hitung7();
        System.out.println("Total Harga = "+total1);

    }
}
