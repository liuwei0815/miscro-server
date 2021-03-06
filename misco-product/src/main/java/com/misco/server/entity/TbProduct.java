package com.misco.server.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 *  实体类
 *  @author liuwei
 *  @since 1.0  2020-3-4 11:15:39
 */
@Data
@Entity
public class TbProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4045703600264523497L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 
	
	private String productName; // 名称
	
	private Long status; // 状态
	
	private BigDecimal price; // 单价
	
	private String productDesc; // 描述
	
	private String caption; // 标题
	
	private Long inventory; // 库存

}
