package com.mogong.service.impl;

import com.mogong.dao.MoAttack;
import com.mogong.service.Director;

/**
 * 导演导戏
 */
public class DirectorImpl implements Director{
	
	// 只需要 知道 城门回答戏 （戏里面的人，怎么演的不用管）, 注入进来
	MoAttack moAttack;
    
	public void direct(){
		// 比如之前有士兵的问题戏	，也需要安排在这里
		System.out.print("城门回答戏：开始");
		moAttack.cityGateAsk();
		System.out.print("城门回答戏：结束");
   }

	public MoAttack getMoAttack() {
		return moAttack;
	}

	public void setMoAttack(MoAttack moAttack) {
		this.moAttack = moAttack;
	}  
	
}
