package com.demo.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.demo.biz.ServiceManagerBiz;
import com.demo.biz.SysnavBiz;
import com.demo.biz.UserInfoBiz;
import com.demo.biz.impl.CrmVo;
import com.demo.biz.impl.ServiceManagerBizImpl;
import com.demo.biz.impl.SysnavBizImpl;
import com.demo.biz.impl.UserInfoBizImpl;
import com.demo.connection.SystemContext;
import com.demo.pojo.ServiceManager;
import com.demo.pojo.Sysnav;
import com.demo.pojo.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ServiceManagerAction extends ActionSupport{
private List<ServiceManager>smlist=new ArrayList<ServiceManager>();
private int pageMax;
private SysnavBiz sysbiz=new SysnavBizImpl();
private List<Sysnav> alllist=new ArrayList<Sysnav>();
private List<Sysnav> list=new ArrayList<Sysnav>();
private CrmVo vo=new CrmVo();
private ServiceManagerBiz smb=new ServiceManagerBizImpl();
private ServiceManager servicemanager;
private UserInfoBiz uib=new UserInfoBizImpl();
private List<UserInfo> uslist=new ArrayList<UserInfo>();
private int serviceId;
private String kehuName;
private String jieguoName;
private int chuliId;
private String chulijieguo;
private int number;
//查询所有服务
public String getAllServiceManager(){
	SystemContext.setPageOffset(0);
	pageMax=smb.getAllService().size();
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	smlist=smb.getAllService();
	uslist=uib.getByIdUserInfo();
	Map<String,Object> session=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) session.get("user");
	session.put("alllist",alllist);
	session.put("list",list);
	return SUCCESS;
	
}
//导航栏方法
public void daohang(){
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	uslist=uib.getByIdUserInfo();
	Map<String,Object> session=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) session.get("user");
	session.put("alllist",alllist);
	session.put("list",list);
	
}
//分页查询
public String getserviceSize(){
	HttpServletRequest request = ServletActionContext.getRequest();
	SystemContext.setPageOffset(0);
	if(request.getParameter("pager.offset") != null || !"".equals(request.getParameter("pager.offset"))){
		SystemContext.setPageOffset(Integer.parseInt(request.getParameter("pager.offset")));
	}
	pageMax=smb.getAllService().size();	
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	smlist=smb.getAllService();
	uslist=uib.getByIdUserInfo();
	Map<String,Object> session=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) session.get("user");
	session.put("alllist",alllist);
	session.put("list",list);
	return SUCCESS;
	
}

//筛选新建的服务
public String getServiceManagerToAjax(){
	HttpSession session=ServletActionContext.getRequest().getSession();
	CrmVo cvo=null;
	if(session.getAttribute("vo")!=null){
		cvo=(CrmVo) session.getAttribute("vo");
		if(vo.getKehuName()!=null){
			cvo.setKehuName(vo.getKehuName());
		}else{
			cvo.setKehuName(null);
		}
		if(vo.getPrefile()!=null){
			cvo.setPrefile(vo.getPrefile());
		}else{
			cvo.setPrefile(null);
		}
		if(vo.getFuwutype()!=null){
		cvo.setFuwutype(vo.getFuwutype());
		}else{
			cvo.setFuwutype(null);
		}
	}else{
		cvo=vo;
	}
	session.setAttribute("vo", cvo);
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	uslist=uib.getByIdUserInfo();
	smlist=smb.findByCondition(cvo);
	Map<String,Object> sessions=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) sessions.get("user");
	sessions.put("alllist",alllist);
	sessions.put("list",list);
	return SUCCESS;
	
}
//筛选分配的服务
public String getServiceManagerToAjax2(){
	HttpSession session=ServletActionContext.getRequest().getSession();
	CrmVo cvo=null;
	if(session.getAttribute("vo")!=null){
		cvo=(CrmVo) session.getAttribute("vo");
		if(vo.getKehuName()!=null){
			cvo.setKehuName(vo.getKehuName());
		}else{
			cvo.setKehuName(null);
		}
		if(vo.getPrefile()!=null){
			cvo.setPrefile(vo.getPrefile());
		}else{
			cvo.setPrefile(null);
		}
		if(vo.getFuwutype()!=null){
		cvo.setFuwutype(vo.getFuwutype());
		}else{
			cvo.setFuwutype(null);
		}
	}else{
		cvo=vo;
	}
	session.setAttribute("vo", cvo);
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	uslist=uib.getByIdUserInfo();
	smlist=smb.findByCondition2(cvo);
	Map<String,Object> sessions=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) sessions.get("user");
	sessions.put("alllist",alllist);
	sessions.put("list",list);
	return SUCCESS;
	
}
//新建服务
public String addService(){
	servicemanager.setState(1);
	smb.saveService(servicemanager);
	return SUCCESS;
}
//删除
public String deletefuwu(){
	ServiceManager servicemanager=smb.getServiceById(serviceId);
	smb.deleteService(servicemanager);
	return SUCCESS;
}
//分配服务 修改
public String updatefuwu() throws UnsupportedEncodingException{
	HttpServletResponse response=ServletActionContext.getResponse();
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
	ServiceManager servicemanager=smb.getServiceById(serviceId);
	System.out.println(serviceId);
	System.out.println(kehuName+"adasfasf");
	kehuName=new String(kehuName.getBytes("ISO-8859-1"),"UTF-8");
	servicemanager.setProcesPerson(kehuName);
	servicemanager.setState(2);
	servicemanager.setProcesTime(new Date());
	smb.updateService(servicemanager);
	return SUCCESS;
}
//查询所有分配的服务
public String getfenpeiService(){
	smlist=smb.getallFenpeiService();
	daohang();	
	return SUCCESS;
}

//查询分配完的服务详情
public String chuliServiceXiang(){
	daohang();
	servicemanager=smb.getServiceById(serviceId);
	return SUCCESS;
}
//填写处理方案
public String chulijieguo() throws UnsupportedEncodingException{
	/*(HttpServletResponse response=ServletActionContext.getResponse();
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
	jieguoName=new String(jieguoName.getBytes("ISO-8859-1"),"UTF-8");*/
	
	System.out.println(jieguoName+"aaaaaa");
	System.out.println(chuliId+"bbbbbb");
	
	servicemanager=smb.getServiceById(chuliId);
	servicemanager.setServiceProcssing(jieguoName);
	servicemanager.setState(3);
	smb.updateService(servicemanager);
	
	return SUCCESS;
}
//查询处理完的服务
public String getchuliservice(){
	smlist=smb.getchuliService();
	daohang();
	return SUCCESS;
}
//查询处理完的服务详情
public String chuliwanServiceXiang(){
	servicemanager=smb.getServiceById(serviceId);
	daohang();
	return SUCCESS;
}
//填写处理结果
public String tianxiejieguo(){
	servicemanager=smb.getServiceById(chuliId);
	servicemanager.setProcesResult(chulijieguo);
	servicemanager.setState(4);
	servicemanager.setSatisfaction(number);
	smb.updateService(getServicemanager());
	return SUCCESS;
}
//查询所有反馈完毕的服务(归档)
public String getfankuiwanservice(){
	smlist=smb.getfankuiService();
	daohang();
	return SUCCESS;
}
//查询所有服务的详细(归档)
public String getguidangService() {
	servicemanager=smb.getServiceById(serviceId);
	daohang();
	return SUCCESS;
}
//服务分析
public String getfuwufenxi(){
	daohang();
	smlist=smb.getallfuwu(); 
	return SUCCESS;
}
public String getServiceManager(){
	HttpSession session=ServletActionContext.getRequest().getSession();
	CrmVo cvo=null;
	if(session.getAttribute("vo")!=null){
		cvo=(CrmVo) session.getAttribute("vo");
		if(vo.getKehuName()!=null){
			cvo.setKehuName(vo.getKehuName());
		}else{
			cvo.setKehuName(null);
		}
		if(vo.getPrefile()!=null){
			cvo.setPrefile(vo.getPrefile());
		}else{
			cvo.setPrefile(null);
		}
	}else{
		cvo=vo;
	}
	session.setAttribute("vo", cvo);
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	uslist=uib.getByIdUserInfo();
	smlist=smb.findByCondition3(cvo);
	Map<String,Object> sessions=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) sessions.get("user");
	sessions.put("alllist",alllist);
	sessions.put("list",list);
	return SUCCESS;
	
}
public void setSmlist(List<ServiceManager> smlist) {
	this.smlist = smlist;
}
public int getPageMax() {
	return pageMax;
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

public ServiceManagerBiz getSmb() {
	return smb;
}

public void setSmb(ServiceManagerBiz smb) {
	this.smb = smb;
}

public CrmVo getVo() {
	return vo;
}

public void setVo(CrmVo vo) {
	this.vo = vo;
}

public ServiceManager getServicemanager() {
	return servicemanager;
}

public void setServicemanager(ServiceManager servicemanager) {
	this.servicemanager = servicemanager;
}

public UserInfoBiz getUib() {
	return uib;
}

public void setUib(UserInfoBiz uib) {
	this.uib = uib;
}

public List<UserInfo> getUslist() {
	return uslist;
}

public void setUslist(List<UserInfo> uslist) {
	this.uslist = uslist;
}

public int getServiceId() {
	return serviceId;
}

public void setServiceId(int serviceId) {
	this.serviceId = serviceId;
}

public String getKehuName() {
	return kehuName;
}

public void setKehuName(String kehuName) {
	this.kehuName = kehuName;
}

public String getJieguoName() {
	return jieguoName;
}

public void setJieguoName(String jieguoName) {
	this.jieguoName = jieguoName;
}

public int getChuliId() {
	return chuliId;
}

public void setChuliId(int chuliId) {
	this.chuliId = chuliId;
}

public String getChulijieguo() {
	return chulijieguo;
}

public void setChulijieguo(String chulijieguo) {
	this.chulijieguo = chulijieguo;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public List<ServiceManager> getSmlist() {
	return smlist;
}	
	

}
