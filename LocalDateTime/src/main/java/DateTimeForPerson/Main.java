package DateTimeForPerson;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Person> people = new ArrayList<>();
            people.add(new Person("John", LocalDate.of(1990, 1, 1)));
            people.add(new Person("Jane", LocalDate.of(2000, 1, 1)));
            people.add(new Person("Joe", LocalDate.of(2010, 1, 1)));
            people.add(new Person("Jill ", LocalDate.of(2020, 1, 1)));
            people.add(new Person("Jack", LocalDate.of(1980, 1, 1)));
            people.add(new Person("Jenny", LocalDate.of(1970, 1, 1)));
            people.add(new Person("Jesse", LocalDate.of(1960, 1, 1)));
            people.add(new Person("Jasmine", LocalDate.of(1950, 1, 1)));
            people.add(new Person("Jared", LocalDate.of(1940, 1, 1)));
            people.add(new Person("Jill", LocalDate.of(2000, 1, 1)));

            Iterator<Person> iterator = people.iterator();
            while (iterator.hasNext()) {
                Person p = iterator.next();
                if (p.getBirthday().isBefore(LocalDate.of(2000, 1, 1))) {
                    System.out.println(p.getName() + " was born before 2000");
                }
            }
        } catch (DateTimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


