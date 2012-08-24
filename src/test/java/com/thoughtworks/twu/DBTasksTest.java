package com.thoughtworks.twu;

import com.thoughtworks.twu.persistence.DBTasks;
import oracle.jdbc.driver.OracleDriver;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.json.JSONArray;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DBTasksTest {
    DBTasks tasks;
    Session session;
    Transaction transaction;

    @Before
    public void setup() throws Exception {
        ServiceRegistry service = null;
        Configuration configuration = new Configuration().configure();
        service = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(service);
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        tasks = new DBTasks(session);
    }

    @Test
    public void testInsertIntoAndSelectFromFavoriteTimeSheet() throws Exception {
        tasks.insertIntoFavoriteTimeSheet("mingle", "1", 1);
        JSONArray timesheets = new JSONArray();
        timesheets = tasks.selectFromFavoriteTimeSheet();
        assertEquals(1, timesheets.length());
        transaction.rollback();
    }
}
