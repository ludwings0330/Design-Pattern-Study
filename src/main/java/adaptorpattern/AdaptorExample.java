package adaptorpattern;

import java.util.zip.ZipEntry;

public class AdaptorExample {
    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdaptor(wildTurkey);

        turkeyAdaptor.quack();
        turkeyAdaptor.fly();
    }
}
