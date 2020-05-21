package pers.jnotepad;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import pers.ui.frame.MainFrame;
//import pers.ui.frame.Toolbar;

/**
 * Java记事本
 * 
 * @author ordinary-student
 *
 */
public class JavaNotepad
{
	public static void main(String[] args) throws FileNotFoundException
	{
		

		
		// 设置窗口风格样式
		
		try
		{
			// 设置本地系统默认的窗口风格样式
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "加载本地系统窗口样式失败！");
		} finally
		{
			new MainFrame().setVisible(true);
		}
	}
}
