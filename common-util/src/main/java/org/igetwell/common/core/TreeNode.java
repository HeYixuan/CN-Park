package org.igetwell.common.core;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    private Integer id;
    private String name;
    private TreeNode parent;
    private List<TreeNode> children;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    public List<TreeNode> getTree(List<TreeNode> nodes){
        List<TreeNode> nodeList = new ArrayList<TreeNode>();
        for(TreeNode node1 : nodes){
            boolean mark = false;
            for(TreeNode node2 : nodes){
                if(!StringUtils.isEmpty(node1.getParent()) && node1.getParent().equals(node2.getId())){
                    mark = true;
                    if(node2.getChildren() == null)
                        node2.setChildren(new ArrayList<TreeNode>());
                    node2.getChildren().add(node1);
                    break;
                }
            }
            if(!mark){
                nodeList.add(node1);
            }
        }
        return nodeList;
    }
}
