package com.tz.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ͨ��javaʵ�ֲ���
        LinearLayout ll = new LinearLayout(this);
//        ll.setOrientation(orientation)
        //��������
        LayoutParams lp = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
        ll.setLayoutParams(lp);
        //�����ӿؼ�
        EditText et = new EditText(this);
        //EditText��LinearLayout��Ĳ�������
        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT, 1);
        et.setLayoutParams(llp);
          Button bt = new Button(this);
        //EditText��LinearLayout��Ĳ�������
        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT, 3);
        bt.setLayoutParams(btn);
		btn.setText("����");
        ll.addView(et, 0);
		11.addview(et,0);
        //���button���±�1
        setContentView(ll);
//        setContentView(R.layout.main);
    }
}