package com.example.josheasop.characterkeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.File;

public class DD5E_Edit extends AppCompatActivity
{
    String fileWriter = "";
    String FileWriter = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dd5_e__edit);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        fileWriter = intent.getStringExtra("fileWriter");
        FileWriter = fileWriter;

        TextView charName = (TextView) findViewById(R.id.charName);
        TextView charClass = (TextView) findViewById(R.id.charClass);
        TextView charLevel = (TextView) findViewById(R.id.charLevel);
        TextView charRace = (TextView) findViewById(R.id.charRace);
        TextView charAlignment = (TextView) findViewById(R.id.charAlignment);
        TextView charExp = (TextView) findViewById(R.id.charExp);
        TextView charStr = (TextView) findViewById(R.id.charStr);
        TextView charDex = (TextView) findViewById(R.id.charDex);
        TextView charCon = (TextView) findViewById(R.id.charCon);
        TextView charInt = (TextView) findViewById(R.id.charInt);
        TextView charWis = (TextView) findViewById(R.id.charWis);
        TextView charChar = (TextView) findViewById(R.id.charChar);
        TextView hitDice = (TextView) findViewById(R.id.hitDice);
        TextView hp = (TextView) findViewById(R.id.hp);
        TextView proficiency = (TextView) findViewById(R.id.proficiency);
        TextView speed = (TextView) findViewById(R.id.speed);
        CheckBox strSave = (CheckBox) findViewById(R.id.strSave);
        CheckBox dexSave = (CheckBox) findViewById(R.id.dexSave);
        CheckBox conSave = (CheckBox) findViewById(R.id.conSave);
        CheckBox intSave = (CheckBox) findViewById(R.id.intSave);
        CheckBox wisSave = (CheckBox) findViewById(R.id.wisSave);
        CheckBox charSave = (CheckBox) findViewById(R.id.charSave);
        CheckBox Acrobatics = (CheckBox) findViewById(R.id.Acrobatics);
        CheckBox AnimalHandling = (CheckBox) findViewById(R.id.AnimalHandling);
        CheckBox Arcana = (CheckBox) findViewById(R.id.Arcana);
        CheckBox Athletics = (CheckBox) findViewById(R.id.Athletics);
        CheckBox Deception = (CheckBox) findViewById(R.id.Deception);
        CheckBox History = (CheckBox) findViewById(R.id.History);
        CheckBox Insight = (CheckBox) findViewById(R.id.Insight);
        CheckBox Intimidation = (CheckBox) findViewById(R.id.Intimidation);
        CheckBox Investigation = (CheckBox) findViewById(R.id.Investigation);
        CheckBox Medicine = (CheckBox) findViewById(R.id.Medicine);
        CheckBox Nature = (CheckBox) findViewById(R.id.Nature);
        CheckBox Perception = (CheckBox) findViewById(R.id.Perception);
        CheckBox Performance = (CheckBox) findViewById(R.id.Performance);
        CheckBox Persuasion = (CheckBox) findViewById(R.id.Persuasion);
        CheckBox Religion = (CheckBox) findViewById(R.id.Religion);
        CheckBox SleightofHand = (CheckBox) findViewById(R.id.SleightofHand);
        CheckBox Stealth = (CheckBox) findViewById(R.id.Stealth);
        CheckBox Survival = (CheckBox) findViewById(R.id.Survival);

        String name = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charName.setText(name);
        String Class = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charClass.setText(Class);
        String level = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charLevel.setText(level);
        String race = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charRace.setText(race);
        String alignment = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charAlignment.setText(alignment);
        String exp = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charExp.setText(exp);
        String str = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charStr.setText(str);
        String dex = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charDex.setText(dex);
        String con = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charCon.setText(con);
        String Int = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charInt.setText(Int);
        String wis = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charWis.setText(wis);
        String Char = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        charChar.setText(Char);
        String HitDice = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        hitDice.setText(HitDice);
        String HP = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        hp.setText(HP);
        String Proficieny = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        proficiency.setText(Proficieny);
        String Speed = FileWriter.split("\\|",2)[0];
        FileWriter = FileWriter.split("\\|",2)[1];
        speed.setText(Speed);
        Boolean StrSave = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        strSave.setChecked(StrSave);
        Boolean DexSave = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        dexSave.setChecked(DexSave);
        Boolean ConSave = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        conSave.setChecked(ConSave);
        Boolean IntSave = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        intSave.setChecked(IntSave);
        Boolean WisSave = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        wisSave.setChecked(WisSave);
        Boolean CharSave = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        charSave.setChecked(CharSave);
        Boolean acrobatics = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Acrobatics.setChecked(acrobatics);
        Boolean animalHandling = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        AnimalHandling.setChecked(animalHandling);
        Boolean arcana = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Arcana.setChecked(arcana);
        Boolean athletics = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Athletics.setChecked(athletics);
        Boolean deception = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Deception.setChecked(deception);
        Boolean history = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        History.setChecked(history);
        Boolean insight = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Insight.setChecked(insight);
        Boolean intimidation = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Intimidation.setChecked(intimidation);
        Boolean investigation = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Investigation.setChecked(investigation);
        Boolean medicine = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Medicine.setChecked(medicine);
        Boolean nature = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Nature.setChecked(nature);
        Boolean perception = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Perception.setChecked(perception);
        Boolean performance = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Performance.setChecked(performance);
        Boolean persuasion = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Persuasion.setChecked(persuasion);
        Boolean religion = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Religion.setChecked(religion);
        Boolean sleightOfHand = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        SleightofHand.setChecked(sleightOfHand);
        Boolean stealth = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Stealth.setChecked(stealth);
        Boolean survival = ifTrue(FileWriter.split("\\|",2)[0]);
        FileWriter = FileWriter.split("\\|",2)[1];
        Survival.setChecked(survival);
    }

    public Boolean ifTrue(String val)
    {
        if(val.equals("true"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String ifBlank(String input)
    {
        String output = " ";

        if(input.equals(""))
        {
            return output;
        }
        else
        {
            return input;
        }
    }

    public void next(View view)
    {
        Intent intent = new Intent(this, dd5e_equipment_edit.class);
        intent.putExtra("fileWriter", stringBuilder() + FileWriter);
        startActivity(intent);
    }

    public void back(View view)
    {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void test(View view)
    {
        Intent intent = new Intent(this, TestDisplay.class);
        intent.putExtra("fileWriter", stringBuilder());
        startActivity(intent);
    }

    public String stringBuilder()
    {
        EditText charName = (EditText) findViewById(R.id.charName);
        EditText charClass = (EditText) findViewById(R.id.charClass);
        EditText charLevel = (EditText) findViewById(R.id.charLevel);
        EditText charRace = (EditText) findViewById(R.id.charRace);
        EditText charAlignment = (EditText) findViewById(R.id.charAlignment);
        EditText charStr = (EditText) findViewById(R.id.charStr);
        EditText charDex = (EditText) findViewById(R.id.charDex);
        EditText charCon = (EditText) findViewById(R.id.charCon);
        EditText charInt = (EditText) findViewById(R.id.charInt);
        EditText charWis = (EditText) findViewById(R.id.charWis);
        EditText charChar = (EditText) findViewById(R.id.charChar);
        EditText hitDice = (EditText) findViewById(R.id.hitDice);
        EditText hp = (EditText) findViewById(R.id.hp);
        EditText proficiency = (EditText) findViewById(R.id.proficiency);
        EditText speed = (EditText) findViewById(R.id.speed);
        CheckBox strSave = (CheckBox) findViewById(R.id.strSave);
        CheckBox dexSave = (CheckBox) findViewById(R.id.dexSave);
        CheckBox conSave = (CheckBox) findViewById(R.id.conSave);
        CheckBox intSave = (CheckBox) findViewById(R.id.intSave);
        CheckBox wisSave = (CheckBox) findViewById(R.id.wisSave);
        CheckBox charSave = (CheckBox) findViewById(R.id.charSave);
        CheckBox Acrobatics = (CheckBox) findViewById(R.id.Acrobatics);
        CheckBox AnimalHandling = (CheckBox) findViewById(R.id.AnimalHandling);
        CheckBox Arcana = (CheckBox) findViewById(R.id.Arcana);
        CheckBox Athletics = (CheckBox) findViewById(R.id.Athletics);
        CheckBox Deception = (CheckBox) findViewById(R.id.Deception);
        CheckBox History = (CheckBox) findViewById(R.id.History);
        CheckBox Insight = (CheckBox) findViewById(R.id.Insight);
        CheckBox Intimidation = (CheckBox) findViewById(R.id.Intimidation);
        CheckBox Investigation = (CheckBox) findViewById(R.id.Investigation);
        CheckBox Medicine = (CheckBox) findViewById(R.id.Medicine);
        CheckBox Nature = (CheckBox) findViewById(R.id.Nature);
        CheckBox Perception = (CheckBox) findViewById(R.id.Perception);
        CheckBox Performance = (CheckBox) findViewById(R.id.Performance);
        CheckBox Persuasion = (CheckBox) findViewById(R.id.Persuasion);
        CheckBox Religion = (CheckBox) findViewById(R.id.Religion);
        CheckBox SleightofHand = (CheckBox) findViewById(R.id.SleightofHand);
        CheckBox Stealth = (CheckBox) findViewById(R.id.Stealth);
        CheckBox Survival = (CheckBox) findViewById(R.id.Survival);

        String fileWriter = "";
        fileWriter += ifBlank(charName.getText().toString()) + "|";
        fileWriter += ifBlank(charClass.getText().toString()) + "|";
        fileWriter += ifBlank(charLevel.getText().toString()) + "|";
        fileWriter += ifBlank(charRace.getText().toString()) + "|";
        fileWriter += ifBlank(charAlignment.getText().toString()) + "|";
        fileWriter += ifBlank(hitDice.getText().toString()) + "|";
        fileWriter += ifBlank(hp.getText().toString()) + "|";
        fileWriter += ifBlank(proficiency.getText().toString()) + "|";
        fileWriter += ifBlank(speed.getText().toString()) + "|";
        fileWriter += ifBlank(charStr.getText().toString()) + "|" + String.valueOf(strSave.isChecked()) + "|";
        fileWriter += ifBlank(charDex.getText().toString()) + "|" + String.valueOf(dexSave.isChecked()) + "|";
        fileWriter += ifBlank(charCon.getText().toString()) + "|" + String.valueOf(conSave.isChecked()) + "|";
        fileWriter += ifBlank(charInt.getText().toString()) + "|" + String.valueOf(intSave.isChecked()) + "|";
        fileWriter += ifBlank(charWis.getText().toString()) + "|" + String.valueOf(wisSave.isChecked()) + "|";
        fileWriter += ifBlank(charChar.getText().toString()) + "|" + String.valueOf(charSave.isChecked()) + "|";
        fileWriter += String.valueOf(Acrobatics.isChecked()) + "|";
        fileWriter += String.valueOf(AnimalHandling.isChecked()) + "|";
        fileWriter += String.valueOf(Arcana.isChecked()) + "|";
        fileWriter += String.valueOf(Athletics.isChecked()) + "|";
        fileWriter += String.valueOf(Deception.isChecked()) + "|";
        fileWriter += String.valueOf(History.isChecked()) + "|";
        fileWriter += String.valueOf(Insight.isChecked()) + "|";
        fileWriter += String.valueOf(Intimidation.isChecked()) + "|";
        fileWriter += String.valueOf(Investigation.isChecked()) + "|";
        fileWriter += String.valueOf(Medicine.isChecked()) + "|";
        fileWriter += String.valueOf(Nature.isChecked()) + "|";
        fileWriter += String.valueOf(Perception.isChecked()) + "|";
        fileWriter += String.valueOf(Performance.isChecked()) + "|";
        fileWriter += String.valueOf(Persuasion.isChecked()) + "|";
        fileWriter += String.valueOf(Religion.isChecked()) + "|";
        fileWriter += String.valueOf(SleightofHand.isChecked()) + "|";
        fileWriter += String.valueOf(Stealth.isChecked()) + "|";
        fileWriter += String.valueOf(Survival.isChecked()) + "|";

        return fileWriter;
    }


}
