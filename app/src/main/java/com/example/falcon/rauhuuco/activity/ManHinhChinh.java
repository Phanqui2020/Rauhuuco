package com.example.falcon.rauhuuco.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.falcon.rauhuuco.R;
import com.example.falcon.rauhuuco.model.SanPham;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by falcon on 17/10/2017.
 */

public class ManHinhChinh extends AppCompatActivity{

    Toolbar tbMain;
    DrawerLayout dlMain;
    ViewFlipper vfDiscount;
    RecyclerView rvProduct;
    NavigationView nvMain;
    ArrayList<SanPham>dsSanPham;
  //  SanPhamAdapter spAdapter;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh);

        addControls();
        addEvents();

      /*  ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(
                this, dlMain, tbMain , R.string.navigation_drawer_open , R.string.navigation_drawer_close);
        dlMain.setDrawerListener(toogle);
        toogle.syncState();*/

        actionBar();
        actionViewFlipper();

    }

    private void actionViewFlipper() {
        ArrayList<Integer> Khuyenmai = new ArrayList<>();
        Khuyenmai.add(R.drawable.login);
        Khuyenmai.add(R.drawable.main);
        Khuyenmai.add(R.drawable.logo);
        for (int i =0; i < Khuyenmai.size(); i++){
            ImageView img = new ImageView(getApplicationContext());
            Picasso.with(getApplicationContext()).load(Khuyenmai.get(i)).into(img);
            img.setScaleType(ImageView.ScaleType.FIT_XY);
            vfDiscount.addView(img);
        }
        vfDiscount.setFlipInterval(5000);
        vfDiscount.setAutoStart(true);
        Animation anim_siR = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        Animation anim_soR = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_out_right);
        vfDiscount.setInAnimation(anim_siR);
        vfDiscount.setOutAnimation(anim_soR);


    }

    private void actionBar() {
        setSupportActionBar(tbMain);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tbMain.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        tbMain.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlMain.openDrawer(GravityCompat.START);
            }
        });

    }

    private void addControls() {
        tbMain = (Toolbar) findViewById(R.id.tbMain);
        dlMain = (DrawerLayout) findViewById(R.id.dlMain);
        vfDiscount = (ViewFlipper) findViewById(R.id.vfDiscount);
        nvMain = (NavigationView) findViewById(R.id.nvMain);
        rvProduct = (RecyclerView) findViewById(R.id.rvProduct);

        ArrayList<SanPham> dsSanPham = new ArrayList<>();
        dsSanPham.add(new SanPham("củ cải", 10000, R.drawable.login));
        dsSanPham.add(new SanPham("củ cải", 10000, R.drawable.noimg));
        dsSanPham.add(new SanPham("củ cải", 10000, R.drawable.logo));

     //   rvProduct.setAdapter(new SanPhamAdapter(this,dsSanPham));

    }

    private void addEvents() {




    }
}
