package com.example.pharmwebspring.Service.Impl;

import com.example.pharmwebspring.DAO.PharmacyDAO;
import com.example.pharmwebspring.Model.Login;
import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.User;
import com.example.pharmwebspring.Service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PharmacyServiceImpl implements PharmacyService {

    @Autowired
    private PharmacyDAO dao;

    @Override
    public void insertPharmacy(Pharmacy pharmacy) {
        dao.setPharmacy(pharmacy);
    }

    @Override
    public Pharmacy getPharmacy(Login login) { return dao.getPharmacy(login); }

    @Override
    public void insertUser(User user) {
        dao.setUser(user);
    }

    @Override
    public User getUser(Login login) {
        return dao.getUser(login);
    }

}
