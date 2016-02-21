package com.example.jmdra.myfirstserviceapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this, MyService.class);
        startService(i);

        Intent intent = new Intent(this, MainIntentService.class);
        startService(intent);

        Bundle secondData = getIntent().getExtras();

        if(secondData == null) {
            return;
        }

        String secondMessage = secondData.getString("mainMessage");
        final TextView mainTextView = (TextView) findViewById(R.id.mainTextView);
        mainTextView.setText(secondMessage);

    }

    public void onClick(View view) {
        Intent i = new Intent(this, SecondActivity.class);

        final EditText mainEditText = (EditText) findViewById(R.id.mainEditText);
        String userMessage = mainEditText.getText().toString();
        i.putExtra("mainMessage", userMessage);

        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
