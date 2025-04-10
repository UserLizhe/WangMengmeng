package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 骑手
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-10-18 18:05:05
 */
@TableName("qishou")
public class QishouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QishouEntity() {
		
	}
	
	public QishouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 骑手工号
	 */
					
	private String qishougonghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 骑手姓名
	 */
					
	private String qishouxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 骑手电话
	 */
					
	private String qishoudianhua;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：骑手工号
	 */
	public void setQishougonghao(String qishougonghao) {
		this.qishougonghao = qishougonghao;
	}
	/**
	 * 获取：骑手工号
	 */
	public String getQishougonghao() {
		return qishougonghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：骑手姓名
	 */
	public void setQishouxingming(String qishouxingming) {
		this.qishouxingming = qishouxingming;
	}
	/**
	 * 获取：骑手姓名
	 */
	public String getQishouxingming() {
		return qishouxingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：骑手电话
	 */
	public void setQishoudianhua(String qishoudianhua) {
		this.qishoudianhua = qishoudianhua;
	}
	/**
	 * 获取：骑手电话
	 */
	public String getQishoudianhua() {
		return qishoudianhua;
	}

}
