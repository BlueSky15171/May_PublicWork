package com.tz.ztt.log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.zt.ztt.utils.LogUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	 TextView textLog ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textLog =  (TextView) findViewById(R.id.tv);
        LogUtils.isDebug=true;
        textLog.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try {
					catchLog(LogUtils.ERROR);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
    }
    
    /***
     * ץȡ��־
     * @throws IOException 
     */
	protected void catchLog(String pro) throws IOException {
		LogUtils.e(LogUtils.ERROR, " this is error!");
		LogUtils.e(LogUtils.INFO, " this is info!");
		
		StringBuffer sb = new StringBuffer();
		ArrayList<String> cmdLine = new ArrayList<String>();
		cmdLine.add("logcat");
		//ִ��һ��ֹͣ
		cmdLine.add("-d");
		//����W
		cmdLine.add("-s");
		cmdLine.add(pro);
//		cmdLine.add("*:W");
//		System.out.println(cmdLine.toString());
//		String[] strings = cmdLine.toArray(new String[cmdLine.size()]);
//		for (String string : strings) {
//			System.out.println(string);
//		}
		
		Process exec = Runtime.getRuntime().exec(cmdLine.toArray(new String[cmdLine.size()]));
		//ִ��������������
		InputStream inputStream = exec.getInputStream();
		//װ����ģʽ
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		//��ȡ�ַ��� 
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String str=null;
		while ((str=bufferedReader.readLine())!=null) {
			sb.append(str);
			sb.append("\n");
		}
//		Toast.makeText(this, sb.toString(), 30000).show();
		System.out.println(sb.toString());
	}


    
}
