package com.thoughtworks.twu.persistence; /**
 * Created with IntelliJ IDEA.
 * User: shilpa
 * Date: 8/23/12
 * Time: 12:07 PM
 * To change this template use File | Settings | File Templates.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.json.JSONException;


public class HibernateConnection {

    public static void main(String[] args) throws JSONException {

        ServiceRegistry service = null;

        Configuration configuration = new Configuration().configure();
        service = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(service);
        Session session =sessionFactory.openSession();
        DBTasks tasks = new DBTasks(session);
        Transaction transaction= session.beginTransaction();
        tasks.insertIntoFavoriteTimeSheet("gap","12",1);
        transaction.commit();
        tasks.selectFromFavoriteTimeSheet();
    }


}