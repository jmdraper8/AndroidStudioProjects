package com.example.jmdra.mysqliteapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {

    EditText johnsInput;
    TextView johnsText;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        johnsInput = (EditText) findViewById(R.id.johnsInput);
        johnsText = (TextView) findViewById(R.id.johnsText);

        dbHandler = new MyDBHandler(this, null, null, 1);

        printDatabase();

    }

    //Add a product to the database
    public void addButtonClicked(View view) {

        Products product = new Products(johnsInput.getText().toString());

        dbHandler.addProduct(product);
        printDatabase();
    }

    //delete items frm database
    public void deleteButtonClicked(View view) {
        String inputText = johnsInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }

    public void printDatabase() {
        String dbString = dbHandler.databaseToString();
        johnsText.setText(dbString);
        johnsInput.setText("");
    }


}
