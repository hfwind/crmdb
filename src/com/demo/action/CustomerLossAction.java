package com.demo.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.demo.biz.CustomerLossBiz;
import com.demo.biz.SysnavBiz;
import com.demo.biz.impl.CrmVo;
import com.demo.biz.impl.CustomerLossBizImpl;
import com.demo.biz.impl.SysnavBizImpl;
import com.demo.connection.SystemContext;
import com.demo.pojo.CustomerLoss;
import com.demo.pojo.Sysnav;
import com.demo.pojo.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerLossAction extends ActionSupport {

	private CustomerLossBiz lossbiz = new CustomerLossBizImpl();
	private List<CustomerLoss> losslist = new ArrayList<CustomerLoss>();
	private SysnavBiz sysbiz = new SysnavBizImpl();
	private List<Sysnav> alllist = new ArrayList<Sysnav>();
	private List<Sysnav> list = new ArrayList<Sysnav>();
	private CustomerLoss culoss = new CustomerLoss();
	private CrmVo vo = new CrmVo();
	private int pageMax;
	private int id;
	private String why;
	private String zhuijia;
	private String yuanzanhuanls;

	public String findAllLoss() {//分页
		pageMax = lossbiz.findSize().size();
		SystemContext.setPageOffset(0);
		alllist = sysbiz.findAll();
		list = sysbiz.getSysPid(0);
		losslist = lossbiz.findAll();
		Map<String, Object> session = ActionContext.getContext().getSession();
		UserInfo user = (UserInfo) session.get("user");
		session.put("alllist", alllist);
		session.put("list", list);
		return SUCCESS;
	}

	public String getAllHousing() {

		HttpServletRequest request = ServletActionContext.getRequest();
		SystemContext.setPageOffset(0);
		if (request.getParameter("pager.offset") != null
				|| !"".equals(request.getParameter("pager.offset"))) {
			SystemContext.setPageOffset(Integer.parseInt(request
					.getParameter("pager.offset")));
		}
		pageMax = lossbiz.findSize().size();
		alllist = sysbiz.findAll();
		list = sysbiz.getSysPid(0);
		losslist = lossbiz.findAll();
		Map<String, Object> session = ActionContext.getContext().getSession();
		UserInfo user = (UserInfo) session.get("user");
		session.put("alllist", alllist);
		session.put("list", list);
		
		return SUCCESS;
		
	}
	
	public String getCustomerToAjax(){//多条件筛选
		HttpSession session=ServletActionContext.getRequest().getSession();
		CrmVo Cvo=null;
		if(session.getAttribute("vo")!=null){
			Cvo=(CrmVo)session.getAttribute("vo");
			if(vo.getCustomer()!=null){
				Cvo.setCustomer(vo.getCustomer());
				if(vo.getCustomer().getCustomerName()==null){
					Cvo.setCustomer(null);
				}
			}
		if(vo.getUser()!=null){
			Cvo.setUser(vo.getUser());
			if(vo.getUser().getTrueName()==null){
				Cvo.setUser(null);
			}
		}
		if(vo.getStateaa()!=null){
			if(vo.getStateaa()!=-1){
				Cvo.setStateaa(vo.getStateaa());
			}else{
				Cvo.setStateaa(null);
			}
		}
		
		}else{
			Cvo=vo;
		}
		pageMax = lossbiz.findSize().size();
		SystemContext.setPageOffset(0);
		session.setAttribute("vo",Cvo);
		alllist=sysbiz.findAll();
		list=sysbiz.getSysPid(0);
		losslist=lossbiz.findByCondition(Cvo);
		Map<String,Object> sessions=ActionContext.getContext().getSession();
		UserInfo user=(UserInfo) sessions.get("user");
		sessions.put("alllist",alllist);
		sessions.put("list",list);
		return SUCCESS;
		
		
	}


	public String ByliushiAll() {//按id查询流失管理
		alllist = sysbiz.findAll();
		list = sysbiz.getSysPid(0);
		culoss = lossbiz.findById(id);
		Map<String, Object> session = ActionContext.getContext().getSession();
		UserInfo user = (UserInfo) session.get("user");
		return SUCCESS;
	}
	
	public String Byliushiupda(){//按id修改确认流失页面
		Date now = new Date(); //获取当前时间
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.format(now);
		CustomerLoss cl=lossbiz.findById(id);
		cl.setLossWhy(why);
		cl.setLossDate(now);
		cl.setState(2);
		lossbiz.attachDirty(cl);
		return SUCCESS;
	}
	
	public String Byzanhuanupda(){//按id修改暂缓流失页面
		CustomerLoss cl=lossbiz.findById(id);
		cl.setReprieve(yuanzanhuanls+";"+zhuijia);
		System.out.println(yuanzanhuanls);
		lossbiz.attachDirty(cl);
		return SUCCESS;
	}

	public List<CustomerLoss> getLosslist() {
		return losslist;
	}

	public void setLosslist(List<CustomerLoss> losslist) {
		this.losslist = losslist;
	}

	public SysnavBiz getSysbiz() {
		return sysbiz;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getYuanzanhuanls() {
		return yuanzanhuanls;
	}

	public void setYuanzanhuanls(String yuanzanhuanls) {
		this.yuanzanhuanls = yuanzanhuanls;
	}

	public void setSysbiz(SysnavBiz sysbiz) {
		this.sysbiz = sysbiz;
	}

	public List<Sysnav> getAlllist() {
		return alllist;
	}

	public void setAlllist(List<Sysnav> alllist) {
		this.alllist = alllist;
	}
	

	public String getZhuijia() {
		return zhuijia;
	}

	public void setZhuijia(String zhuijia) {
		this.zhuijia = zhuijia;
	}

	public int getPageMax() {
		return pageMax;
	}

	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}

	public List<Sysnav> getList() {
		return list;
	}

	public CustomerLoss getCuloss() {
		return culoss;
	}

	public void setCuloss(CustomerLoss culoss) {
		this.culoss = culoss;
	}

	public void setList(List<Sysnav> list) {
		this.list = list;
	}

	public CustomerLossBiz getLossbiz() {
		return lossbiz;
	}
	

	public String getWhy() {
		return why;
	}

	public void setWhy(String why) {
		this.why = why;
	}

	public void setLossbiz(CustomerLossBiz lossbiz) {
		this.lossbiz = lossbiz;
	}

	public CrmVo getVo() {
		return vo;
	}

	public void setVo(CrmVo vo) {
		this.vo = vo;
	}

}
