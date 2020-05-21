package Knowledge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class KnowledgeManager {
	public static String path="knowledges/";
	public static HashMap<String, String> knowledges=new HashMap<String, String>();
	public static void loadKnowledge() throws FileNotFoundException {
		//从硬盘中加载Knowledge
		File file = new File(path);
		File[] array = file.listFiles();
		for(int i=0; i<array.length; i++)
		{
			String title, text;
			Scanner in=new Scanner(new FileReader(path+array[i].getName()));			
			title=in.nextLine();
			text=in.nextLine();
			knowledges.put(title, text);
			in.close();
		}
	};
	public static void saveKnowledge(Knowledge k) throws FileNotFoundException {
		PrintWriter out =new PrintWriter(path+"/"+k.title);
		out.println(k.title);
		out.println(k.text);
		out.close();
	};
	public static String findKnowledgeByTitle(String key)
	{
		return knowledges.get(key);
	};
}
