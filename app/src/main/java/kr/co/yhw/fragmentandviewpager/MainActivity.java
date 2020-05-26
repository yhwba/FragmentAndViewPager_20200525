package kr.co.yhw.fragmentandviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.yhw.fragmentandviewpager.adapters.MyViewPagerAdapter;
import kr.co.yhw.fragmentandviewpager.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;
    MyViewPagerAdapter mvpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView( this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        mvpa = new MyViewPagerAdapter(getSupportFragmentManager());
        binding.myViewPager.setAdapter(mvpa);

        binding.myTabLayout.setupWithViewPager(binding.myViewPager);
    }
}
