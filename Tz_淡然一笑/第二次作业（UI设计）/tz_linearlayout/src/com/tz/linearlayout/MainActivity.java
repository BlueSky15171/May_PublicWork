package com.tz.linearlayout;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		//ͨ��������ز���
		initViewByCode();
		
		/**
		//����������
		LinearLayout ll = new LinearLayout(this);
		ll.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		ll.setOrientation(LinearLayout.HORIZONTAL);
		
		EditText et = new EditText(this);
		et.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 1));  //et��weight��������͸�����ll
		et.setHint("��������������");
		ll.addView(et);
		
		Button btn = new Button(this);
		btn.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		btn.setText("����");
		ll.addView(btn);
		
		setContentView(ll);
		*/
	}
	
	/**
	 * ͨ��������ز���
	 */
	private void initViewByCode() {
		//���ⲿ����
		LinearLayout ll_all = new LinearLayout(this);  //��ʼ���ؼ�
		ll_all.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT)); //���ÿ��
		ll_all.setOrientation(LinearLayout.VERTICAL);  //�����������з�ʽ��Ĭ��ˮƽ��ʽ
		
		//�ϲ�����
		LinearLayout ll_top = new LinearLayout(this);
		ll_top.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
		
		EditText et = new EditText(this);
		//et��Ȩ�ء�weight������������͸�����ll_top�����ԣ�����weight�������ø����͸�����ll_top
		et.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 1));  
		et.setHint("��������������");  //�༭����ʾ��
		ll_top.addView(et, 0);   //��et�ŵ���������ll_top�У���һ��λ��
		
		Button btn = new Button(this);
		btn.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		btn.setText("����"); //�����ı�
		ll_top.addView(btn, 1); //��btn�ŵ���������ll_top�У��ڶ���λ��
		
		//�²�����
		LinearLayout ll_buttom = new LinearLayout(this);
		//ll_buttom��Ȩ�ء�weight������������͸�����ll_all������
		ll_buttom.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT, 1));
		//ע��˴�width��������ΪLayoutParams.MATCH_PARENT��ͼƬ��Ӧ������������ͼƬ���о�����ʾ 
		LinearLayout.LayoutParams ll_buttom_lp = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		ll_buttom_lp.gravity = Gravity.CENTER;  //img��������͸�����ll_buttom������,���Դ�����Ҫ���ø�ll_buttom����
		
		ImageView img = new ImageView(this);
		img.setImageResource(R.drawable.mm);  //����ͼƬ
		img.setLayoutParams(ll_buttom_lp);  
		ll_buttom.addView(img, 0);
		
		ll_all.addView(ll_top, 0);
		ll_all.addView(ll_buttom, 1);
		setContentView(ll_all);  //���ز���
	}
}
