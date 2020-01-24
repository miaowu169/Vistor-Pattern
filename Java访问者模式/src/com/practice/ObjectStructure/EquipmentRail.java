package com.practice.ObjectStructure;

import java.util.ArrayList;
import java.util.List;

import com.practice.Visitor.Player;
import com.practice.elements.Equipment;
/*
 * ��������ṹ��
 */
//װ����
public class EquipmentRail {
	//װ���б�
	private List<Equipment> equipList = new ArrayList<Equipment>();
	//���װ��
	public void addEquip(Equipment equip) {
		equipList.add(equip);
	}
	
	//���鿴�߲鿴װ��
	public void show(Player player) {
		for(Equipment equip:equipList) {
			equip.accept(player);
		}
	}
}
