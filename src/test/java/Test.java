import com.domain.Person;
import com.domain.Relation;
import com.domain.TypeRelation;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class Test {



    @org.junit.jupiter.api.Test
    void TestSearchFriendsOf() {

        Person pierre = new Person("Pierre","Morel");
        Person jean = new Person("Jean","Baudouin");
        Person paul = new Person("Paul", "Édouard");

        ArrayList<Person> friends;


        Relation relation = new Relation(pierre,jean, TypeRelation.FRIEND);

        friends=relation.searchFriendsOf(pierre);
        Assertions.assertTrue(friends.contains(jean));
        Assertions.assertTrue(friends.contains(paul));


    }
}
