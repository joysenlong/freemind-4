package com.mubu2;

public class Item_file {
	/**
	 * @funtion:�ļ�����
	 */
	String name;
	String time;  //�����ļ�ʱ�޸�
	String path;
	Item_file()
	{
		
	}
	Item_file(String name,String time,String path)
	{
		this.path=path;
		this.name=name;
		this.time=time;
	}
	void changePath(String path)
	{
		this.path=path;
	}
	void changeName(String name)
	{
		this.name=name;
	}
	void changeTime(String time)
	{
		this.time=time;
	}
	String getPath()
	{
		return path;
	}
	String getName()
	{
		return name;
	}
	String getTime()
	{
		return time;
	}
	public void show() {
		// TODO �Զ����ɵķ������
		System.out.println(path);
		System.out.println(name);
		System.out.println(time);
	}
}