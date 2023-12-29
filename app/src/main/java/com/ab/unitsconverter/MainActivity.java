package com.ab.unitsconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import converter.BaseConverter;
import converter.Longitud;
import converter.Volumen;

public class MainActivity extends AppCompatActivity {
    BaseConverter baseConverter;
    Longitud longitud = new Longitud();
    Volumen volumen = new Volumen();
    String[] convertUnits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag","Holaaa mudno");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTextEditListener();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d("tag","Holaaa mudno");
        System.out.println("holaaaaa");
        int id = item.getItemId();
        TextView unitTitle = findViewById(R.id.unitTitle);
        if(id == R.id.longitud){
            baseConverter = longitud;
            unitTitle.setText("Longitud");
        } else if (id == R.id.volumen) {
            baseConverter = volumen;
            unitTitle.setText("Volumen");
        } else {
            return true;
        }
        Button inputUnit = findViewById(R.id.inputUnit);
        Button outputUnit = findViewById(R.id.outputUnit);
        convertUnits = baseConverter.getConvertUnits();
        inputUnit.setText(convertUnits[0]);
        outputUnit.setText(convertUnits[1]);
        return true;
    }

    private void setTextEditListener(){
        EditText text = (EditText) findViewById(R.id.inputValue);

        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = String.valueOf(s);
                Log.d("","onTextChanged: "+text);

            }

            @Override
            public void afterTextChanged(Editable s) {
                String text = s.toString();
                Float input = Float.parseFloat(text);
                Button inputUnit = findViewById(R.id.inputUnit);
                Button outputUnit = findViewById(R.id.outputUnit);

                Float output = baseConverter.convert(
                        inputUnit.getText().toString(),
                        outputUnit.getText().toString(),
                        input);
               TextView outputValue = findViewById(R.id.outputValue);
               outputValue.setText(output.toString());
            }
        });
    }

    public void openDialog(){

    }

}