class Task4 {
    public static void main(String[] args) {
        double x = 14.26;
        double y = -1.22;
        double z = 3.5 * Math.pow(10, -2);
        
        double x1 = 2 * Math.cos(x - 2.0 / 3.0);
        double x2 = 1.0 / 2.0 + Math.pow(Math.sin(y), 2); //sin(y) in square =Math.sin(y) * Math.sin(y)
        double z2 = Math.pow(z, 2);
        double x3 = 1 + z2 / (3 - z2 / 5);
        double s = x1 / x2 * x3;
        
        
        System.out.println("s = " + s);
    }
}