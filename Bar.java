import java.util.ArrayList;

public class Bar extends  Meniu{

    public ArrayList<String> articol;

    Bar(String Nume){
        super(Nume);
        articol = new ArrayList<>();
        articol.add("Pina Colada");
        articol.add("Margarita");
        articol.add("Sex on the Beach");
        articol.add("Hurricane\n");
    }

    void showArticole(){
        for(int i = 0; i < articol.size(); i++){
        System.out.println(articol.get(i));
        }
    }
}