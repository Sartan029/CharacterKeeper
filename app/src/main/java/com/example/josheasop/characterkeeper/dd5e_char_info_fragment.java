package com.example.josheasop.characterkeeper;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Josh Easop on 5/18/2017.
 */

public class dd5e_char_info_fragment extends Fragment {
    private static final String TAG = "Character Information";
    public static final String bundleKey = "character";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.char_info_fragment_dd5e, container, false);

        return view;
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Bundle bundle = getArguments();

        character_dd5e character = (character_dd5e) bundle.getSerializable(bundleKey);

        TextView charClass = (TextView) getView().findViewById(R.id.charClass);
        charClass.setText(getResources().getString(R.string.classPrint) + " " + character.getCharClass());
        TextView charLevel = (TextView) getView().findViewById(R.id.charLevel);
        charLevel.setText(getResources().getString(R.string.levelPrint) + " " + character.getLevel());
        TextView charRace = (TextView) getView().findViewById(R.id.charRace);
        charRace.setText(getResources().getString(R.string.racePrint) + " " + character.getRace());
        TextView charAlignment = (TextView) getView().findViewById(R.id.charAlignment);
        charAlignment.setText(getResources().getString(R.string.alignmentPrint) + " " + character.getAlignment());
        EditText charExperience = (EditText)getView().findViewById(R.id.exp);
        charExperience.setText(character.getExp());
        TextView charStr = (TextView) getView().findViewById(R.id.charStr);
        charStr.setText(getResources().getString(R.string.strPrint) + " " + character.getStr());
        TextView strMod = (TextView) getView().findViewById(R.id.strMod);
        strMod.setText(getResources().getString(R.string.modPrint) + " " + character.getStrM());
        TextView charDex = (TextView) getView().findViewById(R.id.charDex);
        charDex.setText(getResources().getString(R.string.dexPrint) + " " + character.getDex());
        TextView dexMod = (TextView) getView().findViewById(R.id.dexMod);
        dexMod.setText(getResources().getString(R.string.modPrint) + " " + character.getDexM());
        TextView charCon = (TextView) getView().findViewById(R.id.charCon);
        charCon.setText(getResources().getString(R.string.conPrint) + " " + character.getCon());
        TextView conMod = (TextView) getView().findViewById(R.id.conMod);
        conMod.setText(getResources().getString(R.string.modPrint) + " " + character.getConM());
        TextView charWis = (TextView) getView().findViewById(R.id.charWis);
        charWis.setText(getResources().getString(R.string.wisPrint) + " " + character.getWis());
        TextView wisMod = (TextView) getView().findViewById(R.id.wisMod);
        wisMod.setText(getResources().getString(R.string.modPrint) + " " + character.getWisM());
        TextView charInt = (TextView) getView().findViewById(R.id.charInt);
        charInt.setText(getResources().getString(R.string.intePrint) + " " + character.getInt());
        TextView intMod = (TextView) getView().findViewById(R.id.intMod);
        intMod.setText(getResources().getString(R.string.modPrint) + " " + character.getIntM());
        TextView charChar = (TextView) getView().findViewById(R.id.charCha);
        charChar.setText(getResources().getString(R.string.chaPrint) + " " + character.getChar());
        TextView charMod = (TextView) getView().findViewById(R.id.charMod);
        charMod.setText(getResources().getString(R.string.modPrint) + " " + character.getCharM());
        CheckBox acrobatics = (CheckBox) getView().findViewById(R.id.Acrobatics);
        acrobatics.setChecked(character.getAcrobatics());
        acrobatics.setText(getResources().getString(R.string.acrobatics) + ": " + character.getSkillModifier("acrobatics"));
        CheckBox animalHandling = (CheckBox) getView().findViewById(R.id.AnimalHandling);
        animalHandling.setChecked(character.getAnimalHandling());
        animalHandling.setText(getResources().getString(R.string.animalHandling) + ": " + character.getSkillModifier("animalHandling"));
        CheckBox arcana = (CheckBox) getView().findViewById(R.id.Arcana);
        arcana.setChecked(character.getArcana());
        arcana.setText(getResources().getString(R.string.arcana) + ": " + character.getSkillModifier("arcana"));
        CheckBox athletics = (CheckBox) getView().findViewById(R.id.Athletics);
        athletics.setChecked(character.getAthletics());
        athletics.setText(getResources().getString(R.string.athletics) + ": " + character.getSkillModifier("athletics"));
        CheckBox deception = (CheckBox) getView().findViewById(R.id.Deception);
        deception.setChecked(character.getDeception());
        deception.setText(getResources().getString(R.string.deception) + ": " + character.getSkillModifier("deception"));
        CheckBox history = (CheckBox) getView().findViewById(R.id.History);
        history.setChecked(character.getHistory());
        history.setText(getResources().getString(R.string.history) + ": " + character.getSkillModifier("history"));
        CheckBox insight = (CheckBox) getView().findViewById(R.id.Insight);
        insight.setChecked(character.getInsight());
        insight.setText(getResources().getString(R.string.insight) + ": " + character.getSkillModifier("insight"));
        CheckBox intimidation = (CheckBox) getView().findViewById(R.id.Intimidation);
        intimidation.setChecked(character.getIntimidation());
        intimidation.setText(getResources().getString(R.string.intimidation) + ": " + character.getSkillModifier("intimidation"));
        CheckBox investigation = (CheckBox) getView().findViewById(R.id.Investigation);
        investigation.setChecked(character.getInvestigation());
        investigation.setText(getResources().getString(R.string.investigation) + ": " + character.getSkillModifier("investigation"));
        CheckBox medicine = (CheckBox) getView().findViewById(R.id.Medicine);
        medicine.setChecked(character.getMedicine());
        medicine.setText(getResources().getString(R.string.medicine) + ": " + character.getSkillModifier("medicine"));
        CheckBox nature = (CheckBox) getView().findViewById(R.id.Nature);
        nature.setChecked(character.getNature());
        nature.setText(getResources().getString(R.string.nature) + ": " + character.getSkillModifier("nature"));
        CheckBox perception = (CheckBox) getView().findViewById(R.id.Perception);
        perception.setChecked(character.getPerception());
        perception.setText(getResources().getString(R.string.perception) + ":  " + character.getSkillModifier("perception"));
        CheckBox persuasion = (CheckBox) getView().findViewById(R.id.Persuasion);
        persuasion.setChecked(character.getPersuasion());
        persuasion.setText(getResources().getString(R.string.persuasion) + ": " + character.getSkillModifier("persuasion"));
        CheckBox religion = (CheckBox) getView().findViewById(R.id.Religion);
        religion.setChecked(character.getReligion());
        religion.setText(getResources().getString(R.string.religion) + ": " + character.getSkillModifier("religion"));
        CheckBox sleightOfHand = (CheckBox) getView().findViewById(R.id.SleightofHand);
        sleightOfHand.setChecked(character.getSleightOfHand());
        sleightOfHand.setText(getResources().getString(R.string.sleightofHand) + ": " + character.getSkillModifier("sleightOfHand"));
        CheckBox stealth = (CheckBox) getView().findViewById(R.id.Stealth);
        stealth.setChecked(character.getStealth());
        stealth.setText(getResources().getString(R.string.stealth) + ": " + character.getSkillModifier("stealth"));
        CheckBox survival = (CheckBox) getView().findViewById(R.id.Survival);
        survival.setChecked(character.getSurvival());
        survival.setText(getResources().getString(R.string.survival) + ": " + character.getSkillModifier("survival"));
    }
}
