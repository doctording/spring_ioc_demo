package com.mogong.service.impl;

import com.mogong.dao.MoAttack;
import com.mogong.service.Director;

/**
 * ���ݵ�Ϸ
 */
public class DirectorImpl implements Director{
	
	// ֻ��Ҫ ֪�� ���Żش�Ϸ ��Ϸ������ˣ���ô�ݵĲ��ùܣ�, ע�����
	MoAttack moAttack;
    
	public void direct(){
		// ����֮ǰ��ʿ��������Ϸ	��Ҳ��Ҫ����������
		System.out.print("���Żش�Ϸ����ʼ");
		moAttack.cityGateAsk();
		System.out.print("���Żش�Ϸ������");
   }

	public MoAttack getMoAttack() {
		return moAttack;
	}

	public void setMoAttack(MoAttack moAttack) {
		this.moAttack = moAttack;
	}  
	
}
