package edu.finance.visualchartforcovid19.bean;

import lombok.Data;

@Data
public class ProvincesDataBean {
    String provinceName;
    Integer confirm;
    Integer nowConfirm;
    Integer localConfirmAdd;
    Integer wzzAdd;
    Integer heal;
    Integer dead;



}
