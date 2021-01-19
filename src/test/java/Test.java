import com.domain.Person;
import com.domain.Relation;
import com.sun.source.tree.ParenthesizedTree;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class Test {



    @org.junit.jupiter.api.Test
    void TestSearchFriendsOf() {

        Person pierre = new Person("Pierre","Morel");
        Person jean = new Person("Jean","Baudouin");
        Person paul = new Person("Paul", "Édouard");

        ArrayList<Person> friends = new ArrayList<>();


        Relation relation = Relation(pierre,jean,Type_Relation);

        friends=relation.searchFriendsOf(pierre);
        Assertions.assertTrue(friends.contains(jean));
        Assertions.assertTrue(friends.contains(paul));


    }
}
