package com.decentsoft.hellohighview.adapter;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.decentsoft.hellohighview.R;
import com.decentsoft.hellohiview.bean.Immortal;

/**
 * ��չ��������ʾ���ɵ�������
 * @author John
 *
 */
public class DsBaseAdapter extends BaseAdapter
{
    private static final String TAG = "DsBaseAdapter";
	private Context context;
	private List<Immortal> data;

	public List<Immortal> getData()
	{
		return data;
	}
	public void setData(List<Immortal> data)
	{
		this.data = data;
	}
	public DsBaseAdapter(Context context,List<Immortal> data)
	{
		this.context = context;
		this.data = data;
	}
	public int getCount()
	{
		// TODO Auto-generated method stub
		return data.size();
	}

	public Object getItem(int position)
	{
		// TODO Auto-generated method stub
		return data.get(position);
	}

	public long getItemId(int position)
	{
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent)
	{
		/**
		 * ͨ��context��ȡinflater,���dslist_item�����棬�õ�������LinearLayout
		 */
		LayoutInflater inflater = LayoutInflater.from(context);
		LinearLayout ll= (LinearLayout) inflater.inflate(com.decentsoft.hellohighview.R.layout.dslist_item, null);
		
		/**
		 * ��ȡ������ʾ�Ŀؼ�
		 */
		ImageView img= (ImageView) ll.findViewById(com.decentsoft.hellohighview.R.id.img);
		TextView  ts_sex = (TextView) ll.findViewById(com.decentsoft.hellohighview.R.id.tx_sex);
		TextView  ts_interst = (TextView) ll.findViewById(com.decentsoft.hellohighview.R.id.tx_interst);
		TextView  ts_name =  (TextView) ll.findViewById(com.decentsoft.hellohighview.R.id.tx_name);
		
		/**
		 * ��ö�Ӧ��������Ϣ����ʾ
		 */
		Immortal immortal = data.get(position);
		img.setImageResource(immortal.getHeadPic());
		ts_sex.setText(Immortal.SEX+immortal.getSex());
		ts_interst.setText(Immortal.INTEREST+immortal.getInterest());
		ts_name.setText(Immortal.NAME+immortal.getName());
		
		/**
		 * �����Ա����ñ�����ʾ
		 */
		if(Immortal.MALE.equals(immortal.getSex()))
		{
			Log.d(TAG, "MALE blue color");
			/* ��ɫ */
			ll.setBackgroundResource(R.color.blue);
			//ll.setBackgroundColor(Color.BLUE);
		}
		else if(Immortal.FEMALE.equals(immortal.getSex()))
		{
			Log.d(TAG, "FEMALE red color");
			/* ��ɫ */
			ll.setBackgroundResource(R.color.red);
			//ll.setBackgroundColor(Color.RED);
		}
		
		/**
		 * ����ll
		 */
		return ll;
	}

}
