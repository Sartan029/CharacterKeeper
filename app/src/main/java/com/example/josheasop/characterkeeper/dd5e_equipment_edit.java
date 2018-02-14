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

public class dd5e_equipment_edit extends AppCompatActivity {

    String fileWriter = "";
    int weapons = 0;
    String weaponAdder = "";
    int pros = 0;
    String proAdder = "";
    int items = 0;
    String itemAdder = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dd5e_equipment_edit);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        fileWriter = intent.getStringExtra("fileWriter");
    }


    protected void addWeap()
    {
        EditText weapName = (EditText) findViewById(R.id.weapName);
        EditText weapAttBns = (EditText) findViewById(R.id.weapattbns);
        EditText weapDMG = (EditText) findViewById(R.id.weapDmg);
        EditText weapInfo = (EditText) findViewById(R.id.weapInfo);

        weapons++;
        weaponAdder += weapName.getText() + "|";
        weaponAdder += weapAttBns.getText() + "|";
        weaponAdder += weapDMG.getText() + "|";
        weaponAdder += weapInfo.getText() + "|";

        weapName.getText().clear();
        weapAttBns.getText().clear();
        weapDMG.getText().clear();
        weapInfo.getText().clear();
    }

    protected void addPro()
    {
        EditText proName = (EditText) findViewById(R.id.proName);
        EditText proAC = (EditText) findViewById(R.id.proAC);
        CheckBox proPenalty = (CheckBox) findViewById(R.id.proPenalty);
        EditText proLocWorn = (EditText) findViewById(R.id.proLocWorn);
        EditText proInfo = (EditText) findViewById(R.id.proInfo);
        EditText proWeight =(EditText) findViewById(R.id.proWeight);

        pros++;
        proAdder += proName.getText() + "|";
        proAdder += proAC.getText() + "|";
        proAdder += String.valueOf(proPenalty.isChecked()) + "|";
        proAdder += proLocWorn.getText() + "|";
        proAdder += proInfo.getText() + "|";
        proAdder += proWeight.getText() + "|";

        proName.getText().clear();
        proAC.getText().clear();
        proPenalty.toggle();
        proLocWorn.getText().clear();
        proInfo.getText().clear();
        proWeight.getText().clear();

    }

    protected void addItem()
    {
        EditText itemName = (EditText) findViewById(R.id.name);
        EditText itemWeight = (EditText) findViewById(R.id.weight);

        items++;
        itemAdder += itemName.getText() + "|";
        itemAdder += itemWeight.getText()+ "|";

        itemName.getText().clear();
        itemWeight.getText().clear();
    }

    public void next(View view)
    {
        //Intent intent = new Intent(this, .class);

        fileWriter += "ITEMS|";
        fileWriter += weapons + "|";
        fileWriter += weaponAdder;
        fileWriter += pros + "|";
        fileWriter += proAdder;
        fileWriter += items + "|";
        fileWriter += itemAdder;

       // intent.putExtra("fileWriter", fileWriter);
        //startActivity(intent);
    }

    public void back(View view)
    {
        Intent intent = new Intent(this, DD5E_Edit.class);

        fileWriter += "ITEMS|";
        fileWriter += weapons + "|";
        fileWriter += weaponAdder;
        fileWriter += pros + "|";
        fileWriter += proAdder;
        fileWriter += items + "|";
        fileWriter += itemAdder;

        intent.putExtra("fileWriter", fileWriter);
        startActivity(intent);
    }

    public void test(View view)
    {
        Intent intent = new Intent(this, TestDisplay.class);

        fileWriter += "ITEMS|";
        fileWriter += weapons + "|";
        fileWriter += weaponAdder;
        fileWriter += pros + "|";
        fileWriter += proAdder;
        fileWriter += items + "|";
        fileWriter += itemAdder;

        intent.putExtra("fileWriter", fileWriter);
        startActivity(intent);
    }
}
