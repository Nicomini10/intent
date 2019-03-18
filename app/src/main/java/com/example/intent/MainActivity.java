package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    static TextView intent;
    private Button ciao;
    private EditText txtIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ciao = (Button)findViewById(R.id.button);
        txtIn = (EditText)findViewById(R.id.editText);


        ciao.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String uri = txtIn.getText().toString();
                Toast.makeText(MainActivity.this, "Starting" + uri, Toast.LENGTH_SHORT).show();

                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                    startActivity(intent);
                }catch (Exception e){

                    Toast.makeText(MainActivity.this, "Error:" + e, Toast.LENGTH_SHORT);

                }



            }
        });




    }
}
