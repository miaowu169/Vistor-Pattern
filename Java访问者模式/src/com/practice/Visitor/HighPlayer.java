package com.practice.Visitor;

import com.practice.elements.MagicKnife;
import com.practice.elements.TheStaffOfFrost;
/*
 * 创建具体访问类(HighPlayer)
 */
public class HighPlayer implements Player {
	private String playerAttenEquip;//装备名称
	private String playerAttenIntro;//装备详细介绍

	@Override
	public void view(TheStaffOfFrost tsof) {
		playerAttenEquip = tsof.getEquipName();
		playerAttenIntro = tsof.getIntroduce();
	}

	@Override
	public void view(MagicKnife mkf) {
		playerAttenEquip = mkf.getEquipName();
		playerAttenIntro = mkf.getIntroduce();
	}

	public void getTSOFF() {
		System.out.println("高端玩家：装备的名称：【" + playerAttenEquip + "】,关注点：【" +  playerAttenIntro + "】");
	}

	public void getMKF() {
		System.out.println("高端玩家：装备的名称：【" + playerAttenEquip + "】,关注点：【" + playerAttenIntro + "】");
	}
}
