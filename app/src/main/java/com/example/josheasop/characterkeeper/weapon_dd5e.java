package com.example.josheasop.characterkeeper;

/**
 * Created by Josh Easop on 5/20/2017.
 */

public class weapon_dd5e
{
    public String name;
    public String attBns;
    public String weight;
    public String dmg;
    public String dmgType;
    public String info;
    public Boolean ammo;
    public String ammoType;
    public Boolean finesse;
    public Boolean heavy;
    public Boolean light;
    public Boolean loading;
    public Boolean range;
    public String rangeInc;
    public Boolean reach;
    public Boolean thrown;
    public Boolean twoHanded;
    public Boolean versatile;

    public weapon_dd5e()
    {}

    public weapon_dd5e(String Name, String AttBns, String Weight, String Dmg, String DmgType, String Info,
            Boolean Ammo, String AmmoType, Boolean Finesse, Boolean Heavy, Boolean Light, Boolean Loading,
            Boolean Range, String RangeInc, Boolean Reach, Boolean Thrown, Boolean TwoHanded, Boolean Versatile)
    {
        name = Name;
        attBns = AttBns;
        weight = Weight;
        dmg = Dmg;
        dmgType = DmgType;
        info = Info;
        ammo = Ammo;
        ammoType = AmmoType;
        finesse = Finesse;
        heavy = Heavy;
        light = Light;
        loading = Loading;
        range = Range;
        rangeInc = RangeInc;
        reach = Reach;
        thrown = Thrown;
        twoHanded = TwoHanded;
        versatile = Versatile;
    }

    public void setName(String in){name = in;}
    public String getName(){return name;}
    public void setAttBns(String in){attBns = in;}
    public String getAttBns(){return attBns;}
    public void setWeight(String in){weight = in;}
    public String getWeight(){return weight;}
    public void setDmg(String in){dmg = in;}
    public String getDmg(){return dmg;}
    public void setDmgType(String in){dmgType = in;}
    public String getDmgType(){return dmgType;}
    public void setInfo(String in){info = in;}
    public String getInfo(){return info;}
    public void setAmmo(Boolean in){ammo = in;}
    public Boolean getAmmo(){return ammo;}
    public void setAmmoType(String in){ammoType = in;}
    public String getAmmoType(){return ammoType;}
    public void setFinesse(Boolean in){finesse = in;}
    public Boolean getFinesse(){return finesse;}
    public void setHeavy(Boolean in){heavy = in;}
    public Boolean getHeavy(){return heavy;}
    public void setLight(Boolean in){light = in;}
    public Boolean getLight(){return light;}
    public void setLoading(Boolean in){loading = in;}
    public Boolean getLoading(){return loading;}
    public void setRange(Boolean in){range = in;}
    public Boolean getRange(){return range;}
    public void setRangeInc(String in){rangeInc = in;}
    public String getRangeInc(){return rangeInc;}
    public void setReach(Boolean in){reach = in;}
    public Boolean getReach(){return reach;}
    public void setThrown(Boolean in){thrown = in;}
    public Boolean getThrown(){return thrown;}
    public void setTwoHanded(Boolean in){twoHanded = in;}
    public Boolean getTwoHanded(){return twoHanded;}
    public void setVersatile(Boolean in){versatile = in;}
    public Boolean getVersatile(){return versatile;}


}
