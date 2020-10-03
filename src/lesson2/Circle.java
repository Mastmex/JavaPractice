package lesson2;

public class Circle {
    private double R,D,S,C;
    void setR(double r){
        this.R=r;
        D=2*R;
        C=2*Math.PI*R;
        S=Math.PI*R*R;
    }

    public double getC() {
        return C;
    }

    public double getD() {
        return D;
    }

    public double getR() {
        return R;
    }

    public double getS() {
        return S;
    }
}
