package com.practice.elements;

import com.practice.Visitor.Player;
/*
 * 创建具体访问类
 */
public class TheStaffOfFrost implements Equipment {
	private String introduce;//装备详细介绍
	private String equipName = "冰霜法杖";
	private String damageValue;//装备的属性
	
	public TheStaffOfFrost(String introduce,String damageValue) {
		super();
		this.introduce = introduce;
		this.damageValue = damageValue;
	}

	@Override
	public void accept(Player player) {
		player.view(this);
	}
	
	public String getIntroduce() {
		return introduce;
	}
	
	public String getEquipName() {
		return equipName;
	}
	
	public String getDamageValue() {
		return damageValue;
	}
}
