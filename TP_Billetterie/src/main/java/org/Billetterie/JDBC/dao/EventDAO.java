package org.Billetterie.JDBC.dao;

import org.Billetterie.Classes.Event;

import java.util.ArrayList;

public class EventDAO extends BaseDAO<Event>{
    @Override
    public ArrayList<Event> get() {
        return null;
    }

    @Override
    public boolean update(Event element) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
