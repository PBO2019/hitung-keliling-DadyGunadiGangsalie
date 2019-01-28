public class Main {

    public static void main(String[] args) {
         Bujursangkar persegil=new Bujursangkar();
         Lingkaran lingkaranl = new Lingkaran();

         persegil.setsisi(10);
         persegil.Hitungkelo();

         lingkaranl.setRadius(50);
         lingkaranl.Hitung();

         System.out.println();
        System.out.println("------");
        System.out.println("panjang sisi bujur sangkar : "+persegil.getsisi()+"cm");
        System.out.println("keliling bujur sangkar :"+persegil.getkeliling()+"cm");
        System.out.println("-------");
        System.out.println("jari-jari lingkaran : " + lingkaranl.getRadius()+"cm" );
        System.out.println("keliling lingkaran : " +lingkaranl.getkeliling()+"cm");
    }
}
