/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author NURFAUZIYAH
 */
public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Query<Karyawan> query = session.createQuery("from Karyawan", Karyawan.class);
        List<Karyawan> karyawanList = query.list();

        for (Karyawan karyawan : karyawanList) {
            System.out.println("Nama: ");
        }
        
        session.close();
        HibernateUtil.shutdown();
    }
}
