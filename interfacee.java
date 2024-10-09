interface rajendran{
    void anish();
    void anitha();
}
interface jayanthi{
    void anish();
    void anitha();
}
class children implements rajendran,jayanthi{
    public void anish(){
        System.out.println("Anish is a son of both rajendran and jayanthi");
    }
    public void anitha(){
        System.out.println("anitha is a daughter of rajendran and jayanthi ");
    }
}
public class interfacee {
    public static void main(String[] args) {
        children old = new children();
        old.anish();
        old.anitha();
    }
}