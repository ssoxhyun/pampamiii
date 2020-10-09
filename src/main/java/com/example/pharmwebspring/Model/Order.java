package com.example.pharmwebspring.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Order {
    private int order_no;
    private String order_name;
    private String order_phone;
    private String order_adr;

    private String user_id_fk;
    private String prod_name_fk;
    private String pharm_name;
    //private int count; -> 조인 (cart)
}
