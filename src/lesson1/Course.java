package lesson1;

public class Course extends lesson  {
    String result;
    private int DistanceJump;
    private int DistanceSwim;

    public Course(int DJ, int DS){
        this.DistanceJump = DJ;
        this.DistanceSwim = DS;
    }

    public String doIt(Group group){
        result = "�������: "+ group.getName()+ " " + '\n';
        for(Team person: group.getPeoples()){
            result += "��� ����������: " + person.getName()+ " " + '\n';
            int jump = person.getMaxJump();
            int swim = person.getMaxSwim();
            start(jump,swim);
        }

        return result;
    }

    private void start(int jump, int swim){
        if(jump>=DistanceJump && swim>=DistanceSwim) result += "��������� ������ ������ �����������"+ '\n';
        else result += "��������� �� ������"+ '\n';
    }


}
