package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers= (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
            }
        });

        TextView colors= (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i);
            }
        });


        TextView family= (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(i);
            }
        });

    }

   /* public void openFamilyList(View view)
    {
        Intent i = new Intent(this, FamilyMembersActivity.class);
        startActivity(i);
    }
    public void openColorsList(View view)
    {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }
    public void openPhrasesList(View view)
    {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }*/
}
