package com.example.testshortcut;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends Activity {

	//	private boolean isFlag;
	private EditText etNum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etNum = (EditText) findViewById(R.id.et_num);

		//生成快捷方式（没有边框）
		findViewById(R.id.btn_show).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				if (isFlag) {
//					if (AppShortCutUtil.isAddShortCut(MainActivity.this)) {
//						AppShortCutUtil.deleteShortCut(MainActivity.this, MainActivity.class);
//					}
//					isFlag = false;
//				} else {
				AppShortCutUtil.deleteShortCut(MainActivity.this, MainActivity.class);
				AppShortCutUtil.addNumShortCut(MainActivity.this,
						MainActivity.class, true,
						etNum.getText().toString(),false);
//					isFlag = true;
//				}

				etNum.postDelayed(new Runnable() {

					@Override
					public void run() {
						Log.e("AppShortCutUtil", "isInstall = "+AppShortCutUtil.isAddShortCut(MainActivity.this));
					}
				}, 1000);
			}
		});

		//生成快捷方式（有边框）
		findViewById(R.id.btn_show2).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				if (isFlag) {
//					if (AppShortCutUtil.isAddShortCut(MainActivity.this)) {
//						AppShortCutUtil.deleteShortCut(MainActivity.this, MainActivity.class);
//					}
//					isFlag = false;
//				} else {
				AppShortCutUtil.addNumShortCut(MainActivity.this,
						MainActivity.class, true,
						etNum.getText().toString(),true);
//					isFlag = true;
//				}

				etNum.postDelayed(new Runnable() {

					@Override
					public void run() {
						Log.e("AppShortCutUtil", "isInstall = "+AppShortCutUtil.isAddShortCut(MainActivity.this));
					}
				}, 1000);
			}
		});



	}


}
