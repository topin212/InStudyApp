package com.example.teacher.instudy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by teacher on 24.05.2017.
 */

public class FragmentAdaptor extends FragmentPagerAdapter {








    public final static int pageSchedule=0; // Курносова

    public final static int pageTask=1; // Брустинов Черешовец

    public final static int pageStudentStatistic=2; // Любенко

    public final static int pageTaskStatistic=3; // Харчишин


    public FragmentAdaptor(FragmentManager mgr) {
        super(mgr);
    }



    @Override
    public int getCount()
    {
        return (0);
    }

    @Override
    public Fragment getItem(int position) {

        /*
        case position => fragment
        * */

        return null;
    }
}