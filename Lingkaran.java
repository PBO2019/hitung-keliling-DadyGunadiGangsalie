public class Lingkaran {
   public static void main(String[]args){
       Lingkaran Bundar = new Lingkaran ();
       Bundar.Hitung();
   }

    public int radius;
    public double phi = 3.14;
    public double jari = 7;
    public double KelilingLingkaran;

    public void Hitung() {
        KelilingLingkaran = 2 * phi * jari;
        System.out.println(KelilingLingkaran);
    }
}
