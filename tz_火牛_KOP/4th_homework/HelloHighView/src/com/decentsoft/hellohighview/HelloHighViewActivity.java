package com.decentsoft.hellohighview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.ListView;

import com.decentsoft.hellohighview.adapter.DsBaseAdapter;
import com.decentsoft.hellohiview.bean.Immortal;

public class HelloHighViewActivity extends Activity implements OnItemLongClickListener, OnClickListener {
	
    private ListView lv;
	private List<Immortal> data;
	private DsBaseAdapter dba;
	/**
	 * ��������
	 */
    private Immortal[] Immortals = {
    		new Immortal("����",Immortal.MALE,"������ˮ",R.drawable.immortal0),
    		new Immortal("ׯ��",Immortal.MALE,"ׯ���ε�",R.drawable.immortal1),
    		new Immortal("�Ⱥ�����",Immortal.FEMALE,"�ն�����",R.drawable.immortal2),
    		new Immortal("�Ź���",Immortal.MALE,"�ó�:)",R.drawable.immortal3),
    		new Immortal("���",Immortal.MALE,"����",R.drawable.immortal4),
    		new Immortal("�ŵ���",Immortal.MALE,"����",R.drawable.immortal5),
    		new Immortal("�ﲻ��",Immortal.FEMALE,"ƽ��",R.drawable.immortal6),
    		new Immortal("������",Immortal.MALE,"��Ȼ��ȫ���޶�",R.drawable.immortal7),
    		new Immortal("���ɹ�",Immortal.FEMALE,"����",R.drawable.immortal8),
    		new Immortal("������",Immortal.MALE,"�þ�:)",R.drawable.immortal9),
    };
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.decentsoft.hellohighview.R.layout.high);
        lv = (ListView) findViewById(com.decentsoft.hellohighview.R.id.lv);
        /**
         * ��������������ݼӵ�data����
         */
        data = new ArrayList<Immortal>();
        for(int i=0;i<Immortals.length;i++)
        {
        	data.add(Immortals[i]);
        }
        //����adapter
        dba = new DsBaseAdapter(this, data);
        lv.setAdapter(dba);
        //����lv��item����ɾ������Ӧ
        lv.setOnItemLongClickListener(this);
        
        //
        Button reset_btn = (Button) findViewById(R.id.reset_btn);
        reset_btn.setOnClickListener(this);
    }

	public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3)
	{
		// TODO Auto-generated method stub
		final Immortal imortal = (Immortal) arg0.getItemAtPosition(arg2);
		new AlertDialog.Builder(this).setTitle("ɾ��?")
		    .setNegativeButton("ȡ��", null)
		    .setPositiveButton("ȷ��",  
		    		new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which)
						{
							Runnable delete = new Runnable(){
								public void run()
								{
									/* ����dba�����data��ɾ�����ڱ����������imortal */
									dba.getData().remove(imortal);
									/* ֪ͨ����dba�仯�ˣ�������ʾ */
									dba.notifyDataSetChanged();
								}
							};
							delete.run();
						}
		            })
		    .show();
		
     /**
		 * ����true��ʾ���Ѿ���������
		 *true if the callback consumed the long click, false otherwise
		 */
		return true;
	}

	public void onClick(View arg0)
	{
		Runnable reset = new Runnable()
		{
			public void run()
			{
				/**
				 * ���data������д������
				 */
				data.clear();
		        for(int i=0;i<Immortals.length;i++)
		        {
		        	data.add(Immortals[i]);
		        }
				/* ����dba��dataΪ��ʼ��ʱ���data */
				dba.setData(data);
				/* ֪ͨ����dba�仯�ˣ�������ʾ */
				dba.notifyDataSetChanged();
			}
		};
		reset.run();
	}
}