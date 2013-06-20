package com.example.android.effectivenavigation;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
	

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
        
    }
    
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new SalesFragment();
            case 1:
            	return new FlightsFragment();
            default:
            	return new ExperienceFragment();
            	
        }
    }

    
    //Nuestra aplicación tiene 3 secciones: Ofertas, Vuelos y Mis Experiencias
    public String getSectionTitle(int position) {
    	
    	switch(position){
    		case 0: return "Ofertas";
    		case 1: return "Vuelos";
    		default: return "Mis Experiencias";
    	}
    }

	
    @Override
	public int getCount() {
		return 3;
	}
}