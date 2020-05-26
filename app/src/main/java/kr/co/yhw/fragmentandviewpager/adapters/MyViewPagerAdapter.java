package kr.co.yhw.fragmentandviewpager.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import kr.co.yhw.fragmentandviewpager.Fragment.FirstFragment;
import kr.co.yhw.fragmentandviewpager.Fragment.SecondFragment;
import kr.co.yhw.fragmentandviewpager.Fragment.ThirdFragment;

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    public MyViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position ==0){
            return "첫번째";
        }
        else if(position ==1){
            return "두번째";
        }
        else {
            return "세번째";
        }

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position ==0){
            return new FirstFragment();
        }
        else if (position ==1 ){
            return new SecondFragment();
        }
        else {
            return new ThirdFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
