package com.practice.Visitor;

import com.practice.elements.MagicKnife;
import com.practice.elements.TheStaffOfFrost;
/*
 * �������������
 */
public class LowPlayer implements Player {
	private String playerAttenEquip;//��ҹ�ע��װ������
	private String playerAttenValue;//��ҹ�ע��װ������
	
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
		System.out.println("�Ͷ���ң�װ�������ƣ���" + playerAttenEquip 
				+ "��,��ע�㣺��" + playerAttenValue + "��");	
	}
	
	public void getMKF() {
		System.out.println("�Ͷ���ң�װ�������ƣ���" + playerAttenEquip
				+ "��,��ע�㣺��" + playerAttenValue + "��");
	}
}
