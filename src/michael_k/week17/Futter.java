package michael_k.week17;

import java.util.ArrayList;
import java.util.HashMap;

public class Futter {





    public String futteruebersicht (ArrayList<Tiere> tiere){

        HashMap<String, Float> futterpreis;
        HashMap<String, Float> futteruebersicht = new HashMap<> ();
        String ausgabe = "";

        for (int i = 0; i < tiere.size ( ); i++) {

            String futterart = tiere.get(i).futterart;
            float futtermenge = tiere.get ( i ).futtermenge;

            if(futteruebersicht.get ( futterart ) == null){
                futteruebersicht.put(futterart, futtermenge);

            }else{
                float oldValue = futteruebersicht.get(futterart);
                futteruebersicht.replace ( futterart, futtermenge+oldValue );
            }

        }

        for (String str: futteruebersicht.keySet () ) {
            ausgabe = ausgabe + "|   |   |   |---" + str + ": "+ futteruebersicht.get(str) + "\n";
        }



        return ausgabe;
    }

}
