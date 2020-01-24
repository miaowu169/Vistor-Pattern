package com.practice.elements;

import com.practice.Visitor.Player;
/*
 * �������������
 */
public class TheStaffOfFrost implements Equipment {
	private String introduce;//װ����ϸ����
	private String equipName = "��˪����";
	private String damageValue;//װ��������
	
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
