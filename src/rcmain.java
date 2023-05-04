import java.util.Scanner;

class Mobil{
    private int kecepatan;
    private int posisiX;
    private int posisiY;

    public Mobil(int kecepatan, int posisiX, int posisiY){
        this.kecepatan = kecepatan;
        this.posisiX = posisiX;
        this.posisiY = posisiY;
    }

    public void maju(){
        posisiX += kecepatan;
        System.out.println("Mobil maju ke koordinat (" + posisiX + ", " + posisiY + ")");
    }

    public void mundur(){
        posisiX -= kecepatan;
        System.out.println("Mobil mundur ke koordinat (" + posisiX + ", " + posisiY + ")");
    }

    public void kanan(){
        posisiY += kecepatan;
        System.out.println("Mobil belok kanan ke koordinat (" + posisiX + ", " + posisiY + ")");
    }

    public void kiri(){
        posisiY -= kecepatan;
        System.out.println("Mobil belok kiri ke koordinat (" + posisiX + ", " + posisiY + ")");
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public int getPosisiX(){
        return posisiX;
    }

    public int getPosisiY(){
        return posisiY;
    }
}

class RemoteControl{
    private Mobil mobil;

    public RemoteControl(Mobil mobil){
        this.mobil = mobil;
    }

    public void maju(){
        mobil.maju();
    }

    public void mundur(){
        mobil.mundur();
    }

    public void kanan(){
        mobil.kanan();
    }

    public void kiri(){
        mobil.kiri();
    }

    public void setKecepatan(int kecepatan){
        mobil.setKecepatan(kecepatan);
        System.out.println("Kecepatan mobil diatur menjadi " + mobil.getKecepatan());
    }

    public void getStatus(){
        System.out.println("Kecepatan mobil: " + mobil.getKecepatan());
        System.out.println("Posisi mobil: (" + mobil.getPosisiX() + ", " + mobil.getPosisiY() + ")");
    }
}

public class rcmain{
    public static void main(String[] args){
        Mobil mobil = new Mobil(10, 0, 0);
        RemoteControl remoteControl = new RemoteControl(mobil);

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("Pilih aksi:");
            System.out.println("1. Maju");
            System.out.println("2. Mundur");
            System.out.println("3. Belok kanan");
            System.out.println("4. Belok kiri");
            System.out.println("5. Atur kecepatan");
            System.out.println("6. Lihat status mobil");
            System.out.println("7. Keluar");

            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan){
                case 1:
                    remoteControl.maju();
                    break;
                case 2:
                    remoteControl.mundur();
                    break;
                case 3:
                    remoteControl.kanan();
                    break;
                case 4:
                    remoteControl.kiri();
                    break;
                case 5:
                    System.out.print("Masukkan kecepatan baru: ");
                    int kecepatan = scanner.nextInt();
                    remoteControl.setKecepatan(kecepatan);
                    break;
                case 6:
                    remoteControl.getStatus();
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

            System.out.println();
        } while (pilihan != 7);
    }
}