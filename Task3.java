class Task3 {
    
    public static void main(String[] args) {
       
        int a = 10;
        int b = 15;
            
        System.out.println("Variables Before switch:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        /*
        int temp = a; // a = 10, b = 15; temp = 10;
        a = b; // b = 15;  a = 15; temp = 10;
        b = temp; // b = 10; a = 15;
        
        System.out.println("Variables After switch:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        */
        a = a + b; // a = 25; b = 15; (a = 25; b = 10);
        b = a - b; // b = 10; a = 25; (b = 15; a=25);
        a = a - b;// a = 15; b = 10; (a = 10; b = 15);
        
        System.out.println("Variables AFTER switch:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        /* System.out.println("Variables AFTER switch:");
        System.out.println("a = " + b);
        System.out.println("b = " + a); // можно так
        */
        
        
        
        
    }
}