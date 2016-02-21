package com.example.jmdra.myboundservice;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.os.IBinder;
import android.content.Context;
import android.content.Intent;
import android.content.ComponentName;
import android.content.ServiceConnection;
import com.example.jmdra.myboundservice.MyService.MyLocalBinder;
import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {

    MyService johnsService;
    boolean isBound = false;

    public void showTime(View view){
        String currentTime = johnsService.getCurrentTime();
        TextView johnsText = (TextView) findViewById(R.id.johnsText);
        johnsText.setText(currentTime);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding to the service
        Intent i = new Intent(this, MyService.class);
        bindService(i, johnsConnection, Context.BIND_AUTO_CREATE);

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

    private ServiceConnection johnsConnection = new ServiceConnection() {
        @Override
        //What happens when you connect to a service
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyLocalBinder binder = (MyLocalBinder) service;
            johnsService = binder.getService();
            isBound = true;

        }

        @Override
        //What happens when you disconnect to a service
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;

        }
    };
}
