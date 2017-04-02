package com.example.myandroidappdemo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class SelectedCompanyListActivity extends ListActivity {

    String[] companyArray = {"AAMRATECH","ACI","ACIFORMULA","ACMELAB","ACTIVEFINE","AFCAGRO","AFTABAUTO","AGNISYSL","AL-HAJTEX","ALARABANK","AMANFEED","AMBEEPHA","AMCL(PRAN)","ANLIMAYARN","ANWARGALV","APEXFOODS","APEXFOOT","APEXSPINN","APEXTANRY","APOLOISPAT","ARAMIT","ARAMITCEM","ARGONDENIM","ATLASBANG","AZIZPIPES","BANGAS","BARKAPOWER","BATASHOE","BBS","BDAUTOCA","BDCOM","BDLAMPS","BDSERVICE","BDTHAI","BDWELDING","BEACHHATCH","BEACONPHAR","BENGALWTL","BERGERPBL","BEXIMCO","BGIC","BNICL","BSC","BSCCL","BSRMLTD","BSRMSTEEL","BXPHARMA","BXSYNTH","CENTRALPHL","CMCKAMAL","CNATEX","CONFIDCEM","CVOPRL","DACCADYE","DAFODILCOM","DBH","DELTASPINN","DESCO","DESHBANDHU","DOREENPWR","DSEX","DSHGARME","DSSL","DULAMIACOT","EASTLAND","EASTRNLUB","ECABLES","EMERALDOIL","ENVOYTEX","ETL","EXIMBANK","FARCHEM","FEKDIL","FINEFOODS","FIRSTSBANK","FORTUNE","FUWANGCER","FUWANGFOOD","GBBPOWER","GEMINISEA","GENNEXT","GHAIL","GHCL","GLAXOSMITH","GOLDENSON","GP","GPHISPAT","GQBALLPEN","GREENDELT","HEIDELBCEM","HFL","HRTEX","HWAWELLTEX","IBNSINA","ICB","IFADAUTOS","IMAMBUTTON","INTECH","ISLAMIINS","ITC","JAMUNAOIL","JMISMDL","KAY&QUE","KBPPWBIL","KDSALTD","KEYACOSMET","KOHINOOR","KPCL","KPPL","LAFSURCEML","LEGACYFOOT","LIBRAINFU","LINDEBD","MAKSONSPIN","MALEKSPIN","MARICO","MATINSPINN","MEGCONMILK","MEGHNACEM","MEGHNAPET","MERCANBANK","METROSPIN","MHSML","MICEMENT","MIRACLEIND","MITHUNKNIT","MJLBD","MODERNDYE","MONNOCERA","MPETROLEUM","NAVANACNG","NFML","NHFIL","NPOLYMAR","NTC","NTLTUBES","OAL","OLYMPIC","ORIONINFU","ORIONPHARM","PADMAOIL","PARAMOUNT","PDL","PENINSULA","PHARMAID","POWERGRID","PREMIERCEM","PTL","QSMDRYCELL","RAHIMAFOOD","RAHIMTEXT","RAKCERAMIC","RANFOUNDRY","RDFOOD","RNSPIN","RSRMSTEEL","SAFKOSPINN","SAIFPOWER","SAIHAMCOT","SAIHAMTEX","SALAMCRST","SALVOCHEM","SAMATALETH","SAMORITA","SAPORTL","SAVAREFR","SHAHJABANK","SHASHADNIM","SHURWID","SHYAMPSUG","SIBL","SIMTEX","SINGERBD","SINOBANGLA","SONALIANSH","SONARGAON","SPCERAMICS","SPCL","SQUARETEXT","SQURPHARMA","STANCERAM","SUMITPOWER","TALLUSPIN","TITASGAS","TUNGHAI","UCB","UNIQUEHRL","UNITEDAIR","UPGDCL","USMANIAGL","WATACHEM","WMSHIPYARD","YPL","ZAHEENSPIN","ZAHINTEX","ZEALBANGLA"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_company_list);

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

