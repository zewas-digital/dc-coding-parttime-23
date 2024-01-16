package michael_k.week15;

public class Objektiv extends Object{

    public int brennweite;
    public int brennweiteMin;
    public int brennweiteMax;
    public float blende;
    public int blendeMin;
    public int blendeMax;

   public Objektiv(String brennweite_Min_Max, String blende_Min_Max) {

       String[] arr1 = brennweite_Min_Max.split ( "/" );
       this.brennweite = Integer.parseInt ( arr1[0] );
       this.brennweiteMin = Integer.parseInt ( arr1[0] );
       this.brennweiteMax = Integer.parseInt ( arr1[1] );

       String[] arr2 = blende_Min_Max.split ( "/" );
       this.blende = Float.parseFloat ( arr2[0] );
       this.blendeMin = Integer.parseInt ( arr2[0] );
       this.blendeMax = Integer.parseInt ( arr2[1] );

   }
}
