package com.tz.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
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
        
        //������ť
        Button bt = new Button(this);
        bt.setText("����");
        llp=new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 0);
        bt.setLayoutParams(llp);
        
        ll.addView(et, 0);
        ll.addView(bt, 1);
        //���button���±�1
        setContentView(ll);
//        setContentView(R.layout.main);
    }
}