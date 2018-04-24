package com.mogong.dao.impl;

import com.mogong.dao.MoAttack;
import com.mogong.model.Geli;

/*
 *  城门回答戏  具体细节
 */
public class MoAttackImpl implements MoAttack{

	// 只需要知道角色及其演什么，具体是谁演不管,注入进来
	private Geli geli;  
	
	public void cityGateAsk() {
        geli.responseAsk("墨者革离");  
    }

	public Geli getGeli() {
		return geli;
	}

	public void setGeli(Geli geli) {
		this.geli = geli;
	}

}
