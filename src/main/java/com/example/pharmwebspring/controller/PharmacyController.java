//package com.example.pharmwebspring.controller;
//
//import com.example.pharmwebspring.Model.Pharmacy;
//import com.example.pharmwebspring.Service.PharmacyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.UnsupportedEncodingException;
//import java.util.List;
//
//@Controller
//public class PharmacyController {
//
//    @Autowired
//    PharmacyService pharmacyService;
//
//    @GetMapping("/login")
//    public String loginpage(){
//        return "login";
//    }
//
//    @RequestMapping("/list")
//    public String list(Model model){
//        List<Pharmacy> pharmacy = pharmacyService.printPharmacy();
//
//        model.addAttribute("pharmacyList", pharmacy);
//
//        return "list";
//    }
//
//    @RequestMapping("/addPharmacy")
//    public String addPharmacy(Model model){
//        return "addPharmacy";
//    }
//
//    @RequestMapping(value = "/insert", method = RequestMethod.POST)
//    public ModelAndView insert(HttpServletRequest request) throws UnsupportedEncodingException {
//        request.setCharacterEncoding("UTF-8");
//        Pharmacy pharmacy = new Pharmacy();
//        pharmacy.setPharm_id((String)(request.getParameter("pharm_id")));
//        pharmacy.setPharm_pw((String)request.getParameter("pharm_pw"));
//        pharmacy.setOpentime((String)request.getParameter("opentime"));
//        pharmacy.setClosetime((String)request.getParameter("closetime"));
//        pharmacy.setPharm_name((String)request.getParameter("pharm_name"));
//        pharmacy.setPharm_adr((String)request.getParameter("pharm_adr"));
//        pharmacy.setRegi_no((String)request.getParameter("regi_no"));
//
//        pharmacyService.insertPharmacy(pharmacy);
//        ModelAndView result = new ModelAndView("redirect:/list");
//
//        return result;
//    }
//}