package com.example.myandroidappdemo;

import android.os.Bundle;
import android.app.Activity;    
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;  
import android.view.MenuItem;
import android.view.View; 
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BuyCalculatorActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buy_calculator);

		getActionBar().setDisplayHomeAsUpEnabled(true);  

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
			Toast msg = Toast.makeText(this, "BUY Calculator", Toast.LENGTH_LONG);
			msg.show();
			break;
		case R.id.exit_app:
			finish();
			break;

		case android.R.id.home:
			finish();
			break;

		}


		return super.onOptionsItemSelected(item);
	}


	public void buyCalculateNow(View v){
		EditText et = (EditText) findViewById(R.id.buyPrice);
		Float buyPrice = Float.parseFloat(et.getText().toString());
		buyPrice = (buyPrice < 1) ? 1 : buyPrice;


		et = (EditText) findViewById(R.id.commissionET);
		Float commission = Float.parseFloat(et.getText().toString());
		commission = (commission <= 0) ? (Float.parseFloat("0.4")) : commission;


		et = (EditText) findViewById(R.id.quantityET);
		Float quantity = Float.parseFloat(et.getText().toString());
		quantity = (quantity < 1) ? 0 : quantity;


		Float uprice 	= buyPrice + (( buyPrice * commission ) / 100);
		Float totalcost 	= uprice * quantity;

		TextView tv = (TextView) findViewById(R.id.unitPriceTV);
		tv.setText("Per Unit Cost : " + uprice + " BDT ");

		tv = (TextView) findViewById(R.id.totalTV);
		tv.setText("Total Cost : " +  totalcost + " BDT "); 

	}

	public void calculateSellRateWithExpectedProfit(View v){
		EditText et = (EditText) findViewById(R.id.buyPrice);
		Float buyPrice = Float.parseFloat(et.getText().toString());
		buyPrice = (buyPrice < 1) ? 1 : buyPrice;

		EditText profitPercentage = (EditText) findViewById(R.id.expectedProfitValue);
		Float profitPercentageValue = Float.parseFloat(profitPercentage.getText().toString());
		profitPercentageValue = (profitPercentageValue < 0) ? 0 : profitPercentageValue;

		et = (EditText) findViewById(R.id.commissionET);
		Float commission = Float.parseFloat(et.getText().toString());
		commission = (commission <= 0) ? (Float.parseFloat("0.4")) : commission;

		Float uprice 	= buyPrice + (( buyPrice * commission ) / 100);

		Float exptSellValue =  ((( uprice * profitPercentageValue ) / 100));
		Float sellCommition  = (( (uprice + exptSellValue) * commission ) / 100 );

		Float sellPrice =  uprice +  exptSellValue + sellCommition ;

		TextView tv = (TextView) findViewById(R.id.sellValueWithExpectedProfit);
		tv.setText("Sell/Share (+%) : " + sellPrice + " BDT ");


		et = (EditText) findViewById(R.id.sellValue);
		et.setText(sellPrice.toString());

		this.calculateProfit(v);


	}

	public void calculateProfit(View v){
		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/ubuntu-c.ttf");
		EditText et = (EditText) findViewById(R.id.buyPrice);
		Float buyPrice = Float.parseFloat(et.getText().toString());
		buyPrice = (buyPrice < 1) ? 1 : buyPrice;


		et = (EditText) findViewById(R.id.commissionET);
		Float commission = Float.parseFloat(et.getText().toString());
		commission = (commission <= 0) ? (Float.parseFloat("0.4")) : commission;


		et = (EditText) findViewById(R.id.quantityET);
		Float quantity = Float.parseFloat(et.getText().toString());
		quantity = (quantity < 1) ? 0 : quantity;


		Float uprice 	= buyPrice + (( buyPrice * commission ) / 100);
		Float totalcost 	= uprice * quantity;

		TextView tv = (TextView) findViewById(R.id.unitPriceTV);
		tv.setText("Per Unit Cost : " + uprice + " BDT ");

		tv = (TextView) findViewById(R.id.totalTV);
		tv.setText("Total Cost : " +  totalcost + " BDT "); 

		EditText sv  =  (EditText) findViewById(R.id.sellValue);
		Float sellPrice = Float.parseFloat(sv.getText().toString());
		sellPrice = (sellPrice < 1) ? 1 : sellPrice;
		Float usellprice 	= sellPrice - (( sellPrice * commission ) / 100);

		Float totalsellcost 	= usellprice * quantity;


		Float totalprofit = totalsellcost - totalcost; 

		tv = (TextView) findViewById(R.id.profitDisplay);
		tv.setText("After Sell Money : " + totalsellcost +" BDT -   Profit: " + totalprofit + " BDT");
		 
		tv.setTypeface(tf);
		
		if(totalprofit > 0)
			tv.setTextColor(Color.BLUE);
		else
			tv.setTextColor(Color.RED);

	}

	public void setSoldMoney(View v){
		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/ubuntu-c.ttf");
		EditText et = (EditText) findViewById(R.id.buyPrice);
		Float buyPrice = Float.parseFloat(et.getText().toString());
		buyPrice = (buyPrice < 1) ? 1 : buyPrice;


		et = (EditText) findViewById(R.id.commissionET);
		Float commission = Float.parseFloat(et.getText().toString());
		commission = (commission <= 0) ? (Float.parseFloat("0.4")) : commission;


		et = (EditText) findViewById(R.id.quantityET);
		Float quantity = Float.parseFloat(et.getText().toString());
		quantity = (quantity < 1) ? 0 : quantity;


		Float uprice 	= buyPrice + (( buyPrice * commission ) / 100);
		Float totalcost 	= uprice * quantity;

		TextView tv = (TextView) findViewById(R.id.unitPriceTV);
		tv.setText("Per Unit Cost : " + uprice + " BDT ");

		tv = (TextView) findViewById(R.id.totalTV);
		tv.setText("Total Cost : " +  totalcost + " BDT "); 

		EditText sv  =  (EditText) findViewById(R.id.sellValue);
		Float sellPrice = Float.parseFloat(sv.getText().toString());
		sellPrice = (sellPrice < 1) ? 1 : sellPrice;
		Float usellprice 	= sellPrice - (( sellPrice * commission ) / 100);

		Float totalsellcost 	= usellprice * quantity;


		Float totalprofit = totalsellcost - totalcost; 

		tv = (TextView) findViewById(R.id.profitDisplay);
		tv.setText("After Sell Money : " + totalsellcost +" BDT -   Profit: " + totalprofit + " BDT"); 
		tv.setTypeface(tf);
		
		if(totalprofit > 0)
			tv.setTextColor(Color.BLUE);
		else
			tv.setTextColor(Color.RED);


		et = (EditText) findViewById(R.id.cashinHand);
		et.setText(totalsellcost.toString());

	}

	public void checkHowMuchICanBuy(View v){

		EditText et = (EditText) findViewById(R.id.buyPrice);
		Float buyPrice = Float.parseFloat(et.getText().toString());
		buyPrice = (buyPrice < 1) ? 1 : buyPrice;


		et = (EditText) findViewById(R.id.commissionET);
		Float commission = Float.parseFloat(et.getText().toString());
		commission = (commission <= 0) ? (Float.parseFloat("0.4")) : commission;


		et = (EditText) findViewById(R.id.cashinHand);
		Float cashinhandtotal = Float.parseFloat(et.getText().toString());


		Float uprice 	        = (Float) buyPrice + (( buyPrice * commission ) / 100);
		Float quantityIcanBuy 	= (Float) cashinhandtotal / uprice;


		et = (EditText) findViewById(R.id.quantityET);
		et.setText(quantityIcanBuy.toString());

	}


}
