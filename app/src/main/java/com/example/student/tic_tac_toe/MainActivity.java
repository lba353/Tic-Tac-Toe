package com.example.student.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView view1, view2, view3, view4, view5, view6, view7, view8, view9;

    private int state1, state2, state3, state4, state5, state6, state7, state8, state9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the views
        view1 = (TextView) findViewById(R.id.button1);
        view2 = (TextView) findViewById(R.id.button2);
        view3 = (TextView) findViewById(R.id.button3);
        view4 = (TextView) findViewById(R.id.button4);
        view5 = (TextView) findViewById(R.id.button5);
        view6 = (TextView) findViewById(R.id.button6);
        view7 = (TextView) findViewById(R.id.button7);
        view8 = (TextView) findViewById(R.id.button8);
        view9 = (TextView) findViewById(R.id.button9);
        
        //Initializing the states (Starting w/ negative to make sure that I will never get a 3 in a row upon opening it)
        state1 = -1;
        state2 = -2;
        state3 = -3;
        state4 = -4;
        state5 = -5;
        state6 = -6;
        state7 = -7;
        state8 = -8;
        state9 = -9;
    }
    
    public void click1(View view) {
        if(state1 == 1) {
            view1.setText("O");
            state1 = 2;
        }
        else {
            view1.setText("X");
            state1 = 1;
        }
        
        check3InRow();
    }

    public void click2(View view) {
        if(state2 == 1) {
            view2.setText("O");
            state2 = 2;
        }
        else {
            view2.setText("X");
            state2 = 1;
        }

        check3InRow();
    }
    
    public void click3(View view) {
        if(state3 == 1) {
            view3.setText("O");
            state3 = 2;
        }
        else {
            view3.setText("X");
            state3 = 1;
        }

        check3InRow();
    }

    public void click4(View view) {
        if(state4 == 1) {
            view4.setText("O");
            state4 = 2;
        }
        else {
            view4.setText("X");
            state4 = 1;
        }

        check3InRow();
    }

    public void click5(View view) {
        if(state5 == 1) {
            view5.setText("O");
            state5 = 2;
        }
        else {
            view5.setText("X");
            state5 = 1;
        }

        check3InRow();
    }

    public void click6(View view) {
        if(state6 == 1) {
            view6.setText("O");
            state6 = 2;
        }
        else {
            view6.setText("X");
            state6 = 1;
        }

        check3InRow();
    }

    public void click7(View view) {
        if(state7 == 1) {
            view7.setText("O");
            state7 = 2;
        }
        else {
            view7.setText("X");
            state7 = 1;
        }

        check3InRow();
    }

    public void click8(View view) {
        if(state8 == 1) {
            view8.setText("O");
            state8 = 2;
        }
        else {
            view8.setText("X");
            state8 = 1;
        }

        check3InRow();
    }

    public void click9(View view) {
        if(state9 == 1) {
            view9.setText("O");
            state9 = 2;
        }
        else {
            view9.setText("X");
            state9 = 1;
        }

        check3InRow();
    }
    
    
    private void check3InRow() {
        
    }
}
