/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author NURFAUZIYAH
 */

import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;
import org.hibernate.Transaction;

public class ControlKaryawan {
    
    public List<Karyawan> getAllKaryawan() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query<Karyawan> query = session.createQuery("FROM Karyawan", Karyawan.class);
        List<Karyawan> karyawanList = query.getResultList();
        session.close();
        return karyawanList;
    }
    
    public void saveKaryawan(Karyawan karyawan) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        
        try {
            transaction = session.beginTransaction();
            session.save(karyawan);
            transaction.commit();
        } catch(Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    public Karyawan getKaryawanById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Karyawan karyawan = null;

        try {
            karyawan = session.get(Karyawan.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return karyawan;
    }
    
    public void updateKaryawan(Karyawan karyawan) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(karyawan);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    public void deleteKaryawan(Karyawan karyawan) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(karyawan);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
