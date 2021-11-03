package com.example.basicview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_basic_property);

        Button okbtn = findViewById(R.id.okbtn);
        okbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "확인버튼클릭됬음",Toast.LENGTH_LONG).show();
            }
        });

    }
    public void mycancleMethod (View v) {
        Log.d("view","취소버튼이 클릭됬음");}

    public void mystopMethod (View v) {
        Log.d("view","중지버튼이 클릭됬음");}
}