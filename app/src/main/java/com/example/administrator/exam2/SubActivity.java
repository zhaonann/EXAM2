package com.example.administrator.exam2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {
    EditText input;
    Button setFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity);
        input=(EditText)findViewById(R.id.edit01);
        setFinish=(Button)findViewById(R.id.set_finish);

        setFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String uriString = input.getText().toString();
                Uri data = Uri.parse(uriString);

                Intent result = new Intent(null, data);

                setResult(RESULT_OK, result);
                finish();
            }
        });
    }
}
