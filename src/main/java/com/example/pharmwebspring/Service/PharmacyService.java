package com.example.pharmwebspring.Service;

import com.example.pharmwebspring.Model.Pharmacy;
import java.util.List;

public interface PharmacyService {
    List<Pharmacy> printPharmacy();
    void insertPharmacy(Pharmacy pharmacy);
}