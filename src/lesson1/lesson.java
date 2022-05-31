package lesson1;

public class lesson {
    public static void main(String[] args) {

        Team[] team = new Team[4];
        team[0] = new Team("Borisov Ivan", 100, 300);
        team[1] = new Team("Borisov Alex", 50, 100);
        team[2] = new Team("Borisov Petr", 150, 800);
        team[3] = new Team("Borisov Oleg", 60, 200);

        Group group = new Group("Супер Спортсмены", team);

        Course c = new Course(70, 200);
        String result = c.doIt(group);

        System.out.println(result);
    }
}
