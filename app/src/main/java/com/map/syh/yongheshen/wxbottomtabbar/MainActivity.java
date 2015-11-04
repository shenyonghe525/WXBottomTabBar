package com.map.syh.yongheshen.wxbottomtabbar;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;

public class MainActivity extends FragmentActivity
{

    WeiXinFragment weiXinFragment = new WeiXinFragment();

    AddressFragment address;

    FrdFragment find;

    SettingsFragment me;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews()
    {

        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, weiXinFragment).commit();
        RadioGroup myTabRg = (RadioGroup) findViewById(R.id.tab_menu);
        myTabRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                // TODO Auto-generated method stub
                switch (checkedId)
                {
                    case R.id.rbChat:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, weiXinFragment).commit();
                        break;
                    case R.id.rbAddress:
                        if (address == null)
                        {
                            address = new AddressFragment();
                        }
                        Log.i("MyFragment", "FragmentAddress");
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, address).commit();
                        break;
                    case R.id.rbFind:
                        find = new FrdFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, find)
                                .commit();
                        break;
                    case R.id.rbMe:
                        me = new SettingsFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, me)
                                .commit();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}


