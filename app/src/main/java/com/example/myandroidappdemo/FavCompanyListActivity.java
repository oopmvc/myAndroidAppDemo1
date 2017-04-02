package com.example.myandroidappdemo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FavCompanyListActivity extends ListActivity {

    String[] companyArray = {"AAMRATECH","ACI","ACIFORMULA","AFTABAUTO","ALARABANK","AMCL(PRAN)","ANLIMAYARN","APEXFOOT","APEXSPINN","APEXTANRY","APOLOISPAT","BEXIMCO","BSC","BSCCL","DESCO","EXIMBANK","FIRSTSBANK","GP","KBPPWBIL","KPCL","MALEKSPIN","MATINSPINN","MJLBD","MPETROLEUM","OLYMPIC","PADMAOIL","POWERGRID","RAKCERAMIC","SHAHJABANK","SINGERBD","SQUARETEXT","SQURPHARMA","SUMITPOWER","TITASGAS","UPGDCL","YPL"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_list);

        getActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, companyArray);

        ListView lv = (ListView) findViewById(android.R.id.list);
        lv.setAdapter(adapter);



    }
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onMenuItemSelected(featureId, item);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String companyname = companyArray[position].toString();

        Intent intent = new Intent(this, CompanyDetailsActivity.class);
        intent.putExtra("company_name", companyname);
        startActivity(intent);


    }



}


