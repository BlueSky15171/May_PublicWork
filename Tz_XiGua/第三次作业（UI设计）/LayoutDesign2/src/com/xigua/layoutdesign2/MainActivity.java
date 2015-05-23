package com.xigua.layoutdesign2;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {

	private ImageView img;
	private EditText edit;
	private Button btn;
	private LinearLayout lllay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        
		//������������Բ��ֺ�ͷ�������Բ���
		RelativeLayout rlay = new RelativeLayout(this);
		rlay.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		LinearLayout llay = new LinearLayout(this);
		llay.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		llay.setId(11111);
        
		edit = new EditText(this);
        btn = new Button(this);
        img = new ImageView(this);
        //������̬���TextView�����Բ���
		lllay = new LinearLayout(this);

		//����EditText��Button��ImageView��Params���Լ�LinearLayout��params
        LinearLayout.LayoutParams eparams = new LinearLayout.LayoutParams(
        		LinearLayout.LayoutParams.FILL_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT,1);
        LinearLayout.LayoutParams bparams = new LinearLayout.LayoutParams(
        		LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,0);
        RelativeLayout.LayoutParams iparams = new RelativeLayout.LayoutParams(
        		RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        iparams.addRule(RelativeLayout.CENTER_IN_PARENT);
		RelativeLayout.LayoutParams rrparams = new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
		rrparams.addRule(RelativeLayout.BELOW,llay.getId());
		lllay.setLayoutParams(rrparams);
        
		//���ÿؼ��Ļ�������
        edit.setLayoutParams(eparams);
        edit.setHint("���������TextView�ĸ���");
        edit.setInputType(InputType.TYPE_CLASS_NUMBER);
        btn.setLayoutParams(bparams);
        btn.setText("���");
        img.setLayoutParams(iparams);
        img.setImageResource(R.drawable.ic_launcher);
        lllay.setOrientation(LinearLayout.VERTICAL);
        
        //��ӱ༭��Ͱ�ť�����������Բ���
        llay.addView(edit,0);
        llay.addView(btn,1);
        //��Ӷ��������Բ��֣�ImageView����һ�����Բ���
        rlay.addView(llay);
        rlay.addView(img);
        rlay.addView(lllay);
        
        setContentView(rlay);
        
        //�豸��ť�ĵ���¼�������ͼƬ�����ݱ༭����������ֽ������
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				img.setVisibility(View.GONE);
				if(!edit.getText().toString().equals("")){
				for(int i=0;i<Integer.valueOf(edit.getText().toString());i++){
					TextView text = new TextView(MainActivity.this);
					text.setText("���ǵ�"+i+"��TextView");
					text.setGravity(Gravity.CENTER);
                    LinearLayout.LayoutParams linear = new LinearLayout.LayoutParams(
                    		LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
                    text.setLayoutParams(linear);
                    text.setTextColor(Color.BLACK);
					lllay.addView(text);
				}
				}else{
					Toast.makeText(MainActivity.this, "��������ݲ���Ϊ��", Toast.LENGTH_SHORT).show();
				}
			}
		});
        
	}
}
