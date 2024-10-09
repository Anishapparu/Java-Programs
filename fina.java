public class fina {
    void print(){
        final int code=7321;
        System.out.println("code: "+code);
    }
    public static void main(String[] args) {
        int code=1234;
        fina obj = new fina();
        obj.print();
        System.out.println("code: "+code);
    }
}
