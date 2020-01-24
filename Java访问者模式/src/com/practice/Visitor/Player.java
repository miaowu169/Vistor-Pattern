package com.practice.Visitor;

import com.practice.elements.MagicKnife;
import com.practice.elements.TheStaffOfFrost;
/*
 * 创建抽象访问者类
 */
public interface Player {
	//查看装备冰霜法杖
	void view(TheStaffOfFrost tsof);
	//查看装备破魔刀
	void view(MagicKnife mkf);
}
