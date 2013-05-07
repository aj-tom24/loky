package com.example.appcontact;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class A003Contact extends TabActivity {
	
	private TabHost tabHost;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		initView();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	private void initView()
	{
		setContentView(R.layout.a003);
		
		tabHost = (TabHost) this.findViewById(android.R.id.tabhost);
		tabHost.setup();
		
		
		TabSpec spec1 = tabHost.newTabSpec(this.getString(R.string.devicecontacts));
		spec1.setIndicator(this.getString(R.string.devicecontacts));
		spec1.setContent(new Intent(this, A003DeviceContact.class));
		tabHost.addTab(spec1);
		
		TabSpec spec2 = tabHost.newTabSpec(this.getString(R.string.BuchMeOcontacts));
		spec2.setIndicator(this.getString(R.string.BuchMeOcontacts));
		spec2.setContent(new Intent(this, A003BuchMeOContact.class));
		tabHost.addTab(spec2);
	}
	
	private void initData()
	{
		
	}
}
