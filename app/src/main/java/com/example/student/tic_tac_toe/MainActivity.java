package com.example.student.tic_tac_toe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView view1, view2, view3, view4, view5, view6, view7, view8, view9, turnView;

    private int state1, state2, state3, state4, state5, state6, state7, state8, state9;

    private int playerTurn;

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
        turnView = (TextView) findViewById(R.id.turn);

        turnView.setText("It is X's turn!");
        
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

        //Initializing player turn.
        playerTurn = 1;
    }
    
    public void click1(View view) {
        state1 = playerTurn;

        if(playerTurn == 1) {
            view1.setText("X");
        }
        else {
            view1.setText("O");
        }
        
        check3InRow();

        changeTurns();

        view1.setClickable(false);
    }

    public void click2(View view) {
        state2 = playerTurn;

        if(playerTurn == 1) {
            view2.setText("X");
        }
        else {
            view2.setText("O");
        }

        check3InRow();

        changeTurns();

        view2.setClickable(false);
    }
    
    public void click3(View view) {
        state3 = playerTurn;

        if(playerTurn == 1) {
            view3.setText("X");
        }
        else {
            view3.setText("O");
        }

        check3InRow();

        changeTurns();

        view3.setClickable(false);
    }

    public void click4(View view) {
        state4 = playerTurn;

        if(playerTurn == 1) {
            view4.setText("X");
        }
        else {
            view4.setText("O");
        }

        check3InRow();

        changeTurns();

        view4.setClickable(false);
    }

    public void click5(View view) {
        state5 = playerTurn;

        if(playerTurn == 1) {
            view5.setText("X");
        }
        else {
            view5.setText("O");
        }

        check3InRow();

        changeTurns();

        view5.setClickable(false);
    }

    public void click6(View view) {
        state6 = playerTurn;

        if(playerTurn == 1) {
            view6.setText("X");
        }
        else {
            view6.setText("O");
        }

        check3InRow();

        changeTurns();

        view6.setClickable(false);
    }

    public void click7(View view) {
        state7 = playerTurn;

        if(playerTurn == 1) {
            view7.setText("X");
        }
        else {
            view7.setText("O");
        }

        check3InRow();

        changeTurns();

        view7.setClickable(false);
    }

    public void click8(View view) {
        state8 = playerTurn;

        if(playerTurn == 1) {
            view8.setText("X");
        }
        else {
            view8.setText("O");
        }

        check3InRow();

        changeTurns();

        view8.setClickable(false);
    }

    public void click9(View view) {
        state9 = playerTurn;

        if(playerTurn == 1) {
            view9.setText("X");
        }
        else {
            view9.setText("O");
        }

        check3InRow();

        changeTurns();

        view9.setClickable(false);
    }

    public void resetGame(View view) {
        state1 = -1;
        state2 = -2;
        state3 = -3;
        state4 = -4;
        state5 = -5;
        state6 = -6;
        state7 = -7;
        state8 = -8;
        state9 = -9;

        playerTurn = 1;

        view1.setText("-");
        view2.setText("-");
        view3.setText("-");
        view4.setText("-");
        view5.setText("-");
        view6.setText("-");
        view7.setText("-");
        view8.setText("-");
        view9.setText("-");
        turnView.setText("It is X's turn!");

        allClickable();

    }

    
    private void check3InRow() {
        if(state1 == state2 && state2 == state3) {
            if(playerTurn == 1) {
                winX();
            }
            else {
                winO();
            }

            allNonClickable();
        }

        if(state4 == state5 && state5 == state6) {
            if(playerTurn == 1) {
                winX();
            }
            else {
                winO();
            }

            allNonClickable();
        }

        if(state7 == state8 && state8 == state9) {
            if(playerTurn == 1) {
                winX();
            }
            else {
                winO();
            }

            allNonClickable();
        }

        if(state1 == state4 && state4 == state7) {
            if(playerTurn == 1) {
                winX();
            }
            else {
                winO();
            }

            allNonClickable();
        }

        if(state2 == state5 && state5 == state8) {
            if(playerTurn == 1) {
                winX();
            }
            else {
                winO();
            }

            allNonClickable();
        }

        if(state3 == state6 && state6 == state9) {
            if(playerTurn == 1) {
                winX();
            }
            else {
                winO();
            }

            allNonClickable();
        }

        if(state1 == state5 && state5 == state9) {
            if(playerTurn == 1) {
                winX();
            }
            else {
                winO();
            }

            allNonClickable();
        }

        if(state3 == state5 && state5 == state7) {
            if(playerTurn == 1) {
                winX();
            }
            else {
                winO();
            }

            allNonClickable();
        }
    }

    private void changeTurns() {
        if(playerTurn == 1) {
            playerTurn = 2;
            turnView.setText("It is O's turn!");
        }
        else {
            playerTurn = 1;
            turnView.setText("It is X's turn!");
        }
    }

    private void allClickable() {
        view1.setClickable(true);
        view2.setClickable(true);
        view3.setClickable(true);
        view4.setClickable(true);
        view5.setClickable(true);
        view6.setClickable(true);
        view7.setClickable(true);
        view8.setClickable(true);
        view9.setClickable(true);
    }

    private void allNonClickable() {
        view1.setClickable(false);
        view2.setClickable(false);
        view3.setClickable(false);
        view4.setClickable(false);
        view5.setClickable(false);
        view6.setClickable(false);
        view7.setClickable(false);
        view8.setClickable(false);
        view9.setClickable(false);
    }

    private void winX() {
        CharSequence text = "X Wins!";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast myMessage= Toast.makeText(context, text, duration);
        myMessage.show();
    }

    private void winO() {
        CharSequence text = "O wins!";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast myMessage= Toast.makeText(context, text, duration);
        myMessage.show();
    }
}
