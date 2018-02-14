package com.snownaul.hello;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("MyTag","만든다!");

        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        TextView txt=new TextView(this);
        txt.setText("그렁가부다222222");
        ll.addView(txt);




        Button btn=new Button(this);
        btn.setText("버튼1111111");
        ll.addView(btn);

        setContentView(ll);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b=(Button)view;
                String s=b.getText().toString();
                if(s.equals("버튼")) {
                    b.setText("눌라졌다아아아아아아아");
                }else{
                    b.setText("버튼");
                }
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("MyTag","시작했다!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyTag","Resume했다!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyTag","중지했다!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyTag","멈췄다!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyTag","종료했다!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MyTag","다시 시작되었다..");

    }


}
