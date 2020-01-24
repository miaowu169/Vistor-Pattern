package com.practice.elements;

import com.practice.Visitor.Player;
/*
 * 创建具体元素类
 */
public interface Equipment {
	public void accept(Player player);
}

