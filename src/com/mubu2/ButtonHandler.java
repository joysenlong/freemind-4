package com.mubu2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ButtonHandler implements ActionListener
{
	/**
	 * @funtion:主页面中三个按钮事件的相应以及页面切换
	 */
	String path;
	JTextArea textField;
	JTextField textArea_1;
	void setPath(String path)
	{
		this.path=path;
	}
	void settextField(JTextArea textField)
	{
		this.textField=textField;
	}
	void settextArea_1(JTextField textArea_1)
	{
		this.textArea_1=textArea_1;
	}
	
	JTextField searchFile;
	JTable table;
	DefaultTableModel model;
	JFrame jFrame;
	void setDefaultTableModel(DefaultTableModel model) {
		this.model = model;
	}
	
	void setTable(JTable table) {
		this.table = table;
	}
	
	void setSearchFile(JTextField searchFile) {
		this.searchFile = searchFile;
	}

	public void actionPerformed(ActionEvent e)
	{
		String source=e.getActionCommand();
		if(source.equals("button_create"))   //新建一个文件然后切换页面
		{
			//弹出一个窗口用于选中目录，在该目录下新建文件
			JFileChooser jfc=new JFileChooser();
			File file = null;
			
	        if(jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
	            file=jfc.getSelectedFile();
	            
	            if(!file.exists()) {
	            	try {
						file.createNewFile();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
	            }
	            //得到文件最后一次更改的时间
		        Calendar cal = Calendar.getInstance();
		        long time = file.lastModified();
		        cal.setTimeInMillis(time);
		        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        String lastTime = formatter.format(cal.getTime());
		        //将文件信息写入data.txt中
				StringBuffer sb=new StringBuffer();
				sb.append(file.getName() + "\t" + lastTime + "\t" + file.getParent() +"\r\n");
				try {
					FileWriter fw=new FileWriter("src/data.txt",true);
					fw.append(sb.toString());
					countChange(1);  //文件个数+1
					fw.close();
					Vector<String> row = new Vector<String>();
					row.add(file.getName());
					row.add(lastTime);
					row.add(file.getParent());
					model.addRow(row);
					String path=file.getParent()+"\\"+file.getName();
					System.out.println(file.getParent());
					jFrame.setContentPane(FilePanel.getInstance(jFrame,path));
	                jFrame.validate();
				}catch(IOException ee){
					ee.printStackTrace();
				}
	        }
		}
		else if(source.equals("button_open"))  
		//用文本选择器打开一个已存在的文件然后切换界面
		{
			//弹出一个窗口，选择文件并打开
			JFileChooser jfc=new JFileChooser();
	        if(jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
	            File file=jfc.getSelectedFile();
	            //页面跳转
	            String path=file.getPath();
	            jFrame.setContentPane(FilePanel.getInstance(jFrame,path));
                jFrame.validate();
	        }
		}
		else if(source.equals("button_pages"))
		//查找某一个指定名称的文件，然后在文件列表中选中结果
		{
			String filename = searchFile.getText();
			Scanner in = null;
			try {
				in = new Scanner(new File("src/data.txt"));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			String line = in.nextLine();
			int idx = -1, now =0;
			while(in.hasNext()) {
				line = in.nextLine();
				String [] item = line.split("\t");
				if(filename.equals(item[0])) {
					idx = now;
					break;
				}
				now++;
			}
			if(idx != -1) {
				System.out.println(idx);
				table.setRowSelectionInterval(idx, idx);
			}
			in.close();
		}
		else if(source.equals("btnNewButton_1"))
		{
        	File data=new File(path);
			try {
				data.createNewFile();
				String detail=textField.getText();
				FileWriter fw=new FileWriter(path);
				fw.write(detail);
				fw.close();
				//更改文件名，实质上是更改文件的路径
				String title=textArea_1.getText();
				if(title.equals(data.getName())==false)
				{
					int index=path.lastIndexOf("\\");
					String path1=path.substring(0,index+1);
					String path2=path1+title+".txt";
					data.renameTo(new File(path2));
					data=new File(path);
					this.path=path2;
					
					Calendar cal = Calendar.getInstance();
			        long time = data.lastModified();
			        cal.setTimeInMillis(time);
			        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			        String lastTime = formatter.format(cal.getTime());
			        System.out.println(lastTime);
				}
				jFrame.setContentPane(Main.getInstance(jFrame));
				jFrame.validate();//刷新
			}
			catch(Exception ee){
				ee.printStackTrace();
			}
		}
	}
	void countChange(int index)     //对记录文件data.txt中文件个数的更改
	{
		try {
			File data=new File("src/data.txt");
			InputStreamReader reader = new InputStreamReader(new FileInputStream(data)); // 建立一个输入流对象reader  
        	BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言  
        	ArrayList<String> list=new ArrayList<String>();
        	String line=br.readLine();
        	while(line!=null)
        	{
        		list.add(line);
        		line=br.readLine();
        	}
        	data.createNewFile();
        	FileWriter fw=new FileWriter("src/data.txt");
        	String a=list.get(0);
        	int b=Integer.parseInt(a)+index;
        	fw.append(String.valueOf(b)).append("\r\n");
        	for(int i=1;i<list.size();i++)
        	{
        		fw.append(list.get(i)).append("\r\n");
        	}
        	fw.close();
        	br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setjFrame(JFrame jFrame) {
		this.jFrame=jFrame;
	}
}
