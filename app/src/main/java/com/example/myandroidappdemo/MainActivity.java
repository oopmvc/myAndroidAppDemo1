package com.example.myandroidappdemo;

import android.os.Bundle;
import android.app.Activity; 
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu; 
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        Button button = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/ubuntu-c.ttf");
        button.setTypeface(tf);
        button2.setTypeface(tf);
        button3.setTypeface(tf);
        button4.setTypeface(tf);
        
        
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = null;
				// TODO Auto-generated method stub
				intent = new Intent(MainActivity.this, BuyCalculatorActivity.class);
          		startActivity(intent); 
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
     
    @Override 
    public boolean onOptionsItemSelected(MenuItem item){
    	
    	switch(item.getItemId()){
          	case R.id.action_buy_share:
          		Intent intent = new Intent(this, BuyCalculatorActivity.class);
          		startActivity(intent); 
          		break;
          	case R.id.exit_app:
          		finish();
          	break;
          		
    	}
    	
    	
    	return super.onOptionsItemSelected(item);
    }
    
    
    public void openCompanyList(View v){
    	
    	Intent intent = new Intent(this, CompanyListActivity.class);
    	startActivity(intent);
    	 
    }
    
    
    public void mixedFunctions(View v){ 
    	Intent intent = new Intent(this, MixedFunctionActivity.class);
    	startActivity(intent);
    	
    }
    
    public void exitApp(View v){
    	finish();
    }
    
    
    
    
}
