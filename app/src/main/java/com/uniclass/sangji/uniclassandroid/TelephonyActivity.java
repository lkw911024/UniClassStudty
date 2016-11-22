package com.uniclass.sangji.uniclassandroid;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import android.widget.Toast;

public class TelephonyActivity extends AppCompatActivity {

    private TelephonyManager manager;
    PhoneStateListener listener = new PhoneStateListener(){
        public void onCallStateChanged(int state, String incomingNumber)
        {
            Toast.makeText(TelephonyActivity.this, "상태 : " + state + "전화번호 : " + incomingNumber, Toast.LENGTH_SHORT).show();
        }
        public void onDataActivity(int direction)
        {
            Toast.makeText(TelephonyActivity.this, "방향 : " + direction, Toast.LENGTH_SHORT).show();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telephony);

        manager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        String s = "상태 : " + manager.getCallState() + "\n전화번호 : " +
                manager.getLine1Number() + "\n데이터 상태 : " + manager.getDataState() +
                "\n장치 아이디 : " + manager.getDeviceId() + "\n네트워크 타입" + manager.getNetworkType() +
                "\n전화기 타입 : " + manager.getPhoneType() + "\n로밍 여부 : " + manager.isNetworkRoaming();
        TextView tv = (TextView) findViewById(R.id.telephony_tv01);
        tv.setText(s);

        manager.listen(listener, PhoneStateListener.LISTEN_CALL_STATE | PhoneStateListener.LISTEN_DATA_ACTIVITY);
    }

    public void onDestroy()
    {
        super.onDestroy();
        manager.listen(listener, PhoneStateListener.LISTEN_NONE);
    }
}

