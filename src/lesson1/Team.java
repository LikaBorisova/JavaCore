package lesson1;


public class Team extends lesson {
    private String fullName;
    private int MaxJump;
    private int MaxSwim;

    public Team(String fN, int MJ, int MS) {
        this.fullName = fN;
        this.MaxJump = MJ;
        this.MaxSwim = MS;
    }
    public String getName() {
        return fullName;
    }
    public int getMaxJump() {
        return MaxJump;
    }
    public int getMaxSwim() {
        return MaxSwim;
    }


}
