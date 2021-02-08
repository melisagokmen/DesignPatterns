
import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name: " + person.getName() + ", Gender: " + person.getGender() + ", Marital Status: " + person.getMaritalStatus() + "]");
        }
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert", "male", "single"));
        persons.add(new Person("John", "male", "married"));
        persons.add(new Person("Laura", "female", "married"));
        persons.add(new Person("Diana", "female", "single"));
        persons.add(new Person("Mike", "male", "single"));
        persons.add(new Person("Bobby", "male", "single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

}
