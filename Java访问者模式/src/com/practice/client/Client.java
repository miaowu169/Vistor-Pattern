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
		//���װ��
		er.addEquip(new TheStaffOfFrost("Ψһ��������˪��Ӣ�ۼ�������˺��ḽ��20%�ļ���Ч��������2��","+ 150����������+1050�������"));
		er.addEquip(new MagicKnife("Ψһ��������ħ�����ӵ�ͬ������������40%�ķ���������\n�������300��","+ 100��������������������+50"));
		
		Player lowPlayer = new LowPlayer();
		Player highPlayer = new HighPlayer();
		
		//������ҷֱ����װ����
		er.show(lowPlayer);
		er.show(highPlayer);
		
		((LowPlayer)lowPlayer).getMKF();
		((HighPlayer)highPlayer).getMKF();
	}
}
