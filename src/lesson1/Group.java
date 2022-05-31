package lesson1;

public class Group {
    private String name;
    private Team[] peoples;

    public Group(String name, Team[] peoples) {
        this.name = name;
        this.peoples = peoples;
    }

    public String getName() {
        return name;
    }

    public Team[] getPeoples() {
        return peoples;
    }

}
