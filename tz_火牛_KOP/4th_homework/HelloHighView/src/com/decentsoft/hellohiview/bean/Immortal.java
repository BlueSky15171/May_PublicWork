package com.decentsoft.hellohiview.bean;

public class Immortal
{ 
	public static final String MALE = "����";
	public static final String FEMALE = "Ů��";
	public static final String NAME = "����:";
	public static final String SEX = "�Ա�:";
	public static final String INTEREST = "����:"; 
	
    private String name;
    private String sex;
    private String interest;
    private int headPic;
    public Immortal(String name,String sex,String interest,int headpic)
    {
    	this.name = name;
    	this.sex = sex;
    	this.interest = interest;
    	this.headPic = headpic;
    }
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public String getInterest()
	{
		return interest;
	}
	public void setInterest(String interest)
	{
		this.interest = interest;
	}
	public int getHeadPic()
	{
		return headPic;
	}
	public void setHeadPic(int headPic)
	{
		this.headPic = headPic;
	}
}
