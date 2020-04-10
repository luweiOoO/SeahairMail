package com.luwei.seahairmail.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��Ա�ȼ�
 * 
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:59:35
 */
@Data
@TableName("ums_member_level")
public class MemberLevelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * �ȼ�����
	 */
	private String name;
	/**
	 * �ȼ���Ҫ�ĳɳ�ֵ
	 */
	private Integer growthPoint;
	/**
	 * �Ƿ�ΪĬ�ϵȼ�[0->���ǣ�1->��]
	 */
	private Integer defaultStatus;
	/**
	 * ���˷ѱ�׼
	 */
	private BigDecimal freeFreightPoint;
	/**
	 * ÿ�����ۻ�ȡ�ĳɳ�ֵ
	 */
	private Integer commentGrowthPoint;
	/**
	 * �Ƿ���������Ȩ
	 */
	private Integer priviledgeFreeFreight;
	/**
	 * �Ƿ��л�Ա�۸���Ȩ
	 */
	private Integer priviledgeMemberPrice;
	/**
	 * �Ƿ���������Ȩ
	 */
	private Integer priviledgeBirthday;
	/**
	 * ��ע
	 */
	private String note;

}
