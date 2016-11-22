package com.uniclass.sangji.uniclassandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ImplicitIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
    }

    protected void implicitCallOnClick(View v)
    {
        Intent intent = null;

        switch(v.getId())
        {
            case R.id.implicit_web:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                break;
            case R.id.implicit_call:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:(+82)01099030582"));
                break;
            case R.id.implicit_map:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.30,127.2?z=10"));
                break;
            case R.id.implicit_contact:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                break;
        }

        if(intent != null)
        {
            startActivity(intent);
        }
    }

}
