package com.example.josheasop.characterkeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.josheasop.characterkeeper.R.color.black;

public class dd5e_equipment extends AppCompatActivity
{
    int id = 0;
    String fileWriter = "";
    int weapons = 0;
    String weaponAdder = "";
    int pros = 0;
    String proAdder = "";
    int items = 0;
    String itemAdder = "";
    int weaponPointer = 0;
    int proPointer = 0;
    int itemPointer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dd5e_equipment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        fileWriter = intent.getStringExtra("fileWriter");
        weaponPointer = R.id.addWeap;
        proPointer = R.id.addPro;
        itemPointer = R.id.addItem;

        Spinner dmgType = (Spinner) findViewById(R.id.dmgType);
        String[] items = new String[]{"Bludgeoning", "Piercing", "Slashing"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dmgType.setAdapter(adapter);
    }


    @SuppressWarnings("ResourceAsColor")
    protected void addWeap(View view)
    {
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.conLayout);

        EditText weapN = (EditText) findViewById(R.id.weapName);
        EditText weapAB = (EditText) findViewById(R.id.weapattbns);
        EditText weapDMG = (EditText) findViewById(R.id.weapDmg);
        EditText weapInfo = (EditText) findViewById(R.id.weapInfo);
        EditText weapweight = (EditText) findViewById(R.id.weapWeight);
        TextView proItem = (TextView) findViewById(R.id.proItem);
        TextView weapon = (TextView) findViewById(R.id.weapons);
        TextView weightPointer = (TextView) findViewById(R.id.weapweight);
        CheckBox ammo = (CheckBox) findViewById(R.id.ammo);
        EditText ammoType = (EditText) findViewById(R.id.ammoType);
        CheckBox finesse = (CheckBox) findViewById(R.id.finesse);
        CheckBox heavy = (CheckBox) findViewById(R.id.heavy);
        CheckBox light = (CheckBox) findViewById(R.id.light);
        CheckBox loading = (CheckBox) findViewById(R.id.loading);
        CheckBox range = (CheckBox) findViewById(R.id.range);
        EditText rangeInc = (EditText) findViewById(R.id.rangeInc);
        CheckBox reach = (CheckBox) findViewById(R.id.reach);
        CheckBox thrown = (CheckBox) findViewById(R.id.thrown);
        CheckBox twoHanded = (CheckBox) findViewById(R.id.twoHanded);
        CheckBox versatile = (CheckBox) findViewById(R.id.versatile);
        Spinner dmgType = (Spinner) findViewById(R.id.dmgType);

        String weapName = "";
        String weapAttBns = "";
        String weapdmg = "";
        String weapinfo = "";
        String weapW = "";
        String weapAmmo = "";
        String weapAmmoType = "";
        String weapFinesse = "";
        String weapHeavy = "";
        String weapLight = "";
        String weapLoading = "";
        String weapRange = "";
        String weapRangeInc = "";
        String weapReach = "";
        String weapThrown = "";
        String weapTwoHanded = "";
        String weapVersatile = "";
        String weapDMGType = "";

        weapName += weapN.getText();
        weapAttBns += weapAB.getText();
        weapdmg += weapDMG.getText();
        weapinfo += weapInfo.getText();
        weapW += weapweight.getText();
        weapAmmo += String.valueOf(ammo.isChecked());
        weapAmmoType += ammoType.getText();
        weapFinesse += String.valueOf(finesse.isChecked());
        weapHeavy += String.valueOf(heavy.isChecked());
        weapLight += String.valueOf(light.isChecked());
        weapLoading += String.valueOf(loading.isChecked());
        weapRange += String.valueOf(range.isChecked());
        weapRangeInc += rangeInc.getText();
        weapReach += String.valueOf(reach.isChecked());
        weapThrown += String.valueOf(thrown.isChecked());
        weapTwoHanded += String.valueOf(twoHanded.isChecked());
        weapVersatile += String.valueOf(versatile.isChecked());
        weapDMGType += dmgType.getSelectedItem().toString();

        weapons++;
        weaponAdder += weapName + "|";
        weaponAdder += weapAttBns + "|";
        weaponAdder += weapdmg + "|";
        weaponAdder += weapDMGType + "|";
        weaponAdder += weapinfo + "|";
        weaponAdder += weapW + "|";
        weaponAdder += weapAmmo + "|";
        weaponAdder += weapAmmoType + "|";
        weaponAdder += weapFinesse + "|";
        weaponAdder += weapHeavy + "|";
        weaponAdder += weapLight + "|";
        weaponAdder += weapLoading + "|";
        weaponAdder += weapRange + "|";
        weaponAdder += weapRangeInc + "|";
        weaponAdder += weapReach + "|";
        weaponAdder += weapThrown + "|";
        weaponAdder += weapTwoHanded + "|";
        weaponAdder += weapVersatile + "|";

        weapN.getText().clear();
        weapAB.getText().clear();
        weapDMG.getText().clear();
        weapInfo.getText().clear();
        weapweight.getText().clear();
        if(ammo.isChecked()) {ammo.toggle();}
        ammoType.setText(R.string.ammoType);
        if(finesse.isChecked()) {finesse.toggle();}
        if(heavy.isChecked())   {heavy.toggle();}
        if(light.isChecked())   {light.toggle();}
        if(loading.isChecked()) {loading.toggle();}
        if(range.isChecked())   {range.toggle();}
        if(reach.isChecked())   {reach.toggle();}
        if(thrown.isChecked())  {thrown.toggle();}
        if(twoHanded.isChecked())   {twoHanded.toggle();}
        if(versatile.isChecked())   {versatile.toggle();}
        dmgType.setGravity(1);

        TextView name = new TextView(this);
        params.topToBottom = weaponPointer;
        params.leftToLeft = R.id.parent;
        id++;
        name.setId(id);
        name.setText(R.string.namePrint);
        name.setTextColor(getResources().getColor(R.color.black));
        name.setLayoutParams(params);
        name.setPadding(8,8,0,0);
        constraintLayout.addView(name);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView weaponName = new TextView(this);
        params.baselineToBaseline = id;
        params.leftToRight = id;
        params.rightToRight = R.id.parent;
        weaponName.setText(weapName);
        weaponName.setLayoutParams(params);
        weaponName.setPadding(8,8,8,0);
        id++;
        weaponName.setId(id);
        weaponName.setTextColor(getResources().getColor(R.color.black));
        constraintLayout.addView(weaponName);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView attBns = new TextView(this);
        params.leftToLeft = R.id.parent;
        params.topToBottom = id;
        attBns.setText(R.string.attbnsPrint);
        id++;
        attBns.setId(id);
        attBns.setPadding(8,8,0,0);
        attBns.setTextColor(getResources().getColor(R.color.black));
        attBns.setLayoutParams(params);
        constraintLayout.addView(attBns);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView weaponAttBns = new TextView(this);
        params.leftToRight = id;
        params.baselineToBaseline = id;
        weaponAttBns.setText(weapAttBns);
        id++;
        weaponAttBns.setId(id);
        weaponAttBns.setPadding(8,8,0,0);
        weaponAttBns.setTextColor(getResources().getColor(R.color.black));
        weaponAttBns.setLayoutParams(params);
        constraintLayout.addView(weaponAttBns);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView weight = new TextView(this);
        params.leftToLeft = weightPointer.getId();
        params.rightToRight = weightPointer.getId();
        params.baselineToBaseline = id;
        id++;
        weight.setId(id);
        weight.setText(R.string.itemWeightPrint);
        weight.setTextColor(getResources().getColor(R.color.black));
        weight.setLayoutParams(params);
        constraintLayout.addView(weight);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView weapWeight = new TextView(this);
        params.leftToRight = weight.getId();
        params.baselineToBaseline = weight.getId();
        id++;
        weapWeight.setId(id);
        weapWeight.setText(weapW);
        weapWeight.setTextColor(getResources().getColor(R.color.black));
        weapWeight.setLayoutParams(params);
        constraintLayout.addView(weapWeight);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView damage = new TextView(this);
        params.leftToLeft = R.id.parent;
        params.topToBottom = attBns.getId();
        damage.setText(R.string.dmgPrint);
        id++;
        damage.setId(id);
        damage.setPadding(8,8,0,0);
        damage.setTextColor(getResources().getColor(R.color.black));
        damage.setLayoutParams(params);
        constraintLayout.addView(damage);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView weaponDamage = new TextView(this);
        params.leftToRight = id;
        params.baselineToBaseline = id;
        id++;
        weaponDamage.setId(id);
        weaponDamage.setText(weapdmg);
        weaponDamage.setPadding(8,8,0,0);
        weaponDamage.setTextColor(getResources().getColor(R.color.black));
        weaponDamage.setLayoutParams(params);
        constraintLayout.addView(weaponDamage);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView weaponDamageType = new TextView(this);
        params.leftToRight = id;
        params.baselineToBaseline = id;
        id++;
        weaponDamageType.setId(id);
        weaponDamageType.setText(weapDMGType);
        weaponDamageType.setPadding(8,8,0,0);
        weaponDamageType.setTextColor(getResources().getColor(R.color.black));
        weaponDamageType.setLayoutParams(params);
        constraintLayout.addView(weaponDamageType);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView information = new TextView(this);
        params.leftToLeft = R.id.parent;
        params.topToBottom = id;
        id++;
        information.setId(id);
        information.setText(R.string.infoPrint);
        information.setPadding(8,8,0,0);
        information.setTextColor(getResources().getColor(R.color.black));
        information.setLayoutParams(params);
        constraintLayout.addView(information);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView weaponInfo = new TextView(this);
        params.leftToRight = id;
        params.baselineToBaseline = id;
        id++;
        weaponInfo.setId(id);
        weaponInfo.setText(weapinfo);
        weaponInfo.setPadding(8,8,0,0);
        weaponInfo.setTextColor(getResources().getColor(R.color.black));
        weaponInfo.setLayoutParams(params);
        constraintLayout.addView(weaponInfo);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        CheckBox weaponAmmo = new CheckBox(this);
        params.leftToLeft = R.id.parent;
        params.topToBottom = id;
        id++;
        weaponAmmo.setText(R.string.ammo);
        weaponAmmo.setPadding(8,8,0,0);
        weaponAmmo.setId(id);
        weaponAmmo.setChecked(ammo.isChecked());
        weaponAmmo.setLayoutParams(params);
        constraintLayout.addView(weaponAmmo);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView weaponAmmoType = new TextView(this);
        params.leftToRight = id;
        params.baselineToBaseline = id;
        id++;
        weaponAmmoType.setText(weapAmmoType);
        weaponAmmoType.setTextColor(getResources().getColor(R.color.black));
        weaponAmmoType.setPadding(8,8,0,0);
        weaponAmmoType.setId(id);
        weaponAmmoType.setLayoutParams(params);
        constraintLayout.addView(weaponAmmoType);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);
        params.topToBottom = id;
        params.rightToRight = weapon.getId();
        params.leftToLeft = weapon.getId();
        proItem.setLayoutParams(params);
        weaponPointer = id;
    }

    protected void addPro(View view)
    {
        EditText proName = (EditText) findViewById(R.id.proName);
        EditText proAC = (EditText) findViewById(R.id.proAC);
        CheckBox proPenalty = (CheckBox) findViewById(R.id.proPenalty);
        EditText proLocWorn = (EditText) findViewById(R.id.proLocWorn);
        EditText proInfo = (EditText) findViewById(R.id.proInfo);
        EditText proWeight = (EditText) findViewById(R.id.proWeight);
        TextView proItem = (TextView) findViewById(R.id.proItem);
        TextView item = (TextView) findViewById(R.id.item);
        int penaltyPointer = proPenalty.getId();

        String proname = ""; proname += proName.getText();
        String proac = ""; proac += proAC.getText();
        String propenalty = ""; propenalty += String.valueOf(proPenalty.isChecked());
        String prolocworn = ""; prolocworn += proLocWorn.getText();
        String proinfo = ""; proinfo += proInfo.getText();
        String proweight = ""; proweight += proWeight.getText();

        pros++;
        proAdder += proname + "|";
        proAdder += proac + "|";
        proAdder += propenalty + "|";
        proAdder += prolocworn + "|";
        proAdder += proinfo + "|";
        proAdder += proweight + "|";

        proName.getText().clear();
        proAC.getText().clear();
        proLocWorn.getText().clear();
        proInfo.getText().clear();
        proWeight.getText().clear();
        if(proPenalty.isChecked())
        {
            proPenalty.toggle();
        }

        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.conLayout);

        TextView name = new TextView(this);
        params.topToBottom = proPointer;
        params.leftToLeft = R.id.parent;
        id++;
        name.setId(id);
        name.setText(R.string.namePrint);
        name.setTextColor(getResources().getColor(R.color.black));
        name.setLayoutParams(params);
        name.setPadding(8,8,0,0);
        constraintLayout.addView(name);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView Name = new TextView(this);
        params.baselineToBaseline = id;
        params.leftToRight = id;
        params.rightToRight = R.id.parent;
        Name.setText(proname);
        Name.setLayoutParams(params);
        Name.setPadding(8,8,8,0);
        id++;
        Name.setId(id);
        Name.setTextColor(getResources().getColor(R.color.black));
        constraintLayout.addView(Name);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView ac = new TextView(this);
        params.topToBottom = id;
        params.leftToLeft = R.id.parent;
        id++;
        ac.setId(id);
        ac.setText(R.string.acPrint);
        ac.setLayoutParams(params);
        ac.setPadding(8,8,0,0);
        ac.setTextColor(getResources().getColor(R.color.black));
        constraintLayout.addView(ac);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView proAc = new TextView(this);
        params.leftToRight = id;
        params.baselineToBaseline = id;
        id++;
        proAc.setId(id);
        proAc.setText(proac);
        proAc.setLayoutParams(params);
        proAc.setPadding(8,8,0,0);
        proAc.setTextColor(getResources().getColor(R.color.black));
        constraintLayout.addView(proAc);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        CheckBox proPen = new CheckBox(this);
        params.baselineToBaseline = id;
        params.leftToLeft = penaltyPointer;
        id++;
        proPen.setId(id);
        if(propenalty.equals("true"))
        {
            proPen.setChecked(true);
        }
        else
        {
            proPen.setChecked(false);
        }
        proPen.setText(R.string.penalty);
        proPen.setPadding(8,8,0,0);
        proPen.setLayoutParams(params);
        proPen.setTextColor(getResources().getColor(R.color.black));
        constraintLayout.addView(proPen);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView locworn = new TextView(this);
        params.topToBottom = id;
        params.leftToLeft = R.id.parent;
        id++;
        locworn.setId(id);
        locworn.setText(R.string.locWornPrint);
        locworn.setPadding(8,8,0,0);
        locworn.setLayoutParams(params);
        locworn.setTextColor(getResources().getColor(R.color.black));
        constraintLayout.addView(locworn);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView locWORN = new TextView(this);
        params.leftToRight = id;
        params.baselineToBaseline = id;
        id++;
        locWORN.setId(id);
        locWORN.setText(prolocworn);
        locWORN.setPadding(8,8,0,0);
        locWORN.setLayoutParams(params);
        locWORN.setTextColor(getResources().getColor(R.color.black));
        constraintLayout.addView(locWORN);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView weight = new TextView(this);
        params.leftToLeft = R.id.parent;
        params.topToBottom = id;
        id++;
        weight.setId(id);
        weight.setText(R.string.itemWeightPrint);
        weight.setTextColor(getResources().getColor(R.color.black));
        weight.setLayoutParams(params);
        constraintLayout.addView(weight);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView proW = new TextView(this);
        params.leftToRight = id;
        params.baselineToBaseline = id;
        id++;
        proW.setId(id);
        proW.setText(proweight);
        proW.setTextColor(getResources().getColor(R.color.black));
        proW.setLayoutParams(params);
        constraintLayout.addView(proW);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);
        proPointer = id;
        params.topToBottom = proPointer;
        params.rightToRight = proItem.getId();
        params.leftToLeft = proItem.getId();
        item.setLayoutParams(params);
    }

    protected void addItem(View view)
    {
        EditText itemName = (EditText) findViewById(R.id.name);
        EditText itemWeight = (EditText) findViewById(R.id.weight);
        EditText itemQuant = (EditText) findViewById(R.id.quantity);
        TextView funds = (TextView) findViewById(R.id.funds);
        int item = findViewById(R.id.item).getId();

        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.conLayout);

        String itemname = ""; itemname += itemName.getText();
        String itemweight = ""; itemweight += itemWeight.getText();
        String quant = ""; quant += itemQuant.getText();

        items++;
        itemAdder += itemname + "|";
        itemAdder += itemweight + "|";
        itemAdder += itemQuant + "|";

        itemName.getText().clear();
        itemWeight.getText().clear();
        itemQuant.getText().clear();

        TextView name = new TextView(this);
        params.topToBottom = itemPointer;
        params.rightToRight = R.id.parent;
        id++;
        name.setId(id);
        name.setText(R.string.namePrint);
        name.setTextColor(getResources().getColor(R.color.black));
        name.setLayoutParams(params);
        name.setPadding(8,8,0,0);
        constraintLayout.addView(name);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView Name = new TextView(this);
        params.baselineToBaseline = id;
        params.leftToRight = id;
        params.rightToRight = R.id.parent;
        Name.setText(itemname);
        Name.setLayoutParams(params);
        Name.setPadding(8,8,8,0);
        id++;
        Name.setId(id);
        Name.setTextColor(getResources().getColor(R.color.black));
        constraintLayout.addView(Name);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView weight = new TextView(this);
        params.topToBottom = id;
        params.rightToRight = R.id.parent;
        weight.setText(R.string.itemWeightPrint);
        weight.setLayoutParams(params);
        weight.setPadding(8,8,0,0);
        id++;
        weight.setId(id);
        weight.setTextColor(getResources().getColor(R.color.black));
        constraintLayout.addView(weight);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView itemW = new TextView(this);
        params.baselineToBaseline = id;
        params.leftToRight = id;
        itemW.setText(itemweight);
        itemW.setLayoutParams(params);
        itemW.setPadding(8,8,0,0);
        id++;
        itemW.setId(id);
        itemW.setTextColor(getResources().getColor(R.color.black));
        constraintLayout.addView(itemW);

        params = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);
        itemPointer = id;
        params.topToBottom = itemPointer;
        params.rightToRight = item;
        params.leftToLeft = item;
        funds.setLayoutParams(params);
    }

    public void next(View view)
    {
       // Intent intent = new Intent(this, dd5e_Equipment.class);

        fileWriter += "ITEMS|";
        fileWriter += weapons + "|";
        fileWriter += weaponAdder;
        fileWriter += pros + "|";
        fileWriter += proAdder;
        fileWriter += items + "|";
        fileWriter += itemAdder;

        //intent.putExtra("fileWriter", fileWriter);
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
        Intent intent = new Intent(this, dd5e_display.class);

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
