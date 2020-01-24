package com.practice.client;

import com.practice.ObjectStructure.EquipmentRail;
import com.practice.Visitor.HighPlayer;
import com.practice.Visitor.LowPlayer;
import com.practice.Visitor.Player;
import com.practice.elements.MagicKnife;
import com.practice.elements.TheStaffOfFrost;

public class Client {
	public static void main(String[] args) {
		EquipmentRail er = new EquipmentRail();
		//添加装备
		er.addEquip(new TheStaffOfFrost("唯一被动—结霜：英雄技能造成伤害会附带20%的减速效果，持续2秒","+ 150法术攻击，+1050最大生命"));
		er.addEquip(new MagicKnife("唯一被动—破魔：增加等同于自身物理攻击40%的法术防御，\n最多增加300点","+ 100物理攻击；基础法术防御+50"));
		
		Player lowPlayer = new LowPlayer();
		Player highPlayer = new HighPlayer();
		
		//两类玩家分别访问装备栏
		er.show(lowPlayer);
		er.show(highPlayer);
		
		((LowPlayer)lowPlayer).getMKF();
		((HighPlayer)highPlayer).getMKF();
	}
}
