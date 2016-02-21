package au.com.johndraper.www.gestures;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.widget.Button;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {

    private TextView johnsMessage;
    private GestureDetectorCompat gestureDetector;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button johnsButton = (Button)findViewById(R.id.johnsButton);

        johnsMessage = (TextView)findViewById(R.id.johnsMessage);
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);

        johnsButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView johnMessage = (TextView)findViewById(R.id.johnsMessage);
                        johnMessage.setText("Single Button Click!");
                    }
                }
        );

        johnsButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView johnsMessage = (TextView)findViewById(R.id.johnsMessage);
                        johnsMessage.setText("Long Button Click!!");
                        return true;
                    }
                }
        );



    }



    //Start Gestures
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        johnsMessage.setText("Single Tap - Confirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        johnsMessage.setText("Double Tap - Confirmed");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        johnsMessage.setText("Double Tap Event - Confirmed");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        johnsMessage.setText("Scroll Down - Confirmed");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        johnsMessage.setText("Show Press - Confirmed");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        johnsMessage.setText("Single Tap Up - Confirmed");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        johnsMessage.setText("Scroll - Confirmed");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        johnsMessage.setText("Long Press - Confirmed");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        johnsMessage.setText("Fling - Confirmed");
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    //End Gestures


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
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
