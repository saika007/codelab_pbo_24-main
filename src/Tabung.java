import java.util.Scanner;

public class Tabung extends BangunRuang {
    Tabung(String name) {
        super(name);
    }

    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double jari_jari;

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
        System.out.print("Input jari-jari: ");
        jari_jari = scanner.nextDouble();
        System.out.print("\n");
    }

    @Override
    public void luasPermukaan() {
        super.luasPermukaan();
        double hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggi);
        System.out.println("Hasil luas permukaan: " + hasil + "\n");
    }

    @Override
    public void volume() {
        super.volume();
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        System.out.println("Hasil volume: " + hasil + "\n");
    }
}