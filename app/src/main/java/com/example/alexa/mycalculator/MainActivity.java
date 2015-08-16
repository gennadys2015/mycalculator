package com.example.alexa.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tv;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonCe;
    Button buttonPlus;
    Button buttonMin;
    Button buttonX;
    Button buttonEq;
    Button buttonSplit;

 //   int plus = 0;
    int i=0;
    int ii=0;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        buttonCe = (Button) findViewById(R.id.buttonCe);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMin = (Button) findViewById(R.id.buttonMin);
        buttonX = (Button) findViewById(R.id.buttonX);
        buttonSplit = (Button) findViewById(R.id.buttonSplit);
        buttonEq = (Button) findViewById(R.id.buttonEq);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        buttonCe.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonEq.setOnClickListener(this);
        buttonSplit.setOnClickListener(this);
        buttonX.setOnClickListener(this);
        buttonMin.setOnClickListener(this);


    }


 int num1;
  int num2;
   int endResult;

    public void displayNum(String num){

        if (i == 1){
            tv.setText("");
            i=0;
                    }
        else if (tv.getText()=="0"){
            tv.setText("");
        }
        tv.setText(tv.getText() + num);

    }


    @Override
    public void onClick(View v){
         if (v.getId() == R.id.button0){
             displayNum("0");
         }
        else if (v.getId() == R.id.button1) {
             displayNum("1");
         }
        if (v.getId() == R.id.button2){
            displayNum("2");
        }
        else if (v.getId() == R.id.button3) {
            displayNum("3");
            Log.i("click","3");
        }
        if (v.getId() == R.id.button4){
            displayNum("4");
        }
        else if (v.getId() == R.id.button5) {
            displayNum("5");
        }
        if (v.getId() == R.id.button6){
            displayNum("6");
        }
        else if (v.getId() == R.id.button7) {
            displayNum("7");
        }
        if (v.getId() == R.id.button8){
            displayNum("8");
        }
        else if (v.getId() == R.id.button9) {
            displayNum("9");
        }


        else if (v.getId() == R.id.buttonCe){
          tv.setText("0");
        }
         else if (v.getId() == R.id.buttonPlus) {
            displayNum("+");
         }
        else if (v.getId() == R.id.buttonX){
            displayNum("*");
        }
        else if (v.getId() == R.id.buttonMin) {
            displayNum("-");
        }
        else if (v.getId() == R.id.buttonSplit){
            displayNum("/");
        }
        else if (v.getId() == R.id.buttonEq) {

          result = tv.getText().toString();

          ii = result.indexOf("+");

         if (ii > 0) {
             num1 = Integer.parseInt(result.substring(0, ii ));
             num2 = Integer.parseInt(result.substring(ii + 1, result.length()));
             endResult = num1 + num2;
             tv.setText(tv.getText()+"="+endResult);
             i=i+1;
             if(endResult==20)
             {
                 Log.i("Sum","20");
             }
          }
      else {
             ii=result.indexOf("-");
             num1 = Integer.parseInt(result.substring(0, ii ));
             num2 = Integer.parseInt(result.substring(ii + 1, result.length()));
             endResult = num1 - num2;
             tv.setText(tv.getText()+"="+endResult);
             i=i+1;
          //  tv.setText("t1");
        }}

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



public void ImgChange (View view)
{
ImageButton iChange = (ImageButton)findViewById(R.id.imageView);
    iChange.setImageResource(R.drawable.cat);
    Log.i("IMG","change");
}
}
