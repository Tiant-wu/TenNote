package pers.ui.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class TreeFrame extends JFrame {
	private static final int W=300;private static final int H=200;
    private JButton addBtn,delBtn;
    private DefaultTreeModel model;
    public TreeFrame()
    {
        setTitle("Tree");
        setSize(W,H);
        //创建树的数据模型
        //根结点
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("山东科技大学");
        DefaultMutableTreeNode xinxi=new DefaultMutableTreeNode("信息工程系");
        //子结点
        root.add(xinxi);
        DefaultMutableTreeNode jsj=new DefaultMutableTreeNode("计算机06-1");
        xinxi.add(jsj);
        DefaultMutableTreeNode jingguan=new DefaultMutableTreeNode("经管系");
        root.add(jingguan);
        DefaultMutableTreeNode kuaiji=new DefaultMutableTreeNode("会计06-1");
        jingguan.add(kuaiji);
        //以树数据模型为参数创建一棵树
        model=new DefaultTreeModel(root);
        final JTree tree=new JTree(model);
        tree.setShowsRootHandles(true);
        tree.setRootVisible(false);
        tree.setEditable(true);
        //tree.putClientProperty("JTree.lineStyle", "None");
        this.getContentPane().add(new JScrollPane(tree));
        /*addBtn=new JButton("添加");
        addBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                DefaultMutableTreeNode select=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
                if(select==null) return;
                DefaultMutableTreeNode parent=(DefaultMutableTreeNode)select.getParent();
                if(parent==null) return;
                DefaultMutableTreeNode newNode=new DefaultMutableTreeNode("NewNode");
                int selectedIndex=parent.getIndex(select);
                model.insertNodeInto(newNode,parent,selectedIndex+1);
                //展开路径
                TreeNode[] treeNode=model.getPathToRoot(newNode);
                TreePath treePath=new TreePath(treeNode);
                tree.scrollPathToVisible(treePath);
            }    
        });
        this.getContentPane().add(addBtn,BorderLayout.WEST);
        delBtn=new JButton("删除");
        this.getContentPane().add(delBtn,BorderLayout.EAST);
        delBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                DefaultMutableTreeNode select=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
                if(select!=null )
                    model.removeNodeFromParent(select);
            }
        }
        );
    }*/

}}
