package claudia.week21_Threads.Restaurant;

public class Kellner {
    private String name;

    public Kellner(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
