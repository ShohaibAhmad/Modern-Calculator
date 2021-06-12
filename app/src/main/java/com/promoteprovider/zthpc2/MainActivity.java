package com.promoteprovider.zthpc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.promoteprovider.zthpc.R;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphImageView;

public class MainActivity extends AppCompatActivity {
    NeumorphButton btnAc,btnParsent,btnDevide,btn_7,btn_8,btn_9,btn_4,btn_5,btn_6,
            btn_3,btn_2,btn_1,btnMulti,btnMinus,btnPlus,btnEqual,btnDot,btn_0;
    TextView btnInput,btnOutput;
    NeumorphImageView btnClear;

    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInput = findViewById(R.id.btnInput);
        btnOutput = findViewById(R.id.btnOutput);

        btnAc = findViewById(R.id.btnAc);
        btnClear = findViewById(R.id.btnClear);
        btnParsent = findViewById(R.id.btnParsent);
        btnDevide = findViewById(R.id.btnDevide);
        btnMulti = findViewById(R.id.btnMulti);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnEqual = findViewById(R.id.btnEqual);
        btnDot = findViewById(R.id.btnDot);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);


        //click
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                btnInput.setText(data + "0");
            }
        });


        //click
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                btnInput.setText(data + "1");
            }
        });

        //click
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                btnInput.setText(data + "2");
            }
        });

        //click
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                btnInput.setText(data + "3");
            }
        });


        //click
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                btnInput.setText(data + "4");
            }
        });

        //click
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                btnInput.setText(data + "5");
            }
        });


        //click
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                btnInput.setText(data + "6");
            }
        });


        //click
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                btnInput.setText(data + "7");
            }
        });

        //click
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                btnInput.setText(data + "8");
            }
        });

        //click
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                btnInput.setText(data + "9");
            }
        });


        //click
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnInput.setText("");
                btnOutput.setText("");
            }
        });

        //click
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = btnInput.getText().toString();
                btnInput.setText(data + ".");
            }
        });

        //click
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = btnInput.getText().toString();
                btnInput.setText(data + " + ");
            }
        });

        //click
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = btnInput.getText().toString();
                btnInput.setText(data + " - ");
            }
        });

        //click
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = btnInput.getText().toString();
                btnInput.setText(data + " x ");
            }
        });

        //click
        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = btnInput.getText().toString();
                btnInput.setText(data + " / ");
            }
        });

        //click
        btnParsent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = btnInput.getText().toString();
                btnInput.setText(data + " % ");
            }
        }); 
        
        //click
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = btnInput.getText().toString();
                data = data.replaceAll("x","*");
                data = data.replaceAll("/","/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String finalResult = "";
                Scriptable scriptable = rhino.initStandardObjects();
                finalResult = rhino.evaluateString(scriptable,data,
                        "javascript",1,null).toString();
                btnOutput.setText(finalResult);

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String backSpace=null;
                if (btnInput.getText().length()>0){
                    StringBuilder stringBuilder = new StringBuilder(btnInput.getText());
                    stringBuilder.deleteCharAt(btnInput.getText().length()-1);
                    backSpace = stringBuilder.toString();
                    btnInput.setText(backSpace);
                }
            }
        });




    }
}