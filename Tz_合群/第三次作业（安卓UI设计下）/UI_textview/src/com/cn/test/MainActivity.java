package com.cn.test;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private EditText et;
	private LinearLayout li_buttom;
	private int count;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initView();
	}
	/**
	 * @author Hequn
	 * ��ʼ����ͼ
	 * 
	 * ***/

	private void initView() {
		// �������Ӳ���
		ScrollView sl = new ScrollView(this);
		sl.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT));
		// �����RelativeLayout
		RelativeLayout rl = new RelativeLayout(this);
		ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.MATCH_PARENT);
		rl.setLayoutParams(params);

		// �������Բ���
		LinearLayout ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.HORIZONTAL);
		RelativeLayout.LayoutParams llParams = new RelativeLayout.LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		llParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		ll.setLayoutParams(llParams);

		// ���������
		et = new EditText(this);
		LinearLayout.LayoutParams Params = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT, 1);
		Params.gravity = Gravity.CENTER_VERTICAL;
		et.setLayoutParams(Params);
		et.setHint("����������");
		et.setInputType(InputType.TYPE_CLASS_NUMBER);

		// ����Button
		Button btn = new Button(this);
		LinearLayout.LayoutParams Params_bt = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.WRAP_CONTENT,
				LinearLayout.LayoutParams.WRAP_CONTENT);
		btn.setLayoutParams(Params_bt);
		btn.setText("���");
		btn.setPadding(20, 20, 20, 20);
		btn.setTextSize(20);
		// �ײ�����textView�����Բ���
		li_buttom = new LinearLayout(this);
		li_buttom.setOrientation(LinearLayout.VERTICAL);
		RelativeLayout.LayoutParams RParams = new RelativeLayout.LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		RParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		RParams.setMargins(25, 100, 25, 25);
		li_buttom.setLayoutParams(RParams);

		ll.addView(et, 0);
		ll.addView(btn, 1);
		rl.addView(ll, 0);
		rl.addView(li_buttom, 1);
		sl.addView(rl);
		setContentView(sl);
		btn.setOnClickListener(this);

	}

	/**
	 * �жϴ�������textView
	 * 
	 ***/
	@Override
	public void onClick(View v) {
		String et_number = et.getText().toString();
		if (!(et_number == null || et_number.trim().length() == 0)) {
			int number = Integer.parseInt(et_number);
			if (number > 0) {
				for (int i = 0; i < number; i++) {
					TextView tv = new TextView(this);
					LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
							LinearLayout.LayoutParams.MATCH_PARENT,
							LinearLayout.LayoutParams.WRAP_CONTENT);
					tv.setLayoutParams(params);
					tv.setText(String.valueOf(count));
					li_buttom.addView(tv, count);
					count++;
				}
			}
		}else{
			Toast.makeText(this, "����û�����������أ�������һ������", 3000).show();
		}
	}

}