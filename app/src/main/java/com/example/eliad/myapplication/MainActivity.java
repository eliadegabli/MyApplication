package com.example.eliad.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMyAge(View view){
        EditText edit =  (EditText) findViewById(R.id.editText);
        if(edit.getText().toString().isEmpty()){
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context,
                    "Write your age!!!!",
                    Toast.LENGTH_SHORT);
            toast.show();
        }else {
            if(!isInteger(edit.getText().toString())){
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context,
                        "Put a Integer number",
                        Toast.LENGTH_SHORT);
                toast.show();
            }else {
                int theAge = Integer.parseInt(edit.getText().toString());
                if (theAge < 0) {
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context,
                            "Minus number is not age!",
                            Toast.LENGTH_SHORT);
                    toast.show();
                } else if (theAge < 18) {
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context,
                            "Child!",
                            Toast.LENGTH_SHORT);
                    toast.show();
                } else if (theAge < 120) {
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context,
                            "Adult!",
                            Toast.LENGTH_SHORT);
                    toast.show();
                } else if (theAge > 120) {
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context,
                            "You Win!",
                            Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
    }
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
