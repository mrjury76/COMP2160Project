package com.example.project;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
//The ViewPager2 adapter is used to provide data to a ViewPager2 widget
// in Android. The ViewPager2 widget is a user interface component
// that allows users to swipe left or right to navigate between
// different fragments or views. The adapter is responsible for
// managing the data and creating the individual views that
// are displayed in the ViewPager2.

public class Menu_Adapter extends FragmentStateAdapter {
    public Menu_Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {

            case 0: {
                Calorie calorieFragment = new Calorie();
                return calorieFragment;
            }
            case 1: {
                Homepage homepageFragment = new Homepage();
                return homepageFragment;
            }
            case 2: {
                Calendar calendarFragment = new Calendar();
                return calendarFragment;
            }
            case 3: {
                List listFragment = new List();
                return listFragment;
            }

            default: {
                return null;
            }
        }
    }
    @Override
    public int getItemCount() {
        return 4;
    }
}

