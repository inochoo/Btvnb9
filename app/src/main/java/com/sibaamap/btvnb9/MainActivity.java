package com.sibaamap.btvnb9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    MyReceiver myReceiver = new MyReceiver();
    EditText edt_name,edt_address,edt_phone;
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(getColor(R.color.yellow));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);


        edt_name = findViewById(R.id.edt_name);
        edt_address = findViewById(R.id.edt_address);
        edt_phone = findViewById(R.id.edt_phone);
        btn_send = findViewById(R.id.btn_send);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueName = edt_name.getText().toString();
                String valueAdd = edt_address.getText().toString();
                String valuePhone = edt_phone.getText().toString();

                Intent intent = new Intent();
                intent.setAction("test");
                intent.putExtra("valueName",valueName);
                intent.putExtra("valueAdd",valueAdd);
                intent.putExtra("valuePhone",valuePhone);

                sendBroadcast(intent);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}