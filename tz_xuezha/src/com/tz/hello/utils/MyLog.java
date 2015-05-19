package com.tz.hello.utils;

import android.util.Log;

public class MyLog {
	public static boolean isDebug; //��־�Ŀ���
	
	public static int i(String tag,String msg){
		if(isDebug){
			//��־�����������
			return Log.i(tag, msg);
		}
		return 0;
	}
	
	public static int d(String tag,String msg){
		if(isDebug){
			//debug��־�����������
			return Log.d(tag, msg);
		}
		return 0;
	}
		public static int w(String tag,String msg){
		if(isDebug){
			//debug��־�����������
			return Log.w(tag, msg);
		}
		return 0;
	}
		public static int e(String tag,String msg){
		if(isDebug){
			//debug��־�����������
			return Log.e(tag, msg);
		}
		return 0;
	}
}