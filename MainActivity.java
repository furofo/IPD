package com.internationalpaper.ipd1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button but1;

    public void init() {
        but1 = (Button)findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this, second.class );
                startActivity(toy);
            }
        });

        TextView textView =(TextView)findViewById(R.id.txt3);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://career8.successfactors.com/career?company=IPProd'> Not a member sign Up! </a>";
        textView.setText(Html.fromHtml(text));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

   // public void buttonOnClick(View v) {
   //     Button button = (Button) v;
      //  Intent toy = new Intent(MainActivity.this, second.class);

   // }
}
