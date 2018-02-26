package com.demo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.demo.biz.DataDictionaryBiz;
import com.demo.biz.SysnavBiz;
import com.demo.biz.impl.CrmVo;
import com.demo.biz.impl.DataDictionaryBizImpl;
import com.demo.biz.impl.SysnavBizImpl;
import com.demo.connection.SystemContext;
import com.demo.pojo.DataDictionary;
import com.demo.pojo.Sysnav;
import com.demo.pojo.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DictionaryAction extends ActionSupport{
	private DataDictionaryBiz databiz=new DataDictionaryBizImpl();
	private List<DataDictionary> datalist=new ArrayList<DataDictionary>();
	private DataDictionary data=new DataDictionary();
	private SysnavBiz sysbiz = new SysnavBizImpl();
	private List<Sysnav> list = new ArrayList<Sysnav>();
	private List<Sysnav> alllist = new ArrayList<Sysnav>();
	
	
	private CrmVo vo=new CrmVo(); 
	private int id;
	private String datatype;
	private String dataentry;
	private String datavalue;
	private int pageMax;
	private String leibie;
	private String tiaomu;
	private String zhi;
	private int bianji;
	public String DataAll(){//查询
		SystemContext.setPageOffset(0);
		pageMax = databiz.findSize().size();
		alllist=sysbiz.findAll();
		list = sysbiz.getSysPid(0);
		datalist =databiz.findAll();
		Map<String, Object> session = ActionContext.getContext().getSession();
		UserInfo user = (UserInfo) session.get("user");
		session.put("alllist", datalist);
		session.put("list", list);
		//UserInfo u= (UserInfo) ActionContext.getContext().getSession().get(user);
		return SUCCESS;
	}
	public String DataUpda(){//修改
		data=databiz.findById(id);
		data.setDataType(leibie);
		data.setEntry(tiaomu);
		data.setDataValue(zhi);
		data.setState(bianji);
		databiz.attachDirty(data);
		return SUCCESS;
	}
	public String AddData(){//添加
		
		data.setDataType(leibie);
		data.setEntry(tiaomu);
		data.setDataValue(zhi);
		data.setState(bianji);
		databiz.save(data);
		
		return SUCCESS;
	}
	public String Byiddata(){//按id查询单项
		data=databiz.findById(id);
		alllist=sysbiz.findAll();
		list=sysbiz.getSysPid(0);
		Map<String,Object> session=ActionContext.getContext().getSession();
		UserInfo user=(UserInfo) session.get("user");
		session.put("alllist",alllist);
		session.put("list",list);
		//UserInfo u= (UserInfo) ActionContext.getContext().getSession().get(user);
		return SUCCESS;
	}
	public String DataDele(){//删除，，改状态
		data=databiz.findById(id);
		databiz.deletData(data);
		
		return SUCCESS;
	}
	public String findAllData() {//分页
		HttpServletRequest request = ServletActionContext.getRequest();
		SystemContext.setPageOffset(0);
		if (request.getParameter("pager.offset") != null
				|| !"".equals(request.getParameter("pager.offset"))) {
			SystemContext.setPageOffset(Integer.parseInt(request
					.getParameter("pager.offset")));
		}
		pageMax = databiz.findSize().size();
		alllist = sysbiz.findAll();
		list = sysbiz.getSysPid(0);
		datalist = databiz.findAll();
		Map<String, Object> session = ActionContext.getContext().getSession();
		UserInfo user = (UserInfo) session.get("user");
		session.put("alllist", datalist);
		session.put("list", list);
		//UserInfo u= (UserInfo) ActionContext.getContext().getSession().get(user);
		return SUCCESS;
	}
	

	public String getCustomerToAjax(){ //多条件查询
		HttpSession session=ServletActionContext.getRequest().getSession();
		CrmVo Cvo=null;
		if(session.getAttribute("vo")!=null){
			Cvo=(CrmVo)session.getAttribute("vo");
			if(vo.getDataType()!=null){
				Cvo.setDataType(vo.getDataType());
				if(vo.getDataType()==null){
					Cvo.setDataType(null);
				}
			}
		if(vo.getEntry()!=null){
			Cvo.setEntry(vo.getEntry());
			if(vo.getEntry()==null){
				Cvo.setEntry(null);
			}
		}
		if(vo.getDataValue()!=null){
			Cvo.setDataValue(vo.getDataValue());
			if(vo.getDataValue()==null){
				Cvo.setDataValue(null);
			}
		}
		}else{
			Cvo=vo;
		}
		//SystemContext.setPageOffset(0);
		//pageMax = databiz.findSize().size();
		session.setAttribute("vo",Cvo);
		alllist=sysbiz.findAll();
		list=sysbiz.getSysPid(0);
		datalist=databiz.findByCondition(Cvo);
		Map<String,Object> sessions=ActionContext.getContext().getSession();
		UserInfo user=(UserInfo) sessions.get("user");
		sessions.put("alllist",alllist);
		sessions.put("list",list);
		//UserInfo u= (UserInfo) ActionContext.getContext().getSession().get(user);
		return SUCCESS;
	}
	public List<DataDictionary> getDatalist() {
		return datalist;
	}
	public void setDatalist(List<DataDictionary> datalist) {
		this.datalist = datalist;
	}
	public DataDictionary getData() {
		return data;
	}
	public void setData(DataDictionary data) {
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public String getDataentry() {
		return dataentry;
	}
	public void setDataentry(String dataentry) {
		this.dataentry = dataentry;
	}
	public String getDatavalue() {
		return datavalue;
	}
	public void setDatavalue(String datavalue) {
		this.datavalue = datavalue;
	}
	public int getPageMax() {
		return pageMax;
	}
	public String getLeibie() {
		return leibie;
	}
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	public String getTiaomu() {
		return tiaomu;
	}
	public void setTiaomu(String tiaomu) {
		this.tiaomu = tiaomu;
	}
	public String getZhi() {
		return zhi;
	}
	public void setZhi(String zhi) {
		this.zhi = zhi;
	}

	public int getBianji() {
		return bianji;
	}
	public void setBianji(int bianji) {
		this.bianji = bianji;
	}
	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}
	public SysnavBiz getSysbiz() {
		return sysbiz;
	}
	public void setSysbiz(SysnavBiz sysbiz) {
		this.sysbiz = sysbiz;
	}
	public List<Sysnav> getList() {
		return list;
	}
	public void setList(List<Sysnav> list) {
		this.list = list;
	}
	public DataDictionaryBiz getDatabiz() {
		return databiz;
	}
	public void setDatabiz(DataDictionaryBiz databiz) {
		this.databiz = databiz;
	}
	public List<Sysnav> getAlllist() {
		return alllist;
	}
	public void setAlllist(List<Sysnav> alllist) {
		this.alllist = alllist;
	}
	public CrmVo getVo() {
		return vo;
	}
	public void setVo(CrmVo vo) {
		this.vo = vo;
	}
	
}
