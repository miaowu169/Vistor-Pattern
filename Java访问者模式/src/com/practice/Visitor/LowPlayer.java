package com.practice.Visitor;

import com.practice.elements.MagicKnife;
import com.practice.elements.TheStaffOfFrost;
/*
 * 创建具体访问者
 */
public class LowPlayer implements Player {
	private String playerAttenEquip;//玩家关注的装备名称
	private String playerAttenValue;//玩家关注的装备属性
	
	@Override
	public void view(TheStaffOfFrost tsof) {
		playerAttenEquip = tsof.getEquipName();
		playerAttenValue= tsof.getDamageValue();
	}

	@Override
	public void view(MagicKnife mkf) {
		playerAttenEquip = mkf.getEquipName();
		playerAttenValue = mkf.getDamageValue();
	}
	
	public void getTSOFF() {
		System.out.println("低端玩家：装备的名称：【" + playerAttenEquip 
				+ "】,关注点：【" + playerAttenValue + "】");	
	}
	
	public void getMKF() {
		System.out.println("低端玩家：装备的名称：【" + playerAttenEquip
				+ "】,关注点：【" + playerAttenValue + "】");
	}
}
