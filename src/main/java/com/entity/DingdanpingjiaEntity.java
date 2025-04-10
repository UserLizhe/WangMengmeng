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
 * 订单评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-10-18 18:05:05
 */
@TableName("dingdanpingjia")
public class DingdanpingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingdanpingjiaEntity() {
		
	}
	
	public DingdanpingjiaEntity(T t) {
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
	 * 菜品名称
	 */
					
	private String caipinmingcheng;
	
	/**
	 * 菜品分类
	 */
					
	private String caipinfenlei;
	
	/**
	 * 菜品图片
	 */
					
	private String caipintupian;
	
	/**
	 * 商家编号
	 */
					
	private String shangjiabianhao;
	
	/**
	 * 骑手工号
	 */
					
	private String qishougonghao;
	
	/**
	 * 菜品评分
	 */
					
	private String caipinpingfen;
	
	/**
	 * 商家评分
	 */
					
	private String shangjiapingfen;
	
	/**
	 * 骑手评分
	 */
					
	private String qishoupingfen;
	
	/**
	 * 综合评分
	 */
					
	private String zonghepingfen;
	
	/**
	 * 订单评价
	 */
					
	private String dingdanpingjia;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：菜品名称
	 */
	public void setCaipinmingcheng(String caipinmingcheng) {
		this.caipinmingcheng = caipinmingcheng;
	}
	/**
	 * 获取：菜品名称
	 */
	public String getCaipinmingcheng() {
		return caipinmingcheng;
	}
	/**
	 * 设置：菜品分类
	 */
	public void setCaipinfenlei(String caipinfenlei) {
		this.caipinfenlei = caipinfenlei;
	}
	/**
	 * 获取：菜品分类
	 */
	public String getCaipinfenlei() {
		return caipinfenlei;
	}
	/**
	 * 设置：菜品图片
	 */
	public void setCaipintupian(String caipintupian) {
		this.caipintupian = caipintupian;
	}
	/**
	 * 获取：菜品图片
	 */
	public String getCaipintupian() {
		return caipintupian;
	}
	/**
	 * 设置：商家编号
	 */
	public void setShangjiabianhao(String shangjiabianhao) {
		this.shangjiabianhao = shangjiabianhao;
	}
	/**
	 * 获取：商家编号
	 */
	public String getShangjiabianhao() {
		return shangjiabianhao;
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
	 * 设置：菜品评分
	 */
	public void setCaipinpingfen(String caipinpingfen) {
		this.caipinpingfen = caipinpingfen;
	}
	/**
	 * 获取：菜品评分
	 */
	public String getCaipinpingfen() {
		return caipinpingfen;
	}
	/**
	 * 设置：商家评分
	 */
	public void setShangjiapingfen(String shangjiapingfen) {
		this.shangjiapingfen = shangjiapingfen;
	}
	/**
	 * 获取：商家评分
	 */
	public String getShangjiapingfen() {
		return shangjiapingfen;
	}
	/**
	 * 设置：骑手评分
	 */
	public void setQishoupingfen(String qishoupingfen) {
		this.qishoupingfen = qishoupingfen;
	}
	/**
	 * 获取：骑手评分
	 */
	public String getQishoupingfen() {
		return qishoupingfen;
	}
	/**
	 * 设置：综合评分
	 */
	public void setZonghepingfen(String zonghepingfen) {
		this.zonghepingfen = zonghepingfen;
	}
	/**
	 * 获取：综合评分
	 */
	public String getZonghepingfen() {
		return zonghepingfen;
	}
	/**
	 * 设置：订单评价
	 */
	public void setDingdanpingjia(String dingdanpingjia) {
		this.dingdanpingjia = dingdanpingjia;
	}
	/**
	 * 获取：订单评价
	 */
	public String getDingdanpingjia() {
		return dingdanpingjia;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
