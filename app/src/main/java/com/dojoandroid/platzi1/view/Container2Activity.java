package com.dojoandroid.platzi1.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.dojoandroid.platzi1.MainActivity;
import com.dojoandroid.platzi1.R;
import com.dojoandroid.platzi1.view.fragments.HomeFragment;
import com.dojoandroid.platzi1.view.fragments.ProfileFragment;
import com.dojoandroid.platzi1.view.fragments.SeacrhFragment;

import it.sephiroth.android.library.bottomnavigation.BottomNavigation;
import it.sephiroth.android.library.bottomnavigation.BottomNavigationItem;

public class Container2Activity extends AppCompatActivity {
    private BottomNavigationView bottomAlvarez;

    private static final String TAG = MainActivity.class.getSimpleName();
    private BottomNavigationView bottomNavigation;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottombar);
//        bottomNavigation.inflateMenu(R.menu.menu_navigation);
        fragmentManager = getSupportFragmentManager();

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               /*  switch (item.getItemId()) {
                    case R.id.AlvHome:

                        HomeFragment home = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, home)
                                .setTransition(FragmentTransaction.TRANSIT_ENTER_MASK)
                                .addToBackStack(null).commit();

                        break;


                        break;
                }
*/
                int id = item.getItemId();
                switch (id) {
                    case R.id.AlvHome:
                        fragment = new HomeFragment();
                        break;
                    case R.id.AlvSearch:
                        fragment = new SeacrhFragment();
                        break;
                    case R.id.AlvPerson:
                        fragment = new ProfileFragment();
                        break;
                }
                    final FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.replace(R.id.container, fragment).commit();

                return false;
                }
            });
        }

    }