package DateTimeForPerson;
import java.time.LocalDate;
class Person {
    private final String name;
    private final LocalDate birthday;


    public Person(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public String getName(){
        return name;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

}