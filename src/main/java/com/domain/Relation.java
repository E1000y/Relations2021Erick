package com.domain;

import java.util.ArrayList;

public class Relation {

    private Person object;
    private Person target;
    private TypeRelation typeRelation;
    private ArrayList<Person> listPerson = new ArrayList<>();

    public Relation(Person object, Person target, TypeRelation typeRelation) {

        this.object = object;
        this.target = target;
        this.typeRelation = typeRelation;
        listPerson.add(target);

    }

    public ArrayList<Person> searchFriendsOf(Person object) {
       return listPerson;
    }
}