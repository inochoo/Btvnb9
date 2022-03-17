package com.sibaamap.btvnb9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String valueName = intent.getStringExtra("valueName");//lấy dữ liệu để truyền
        String valueAdd = intent.getStringExtra("valueAdd");
        String valuePhone = intent.getStringExtra("valuePhone");
    }
}
