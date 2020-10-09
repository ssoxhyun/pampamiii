package com.example.pharmwebspring.Service;

import com.example.pharmwebspring.Model.Login;
import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.User;

import java.util.List;

public interface PharmacyService {
    void insertPharmacy(Pharmacy pharmacy);
    void insertUser(User user);

    User getUser(Login login);
    Pharmacy getPharmacy(Login login);
}