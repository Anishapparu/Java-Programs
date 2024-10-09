import java.util.*;
abstract class student{
    abstract void mark();
}
class  sport extends student{
    void mark(){
        System.out.println("sport");
    }
}
public class abstra {
    public static void main(String[] args) {
        sport old=new sport();
        old.mark();
    }
}