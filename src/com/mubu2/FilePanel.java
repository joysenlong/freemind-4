package com.mubu2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Dimension;

public class FilePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public FilePanel(){
	//setTitle("\u8D85\u7EA7\u5947\u602A\u7684\u601D\u7EF4\u5BFC\u56FE");
	setBackground(new Color(240, 248, 255));
	//setDefaultCloseOperation(JPanel.EXIT_ON_CLOSE);
	setBounds(100, 100, 801, 699);
	contentPane = new JPanel();
	contentPane.setToolTipText("\u6587\u672C\u7F16\u8F91\u9875\u9762");
	contentPane.setSize(new Dimension(700, 850));
	contentPane.setFont(new Font("楷体", Font.BOLD, 15));
	contentPane.setBackground(new Color(245, 255, 250));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	//setContentPane(contentPane);
	
	JPanel panel = new JPanel();
	
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	
	JButton btnNewButton_1 = new JButton("\u4FDD\u5B58\u4E3A...");
	
	JLabel label = new JLabel("\u5F53\u524D\u5317\u4EAC\u65F6\u95F4\uFF1A00:00:00");
	label.setFont(new Font("宋体", Font.BOLD, 15));
	GroupLayout gl_contentPane = new GroupLayout(contentPane);
	gl_contentPane.setHorizontalGroup(
		gl_contentPane.createParallelGroup(Alignment.TRAILING)
			.addGroup(gl_contentPane.createSequentialGroup()
				.addGap(10)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 554, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)))
				.addGap(57))
	);
	gl_contentPane.setVerticalGroup(
		gl_contentPane.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_contentPane.createSequentialGroup()
				.addGap(23)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
					.addComponent(panel, 0, 0, Short.MAX_VALUE)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE))
				.addGap(104))
	);
	
	JButton btnNewButton = new JButton("");
	btnNewButton.setToolTipText("\u589E\u52A0\u7F29\u8FDB");
	btnNewButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
		}
	});
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setIcon(new ImageIcon("src/img/tab.png"));
	
	JButton button_1 = new JButton("");
	button_1.setToolTipText("\u5237\u65B0\u601D\u7EF4\u5BFC\u56FE");
	button_1.setIcon(new ImageIcon("src/img/refresh.png"));
	
	JButton button_2 = new JButton("");
	button_2.setToolTipText("\u5220\u9664\u9879");
	button_2.setIcon(new ImageIcon("src/img/delete.png"));
	
	JButton button_3 = new JButton("");
	button_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	button_3.setToolTipText("\u51CF\u5C11\u7F29\u8FDB");
	button_3.setIcon(new ImageIcon("src/img/r_tab.png"));
	
	JButton button_4 = new JButton("");
	button_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	button_4.setToolTipText("\u6DFB\u52A0\u590D\u9009\u6846");
	button_4.setIcon(new ImageIcon("src/img/insert_img.png"));
	
	JButton button_5 = new JButton("");
	button_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	button_5.setToolTipText("\u5B8C\u6210");
	button_5.setIcon(new ImageIcon("src/img/finished.PNG"));
	
	JButton button_6 = new JButton("");
	button_6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	button_6.setToolTipText("\u9AD8\u4EAE");
	button_6.setIcon(new ImageIcon("src/img/highlight.png"));
	
	JButton button_7 = new JButton("");
	button_7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	button_7.setToolTipText("\u7F16\u8F91\u63CF\u8FF0");
	button_7.setIcon(new ImageIcon("src/img/describe.PNG"));
	
	JButton button_8 = new JButton("");
	button_8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	button_8.setToolTipText("\u63D2\u5165\u56FE\u7247");
	button_8.setIcon(new ImageIcon("src/img/gxk.png"));
	
	JButton button_9 = new JButton("");
	button_9.setToolTipText("\u5C06\u601D\u7EF4\u5BFC\u56FE\u5BFC\u51FA\u4E3A\u56FE\u7247");
	button_9.setIcon(new ImageIcon("src/img/save_picture.png"));
	button_9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	GroupLayout gl_panel = new GroupLayout(panel);
	gl_panel.setHorizontalGroup(
		gl_panel.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addComponent(btnNewButton, 0, 0, Short.MAX_VALUE)
					.addComponent(button_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(button_5, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addComponent(button_6, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addComponent(button_7, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 69, Short.MAX_VALUE)
					.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 69, Short.MAX_VALUE)
					.addComponent(button_8, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addComponent(button_9, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
				.addContainerGap())
	);
	gl_panel.setVerticalGroup(
		gl_panel.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel.createSequentialGroup()
				.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addGap(1)
				.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addGap(1)
				.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addGap(2)
				.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addGap(27)
				.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(195, Short.MAX_VALUE))
	);
	panel.setLayout(gl_panel);
	
	JPanel panel_1 = new JPanel();
	tabbedPane.addTab("文字编辑区", null, panel_1, null);
	panel_1.setLayout(new BorderLayout(0, 0));
	
	JScrollPane scrollPane = new JScrollPane();
	panel_1.add(scrollPane, BorderLayout.CENTER);
	
	JPanel panel_3 = new JPanel();
	scrollPane.setColumnHeaderView(panel_3);
	
	JLabel lblNewLabel_1 = new JLabel("标题:   ");
	
	JTextArea textArea_1 = new JTextArea();
	textArea_1.setBorder(new LineBorder(Color.GRAY, 1, true));
	GroupLayout gl_panel_3 = new GroupLayout(panel_3);
	gl_panel_3.setHorizontalGroup(
		gl_panel_3.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_3.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblNewLabel_1)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 531, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(166, Short.MAX_VALUE))
	);
	gl_panel_3.setVerticalGroup(
		gl_panel_3.createParallelGroup(Alignment.TRAILING)
			.addGroup(gl_panel_3.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblNewLabel_1)
					.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	);
	panel_3.setLayout(gl_panel_3);
	
	textField = new JTextField();
	scrollPane.setViewportView(textField);
	textField.setColumns(10);
	
	JPanel panel_2 = new JPanel();
	panel_2.setBackground(Color.WHITE);
	tabbedPane.addTab("图形转化区", null, panel_2, null);
	contentPane.setLayout(gl_contentPane);
}
}
