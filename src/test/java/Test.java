import com.domain.Person;
import com.domain.Type_Relation;
import com.domain.Relation;
import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    void TestIfConfigurationWorks() {
        Assertions.assertFalse(false);
    }

    @org.junit.jupiter.api.Test
    void TestIfPersonExists() {
        Person person = new Person("a","b");
        Assertions.assertNotNull(person);
    }

    @org.junit.jupiter.api.Test
    void TestIfPersonHasFirstNameAndLastName() {

        Person person = new Person("Jean-Jacques","Dupont");
        Assertions.assertEquals(Person.firstName, "Jean-Jacques");
        Assertions.assertEquals(Person.lastName, "Dupont");
    }

    @org.junit.jupiter.api.Test
    void TestParentChildRelationship() {
        Person father = new Person("Jean-Jacques","Dupont");
        Person child = new Person("James","Dupont");
        Relation relation = new Relation();
        relation.addChildOf(father,child);
        Assertions.assertEquals(Type_Relation.PARENT, relation.getRelation(father,child));
    }

    @org.junit.jupiter.api.Test
    void TestFatherofTwoKidsParentsRelation() {
        Person father = new Person("Peter","O'Reilly");
        Person child1 = new Person("Michael","O'Reilly");
        Person child2 = new Person("Anne","O'Reilly");

        Relation relation = new Relation();
        relation.addChildOf(father,child1);
        relation.addChildOf(father,child2);

        Assertions.assertEquals(Type_Relation.PARENT, relation.getRelation(father, child1));
        Assertions.assertEquals(Type_Relation.PARENT, relation.getRelation(father, child2));
    }

    @org.junit.jupiter.api.Test
    void TestKidOfOneParentChildRelation() {
        Person father = new Person("Peter","O'Reilly");
        Person child1 = new Person("Michael","O'Reilly");
        Person child2 = new Person("Anne","O'Reilly");

        Relation relation = new Relation();
        relation.addParentOf(child1,father);
        relation.addParentOf(child2,father);

        Assertions.assertEquals(Type_Relation.CHILD, relation.getRelation(child1,father));
        Assertions.assertEquals(Type_Relation.CHILD, relation.getRelation(child2,father));



    }

    @org.junit.jupiter.api.Test
    void TestGetFathersFirstName() {
        Person father = new Person("Jean","Pierre");
        Assertions.assertEquals(father.getFirstName(),"Jean");
    }


}
