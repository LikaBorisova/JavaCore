package Lesson4;

public class MainPhone {
    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();
        phoneBook.add("88123456702", "Sidorov");
        phoneBook.add("89567843562","Petushkov");
        phoneBook.add("81237766235","Samosolov");
        phoneBook.add("89992372289","Generalov");
        phoneBook.add("89092347721","Bobrikov");
        phoneBook.add("89092346722","Sidorov");
        phoneBook.add("89262376219","Generalov");
        phoneBook.add("89092376271","Generalov");



        System.out.println(phoneBook.getPhone("Sidorov"));
        System.out.println(phoneBook.getPhone("Petushkov"));
        System.out.println(phoneBook.getPhone("Generalov"));


    }
}
