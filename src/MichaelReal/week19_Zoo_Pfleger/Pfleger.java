package MichaelReal.week19_Zoo_Pfleger;

import java.util.ArrayList;
import java.util.HashMap;

public class Pfleger {
    private String name;
    private HashMap<String, ArrayList<String>> zustaendigeGehege;

    public Pfleger(String name) {
        this.name = name;
        this.zustaendigeGehege = new HashMap<>();
    }


}
