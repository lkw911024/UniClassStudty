package com.uniclass.sangji.uniclassandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickedBtn01(View v)
    {
        Toast.makeText(getApplicationContext(),"전화 연결하기 버튼 클릭", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-9903-0582"));
        startActivity(intent);
    }

    public void onClickedBtn02(View v)
    {
        Toast.makeText(getApplicationContext(),"화면 넘어가기 버튼 클릭", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(),CalculatorActivity.class);
        // Intent : XML에서 정의한 태그의 id를 이용하여 코드에서 객체를 참조한다.
        // intet 객체는 어떤 기능을 실행할 지를 지정하기 위해 사용한다.
        //intent를 생성하면서 넘어갈 Activity를 넣어준다.
        startActivity(intent);
    }

}
