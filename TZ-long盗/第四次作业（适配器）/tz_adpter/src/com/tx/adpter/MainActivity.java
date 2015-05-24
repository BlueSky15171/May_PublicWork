package com.tx.adpter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
    private ListView mListView;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initUI();
       
    }

	private void initUI() {
		 mListView=(ListView)findViewById(R.id.listView);
	     peopleAdapter smAdapter = new peopleAdapter(this, getDate());
	     mListView.setAdapter(smAdapter);
	}
	/**
	 * ��ȡ����
	 * @return peopleʵ��
	 */
	private List<People> getDate(){
		List<People> lists = new ArrayList<People>();
		
		People date1 = new People();
		date1.setIcon(R.drawable.f10);
		date1.setName("С��");
		date1.setSex("Ů");
		date1.setColorValue("��ֵ:88");
		date1.setInterest("����");
		lists.add(date1);
		People date2 = new People();
		date2.setIcon(R.drawable.f1);
		date2.setName("Walker.sun");
		date2.setSex("��");
		date2.setColorValue("��ֵ:66");
		date2.setInterest("��Ϸ");
		lists.add(date2);
		People date3 = new People();
		date3.setIcon(R.drawable.f2);
		date3.setName("Sunday");
		date3.setSex("��");
		date3.setColorValue("��ֵ:77");
		date3.setInterest("�˶�");
		lists.add(date3);
		People date4 = new People();
		date4.setIcon(R.drawable.f3);
		date4.setName("����");
		date4.setSex("��");
		date4.setColorValue("��ֵ:72");
		date4.setInterest("lol");
		lists.add(date4);
		People date5 = new People();
		date5.setIcon(R.drawable.f4);
		date5.setName("Grace��ʦ");
		date5.setSex("Ů");
		date5.setColorValue("��ֵ��88");
		date5.setInterest("����");
		lists.add(date5);
		People date6 = new People();
		date6.setIcon(R.drawable.f5);
		date6.setName("�����Ψһ��ִ��");
		date6.setSex("��");
		date6.setColorValue("��ֵ��79");
		date6.setInterest("��ʳ");
		lists.add(date6);
		People date7 = new People();
		date7.setIcon(R.drawable.f6);
		date7.setName("������_");
		date7.setSex("��");
		date7.setColorValue("��ֵ:75");
		date7.setInterest("��ɽ");
		lists.add(date7);
		People date8 = new People();
		date8.setIcon(R.drawable.f7);
		date8.setName("�e��ִ��ؼд�ഺ");
		date8.setSex("��");
		date8.setColorValue("��ֵ:70");
		date8.setInterest("����");
		lists.add(date8);
		People date9 = new People();
		date9.setIcon(R.drawable.f8);
		date9.setName("����");
		date9.setSex("��");
		date9.setColorValue("��ֵ��74");
		date9.setInterest("��Ӿ");
		lists.add(date9);
		People date10 = new People();
		date10.setIcon(R.drawable.f9);
		date10.setName("ɱ����");
		date10.setSex("��");
		date10.setColorValue("��ֵ:76");
		date10.setInterest("����");
		lists.add(date10);
		
		return lists;	
	}
}