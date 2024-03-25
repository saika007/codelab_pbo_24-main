import java.util.Scanner;

public class BangunRuang {
    private String name;
    Scanner scanner = new Scanner(System.in);

    BangunRuang(String name){
        this.name = name;
    }

    public void inputNilai(){ 
        System.out.println("Input nilai " + name);
    }

    public void luasPermukaan(){
        System.out.println("Menghitung luas permukaan bangun " + name);
    }

    public void volume(){
        System.out.println("Menghitung volume bangun " + name);
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }
}
