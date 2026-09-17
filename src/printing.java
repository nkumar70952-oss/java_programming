// Difference btw  println and print

class printing2{
    static void main(String[] args) {
        // here everything moves to next line because of println
        System.out.println("hii");
        System.out.println("good");
        System.out.println("boy");
    }
}
class printing {
    public static void main(String[] args) {
        System.out.println("hii"); //ln shifts the next statement in new line
        System.out.print("good");  // here it stick to boy
        System.out.println("boy");
    }
}


