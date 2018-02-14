package com.example.josheasop.characterkeeper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class dd5e_combat_info_fragment extends Fragment
{
    private static final String TAG = "Character Information";
    public static final String bundleKey = "character";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.char_combat_info_fragment_dd5e, container, false);

        return view;
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Bundle bundle = getArguments();

        character_dd5e character = (character_dd5e) bundle.getSerializable(bundleKey);

        Log.e(TAG, String.format("combat_info_fragment : %s", character.getCharSave()));

        TextView ac = (TextView) getView().findViewById(R.id.ac);
        ac.setText(getResources().getString(R.string.acPrint) + " " + calculateAC(character));
        TextView hp = (TextView) getView().findViewById(R.id.maxHP);
        hp.setText(getResources().getString(R.string.maxHP) + " " + character.getHP());
        TextView curHP = (TextView) getView().findViewById(R.id.currentHP);
        curHP.setText(getResources().getString(R.string.currentHP) + " " + character.getCurrentHP());
        TextView strSave = (TextView) getView().findViewById(R.id.strSave);
        strSave.setText(getResources().getString(R.string.strPrint) + " " + character.getstrSave());
        TextView dexSave = (TextView) getView().findViewById(R.id.dexSave);
        dexSave.setText(getResources().getString(R.string.dexPrint) + " " + character.getdexSave());
        Log.e(TAG, character.getdexSave());
        TextView conSave = (TextView) getView().findViewById(R.id.conSave);
        conSave.setText(getResources().getString(R.string.conPrint) + " " + character.getconSave());
        TextView intSave = (TextView) getView().findViewById(R.id.intSave);
        intSave.setText(getResources().getString(R.string.intePrint) + " " + character.getintSave());
        TextView wisSave = (TextView) getView().findViewById(R.id.wisSave);
        wisSave.setText(getResources().getString(R.string.wisPrint) + " " + character.getwisSave());
        TextView chaSave = (TextView) getView().findViewById(R.id.chaSave);
        chaSave.setText(getResources().getString(R.string.chaPrint) + " " + character.getchaSave());
    }

    String calculateAC(character_dd5e character)
    {
        int ac = 10;
        int maxDex = 10;
        protectiveItem_dd5e[] pros = character.getProtectiveItems();

        try {
            int z = pros.length;
            for(int lcv = 0; lcv < z; lcv++)
            {
                protectiveItem_dd5e pro = pros[lcv];
                ac += Integer.parseInt(pro.getProAc());
            }
        }
        catch(Exception e){}

        ac += Integer.parseInt(character.getDexM());

        return Integer.toString(ac);
    }
}
