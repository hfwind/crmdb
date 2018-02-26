package com.demo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.text.DefaultEditorKit.CutAction;

import org.apache.struts2.ServletActionContext;

import com.demo.biz.CustomerLossBiz;
import com.demo.biz.SysnavBiz;
import com.demo.biz.impl.CrmVo;
import com.demo.biz.impl.CustomerBizImpl;
import com.demo.biz.impl.CustomerLossBizImpl;
import com.demo.biz.impl.SysnavBizImpl;
import com.demo.connection.SystemContext;
import com.demo.pojo.CustomerLoss;
import com.demo.pojo.Sysnav;
import com.demo.pojo.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LossfenxiAction extends ActionSupport{
	private CustomerLossBiz cubiz=new CustomerLossBizImpl();
	private List<CustomerLoss> losslist=new ArrayList<CustomerLoss>();
	private List<Sysnav> alllist = new ArrayList<Sysnav>();
	private SysnavBiz sysbiz = new SysnavBizImpl();
	private List<Sysnav> list = new ArrayList<Sysnav>();
	private CrmVo vo=new CrmVo();
	private int pageMax;
	
	public String GetAll(){//查询
		pageMax = cubiz.findSize().size();
		SystemContext.setPageOffset(0);
		alllist = sysbiz.findAll();
		list = sysbiz.getSysPid(0);
		losslist = cubiz.findAll();
		Map<String, Object> session = ActionContext.getContext().getSession();
		//UserInfo user = (UserInfo) session.get("user");
		session.put("alllist", alllist);
		session.put("list", list);
		return SUCCESS;
	}
	
	public String getAllHousing() {//分页

		HttpServletRequest request = ServletActionContext.getRequest();
		SystemContext.setPageOffset(0);
		if (request.getParameter("pager.offset") != null
				|| !"".equals(request.getParameter("pager.offset"))) {
			SystemContext.setPageOffset(Integer.parseInt(request
					.getParameter("pager.offset")));
		}
		pageMax = cubiz.findSize().size();
		alllist = sysbiz.findAll();
		list = sysbiz.getSysPid(0);
		losslist = cubiz.findAll();
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
		}else{
			Cvo=vo;
		}
		pageMax = cubiz.findSize().size();
		SystemContext.setPageOffset(0);
		session.setAttribute("vo",Cvo);
		alllist=sysbiz.findAll();
		list=sysbiz.getSysPid(0);
		losslist=cubiz.findByCondition(Cvo);
		Map<String,Object> sessions=ActionContext.getContext().getSession();
		//UserInfo user=(UserInfo) sessions.get("user");
		sessions.put("alllist",alllist);
		sessions.put("list",list);
		return SUCCESS;
		
		
	}
	
	public List<Sysnav> getAlllist() {
		return alllist;
	}

	public void setAlllist(List<Sysnav> alllist) {
		this.alllist = alllist;
	}

	public List<Sysnav> getList() {
		return list;
	}

	public void setList(List<Sysnav> list) {
		this.list = list;
	}

	public int getPageMax() {
		return pageMax;
	}
	

	public SysnavBiz getSysbiz() {
		return sysbiz;
	}

	public void setSysbiz(SysnavBiz sysbiz) {
		this.sysbiz = sysbiz;
	}

	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}

	public CrmVo getVo() {
		return vo;
	}

	public void setVo(CrmVo vo) {
		this.vo = vo;
	}

	public List<CustomerLoss> getLosslist() {
		return losslist;
	}
	public void setLosslist(List<CustomerLoss> losslist) {
		this.losslist = losslist;
	}
	
}
