package com.example.appcontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.base.BaseActivity;
import com.example.util.Util;

public class A002Login extends BaseActivity implements OnClickListener {
	
	private Button btn_login, btn_loginBuchMeO;
	private EditText et_email, et_password;
	private ImageView iv_facebook, iv_email;
	
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
		setContentView(R.layout.a002);
		
		this.btn_login = (Button)this.findViewById(R.id.a002_btn_login);
		this.btn_loginBuchMeO = (Button)this.findViewById(R.id.a002_btn_loginBuchMeO);
		this.et_email = (EditText)this.findViewById(R.id.a002_et_email);
		this.et_password = (EditText)this.findViewById(R.id.a002_et_password);
		this.iv_facebook = (ImageView)this.findViewById(R.id.a002_iv_loginFB);
		this.iv_email = (ImageView)this.findViewById(R.id.a002_iv_loginEmail);
		
		this.btn_login.setOnClickListener(this);
		this.btn_loginBuchMeO.setOnClickListener(this);
		this.iv_email.setOnClickListener(this);
		this.iv_facebook.setOnClickListener(this);
	}
	
	private void initData()
	{
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.a002_btn_login:	
			callA003();
			break;
		case R.id.a002_btn_loginBuchMeO:		
			changeLayout(0);
			break;
		case R.id.a002_iv_loginEmail:	
			changeLayout(2);
			break;
		case R.id.a002_iv_loginFB:
			changeLayout(1);
			break;
		default:
			break;
		}
	}
	
	private void callA003()
	{
		if(!Util.checkNullString(this.et_email.getText().toString()) && !Util.checkNullString(this.et_password.getText().toString()))
		{
			Intent i = new Intent(this, A003Contact.class);
			startActivity(i);
			finish();
		}
	}
	
	private void changeLayout(int i)
	{
		switch(i)
		{
			case 0:	// Login BuchMeO
				this.btn_loginBuchMeO.setVisibility(View.GONE);
				this.iv_facebook.setVisibility(View.VISIBLE);
				this.iv_email.setVisibility(View.VISIBLE);
				break;
			case 1:	// Login Facebook
				this.btn_loginBuchMeO.setVisibility(View.VISIBLE);
				this.iv_facebook.setVisibility(View.GONE);
				this.iv_email.setVisibility(View.VISIBLE);
				break;
			case 2:	// Login Gmail
				this.btn_loginBuchMeO.setVisibility(View.VISIBLE);
				this.iv_facebook.setVisibility(View.VISIBLE);
				this.iv_email.setVisibility(View.GONE);
				break;
		}
	}
}
