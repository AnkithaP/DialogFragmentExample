package com.aryaan.ankitha.dialogfragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view){
        MyAlertDialog myAlertDialog = new MyAlertDialog();
        myAlertDialog.show(getFragmentManager(),"My Alert Dialog");
    }
}
