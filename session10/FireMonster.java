package session10;

public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "attack with fire!";
    }

}
