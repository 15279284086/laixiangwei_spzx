package com.lxw.spzx.manager.helper;

import com.lxw.spzx.model.entity.system.SysMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuHelper {
    /**
     * 使用递归方法建菜单
     * @param sysMenuList
     * @return
     */
    public static List<SysMenu> buildTree(List<SysMenu> sysMenus){
        List<SysMenu> trees = new ArrayList<>();
        for(SysMenu sysMenu:sysMenus){
            if(sysMenu.getParentId().longValue()==0){
                trees.add(findChildren(sysMenu,sysMenus));
            }
        }

        return trees;
    }
    /**
     * 递归查找子节点
     * @param treeNodes
     * @return
     */
    public static SysMenu findChildren(SysMenu sysMenu, List<SysMenu> treeNodes) {
        sysMenu.setChildren(new ArrayList<>());
        for(SysMenu it:treeNodes){
            if(sysMenu.getId().longValue() == it.getParentId().longValue()){
                sysMenu.getChildren().add(findChildren(it,treeNodes));
            }
        }
        return sysMenu;
    }
}
