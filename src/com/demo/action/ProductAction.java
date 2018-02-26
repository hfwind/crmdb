package com.demo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.demo.biz.ProductBiz;
import com.demo.biz.SysnavBiz;
import com.demo.biz.impl.CrmVo;
import com.demo.biz.impl.ProductBizImpl;
import com.demo.biz.impl.SysnavBizImpl;
import com.demo.connection.SystemContext;
import com.demo.pojo.Product;
import com.demo.pojo.Sysnav;
import com.demo.pojo.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport{
	ProductBiz pbiz=new ProductBizImpl();
	private CrmVo vo=new CrmVo();
	private List<Product> plist=new ArrayList<Product>();
	private SysnavBiz sysbiz = new SysnavBizImpl();
	private List<Sysnav> alllist = new ArrayList<Sysnav>();
	private List<Sysnav> list = new ArrayList<Sysnav>();
	private UserInfo user;
	private int pageMax;
	//查询所有库存信息
	public String getAllProduct(){
		pageMax=pbiz.findSize().size();
		SystemContext.setPageOffset(0);
		Map<String, Object> session = ActionContext.getContext().getSession();
		user = (UserInfo) session.get("user");
		alllist = sysbiz.findAll();
		System.out.println(pageMax);
		list = sysbiz.getSysPid(0);
		plist=pbiz.findAll();
		session.put("plist", plist);
		session.put("alllist", alllist);
		session.put("list", list);
		return SUCCESS;		
	}
	//分页查询库存信息 
	public String getProductPage(){
		HttpServletRequest request = ServletActionContext.getRequest();
		pageMax=pbiz.findSize().size();
		SystemContext.setPageOffset(0);
		if(request.getParameter("pager.offset") != null || !"".equals(request.getParameter("pager.offset"))){
			SystemContext.setPageOffset(Integer.parseInt(request.getParameter("pager.offset")));
		}
		Map<String, Object> session = ActionContext.getContext().getSession();
		user = (UserInfo) session.get("user");
		alllist = sysbiz.findAll();
		System.out.println(pageMax);
		list = sysbiz.getSysPid(0);
		plist=pbiz.findAll();
		session.put("plist", plist);
		session.put("alllist", alllist);
		session.put("list", list);
		return SUCCESS;	
	}
	//筛选查询库存信息
	public String getProductToAjaxfenpei(){
		HttpSession session=ServletActionContext.getRequest().getSession();
		CrmVo cvo=null;
		if(session.getAttribute("vo")!=null){
			cvo=(CrmVo) session.getAttribute("vo");
			if(vo.getProductName()!=null){
				cvo.setProductName(vo.getProductName());
			}else{
				cvo.setProductName(null);
			}
			if(vo.getGoods()!=null){
				cvo.setGoods(vo.getGoods());
			}else{
				cvo.setGoods(null);
			}
			if(vo.getRemark()!=null){
				cvo.setRemark(vo.getRemark());
			}else{
				cvo.setRemark(null);
			}
			if(vo.getWar()!=null){
				cvo.setWar(vo.getWar());
				if(vo.getWar().getWarehouseName()==null){
					cvo.setWar(null);
				}
			}
		}else{
			cvo=vo;		
		}
		pageMax=pbiz.findSize().size();
		SystemContext.setPageOffset(0);
		session.setAttribute("vo", cvo);
		alllist=sysbiz.findAll();
		list=sysbiz.getSysPid(0);
		plist=pbiz.findByConditions(cvo);
		Map<String,Object> sessions=ActionContext.getContext().getSession();
		UserInfo user=(UserInfo) sessions.get("user");
		sessions.put("alllist",alllist);
		sessions.put("list",list);
		return SUCCESS;

	} 
	//筛选查询库存信息
		public String getchangkushaixuan(){
			HttpSession session=ServletActionContext.getRequest().getSession();
			CrmVo cvo=null;
			if(session.getAttribute("vo")!=null){
				cvo=(CrmVo) session.getAttribute("vo");
				if(vo.getRemark()!=null){
					cvo.setRemark(vo.getRemark());
				}else{
					cvo.setRemark(null);
				}
				if(vo.getWar()!=null){
					cvo.setWar(vo.getWar());
					System.out.println(cvo.getWar().getWarehouseName());
					if(vo.getWar().getWarehouseName()==null){
						cvo.setWar(null);
					}
				}
			}else{
				cvo=vo;		
			}
			pageMax=pbiz.findSize().size();
			SystemContext.setPageOffset(0);
			session.setAttribute("vo", cvo);
			alllist=sysbiz.findAll();
			list=sysbiz.getSysPid(0);
			plist=pbiz.findByConditions2(cvo);
			Map<String,Object> sessions=ActionContext.getContext().getSession();
			UserInfo user=(UserInfo) sessions.get("user");
			sessions.put("alllist",alllist);
			sessions.put("list",list);
			return SUCCESS;

		} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getPageMax() {
		return pageMax;
	}




















	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}




















	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public ProductBiz getPbiz() {
		return pbiz;
	}
	public void setPbiz(ProductBiz pbiz) {
		this.pbiz = pbiz;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	public SysnavBiz getSysbiz() {
		return sysbiz;
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
	public List<Sysnav> getList() {
		return list;
	}
	public void setList(List<Sysnav> list) {
		this.list = list;
	}
	public CrmVo getVo() {
		return vo;
	}
	public void setVo(CrmVo vo) {
		this.vo = vo;
	}
}
