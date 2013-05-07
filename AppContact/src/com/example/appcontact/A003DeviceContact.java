package com.example.appcontact;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.adapter.A003Adapter;
import com.example.base.BaseActivity;
import com.example.model.ContactModel;

public class A003DeviceContact extends BaseActivity implements OnItemClickListener{
	
	private List<ContactModel> mContact;
	private ListView mListView;
	private A003Adapter mAdapter;
	
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
		setContentView(R.layout.a003_listview);
		
		this.mListView = (ListView)this.findViewById(R.id.a003_listview);
		this.mListView.setOnItemClickListener(this);
		
		initData();
	}
	
	private void initData()
	{
		mContact = new ArrayList<ContactModel>();
		for(int i=0;i<50;i++)
		{
			mContact.add(new ContactModel("Name " + i));
		}
		
		mAdapter = new A003Adapter(getParent(), R.layout.item_a003, mContact);
		
		this.mListView.setAdapter(mAdapter);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
}
