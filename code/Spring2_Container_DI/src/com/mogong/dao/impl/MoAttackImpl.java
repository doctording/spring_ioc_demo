package com.mogong.dao.impl;

import com.mogong.dao.MoAttack;
import com.mogong.model.Geli;

/*
 *  ���Żش�Ϸ  ����ϸ��
 */
public class MoAttackImpl implements MoAttack{

	// ֻ��Ҫ֪����ɫ������ʲô��������˭�ݲ���,ע�����
	private Geli geli;  
	
	public void cityGateAsk() {
        geli.responseAsk("ī�߸���");  
    }

	public Geli getGeli() {
		return geli;
	}

	public void setGeli(Geli geli) {
		this.geli = geli;
	}

}
