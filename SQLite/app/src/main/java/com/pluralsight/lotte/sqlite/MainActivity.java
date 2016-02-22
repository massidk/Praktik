package com.pluralsight.lotte.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText lotteInput;
    TextView lotteText;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lotteInput =(EditText) findViewById(R.id.lotteInput);
        lotteText = (TextView) findViewById(R.id.lotteText);
        dbHandler = new MyDBHandler(this,null,null,1);

        printDatabase();
    }
    public void addButtonClicked(View view){
        Products product = new Products(lotteInput.getText().toString());
        dbHandler.addProduct(product);
        printDatabase();
    }
    public void deleteButtonClicked(View view){
        String inputText = lotteInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();

    }

    public void printDatabase() {
        String dbString = dbHandler.databaseToString();
        lotteText.setText(dbString);
        lotteInput.setText("");
    }


}
