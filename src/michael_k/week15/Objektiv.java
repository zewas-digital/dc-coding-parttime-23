package michael_k.week15;

public class Objektiv extends Object{

    public int brennweite;
    public int brennweiteMin;
    public int brennweiteMax;
    public float blende;
    public int blendeMin;
    public int blendeMax;

   public void Objektiv(String brennweite_Min_Max, String blende_Min_Max) {

       String[] arr3 = brennweite_Min_Max.split ( "/" );
       this.brennweite = Integer.parseInt ( arr3[0] );
       this.brennweiteMin = Integer.parseInt ( arr3[0] );
       this.brennweiteMax = Integer.parseInt ( arr3[1] );

       String[] arr2 = blende_Min_Max.split ( "/" );
       this.blende = Float.parseFloat ( arr2[0] );
       this.blendeMin = Integer.parseInt ( arr2[0] );
       this.blendeMax = Integer.parseInt ( arr2[1] );

   }
}
