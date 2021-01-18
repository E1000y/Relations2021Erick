package com.domain;

public class Relation {

    private Type_Relation typeRelation;



    public void addChildOf(Person father, Person child) {
        typeRelation = Type_Relation.PARENT;
    }




    public Type_Relation getRelation(Person father, Person child) {
        return typeRelation;
    }

    public void addParentOf(Person child, Person father) {
        typeRelation = Type_Relation.CHILD;
    }
}
