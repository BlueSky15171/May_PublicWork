package com.guass.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class mainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //��Բ�������
        RelativeLayout rt=new RelativeLayout(this);
        android.view.ViewGroup.LayoutParams rtl=new android.view.ViewGroup.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        rt.setLayoutParams(rtl);
        
        //���Բ���
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        RelativeLayout.LayoutParams ilp =new RelativeLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT);
        ll.setLayoutParams(ilp);
        
        //��ť
        Button bt=new Button(this);
        bt.setText("����");
        bt.setTextSize(30);
        bt.setPadding(5, 10, 5, 10);
        LinearLayout.LayoutParams llp=new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT,0);
        llp.gravity=Gravity.CENTER_VERTICAL;
        bt.setLayoutParams(llp);
        
        //�ı���
        EditText et=new EditText(this);
        et.setHint("��������ַ");
        llp=new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT, 1);
        llp.gravity=Gravity.CENTER_VERTICAL;
        et.setLayoutParams(llp);
        
        //���ؼ��ͽ��ؼ�����
        ll.addView(et, 0);
        ll.addView(bt, 1);

        //imageView
        ImageView iv=new ImageView(this);
        iv.setImageResource(R.drawable.movie);
        ilp=new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.FILL_PARENT);
        ilp.addRule(RelativeLayout.CENTER_IN_PARENT);
        iv.setLayoutParams(ilp);
        
        rt.addView(ll, 0);
        rt.addView(iv, 1);
        setContentView(rt);
        //setContentView(R.layout.main);
    }
}