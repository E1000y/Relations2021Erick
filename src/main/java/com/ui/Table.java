package com.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table extends JFrame implements ActionListener {
    JLabel name1, relation, name2;
    JButton update;

    public Table(){
        setSize(500,500);

        setLocation(990,540);
        setTitle("Display of inter people relations");
        FlowLayout fl = new FlowLayout();
        setLayout(fl);

        name1 = new JLabel("name 1");
        relation = new JLabel("parent");
        name2 = new JLabel("name 2");
        update = new JButton("Update");

        Container c = getContentPane();
        c.add(name1);
        c.add(relation);
        c.add(name2);
        c.add(update);

        setVisible(true);

        update.addActionListener(this);

    }

    public static void main(String[] args) {
        Table t = new Table();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
/*
        Person father = new Person("Jean","Pierre");

        Person child = new Person("Théo","Pierre");
        Relation relation = new Relation();
        relation.addParentOf(child,father);
        relation.addChildOf(father,child);

        name1.setText(father.getFirstName());
        this.relation.setText(relation.getRelation(father,child).toString());
        name2.setText(child.getFirstName());*/

    }
}
