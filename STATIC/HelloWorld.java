class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Point p = new Point ();
        Point q = new Point (c:5);
        p.print();
        q.print();

        System.out.println("Objetos de Point" + Point.getCount());
    }

}   