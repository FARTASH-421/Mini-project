import java.util.Scanner;

public class Property {
    private String name;
    private int index;
    boolean Continue = true;
    private Player Owner = new Player("Bank");

    public Player getOwner() {
        return Owner;
    }

    public void setOwner(Player owner) throws LowBalance {
        Owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    Property(String name, int index){
        this.index = index;
        this.name = name;
    }
    Scanner input = new Scanner(System.in);
}

class LowBalance extends Exception{
    public LowBalance(Player player) {
        super("You do not have enough money");
        player.lowBalance = true;
    }
}
class WrongInput extends Exception{
    public WrongInput() {
        super("Wrong input! try again");
    }
}

