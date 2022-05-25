package it.esercizi_alternativi.alenamentoPasqu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test  {
    public static void main(String[] args) {

        Laptop vaio = new Laptop(200,"1199",0.22,8,500,"i7");
        Laptop hp = new Laptop(400,"2289",0.22,16,1000,"r7");
        Laptop m1 = new Laptop(5000,"3377",0.22,8,250,"m1");
        Laptop acer = new Laptop(250,"4400",0.22,12,250,"r5");

        List<DispositiviDigitali> dispositiviDigitaliList = new ArrayList<>();
        dispositiviDigitaliList.add(vaio);
        dispositiviDigitaliList.add(hp);
        dispositiviDigitaliList.add(m1);
        dispositiviDigitaliList.add(acer);

        Map<String,DispositiviDigitali> stringDispositiviDigitaliHashMap = new HashMap<>();

        for (DispositiviDigitali p: dispositiviDigitaliList) {
            if (p.getPrezzoAlConsumatore() > 1000){
                p.printMe();
            }
        }




    }
}
