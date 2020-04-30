package com.huatec.edu.mobileshop.dao;

import com.huatec.edu.mobileshop.entity.Goods;
import com.huatec.edu.mobileshop.entity.Member;

import java.util.List;
import java.util.Map;

public interface GoodsDao {
	/* 此处的方法名与参数类型需和MemberSqlMap.xml中
	 * 相应元素的id与parameterType的值相同
	 */
	public int saveGoods(Goods goods);//insert元素
	public List<Goods> findAllGoods();//select元素
	public int updateNameById(Map map);//update元素
	public int deleteById(int goods_id);//delete元素
	public int dynamicUpdate(Member member);
	public List<Member> findUnion(int member_id);
}
