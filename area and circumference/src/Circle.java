public class Circle {
    float r;
    public float getR() {
        return r;
    }
    public void setR(float r) {
        this.r = r;
    }
    public double area(float r) {
        return 3.14*r*r;
    }
    public double circumference(float r) {
        return 2*3.14*r;
    }
}
