package com.andrewbas.oxiwyletest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import static androidx.core.os.LocaleListCompat.create;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CustomButton btnMenu1;
    CustomButton btnShop2;
    CustomButton btnPause3;
    CustomButton btnNormal4;
    CustomButton btnAccelerated5;

    boolean btnMenuIsClicked = false;
    boolean btnShopIsClicked = false;
    boolean btnPauseIsClicked = false;
    boolean btnNormalIsClicked = false;
    boolean btnAcceleratedIsClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu1 = findViewById(R.id.btnMenu1);
        btnMenu1.setOnClickListener(this);

        btnShop2 = findViewById(R.id.btnShop2);
        btnShop2.setOnClickListener(this);

        btnPause3 = findViewById(R.id.btnPause3);
        btnPause3.setOnClickListener(this);

        btnNormal4 = findViewById(R.id.btnNormal4);
        btnNormal4.setOnClickListener(this);

        btnAccelerated5 = findViewById(R.id.btnAccelerated5);
        btnAccelerated5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setPositiveButton(R.string.dialog_ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    if(id == Dialog.BUTTON_POSITIVE){
                    dialog.cancel();
                }
            }
        });
            builder.setNegativeButton(R.string.dialog_back, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if(which == Dialog.BUTTON_NEGATIVE){
                        dialog.cancel();
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Можно было бы отменить нажатие кнопки, но этого не было явно указанно в задании", Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            });

        AlertDialog dialog = builder.create();
        dialog.setTitle(R.string.dialog_title);

        switch (v.getId()){
            case R.id.btnMenu1 :

                if(btnMenuIsClicked){
                   btnMenu1.setBackground(getDrawable(R.drawable.tb_ic_menu));
                   btnMenuIsClicked = false;
                }else {
                    btnMenu1.setBackground(getDrawable(R.drawable.tb_ic_menu_clicked));
                    btnMenuIsClicked = true;
                }
                dialog.setMessage(getString(R.string.strMenu1));
                dialog.show();
                break;

            case R.id.btnShop2 :

                if(btnShopIsClicked){
                   btnShop2.setBackground(getDrawable(R.drawable.tb_ic_shop));
                   btnShopIsClicked = false;
                }else {
                    btnShop2.setBackground(getDrawable(R.drawable.tb_ic_shop_clicked));
                    btnShopIsClicked = true;
                }
                dialog.setMessage(getString(R.string.strShop2));
                dialog.show();
                break;

            case R.id.btnPause3 :

                if(btnPauseIsClicked){
                   btnPause3.setBackground(getDrawable(R.drawable.tb_ic_pause));
                   btnPauseIsClicked = false;
                }else {
                    btnPause3.setBackground(getDrawable(R.drawable.tb_ic_pause_clicked));
                    btnPauseIsClicked = true;
                }
                dialog.setMessage(getString(R.string.strPause3));
                dialog.show();
                break;

            case R.id.btnNormal4 :

                if(btnNormalIsClicked){
                   btnNormal4.setBackground(getDrawable(R.drawable.tb_ic_normal));
                   btnNormalIsClicked = false;
                }else {
                    btnNormal4.setBackground(getDrawable(R.drawable.tb_ic_normal_clicked));
                    btnNormalIsClicked = true;
                }
                dialog.setMessage(getString(R.string.strNormal4));
                dialog.show();
                break;

            case R.id.btnAccelerated5 :

                if(btnAcceleratedIsClicked){
                   btnAccelerated5.setBackground(getDrawable(R.drawable.tb_ic_accelerated));
                   btnAcceleratedIsClicked = false;
                }else {
                    btnAccelerated5.setBackground(getDrawable(R.drawable.tb_ic_accelerated_clicked));
                    btnAcceleratedIsClicked = true;
                }
                dialog.setMessage(getString(R.string.strAccelerated5));
                dialog.show();
                break;
        }
    }
}
