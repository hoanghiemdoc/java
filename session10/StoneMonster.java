package session10;

public class StoneMonster extends Monster {
    public StoneMonster(String name){
        super(name);

        }
    @Override
    public String attack(){
        return "attack with stones!";
    }
}
