package cn.xxx.elec.web.action;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.xxx.elec.service.ElecSystemDDLService;
import cn.xxx.elec.service.ElecUserService;
import cn.xxx.elec.web.vo.ElecSystemDDLForm;
import cn.xxx.elec.web.vo.ElecUserForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;


@Component("elecUserAction_*")
@SuppressWarnings("serial")
public class ElecUserAction extends BaseAction implements ModelDriven<ElecUserForm>{
	
	private ElecUserService eus;
	private ElecSystemDDLService esds;
	private ElecUserForm elecUserForm = new ElecUserForm();
	

	public ElecUserService getEus() {
		return eus;
	}

	@Resource(name=ElecUserService.SERVICE_NAME)
	public void setEus(ElecUserService eus) {
		this.eus = eus;
	}
	@Resource(name=ElecSystemDDLService.SERVICE_NAME)
	public void setEsds(ElecSystemDDLService esds){
		this.esds = esds;
	}
	@Override
	public ElecUserForm getModel() {
		return this.elecUserForm;
	}
	/**  
	* @Name: userIndex
	* @Description: 跳转到用户管理页面
	* @Author: wei（作者）
	* @Version: V1.00 （版本号）
	* @Create Date: 2015-1-21 （创建日期）
	* @Parameters: 
	* @Return: String userIndex 
	*/
	public String userIndex(){
		//System.out.println("user manager");
		List<ElecUserForm> list = eus.findElecUserList(elecUserForm);
		request.put("userList", list);
		return "userIndex";
	}
	/**  
	* @Name: userAdd
	* @Description: 跳转到用户添加页面
	* @Author: wei
	* @Version: V1.00 
	* @Create Date: 2015-01-23
	* @Parameters: 
	* @Return: String 值为userAdd
	*/
	public String userAdd(){
		initSystemDDL();
		return "userAdd";
	}
	/**  
	* @Name: initSystemDDL
	* @Description: 初始化用户数据字典中的数据项
	* @Author: wei
	* @Version: V1.00 
	* @Create Date: 2015-01-24
	* @Parameters:无 
	* @Return: 无
	*/
	private void initSystemDDL(){
		List<ElecSystemDDLForm> sexList = esds.findByKeyWord("性别");
		List<ElecSystemDDLForm> jctList = esds.findByKeyWord("所属单位");
		List<ElecSystemDDLForm> isDutyList = esds.findByKeyWord("是否在职");
		request.put("sexList", sexList);
		request.put("jctList", jctList);
		request.put("isDutyList", isDutyList);
	}
	/**  
	* @Name: save
	* @Description: 用户添加
	* @Author: wei
	* @Version: V1.00 
	* @Create Date: 2015-01-23
	* @Parameters: 
	* @Return: String 值为save
	*/
	public String save(){
		//System.out.println("save----");
		System.out.println(elecUserForm);
		eus.saveUser(elecUserForm);
		return "save";
	}
	
	/**  
	* @Name: userEdit
	* @Description: 用户添加
	* @Author: wei
	* @Version: V1.00 
	* @Create Date: 2015-01-23
	* @Parameters: 
	* @Return: String 值为userEdit 跳转到userEdit.jsp
	*/
	public String userEdit(){
		initSystemDDL();
		elecUserForm = eus.findElecUser(elecUserForm);
		//ValueStack stack = ActionContext.getContext().getValueStack();
		//stack.push(elecUserForm);
		//System.out.println(elecUserForm);
		String viewFlag = elecUserForm.getViewFlag();
		request.put("viewFlag", viewFlag);		
		return "userEdit";
	}
	
	/**  
	* @Name: delete
	* @Description: 用户添加
	* @Author: wei
	* @Version: V1.00 
	* @Create Date: 2015-01-23
	* @Parameters: 
	* @Return: String 值为userEdit 跳转到userEdit.jsp
	*/
	public String delete(){
		eus.deleteElecUser(elecUserForm);
		return "save";
	}
}