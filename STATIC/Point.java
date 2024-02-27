public class Point {
    private double x;
    private double y;
    private static int count;
    public Point() {
        System.out.println("Desde el constructor");
        x=0.0;
        y=0.0;
        count ++;
    }
    public Point (int c) {
        System.out.println("desde el constructor");
        x=c;
        y=c;
        count ++; 
    }
    void print (){ 
        System.out.printl("Soy el punto" + x + " , " + y); 

    }
    public static int getCount() {
        System.out.println(count);
        return count;
        
    }

}
