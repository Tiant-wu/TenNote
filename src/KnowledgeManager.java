import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class KnowledgeManager {
	public static String path="../knowledge/";
	public static HashMap<String, String> knowledges=new HashMap<String, String>();
	public static void loadKnowledge() {
		//从硬盘中加载Knowledge
		 File file = new File(path);
		File[] array = file.listFiles();
		System.out.println("ddddddd");
		for(int i=0; i<array.length; i++)
		{
			String title, text;
			Scanner in=new Scanner(path+array[i].getName());
			title=in.next();
			text=in.next();
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
