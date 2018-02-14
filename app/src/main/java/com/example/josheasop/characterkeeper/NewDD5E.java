package com.example.josheasop.characterkeeper;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.example.josheasop.characterkeeper.R.id.Acrobatics;
import static com.example.josheasop.characterkeeper.R.id.AnimalHandling;
import static com.example.josheasop.characterkeeper.R.id.Arcana;
import static com.example.josheasop.characterkeeper.R.id.Athletics;
import static com.example.josheasop.characterkeeper.R.id.Deception;
import static com.example.josheasop.characterkeeper.R.id.History;
import static com.example.josheasop.characterkeeper.R.id.Insight;
import static com.example.josheasop.characterkeeper.R.id.Intimidation;
import static com.example.josheasop.characterkeeper.R.id.Investigation;
import static com.example.josheasop.characterkeeper.R.id.Medicine;
import static com.example.josheasop.characterkeeper.R.id.Nature;
import static com.example.josheasop.characterkeeper.R.id.Perception;
import static com.example.josheasop.characterkeeper.R.id.Performance;
import static com.example.josheasop.characterkeeper.R.id.Persuasion;
import static com.example.josheasop.characterkeeper.R.id.Religion;
import static com.example.josheasop.characterkeeper.R.id.SleightofHand;
import static com.example.josheasop.characterkeeper.R.id.Stealth;
import static com.example.josheasop.characterkeeper.R.id.Survival;
import static com.example.josheasop.characterkeeper.R.id.charAlignment;
import static com.example.josheasop.characterkeeper.R.id.charChar;
import static com.example.josheasop.characterkeeper.R.id.charClass;
import static com.example.josheasop.characterkeeper.R.id.charCon;
import static com.example.josheasop.characterkeeper.R.id.charDex;
import static com.example.josheasop.characterkeeper.R.id.charInt;
import static com.example.josheasop.characterkeeper.R.id.charLevel;
import static com.example.josheasop.characterkeeper.R.id.charName;
import static com.example.josheasop.characterkeeper.R.id.charRace;
import static com.example.josheasop.characterkeeper.R.id.charSave;
import static com.example.josheasop.characterkeeper.R.id.charStr;
import static com.example.josheasop.characterkeeper.R.id.charWis;
import static com.example.josheasop.characterkeeper.R.id.conSave;
import static com.example.josheasop.characterkeeper.R.id.dexSave;
import static com.example.josheasop.characterkeeper.R.id.intSave;
import static com.example.josheasop.characterkeeper.R.id.strSave;
import static com.example.josheasop.characterkeeper.R.id.wisSave;

public class NewDD5E extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dd5_e);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /* Checks if external storage is available for read and write */
    public boolean isExternalStorageWritable()
    {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state))
        {
            return true;
        }
        return false;
    }

    /* Checks if external storage is available to at least read */
    public boolean isExternalStorageReadable()
    {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state) || Environment.MEDIA_MOUNTED_READ_ONLY.equals(state))
        {
            return true;
        }
        return false;
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
        Intent intent = new Intent(this, dd5e_equipment.class);
        intent.putExtra("fileWriter", stringBuilder());
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
        EditText charExp = (EditText) findViewById(R.id.charExp);
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
        fileWriter += ifBlank(charExp.getText().toString()) + "|";
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
