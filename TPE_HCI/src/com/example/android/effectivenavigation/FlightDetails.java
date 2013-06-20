package com.example.android.effectivenavigation;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;
//import android.view.Menu;

public class FlightDetails extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flight_details);
		
		final ActionBar actionBar = getActionBar();
		
		actionBar.setHomeButtonEnabled(true);
		
	}
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.flight_details, menu);
		return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {       
		 android.app.FragmentManager fm= getFragmentManager();
		 if(fm.getBackStackEntryCount()>0){
		   fm.popBackStack();
		} 
        return true;
    }


}
