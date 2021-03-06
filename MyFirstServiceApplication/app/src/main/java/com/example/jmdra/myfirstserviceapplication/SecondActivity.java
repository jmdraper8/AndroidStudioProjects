package com.example.jmdra.myfirstserviceapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle mainData = getIntent().getExtras();

        if(mainData == null) {
            return;
        }

        String mainMessage = mainData.getString("mainMessage");
        final TextView secondTextView = (TextView) findViewById(R.id.secondTextView);
        secondTextView.setText(mainMessage);

    }

    public void onClick(View view) {
        Intent i = new Intent(this, MainActivity.class);

        final EditText secondEditText = (EditText) findViewById(R.id.secondEditText);
        String userMessage = secondEditText.getText().toString();
        i.putExtra("mainMessage", userMessage);

        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
