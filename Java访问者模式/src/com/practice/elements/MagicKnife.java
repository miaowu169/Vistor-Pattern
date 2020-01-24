package com.practice.elements;

import com.practice.Visitor.Player;
/*
 * 创建具体元素类
 */
public class MagicKnife implements Equipment {
	private String introduce;
	public String equipName = "破魔刀";
	private String damageValue;

	public MagicKnife(String introduce,String damageValue) {
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
	
	public String getDamageValue() {
		return damageValue;
	}
	
	public String getEquipName() {
		return equipName;
	}
}
