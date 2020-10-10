package com.example.pharmwebspring.Service;

import com.example.pharmwebspring.Model.Login;
import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.User;

import java.util.List;

public interface LoginService {
    void insertPharmacy(Pharmacy pharmacy);
    void insertUser(User user);

    Pharmacy getPharmacy(Login login);
    User getUser(Login login);
}