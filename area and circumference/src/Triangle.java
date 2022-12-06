public class Triangle {
    float a, b, c;
    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }
    public float getC() {
        return c;
    }
    public void setC(float c) {
        this.c = c;
    }
    public double area(float a, float b, float c) {
        float s = (a+b+c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double circumference(float a, float b, float c) {
        return a+b+c;
    }
}
