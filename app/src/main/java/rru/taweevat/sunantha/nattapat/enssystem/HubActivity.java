package rru.taweevat.sunantha.nattapat.enssystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HubActivity extends AppCompatActivity {

    //Explicit
    public TextView infromTextView, newsTextView, searchTextView,
            statisticTextView, callTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);


        //bind widget
        bindWidget();

    } // main method

    public void clickInform(View view) {

        Intent intent = new Intent(HubActivity.this, InfromActivity.class);
        String name = getIntent().getStringExtra("nameLogin");
        intent.putExtra("nameLogin", name);
        startActivity(intent);

    }


    public void clickTHAI(View view) {

        infromTextView.setText(getResources().getString(R.string.th_inform));
        newsTextView.setText(getResources().getString(R.string.th_news));
        searchTextView.setText(getResources().getString(R.string.th_search));
        statisticTextView.setText(getResources().getString(R.string.th_statistic));
        callTextView.setText(getResources().getString(R.string.th_call));

    }//clickTHAI

    public void clickENG(View view) {

        infromTextView.setText(getResources().getString(R.string.en_inform));
        newsTextView.setText(getResources().getString(R.string.en_news));
        searchTextView.setText(getResources().getString(R.string.en_search));
        statisticTextView.setText(getResources().getString(R.string.en_statistic));
        callTextView.setText(getResources().getString(R.string.en_call));

    }//clickENG


    private void bindWidget() {
        infromTextView = (TextView) findViewById(R.id.textView9);
        newsTextView = (TextView) findViewById(R.id.textView10);
        searchTextView = (TextView) findViewById(R.id.textView11);
        statisticTextView = (TextView) findViewById(R.id.textView12);
        callTextView = (TextView) findViewById(R.id.textView13);


    }


} // main class
