package com.xigua.layoutdesign;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initSearchView();		      
	}

	/**
	 * @author XiGua
	 * 
	 */
	private void initSearchView() {
		//newһ�����Բ��֣�����ˮƽ���֣��������
		LinearLayout linear = new LinearLayout(this);
		LayoutParams lparams = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
		linear.setLayoutParams(lparams);
        linear.setOrientation(LinearLayout.HORIZONTAL);
        
        //newһ���༭������Ȩ�أ���ߣ��Լ���������
        EditText edit = new EditText(this);
        LinearLayout.LayoutParams eparams = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 3);
        edit.setLayoutParams(eparams);
        edit.setSingleLine();
        
        //newһ����ť�������ı��������С������Լ�Ȩ��
        Button btn = new Button(this);
        LinearLayout.LayoutParams bparams = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1);
        btn.setLayoutParams(bparams);
        btn.setText("����");
        btn.setTextSize(20);
        
        //����view���뵽���Բ���
        linear.addView(edit, 0);
        linear.addView(btn, 1);
        
        //�����Բ��ּ��ص�phone window��ȥ
        setContentView(linear);		
	}


}
