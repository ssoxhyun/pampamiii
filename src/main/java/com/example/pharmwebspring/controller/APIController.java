package com.example.pharmwebspring.controller;

import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.Res_Reg;
import com.example.pharmwebspring.Model.User;
import com.example.pharmwebspring.Service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    PharmacyService pharmacyService;

    @PostMapping("/regcu")
    public Res_Reg regCustomer(@RequestBody User user){

        pharmacyService.insertCustomer(user);
        Res_Reg res_reg = new Res_Reg();
        res_reg.setStatus(200);
        return res_reg;
    }

    @PostMapping("/regpr")
    public Res_Reg regPharmacy(@RequestBody Pharmacy pharmacy){

        pharmacyService.insertPharmacy(pharmacy);
        Res_Reg res_reg = new Res_Reg();
        res_reg.setStatus(200);
        return res_reg;
    }


}
