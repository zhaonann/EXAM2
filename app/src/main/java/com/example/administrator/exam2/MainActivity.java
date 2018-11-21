package com.example.administrator.exam2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView labelView;
    private Button set_btn;
    public static final int SUBACTIVITY=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        labelView=(TextView)findViewById(R.id.text01);
        set_btn=(Button)findViewById(R.id.set_btn);

        set_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SubActivity.class);
                startActivityForResult(intent,SUBACTIVITY);
            }
        });
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case SUBACTIVITY:
                if(resultCode==RESULT_OK){
                    Uri uriData = data.getData();

                    labelView.setText(uriData.toString());
//                    Intent intentService=new Intent(MainActivity.this,MyService.class);
//                    startService(intentService);


                }
                break;
        }
    }

}
