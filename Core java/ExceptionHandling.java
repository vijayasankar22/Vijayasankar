public class ExceptionHandling {
    public static void main(String[] args) {
        String s= null;
        try { //try this things if anything error happens execute catch block
            print(s);
        }
        catch(Exception k){ // catch block is executed only when there is error in try block
            System.out.println(k.getMessage());
        }
        finally {
            System.out.println("Process Over");
        }
    }

    static void print(String s) throws ArithmeticException {
        if(s==null) {throw new ArithmeticException("Arithmetic");}
        System.out.println(s);
    }
}
