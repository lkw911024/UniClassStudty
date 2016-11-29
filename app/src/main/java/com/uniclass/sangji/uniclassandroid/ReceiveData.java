package com.uniclass.sangji.uniclassandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ReceiveData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_data);

        ImageView imageView = (ImageView) findViewById(R.id.receiveImageView01);
        TextView textView = (TextView) findViewById(R.id.receiveTextView01);

        Intent intent = getIntent();

        String action = intent.getAction();
        String type = intent.getType();

        if(action.equals(Intent.ACTION_SEND))
        {
            if(type.startsWith("text/"))
            {
                imageView.setVisibility(View.GONE);
                String text = intent.getStringExtra(Intent.EXTRA_TEXT);

                if(text != null)
                {
                    textView.setText(text);
                }
            }
            else if(type.startsWith("image/")) {
                textView.setVisibility(View.GONE);
                Uri uri = (Uri) intent.getParcelableExtra(Intent.EXTRA_STREAM);

                if (uri != null) {
                    imageView.setImageURI(uri);

                }
            }
        }
        else if(action.equals(Intent.ACTION_MAIN))
        {
            Toast.makeText(this, "이건 뭐죠?", Toast.LENGTH_SHORT).show();
        }
    }
}
