package com.example.pharmwebspring.controller;

import com.example.pharmwebspring.Model.Login;
import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.RegisterRes;
import com.example.pharmwebspring.Model.User;
import com.example.pharmwebspring.Service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    PharmacyService pharmacyService;

    @PostMapping("/uregi")
    public RegisterRes regUser(@RequestBody User regUser){
        // validation
        Login login=new Login();
        RegisterRes registerRes = new RegisterRes();

        login.setUser_id(regUser.getUser_id());
        login.setUser_pw(regUser.getUser_pw());

        User user=pharmacyService.getUser(login);

        if(user==null){
            pharmacyService.insertUser(regUser);
            registerRes.setStatus(200);
        }else{
            registerRes.setStatus(400);
        }

        return registerRes;
    }

    @PostMapping("/pregi")
    public RegisterRes regPharmacy(@RequestBody Pharmacy pharmacy){

        pharmacyService.insertPharmacy(pharmacy);
        RegisterRes registerRes = new RegisterRes();
        registerRes.setStatus(200);
        return registerRes;
    }

    @PostMapping("/uidlogin") //sql -> 값 가져와서 성공 실패 보는
    public RegisterRes LoginUser(@RequestBody Login login){

        RegisterRes registerRes = new RegisterRes();
        User user = pharmacyService.getUser(login);

        if(user==null){

            registerRes.setStatus(400);
        }else{

            registerRes.setStatus(200);
        }
        return registerRes;
    }

    @PostMapping("/uidlogin") //sql -> 값 가져와서 성공 실패 보는
    public RegisterRes LoginPharmacy(@RequestBody Login login){

        RegisterRes registerRes = new RegisterRes();
        Pharmacy pharmacy = pharmacyService.getPharmacy(login);

        if(pharmacy==null){

            registerRes.setStatus(400);
        }else{

            registerRes.setStatus(200);
        }
        return registerRes;
    }

}
