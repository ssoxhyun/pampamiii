package com.example.pharmwebspring.DAO;

import com.example.pharmwebspring.Model.Login;
import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface LoginDAO {

    void setPharmacy(Pharmacy pharmacy);
    Pharmacy getPharmacy(Login login);

    void setUser(User user);
    User getUser(Login login);
}
