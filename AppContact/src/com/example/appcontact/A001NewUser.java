package com.example.appcontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.base.BaseActivity;

public class A001NewUser extends BaseActivity implements OnClickListener{
	
	private Button btn_registry, btn_login;
	private EditText et_firstname, et_lastname, et_email, et_confirmemail;
	
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
		
		setContentView(R.layout.a001);
		
		this.btn_registry = (Button)this.findViewById(R.id.a001_btn_registry);
		this.btn_login = (Button)this.findViewById(R.id.a001_btn_login);
		this.et_firstname = (EditText)this.findViewById(R.id.a001_et_firstname);
		this.et_lastname = (EditText)this.findViewById(R.id.a001_et_lastname);
		this.et_email = (EditText)this.findViewById(R.id.a001_et_email);
		this.et_confirmemail = (EditText)this.findViewById(R.id.a001_et_confirmemail);
		
		this.btn_login.setOnClickListener(this);
		this.btn_registry.setOnClickListener(this);
	}
	
	private void initData()
	{
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.a001_btn_login:
			callA002();
			break;
		case R.id.a001_btn_registry:
			break;
		default:
			break;
		}
	}
	
	private void callA002()
	{
		Intent i = new Intent(this, A002Login.class);
		this.startActivity(i);
		finish();
	}
}
