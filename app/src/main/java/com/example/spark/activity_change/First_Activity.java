package com.example.spark.activity_change;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_Activity extends AppCompatActivity {

    Button button4;
    //Second_Activity second=new Second_Activity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_);

    button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten=new Intent(First_Activity.this,Second_Activity.class);
                startActivity(inten);
            }
        });
}
}
