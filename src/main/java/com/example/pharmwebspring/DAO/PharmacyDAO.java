package com.example.pharmwebspring.DAO;

import com.example.pharmwebspring.Model.Pharmacy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface PharmacyDAO {
    List<Pharmacy> getPharmacy();
    void setPharmacy(Pharmacy pharmacy);
}
