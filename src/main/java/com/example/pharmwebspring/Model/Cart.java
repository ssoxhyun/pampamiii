package com.example.pharmwebspring.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//큐
//어노테이션 Foreign key?

public class Cart {
    private int count;

    private int order_no_fk;
    private String user_id_fk;
    private String prod_name_fk;
}
