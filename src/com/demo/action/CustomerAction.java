package com.demo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.demo.biz.CustomerBiz;
import com.demo.biz.CustomerGradeBiz;
import com.demo.biz.SysnavBiz;
import com.demo.biz.UserInfoBiz;
import com.demo.biz.impl.CrmVo;
import com.demo.biz.impl.CustomerBizImpl;
import com.demo.biz.impl.CustomerGradeBizImpl;
import com.demo.biz.impl.SysnavBizImpl;
import com.demo.biz.impl.UserInfoBizImpl;
import com.demo.connection.SystemContext;
import com.demo.pojo.Customer;
import com.demo.pojo.CustomterGrade;
import com.demo.pojo.Sysnav;
import com.demo.pojo.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport{
//客户详情
private CustomerBiz cusbiz=new CustomerBizImpl();
private List<Customer> culist=new ArrayList<Customer>();

//sysnavbiz
private SysnavBiz sysbiz=new SysnavBizImpl();
private List<Sysnav> alllist=new ArrayList<Sysnav>();
private List<Sysnav> list=new ArrayList<Sysnav>();
private int pageMax;
private CrmVo vo=new CrmVo();
private int customerId;
private List<Customer> cusupda=new ArrayList<Customer>();//查城市
private UserInfoBiz userbiz=new UserInfoBizImpl();//客户经理biz
private List<UserInfo> uselist=new ArrayList<UserInfo>();//客户经理list
private CustomerGradeBiz gradebiz=new CustomerGradeBizImpl();//客户等级biz
private List<CustomterGrade> gradelist=new ArrayList<CustomterGrade>();//客户经理list
private String mingcheng;
private String diqu;
private int jingli;
private int dengji;
private Integer manyi;
private Integer xinyu;
private String dizhi;
private String youzheng;
private String dianhua;
private String chuanzhen;
private String wangzhi;
private String yingye;
private String faren;
private int zijin;
private String yee;
private String yinhang;
private String zhanghao;
private String disui;
private String guosui;
private int id;
private Customer cus;
public String getAllCustomer(){
	
	pageMax=cusbiz.findSize().size();
	SystemContext.setPageOffset(0);
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	culist=cusbiz.getByIdCustomer();
	Map<String,Object> session=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) session.get("user");
	session.put("alllist",alllist);
	session.put("list",list);
	session.put("culist",culist);
	return SUCCESS;
}
public String getAllHousing(){
	
	HttpServletRequest request = ServletActionContext.getRequest();
	SystemContext.setPageOffset(0);
	if(request.getParameter("pager.offset") != null || !"".equals(request.getParameter("pager.offset"))){
		SystemContext.setPageOffset(Integer.parseInt(request.getParameter("pager.offset")));
	}
	pageMax=cusbiz.findSize().size();
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	culist=cusbiz.getByIdCustomer();
	Map<String,Object> session=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) session.get("user");
	session.put("alllist",alllist);
	session.put("list",list);
	session.put("culist",culist);
	return SUCCESS;
}
public String getCustomerToAjax(){
	HttpSession session=ServletActionContext.getRequest().getSession();
	CrmVo Cvo=null;
	if(session.getAttribute("vo")!=null){
		Cvo=(CrmVo)session.getAttribute("vo");
		if(vo.getCustomerId()!=null){
			Cvo.setCustomerId(vo.getCustomerId());
		}else{
			Cvo.setCustomerId(null);
		}
		if(vo.getCustomerName()!=null){
			Cvo.setCustomerName(vo.getCustomerName());
		}else{
			Cvo.setCustomerName(null);
		}
		if(vo.getAddr()!=null){
			Cvo.setAddr(vo.getAddr());
		}else{
			Cvo.setAddr(null);
		}
		if(vo.getCustomerjl()!=null){
			Cvo.setCustomerjl(vo.getCustomerjl());
		}else{
			Cvo.setCustomerjl(null);
		}
		if(vo.getGrade()!=null){
			Cvo.setGrade(vo.getGrade());
			if(vo.getGrade().getGradeId()==0){
				Cvo.setGrade(null);
			}
		}
	}else{
		Cvo=vo;
	}
	session.setAttribute("vo",Cvo);
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	culist=cusbiz.findByCondition(Cvo);
	Map<String,Object> sessions=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) sessions.get("user");
	sessions.put("alllist",alllist);
	sessions.put("list",list);
	return SUCCESS;
}
public String deleteCustomer(){
	Customer cu=cusbiz.findById(customerId);
	System.out.println(customerId);
	cusbiz.deletCustomer(cu);
	return SUCCESS;
}

public String Cusupda(){//修改
	cus=cusbiz.findById(id);
	cus.setCustomerName(mingcheng);//名称
	cus.setCustomerRegion(diqu);//地区
	UserInfo uinfo=new UserInfo();
	uinfo.setUserId(jingli);
	cus.setUser(uinfo);//客户经理
	CustomterGrade cugrade=new CustomterGrade();
	cugrade.setGradeId(dengji);
	cus.setGrade(cugrade);//客户等级
	cus.setSatisfaction(manyi);//客户满意度
	cus.setCredit(xinyu);//客户信用度
	cus.setCustomerAddr(dizhi);//地址
	cus.setMail(youzheng);//邮政编码
	cus.setCustomerrPhone(dianhua);//客户电话
	cus.setCustomerFax(chuanzhen);//传真
	cus.setCustomerUrl(wangzhi);//网址
	cus.setBusinessLicence(yingye);//营业执照注册号
	cus.setCorporation(faren);//法人
	cus.setMoney(zijin);//注册资金
	cus.setAnnualTurnover(yee);//年营金额
	cus.setOpenBank(yinhang);//开户银行
	cus.setBankNumber(zhanghao);//银行账号
	cus.setLandTax(disui);//地税登记号
	cus.setStateTax(guosui);//国税
	cusbiz.attachDirty(cus);
	return SUCCESS;
}

public String ByidAll(){
	cus=cusbiz.findById(id);
	uselist=userbiz.getByIdUserInfo();
	cusupda=cusbiz.All();
	gradelist=gradebiz.findAll();
	return SUCCESS;
}
//构成
public String getallgoucheng(){
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	culist=cusbiz.getgoucheng();
	return SUCCESS;
}
public CustomerBiz getCusbiz() {
	return cusbiz;
}
public void setCusbiz(CustomerBiz cusbiz) {
	this.cusbiz = cusbiz;
}
public List<Customer> getCulist() {
	return culist;
}
public void setCulist(List<Customer> culist) {
	this.culist = culist;
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
public int getPageMax() {
	return pageMax;
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
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public List<Customer> getCusupda() {
	return cusupda;
}
public void setCusupda(List<Customer> cusupda) {
	this.cusupda = cusupda;
}
public UserInfoBiz getUserbiz() {
	return userbiz;
}
public void setUserbiz(UserInfoBiz userbiz) {
	this.userbiz = userbiz;
}
public List<UserInfo> getUselist() {
	return uselist;
}
public void setUselist(List<UserInfo> uselist) {
	this.uselist = uselist;
}
public CustomerGradeBiz getGradebiz() {
	return gradebiz;
}
public void setGradebiz(CustomerGradeBiz gradebiz) {
	this.gradebiz = gradebiz;
}
public List<CustomterGrade> getGradelist() {
	return gradelist;
}
public void setGradelist(List<CustomterGrade> gradelist) {
	this.gradelist = gradelist;
}
public String getMingcheng() {
	return mingcheng;
}
public void setMingcheng(String mingcheng) {
	this.mingcheng = mingcheng;
}
public String getDiqu() {
	return diqu;
}
public void setDiqu(String diqu) {
	this.diqu = diqu;
}
public int getJingli() {
	return jingli;
}
public void setJingli(int jingli) {
	this.jingli = jingli;
}
public int getDengji() {
	return dengji;
}
public void setDengji(int dengji) {
	this.dengji = dengji;
}
public Integer getManyi() {
	return manyi;
}
public void setManyi(Integer manyi) {
	this.manyi = manyi;
}
public Integer getXinyu() {
	return xinyu;
}
public void setXinyu(Integer xinyu) {
	this.xinyu = xinyu;
}
public String getDizhi() {
	return dizhi;
}
public void setDizhi(String dizhi) {
	this.dizhi = dizhi;
}
public String getYouzheng() {
	return youzheng;
}
public void setYouzheng(String youzheng) {
	this.youzheng = youzheng;
}
public String getDianhua() {
	return dianhua;
}
public void setDianhua(String dianhua) {
	this.dianhua = dianhua;
}
public String getChuanzhen() {
	return chuanzhen;
}
public void setChuanzhen(String chuanzhen) {
	this.chuanzhen = chuanzhen;
}
public String getWangzhi() {
	return wangzhi;
}
public void setWangzhi(String wangzhi) {
	this.wangzhi = wangzhi;
}
public String getYingye() {
	return yingye;
}
public void setYingye(String yingye) {
	this.yingye = yingye;
}
public String getFaren() {
	return faren;
}
public void setFaren(String faren) {
	this.faren = faren;
}
public int getZijin() {
	return zijin;
}
public void setZijin(int zijin) {
	this.zijin = zijin;
}
public String getYee() {
	return yee;
}
public void setYee(String yee) {
	this.yee = yee;
}
public String getYinhang() {
	return yinhang;
}
public void setYinhang(String yinhang) {
	this.yinhang = yinhang;
}
public String getZhanghao() {
	return zhanghao;
}
public void setZhanghao(String zhanghao) {
	this.zhanghao = zhanghao;
}
public String getDisui() {
	return disui;
}
public void setDisui(String disui) {
	this.disui = disui;
}
public String getGuosui() {
	return guosui;
}
public void setGuosui(String guosui) {
	this.guosui = guosui;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Customer getCus() {
	return cus;
}
public void setCus(Customer cus) {
	this.cus = cus;
}

}
