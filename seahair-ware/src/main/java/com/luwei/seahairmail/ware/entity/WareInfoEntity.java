package com.luwei.seahairmail.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * �ֿ���Ϣ
 * 
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:41:22
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * �ֿ���
	 */
	private String name;
	/**
	 * �ֿ��ַ
	 */
	private String address;
	/**
	 * �������
	 */
	private String areacode;

}
