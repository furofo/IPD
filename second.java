package com.internationalpaper.ipd1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static com.internationalpaper.ipd1.R.id.password;
public class second extends AppCompatActivity {
public void init() {
        String SearchQueryTerm = null;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
        SearchQueryTerm = extras.getString("SearchQueryTerm");
        }

        TextView myTextView = (TextView) findViewById(R.id.textView4);
        myTextView.setText("Your Password is " + SearchQueryTerm);

        System.out.println(SearchQueryTerm);
        }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();


}
}

//public class second extends AppCompatActivity MainActivity  {

   // @Override
    //protected void onCreate(Bundle savedInstanceState) {

       // super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_second);
       // String SearchQueryTerm = MainActivity.getPassword();
       // TextView t= new TextView(this);
        //t.setText("Your Text is="+ password2);
       // setContentView(t);
   // }
//}
