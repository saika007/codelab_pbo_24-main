import java.util.Scanner;

public class Kubus extends BangunRuang {
    Kubus(String name) {
        super(name);
    }

    Scanner scanner = new Scanner(System.in);
    private double sisi;
    

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input sisi: ");
        sisi = scanner.nextDouble();
        System.out.print("\n");
    }

    @Override
    public void luasPermukaan(){
        super.luasPermukaan();
        double hasil = 6 * sisi * sisi;
        System.out.println("Hasil luas permukaan: " + hasil + "\n");
    }

    @Override
    public void volume(){
        super.volume();
        double hasil = Math.pow(sisi, 3);
        System.out.println("Hasil volume: " + hasil + "\n");
    }
}
