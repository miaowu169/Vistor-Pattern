package com.practice.ObjectStructure;

import java.util.ArrayList;
import java.util.List;

import com.practice.Visitor.Player;
import com.practice.elements.Equipment;
/*
 * 创建对象结构类
 */
//装备栏
public class EquipmentRail {
	//装备列表
	private List<Equipment> equipList = new ArrayList<Equipment>();
	//添加装备
	public void addEquip(Equipment equip) {
		equipList.add(equip);
	}
	
	//供查看者查看装备
	public void show(Player player) {
		for(Equipment equip:equipList) {
			equip.accept(player);
		}
	}
}
