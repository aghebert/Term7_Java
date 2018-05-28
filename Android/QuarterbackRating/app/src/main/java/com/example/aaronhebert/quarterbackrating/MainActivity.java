package com.example.aaronhebert.quarterbackrating;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView answer;
    private Button getRating;
    private EditText attempts;
    private EditText completions;
    private EditText yards;
    private EditText interceptions;
    private EditText touchdowns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        attempts = (EditText)findViewById(R.id.attempts);
        completions = (EditText)findViewById(R.id.completions);
        yards = (EditText)findViewById(R.id.yards);
        interceptions = (EditText)findViewById(R.id.interceptions);
        touchdowns = (EditText)findViewById(R.id.touchdowns);
        getRating = (Button)findViewById(R.id.getRating);
        answer = (TextView)findViewById (R.id.answer);

        Button getRating = (Button) findViewById(R.id.getRating);
        getRating.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double compsDbl = Double.parseDouble(completions.getText().toString());
                Double attemptsDbl = Double.parseDouble(attempts.getText().toString());
                Double yardsDbl = Double.parseDouble(yards.getText().toString());
                Double interDbl = Double.parseDouble(interceptions.getText().toString());
                Double touchdDbl = Double.parseDouble(touchdowns.getText().toString());


                Double a = ((( compsDbl / attemptsDbl ) * 100) -30) / 20;
                Double b = ((touchdDbl/attemptsDbl) * 100) / 5;
                Double c = (9.5 - ((interDbl/attemptsDbl) * 100)) / 4;
                Double d = ((yardsDbl/attemptsDbl) - 3) / 4;

                Double result = (a + b + c + d) / .06 ;

                answer.setText(Double.toString(result));
            }
        });
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
}
