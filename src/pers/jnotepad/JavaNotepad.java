package pers.jnotepad;

<<<<<<< HEAD
import java.io.FileNotFoundException;

=======
>>>>>>> f9918554b2c6ddbc63351b2aedca6ae13a738c41
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
<<<<<<< HEAD
	public static void main(String[] args) throws FileNotFoundException
=======
	public static void main(String[] args)
>>>>>>> f9918554b2c6ddbc63351b2aedca6ae13a738c41
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
