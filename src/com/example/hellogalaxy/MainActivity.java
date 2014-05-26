package com.example.hellogalaxy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		//ボタンをＩＤで探してボタン変数を作る
		Button btnOK = (Button)findViewById(R.id.btnOK);
		//ボタン変数にリスナーを登録
		//MainActivity（this）のクリックイベントを待ち構えるリスナー
		btnOK.setOnClickListener(this);

		Button btnCancel = (Button)findViewById(R.id.btnCancel);
		btnCancel.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){ //どのボタンが押されたか判定
		case R.id.btnOK: //btnOKが押された
			//エディットテキストから入力内容を取り出す
			EditText etv = (EditText)findViewById(R.id.edtFirst);
			String inputMsg = etv.getText().toString();
			EditText etv2 = (EditText)findViewById(R.id.edtFamily);
			String inputMsg2 = etv2.getText().toString();

			if( inputMsg.length()!=0 || inputMsg2.length()!=0){
			//メッセージ表示用のTextViewを探して、文字を設定
			TextView tv = (TextView)findViewById(R.id.txtMsg);
			tv.setText("あなたでしたか、" + inputMsg + inputMsg2 + "さん");
			}
			break;

		case R.id.btnCancel: //btnCancelが押された
			etv = (EditText)findViewById(R.id.edtFirst);
			etv.setText(""); //空白をセット
			etv2 = (EditText)findViewById(R.id.edtFamily);
			etv2.setText("");
			break;
		}
	}




}
