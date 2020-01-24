package com.practice.Visitor;

import com.practice.elements.MagicKnife;
import com.practice.elements.TheStaffOfFrost;
/*
 * �������������(HighPlayer)
 */
public class HighPlayer implements Player {
	private String playerAttenEquip;//װ������
	private String playerAttenIntro;//װ����ϸ����

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
		System.out.println("�߶���ң�װ�������ƣ���" + playerAttenEquip + "��,��ע�㣺��" +  playerAttenIntro + "��");
	}

	public void getMKF() {
		System.out.println("�߶���ң�װ�������ƣ���" + playerAttenEquip + "��,��ע�㣺��" + playerAttenIntro + "��");
	}
}
