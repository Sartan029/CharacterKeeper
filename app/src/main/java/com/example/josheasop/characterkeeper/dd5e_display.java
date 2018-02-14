package com.example.josheasop.characterkeeper;

import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

public class dd5e_display extends AppCompatActivity
{
    private static final String TAG = "MainActivity";
    private SectionPageAdapter mSectionsPageAdapter;

    String FileWriter;
    public static final String bundleKey = "character";
    character_dd5e character;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dd5e_display);
        Log.d(TAG, "onCreate: Starting");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPageAdapter = new SectionPageAdapter(getSupportFragmentManager());

        Intent intent = getIntent();
        FileWriter = intent.getStringExtra("fileWriter");
        character = new character_dd5e(FileWriter);

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setUpViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    public character_dd5e getCharacter()
    {
        return character;
    }

    public Boolean ifTrue(String val)
    {
        if(val.equals("true"))
        {return true;}
        else
        {return false;}
    }

    private  void setUpViewPager(ViewPager viewPager)
    {
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(createDD5e_char_info(), "Character Information");
        adapter.addFragment(createDD5e_combat_info(), "Combat Information");
        viewPager.setAdapter(adapter);
    }

    private Fragment createDD5e_char_info()
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable(bundleKey, character);

        dd5e_char_info_fragment frag = new dd5e_char_info_fragment();
        frag.setArguments(bundle);
        return frag;
    }

    private Fragment createDD5e_combat_info()
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable(bundleKey, character);

        dd5e_combat_info_fragment frag = new dd5e_combat_info_fragment();
        frag.setArguments(bundle);
        return frag;
    }

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
        else if(score.equals("25") || score.equals("27"))
        {mod = "8";}
        else if(score.equals("28") || score.equals("29"))
        {mod = "9";}
        else if(score.equals("30"))
        {mod = "10";}
        return mod;
    }


}
