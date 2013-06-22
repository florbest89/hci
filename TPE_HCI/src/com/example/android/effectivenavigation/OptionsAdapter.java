package com.example.android.effectivenavigation;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class OptionsAdapter extends ArrayAdapter<String> {

	List<String> deals = new ArrayList<String>();
	int layoutResId;
	Context context;
	SectionType type;

	public OptionsAdapter(Context context, int layoutResId,
			List<String> options,SectionType typ) {

		super(context, layoutResId, options);
		this.layoutResId = layoutResId;
		deals = options;
		this.context = context;
		type = typ;
		

	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	View row = convertView;
	ItemHolder holder = null;
	 
	if(row == null)
	{
	LayoutInflater inflater = ((Activity) context).getLayoutInflater();
	row = inflater.inflate(layoutResId, parent, false);
	 
	holder = new ItemHolder();
	
	holder.icon = (ImageView)row.findViewById(R.id.icon);
	holder.title = (TextView)row.findViewById(R.id.txtTitle);
	 
	row.setTag(holder);
	}
	else
	{
	holder = (ItemHolder)row.getTag();
	}
	
	
	holder.title.setText(deals.get(position));
	switch(type){
		case DEAL: holder.icon.setImageResource(R.drawable.sales);break;
		case FLIGHT: holder.icon.setImageResource(R.drawable.plane); break;
	}
	
	
	 
	return row;
	}

	static class ItemHolder{
		ImageView icon;
		TextView title;
		
	}
}
