import java.util.ArrayList;

public class PersonManager
{
    ArrayList<Person> arrP = new ArrayList<Person>();

    public void searchPeople(String searchName, ArrayList<Person> arrP) {
        for (Person p : arrP) {
            if (p.getName() == searchName) {
                System.out.println(p.toString());
            }
        }
    }


    public void printListOfPeople(ArrayList<Person> arrP) {
        for (Person p : arrP) {
            System.out.println(p.toString());
        }
    }





    public static void main(String[] args) {
        //Person Class Testing

        PersonManager pm = new PersonManager();

        Person p1 = new Person("Steve", 45, "Analyst");
        Person p2 = new Person("John", 24, " Support");
        Person p3 = new Person("David", 34, "Trader");

        pm.arrP.add(p1);
        pm.arrP.add(p2);
        pm.arrP.add(p3);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println("");
        pm.printListOfPeople(pm.arrP);

        System.out.println("");
        pm.searchPeople("John", pm.arrP);
    }

}






