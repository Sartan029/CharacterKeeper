package com.example.josheasop.characterkeeper;

import android.util.Log;
import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by Josh Easop on 5/20/2017.
 */

public class character_dd5e implements Serializable
{
    public String name = "";
    public String Class = "";
    public String level = "";
    public String race = "";
    public String alignment = "";
    public String exp = "";
    public String str = "";
    public String strM = "";
    public String dex = "";
    public String dexM = "";
    public String con = "";
    public String conM ="";
    public String Int = "";
    public String IntM = "";
    public String wis = "";
    public String wisM = "";
    public String Char = "";
    public String CharM = "";
    public String HitDice = "";
    public String HP = "";
    public String CurrentHP = "";
    public String Proficiency = "";
    public String Speed = "";
    public Boolean StrSave = null;
    public String strSave = "";
    public Boolean DexSave = null;
    public String dexSave = "";
    public Boolean ConSave = null;
    public String conSave = "";
    public Boolean IntSave = null;
    public String intSave = "";
    public Boolean WisSave = null;
    public String wisSave = "";
    public Boolean CharSave = null;
    public String charSave = "";
    public Boolean acrobatics = null;
    public Boolean animalHandling = null;
    public Boolean arcana = null;
    public Boolean athletics = null;
    public Boolean deception = null;
    public Boolean history = null;
    public Boolean insight = null;
    public Boolean intimidation = null;
    public Boolean investigation = null;
    public Boolean medicine = null;
    public Boolean nature = null;
    public Boolean perception = null;
    public Boolean performance = null;
    public Boolean persuasion = null;
    public Boolean religion = null;
    public Boolean sleightOfHand = null;
    public Boolean stealth = null;
    public Boolean survival = null;
    public weapon_dd5e[] weapons = null;
    public item_dd5e[] items = null;
    public protectiveItem_dd5e[] protectiveItems = null;

    public character_dd5e(String charName, String charClass, String charLevel, String charAlignment, String charExp, String charStr, String charDex,
        String charCon, String charInt, String charWis, String charChar, String charHitDice, String charHP, String charPro, String charSpeed, Boolean charStrSave,
        Boolean charDexSave, Boolean charConSave, Boolean charIntSave, Boolean charWisSave, Boolean charCharSave, Boolean charAcrobatics, Boolean charAnimalHandling,
        Boolean charArcana, Boolean charAthletics, Boolean charDeception, Boolean charHistory, Boolean charInsight, Boolean charIntimidation,
        Boolean charInvestigation, Boolean charMedicine, Boolean charNature, Boolean charPerception, Boolean charPerformance, Boolean charPersuasion,
        Boolean charReligion, Boolean charSleightOfHand, Boolean charStealth, Boolean charSurvival, weapon_dd5e[] charWeaps, item_dd5e[] charItems,
        protectiveItem_dd5e[] charPros)
    {
        name = charName;
        Class = charClass;
        level = charLevel;
        alignment = charAlignment;
        exp = charExp;
        str = charStr;
        strM = calculateModifier(charStr);
        dex = charDex;
        dexM = calculateModifier(charDex);
        con = charCon;
        conM = calculateModifier(charCon);
        Int = charInt;
        IntM = calculateModifier(charInt);
        wis = charWis;
        wisM = calculateModifier(charWis);
        Char = charChar;
        CharM = calculateModifier(charChar);
        HitDice = charHitDice;
        HP = charHP;
        CurrentHP = charHP;
        Proficiency = charPro;
        Speed = charSpeed;
        StrSave = charStrSave;
        strSave = calculateSave("str");
        DexSave = charDexSave;
        dexSave = calculateSave("dex");
        ConSave = charConSave;
        conSave = calculateSave("con");
        IntSave = charIntSave;
        intSave = calculateSave("int");
        WisSave = charWisSave;
        wisSave = calculateSave("wis");
        CharSave = charCharSave;
        charSave = calculateSave("cha");
        acrobatics = charAcrobatics;
        animalHandling = charAnimalHandling;
        arcana = charArcana;
        athletics = charAthletics;
        deception = charDeception;
        history = charHistory;
        insight = charInsight;
        intimidation = charIntimidation;
        investigation = charInvestigation;
        medicine = charMedicine;
        nature = charNature;
        perception = charPerception;
        performance = charPerformance;
        persuasion = charPersuasion;
        religion = charReligion;
        sleightOfHand = charSleightOfHand;
        stealth = charStealth;
        survival = charSurvival;
        weapons = charWeaps;
        items = charItems;
        protectiveItems = charPros;
    }

    public character_dd5e(String input)
    {
        String[] split = new String[2];
        String holder = "";


        split = input.split("\\|",2);
        name = split[0];
        holder = split[1];
        split = holder.split("\\|",2);
        Class = split[0];
        holder = split[1];
        split = holder.split("\\|",2);
        level = split[0];
        holder = split[1];
        split = holder.split("\\|",2);
        race = split[0];
        holder = split[1];
        split = holder.split("\\|",2);
        alignment = split[0];
        holder = split[1];
        split = holder.split("\\|",2);
        exp = split[0];
        holder = split[1];
        split = holder.split("\\|",2);
        HitDice = split[0];
        holder = split[1];
        split = holder.split("\\|",2);
        HP = split[0];
        CurrentHP = HP;
        holder = split[1];
        split = holder.split("\\|",2);
        Proficiency = split[0];
        holder = split[1];
        split =holder.split("\\|",2);
        Speed = split[0];
        holder = split[1];
        split = holder.split("\\|",2);
        str = split[0];
        strM = calculateModifier(str);
        holder = split[1];
        split = holder.split("\\|",2);
        StrSave = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        dex = split[0];
        dexM = calculateModifier(dex);
        holder = split[1];
        split = holder.split("\\|",2);
        DexSave = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        con = split[0];
        conM = calculateModifier(con);
        holder = split[1];
        split = holder.split("\\|",2);
        ConSave = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        Int = split[0];
        IntM = calculateModifier(Int);
        holder = split[1];
        split = holder.split("\\|",2);
        IntSave = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        wis = split[0];
        wisM = calculateModifier(wis);
        holder = split[1];
        split = holder.split("\\|",2);
        WisSave = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        Char = split[0];
        CharM = calculateModifier(Char);
        holder = split[1];
        split = holder.split("\\|",2);
        CharSave = ifTrue(split[0]);
        holder= split[1];
        split = holder.split("\\|",2);
        acrobatics = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        animalHandling = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        arcana = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        athletics = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        deception = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        history = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        insight = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        intimidation = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        investigation = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        medicine = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        nature = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        perception = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        performance = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        persuasion = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        religion = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        sleightOfHand = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        stealth = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|",2);
        survival = ifTrue(split[0]);
        holder = split[1];
        split = holder.split("\\|", 2);
        holder = split[1];
        split = holder.split("\\|", 2);
        int z = Integer.parseInt(split[0]);
        holder = split[1];
        weapon_dd5e[] weaps = new weapon_dd5e[z];
        for(int lcv = 0; lcv < z; lcv++)
        {
            String name;
            String attBns;
            String weight;
            String dmg;
            String dmgType;
            String info;
            Boolean ammo;
            String ammoType;
            Boolean finesse;
            Boolean heavy;
            Boolean light;
            Boolean loading;
            Boolean range;
            String rangeInc;
            Boolean reach;
            Boolean thrown;
            Boolean twoHanded;
            Boolean versatile;

            split = holder.split("\\|", 2);
            name = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            attBns = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            weight = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            dmg = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            dmgType = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            info = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            ammo = ifTrue(split[0]);
            holder = split[1];
            split = holder.split("\\|", 2);
            ammoType = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            finesse = ifTrue(split[0]);
            holder = split[1];
            split = holder.split("\\|", 2);
            heavy = ifTrue(split[0]);
            holder = split[1];
            split = holder.split("\\|", 2);
            light = ifTrue(split[0]);
            holder = split[1];
            split = holder.split("\\|", 2);
            loading = ifTrue(split[0]);
            holder = split[1];
            split = holder.split("\\|", 2);
            range = ifTrue(split[0]);
            holder = split[1];
            split = holder.split("\\|", 2);
            rangeInc = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            reach = ifTrue(split[0]);
            holder = split[1];
            split = holder.split("\\|", 2);
            thrown = ifTrue(split[0]);
            holder = split[1];
            split = holder.split("\\|", 2);
            twoHanded = ifTrue(split[0]);
            holder = split[1];
            split = holder.split("\\|", 2);
            versatile = ifTrue(split[0]);
            holder = split[1];
            weapon_dd5e weap = new weapon_dd5e(name, attBns, weight, dmg, dmgType, info, ammo, ammoType,
                    finesse, heavy, light, loading, range, rangeInc, reach, thrown, twoHanded, versatile);
            weaps[lcv] = weap;
        }
        split = holder.split("\\|", 2);
        z = Integer.parseInt(split[0]);
        holder = split[1];
        protectiveItem_dd5e[] pros = new protectiveItem_dd5e[z];
        for(int lcv = 0; lcv < z; lcv++)
        {
            String proname;
            String proac;
            Boolean propenalty;
            String prolocworn;
            String proinfo;
            String proweight;

            split = holder.split("\\|", 2);
            proname = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            proac = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            if(split[0].equals("true"))
            {
                propenalty = true;
            }
            else
            {
                propenalty = false;
            }
            holder = split[1];
            split = holder.split("\\|", 2);
            prolocworn = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            proinfo = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            proweight = split[0];
            holder = split[1];

            protectiveItem_dd5e pro = new protectiveItem_dd5e(proname, proac, propenalty, prolocworn, proinfo, proweight);
            pros[lcv] = pro;
        }
        split = holder.split("\\|", 2);
        z = Integer.parseInt(split[0]);
        holder = split[1];
        item_dd5e[] items = new item_dd5e[z];
        for(int lcv = 0; lcv < z; lcv++)
        {
            String name;
            String weight;
            String quant;

            split = holder.split("\\|", 2);
            name = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            weight = split[0];
            holder = split[1];
            split = holder.split("\\|", 2);
            quant = split[0];
            holder = split[1];

            item_dd5e item = new item_dd5e(name, weight, quant);
            items[lcv] = item;
        }
    }

    public void setName(String in) {name = in;}
    public String getName() {return name;}
    public void setClass(String in) {Class = in;}
    public String getCharClass() {return Class;}
    public void setLevel(String in) {level = in;}
    public String getLevel() {return level;}
    public void setRace(String in) {race = in;}
    public String getRace() {return race;}
    public void setAlignment(String in) {alignment = in;}
    public String getAlignment() {return alignment;}
    public void setExp(String in) {exp = in;}
    public String getExp() {return exp;}
    public void setStr(String in)
    {
        str = in;
        strM = calculateModifier(str);
    }
    public String getStr() {return str;}
    public String getStrM() {return strM;}
    public void setDex(String in)
    {
        dex = in;
        dexM = calculateModifier(dex);
    }
    public String getDex() {return dex;}
    public String getDexM() {return dexM;}
    public void setCon(String in)
    {
        con = in;
        conM = calculateModifier(con);
    }
    public String getCon() {return con;}
    public String getConM() {return conM;}
    public void setInt(String in)
    {
        Int = in;
        IntM = calculateModifier(Int);
    }
    public String getInt() {return Int;}
    public String getIntM() {return IntM;}
    public void setWis(String in)
    {
        wis = in;
        wisM = calculateModifier(wis);
    }
    public String getWis() {return wis;}
    public String getWisM() {return wisM;}
    public void setChar(String in)
    {
        Char = in;
        CharM = calculateModifier(Char);
    }
    public String getChar() {return Char;}
    public String getCharM() {return CharM;}
    public void setHitDice(String in) {HitDice = in;}
    public String getHitDice() {return HitDice;}
    public void setHP(String in) {HP = in;}
    public String getHP() {return HP;}
    public void setCurrentHP(String in) {CurrentHP = in;}
    public String getCurrentHP() {return CurrentHP;}
    public void setProficiency(String in) {Proficiency = in;}
    public String getProficiency() {return Proficiency;}
    public void setSpeed(String in) {Speed = in;}
    public String getSpeed() {return Speed;}
    public void setStrSave(Boolean in) {StrSave = in; strSave = calculateSave("str");}
    public Boolean getStrSave() {return StrSave;}
    public void setDexSave(Boolean in) {DexSave = in; dexSave = calculateSave("dex");}
    public Boolean getDexSave() {return DexSave;}
    public void setConSave(Boolean in) {ConSave = in; conSave = calculateSave("con");}
    public Boolean getConSave() {return ConSave;}
    public void setIntSave(Boolean in) {IntSave = in; intSave = calculateSave("int");}
    public Boolean getIntSave() {return IntSave;}
    public void setWisSave(Boolean in) {WisSave = in; wisSave = calculateSave("wis");}
    public Boolean getWisSave() {return WisSave;}
    public void setCharSave(Boolean in) {CharSave = in; charSave = calculateSave("cha");}
    public Boolean getCharSave() {return CharSave;}
    public void setAcrobatics(Boolean in) {acrobatics = in;}
    public Boolean getAcrobatics() {return acrobatics;}
    public void setAnimalHandling(Boolean in) {animalHandling = in;}
    public Boolean getAnimalHandling() {return animalHandling;}
    public void setArcana(Boolean in) {arcana = in;}
    public Boolean getArcana() {return arcana;}
    public void setAthletics(Boolean in) {athletics = in;}
    public Boolean getAthletics() {return athletics;}
    public void setDeception(Boolean in) {deception = in;}
    public Boolean getDeception() {return deception;}
    public void setHistory(Boolean in) {history = in;}
    public Boolean getHistory() {return history;}
    public void setInsight(Boolean in) {insight = in;}
    public Boolean getInsight() {return insight;}
    public void setIntimidation(Boolean in) {intimidation = in;}
    public Boolean getIntimidation() {return intimidation;}
    public void setInvestigation(Boolean in) {investigation = in;}
    public Boolean getInvestigation() {return investigation;}
    public void setMedicine(Boolean in) {medicine = in;}
    public Boolean getMedicine() {return medicine;}
    public void setNature(Boolean in) {nature = in;}
    public Boolean getNature() {return nature;}
    public void setPerception(Boolean in) {perception = in;}
    public Boolean getPerception() {return perception;}
    public void setPerformance(Boolean in) {performance = in;}
    public Boolean getPerformance() {return performance;}
    public void setPersuasion(Boolean in) {persuasion = in;}
    public Boolean getPersuasion() {return persuasion;}
    public void setReligion(Boolean in) {religion = in;}
    public Boolean getReligion() {return religion;}
    public void setSleightOfHand(Boolean in) {sleightOfHand = in;}
    public Boolean getSleightOfHand() {return sleightOfHand;}
    public void setStealth(Boolean in) {stealth = in;}
    public Boolean getStealth() {return stealth;}
    public void setSurvival(Boolean in) {survival = in;}
    public Boolean getSurvival() {return survival;}
    public void setWeapons(weapon_dd5e[] in) {weapons = in;}
    public weapon_dd5e[] getWeapons() {return weapons;}
    public void setItems(item_dd5e[] in) {items = in;}
    public item_dd5e[] getItems() {return items;}
    public void setProtectiveItems(protectiveItem_dd5e[] in) {protectiveItems = in;}
    public protectiveItem_dd5e[] getProtectiveItems() {return protectiveItems;}


    public void setStrM(String in) {strM = in;}
    public void setDexM(String in) {dexM = in;}
    public void setConM(String in) {conM = in;}
    public void setIntM(String in) {IntM = in;}
    public void setWisM(String in) {wisM = in;}
    public void setCharM(String in) {CharM = in;}
    public String getstrSave() {return calculateSave("str");}
    public String getdexSave() {return dexSave;}
    public String getconSave() {return conSave;}
    public String getintSave() {return intSave;}
    public String getwisSave() {return wisSave;}
    public String getchaSave() {return charSave;}

    public String calculateModifier(String score)
    {
        String mod = "0";
        if(score.equals("1"))
        {mod = "-5";}
        else if(score .equals("2") || score.equals("3"))
        {mod = "-4";}
        else if(score.equals("4") || score.equals("5"))
        {mod = "-3";}
        else if(score.equals("6") || score.equals("7"))
        {mod = "-2";}
        else if(score.equals("8") || score.equals("9"))
        {mod = "-1";}
        else if(score.equals("10") || score.equals("11"))
        {mod = "0";}
        else if(score.equals("12") || score.equals("13"))
        {mod = "1";}
        else if(score.equals("14") || score.equals("15"))
        {mod = "2";}
        else if(score.equals("16") || score.equals("17"))
        {mod = "3";}
        else if(score.equals("18") || score.equals("19"))
        {mod = "4";}
        else if(score.equals("20") || score.equals("21"))
        {mod = "5";}
        else if(score.equals("22") || score.equals("23"))
        {mod = "6";}
        else if(score.equals("24") || score.equals("25"))
        {mod = "7";}
        else if(score.equals("26") || score.equals("27"))
        {mod = "8";}
        else if(score.equals("28") || score.equals("29"))
        {mod = "9";}
        else if(score.equals("30"))
        {mod = "10";}
        return mod;
    }

    public Boolean ifTrue(String val)
    {
        if(val.equals("true"))
        {return true;}
        else
        {return false;}
    }

    public String ifBlank(String input)
    {
        String output = " ";

        if(input.equals(""))
        {return output;}
        else
        {return input;}
    }

    public String getSkillModifier(String skill)
    {
        String out = "";

        if(skill.equals("acrobatics"))
        {
            if(acrobatics)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(dexM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = dexM;
            }
        }
        else if(skill.equals("animalHandling"))
        {
            if(animalHandling)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(wisM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = wisM;
            }
        }
        else if(skill.equals("arcana"))
        {
            if(arcana)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(IntM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = IntM;
            }
        }
        else if(skill.equals("athletics"))
        {
            if(athletics)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(strM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = strM;
            }
        }
        else if(skill.equals("deception"))
        {
            if(deception)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(CharM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = CharM;
            }
        }
        else if(skill.equals("history"))
        {
            if(history)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(IntM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = IntM;
            }
        }
        else if(skill.equals("insight"))
        {
            if(insight)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(wisM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = wisM;
            }
        }
        else if(skill.equals("intimidation"))
        {
            if(intimidation)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(CharM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = CharM;
            }
        }
        else if(skill.equals("investigation"))
        {
            if(investigation)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(IntM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = IntM;
            }
        }
        else if(skill.equals("medicine"))
        {
            if(medicine)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(wisM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = wisM;
            }
        }
        else if(skill.equals("nature"))
        {
            if(nature)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(IntM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = IntM;
            }
        }
        else if(skill.equals("perception"))
        {
            if(perception)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(wisM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = wisM;
            }
        }
        else if(skill.equals("performance"))
        {
            if(performance)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(CharM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = CharM;
            }
        }
        else if(skill.equals("persuasion"))
        {
            if(persuasion)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(CharM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = CharM;
            }
        }
        else if(skill.equals("religion"))
        {
            if(religion)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(IntM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = IntM;
            }
        }
        else if(skill.equals("sleightOfHand"))
        {
            if(sleightOfHand)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(dexM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = dexM;
            }
        }
        else if(skill.equals("stealth"))
        {
            if(stealth)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(dexM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = dexM;
            }
        }
        else if(skill.equals("survival"))
        {
            if(survival)
            {
                int x = Integer.parseInt(Proficiency);
                int y = Integer.parseInt(wisM);
                int z = x+y;
                out = Integer.toString(z);
            }
            else
            {
                out = wisM;
            }
        }

        return out;
    }

    public String calculateSave(String att)
    {
        String save = "";
        int y;
        Log.e("JJE", "'" + Proficiency + "'");
        if(Proficiency == " ")
        {
            y = 0;
            Log.e("JJE", "In if");
        }
        else
        {
            try
            {
                y = Integer.parseInt(Proficiency);
            }
            catch(NumberFormatException e)
            { y = 0;           }
        }

        if(att == "str")
        {
            if(StrSave)
            {
                int a = Integer.parseInt(strM);
                int x = y + a;
                save = Integer.toString(x);
            }
            else
            {
                save = strM;
            }
        }
        else if(att == "dex")
        {
            if(DexSave)
            {
                int a = Integer.parseInt(dexM);
                int x = y + a;
                save = Integer.toString(x);
            }
            else
            {
                save = dexM;
            }
        }
        else if(att == "con")
        {
            if(ConSave)
            {
                int a = Integer.parseInt(conM);
                int x = y + a;
                save = Integer.toString(x);
            }
            else
            {
                save = conM;
            }
        }
        else if(att == "int")
        {
            if(IntSave)
            {
                int a = Integer.parseInt(IntM);
                int x = y + a;
                save = Integer.toString(x);
            }
            else
            {
                save = IntM;
            }
        }
        else if(att == "wis")
        {
            if(WisSave)
            {
                int a = Integer.parseInt(wisM);
                int x = y + a;
                save = Integer.toString(x);
            }
            else
            {
                save = wisM;
            }
        }
        else if(att == "cha")
        {
            if(CharSave)
            {
                int a = Integer.parseInt(CharM);
                int x = y + a;
                save = Integer.toString(x);
            }
            else
            {
                save = CharM;
            }
        }

        return save;
    }
}
