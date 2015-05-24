package com.tz.layout;

import android.R.color;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class oneLayoutActivity extends Activity {
	
	private static final int NUMBER_ONE = 1;
	private static final int NUMBER_TWO = 2;
	private static final int NUMBER_THERE = 3;
	private static final int NUMBER_FOUR = 4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		RelativeLayout rl = new RelativeLayout(this);
		rl.setLayoutParams(new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		rl.setBackgroundColor(color.white);
		setContentView(rl);
		
		LinearLayout llyout = new LinearLayout(this);
		llyout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));		
		llyout.setOrientation(LinearLayout.HORIZONTAL);
		llyout.setId(NUMBER_FOUR);	
		
		EditText et = new EditText(this);
		et.setId(NUMBER_ONE);
		et.setHint("����������");
		LinearLayout.LayoutParams  params = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 1);		
		llyout.addView(et, params);
		
		Button btn = new Button(this);
		btn.setId(NUMBER_TWO);
		btn.setText("ȷ��");

		LinearLayout.LayoutParams  btnParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);				
		llyout.addView(btn, btnParams);
		
		
		RelativeLayout.LayoutParams lp1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);  
	    lp1.addRule(RelativeLayout.ALIGN_PARENT_TOP);       
	     // llyout λ�ڸ� View �Ķ���
	    rl.addView(llyout, lp1 ); 
	    
	    
//		
		ImageView img = new ImageView(this);
		img.setId(NUMBER_THERE);
		img.setBackgroundResource(R.drawable.f);
		
	    RelativeLayout.LayoutParams rl_lpara1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 200);
	    rl_lpara1.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
	    rl_lpara1.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);
	    //imgͼƬ�ڸ���Ĵ�ֱ��ˮƽ����
	    rl.addView(img, rl_lpara1);
	}

}
