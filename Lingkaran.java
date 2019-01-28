public class Lingkaran {

    private double phi;
    private double keliling = 3.14;
    private int Radius;


    public void Hitung() {
        this.keliling  = 2 * phi *Radius;

    }
    public int getRadius(){
        return Radius;
    }
    public void setRadius(int Radius){
    this.Radius = Radius;
    }
    public double getkeliling(){
    return keliling;
    }
}
