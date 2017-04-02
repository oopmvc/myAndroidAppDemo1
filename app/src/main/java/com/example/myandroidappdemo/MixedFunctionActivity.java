package com.example.myandroidappdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class MixedFunctionActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mixedfunctions);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		
	}


	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		if(item.getItemId() == android.R.id.home){
			finish();
		}
		return super.onMenuItemSelected(featureId, item);
	}
	
	
	public void dseChart(View v){
		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl("http://dsebd.org");
		
	}
	
	
	public void byLastTradePrice(View v){
		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl("http://dsebd.org/latest_share_price_scroll_l.php");
		
	}
	
	
	public void byPercentageChange(View v){
		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl("http://dsebd.org/latest_share_price_scroll_by_change.php");
		
	}
	
	
	public void byTradeCode(View v){
		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl("http://dsebd.org/latest_share_price_scroll_by_value.php");
		
	}
	
	
	public void loadTopTweenty(View v){
		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl("http://dsebd.org/top_20_share.php");
		
	}
	
	
	public void byValOpen(View v){
		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl("http://dsebd.org/latest_share_price_scroll_by_value.php");
		
	}
	
	
	
	
	public void byVolOpen(View v){
		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl("http://dsebd.org/latest_share_price_scroll_by_volume.php");
		
	}
	
	
	
	public void loadByLastTradePrice(View v){
		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl("http://dsebd.org/latest_share_price_scroll_by_ltp.php");
		
	}
	
	
	
	

}
