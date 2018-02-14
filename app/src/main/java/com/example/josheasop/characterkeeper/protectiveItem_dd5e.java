package com.example.josheasop.characterkeeper;

/**
 * Created by Josh Easop on 5/20/2017.
 */

public class protectiveItem_dd5e
{
    String proname;
    String proac;
    Boolean propenalty;
    String prolocworn;
    String proinfo;
    String proweight;

    public protectiveItem_dd5e()
    {}

    public protectiveItem_dd5e(String name, String ac, Boolean penalty, String locworn, String info, String weight)
    {
        proname = name;
        proac = ac;
        propenalty = penalty;
        prolocworn = locworn;
        proinfo = info;
        proweight = weight;
    }

    public void setProName(String name) {proname = name;}
    public void setProAc(String ac) {proac = ac;}
    public void setPropenalty(Boolean penalty) {propenalty = penalty;}
    public void setProlocworn(String locworn) {prolocworn = locworn;}
    public void setProInfo(String info) {proinfo = info;}
    public void setProweight(String weight) {proweight = weight;}
    public String getProName() {return proname;}
    public String getProAc() {return proac;}
    public Boolean getProPenalty() {return propenalty;}
    public String getProLocWorn() {return prolocworn;}
    public String getProInfo() {return proinfo;}
    public String getProWeight() {return proweight;}
}
