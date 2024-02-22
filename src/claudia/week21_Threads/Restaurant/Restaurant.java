package claudia.week21_Threads.Restaurant;

public class Restaurant {
    private final String name;

    public Restaurant(String name){
        this.name = name;
        }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return "Restaurant " + this.name;
    }
}
