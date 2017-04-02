package com.example.myandroidappdemo;

import org.apache.http.util.EncodingUtils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView; 
import android.webkit.WebViewClient;
import android.widget.TextView;

@SuppressLint("SetJavaScriptEnabled")
public class CompanyDetailsActivity extends Activity {

	private String companydetail_urlbase = "http://dsebd.org/displayCompany.php?name=";
	private String commtwoyearprice_urlbase = "http://dsebd.org/companyGraph/cp/two_years_graph/companygraph-3.php?company=";
	private String commtwoyearvol_urlbase = "http://dsebd.org/companyGraph/trd/two_years_graph/companygraph.php?company=";
	private String companynews_urlbase    = "http://dsebd.org/old_news.php"; 
	private String companyprices          = "http://dsebd.org/mkt_depth_3.php"; 
	 
	private String companyname = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_company_details);

		getActionBar().setDisplayHomeAsUpEnabled(true);


		Intent intent = getIntent();
		this.companyname = intent.getStringExtra("company_name"); 

		TextView tv = (TextView) findViewById(R.id.companyCode);
		tv.setText(this.companyname);




	}



	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		if(item.getItemId() == android.R.id.home){
			finish();
		}
		return super.onMenuItemSelected(featureId, item);
	}

	public void showcompanyDetails(View v){  
		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl(this.companydetail_urlbase + this.companyname);

	} 
	public void showLastTwoYearsPrice(View v){

		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl(this.commtwoyearprice_urlbase + this.companyname);
	} 
	public void showLastTwoYearsVol(View v){

		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true);
		webview.loadUrl(this.commtwoyearvol_urlbase + this.companyname);
	} 

	public void showCompanyNews(View v){ 
		WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.getSettings().setLoadsImagesAutomatically(true); 
		String postData = "cboSymbol="+ this.companyname;
		webview.postUrl( this.companynews_urlbase  , EncodingUtils.getBytes(postData, "base64"));

	} 



	public void showCompanyPrices(View v){
		final WebView webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.getSettings().setLoadsImagesAutomatically(true);
		final String companynamelocal = this.companyname;
		webview.setWebViewClient(new WebViewClient(){
       
			@Override
			public void onPageFinished(WebView view, String url) {  
				String fulljs = "javascript:showHint('"+companynamelocal+"')";
				webview.loadUrl(fulljs); 
				super.onPageFinished(view, url);

			}

		});

		webview.loadUrl(this.companyprices );

		//this.companyname



	}



}
