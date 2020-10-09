package com.example.pharmwebspring.Service.Impl;

import com.example.pharmwebspring.DAO.PharmacyDAO;
import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.User;
import com.example.pharmwebspring.Service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService {

    @Autowired
    private PharmacyDAO dao;

    @Override
    public List<Pharmacy> printPharmacy() {
        List<Pharmacy> pharmacy = dao.getPharmacy();
        return pharmacy;
    }

    @Override
    public void insertPharmacy(Pharmacy pharmacy) {
        dao.setPharmacy(pharmacy);
    }

    @Override
    public void insertCustomer(User user) {
        dao.setCustomer(user);
    }
}
