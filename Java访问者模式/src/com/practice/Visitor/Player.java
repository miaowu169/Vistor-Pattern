package com.practice.Visitor;

import com.practice.elements.MagicKnife;
import com.practice.elements.TheStaffOfFrost;
/*
 * ���������������
 */
public interface Player {
	//�鿴װ����˪����
	void view(TheStaffOfFrost tsof);
	//�鿴װ����ħ��
	void view(MagicKnife mkf);
}
