package LLD.Chess;

public class Player {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
