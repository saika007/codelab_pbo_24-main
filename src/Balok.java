import java.util.Scanner;

public class Balok extends BangunRuang {
    Balok(String name) {
        super(name);
    }

    Scanner scanner = new Scanner(System.in);
    private double panjang, lebar, tinggi;

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
        System.out.print("\n");
    }

    @Override
    public void luasPermukaan() {
        super.luasPermukaan();
        double hasil = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        System.out.println("Hasil luas permukaan: " + hasil + "\n");
    }

    @Override
    public void volume() {
        super.volume();
        double hasil = panjang * lebar * tinggi;
        System.out.println("Hasil volume: " + hasil + "\n");
    }
}