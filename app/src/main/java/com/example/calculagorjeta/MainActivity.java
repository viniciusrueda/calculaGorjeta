package com.example.calculagorjeta;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {


    private static final NumberFormat currencyFormat =
            NumberFormat.getCurrencyInstance();
    private static  final NumberFormat percentFormat =
            NumberFormat.getPercentInstance();

    private TextView amountTextView;
    private TextView percentTextView;
    private TextView tipTextView;
    private TextView totalTextView

    private double billAmount = 0.0;
    private double pecent = 0.15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amountTextView =
                findViewById(R.id.amountTextView);
        percentTextView =
                findViewById(R.id.percentTextView);
        tipTextView =
                findViewById(R.id.tipTextView);
        totalTextView =
                findViewById(R.id.totalTextView);

        EditText amountEditText =
                findViewById(R.id.amountEditText);

        SeekBar percentSeekBar =
                findViewById(R.id.percentSeekBar);

        amountEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




    }
}
