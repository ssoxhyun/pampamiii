package com.example.pharmwebspring.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login {
    private String user_id;
    private String user_pw;

    private String pharm_id;
    private String pharm_pw;
}
