package com.virtual.revisited.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.virtual.revisited.constants.EmployeeControllerPortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletParameters;
import javax.portlet.PortletRequest;

import org.osgi.service.component.annotations.Component;


@Component(
		immediate=true,
		property = {
			"javax.portlet.name=" + EmployeeControllerPortletKeys.EMPLOYEECONTROLLER,
			"mvc.command.name=saveEmployee"
		},
		service = MVCActionCommand.class 
		)
public class SaveActionMVCCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest arg0, ActionResponse arg1) throws Exception {
		
		String name = ParamUtil.get(arg0, "name","");
		String address = ParamUtil.get(arg0, "address","");
		String phoneNo = ParamUtil.get(arg0, "phoneNo","");
		long salary = ParamUtil.get(arg0, "salary",0);
		String emailAddress = ParamUtil.get(arg0, "emailAddress","");
		String dol = ParamUtil.get(arg0, "dol","");
		String doj = ParamUtil.get(arg0, "doj","");
		
		System.out.println(name + " - " + address+ " - " +phoneNo+ " - " +salary+ " - " +emailAddress+ " - " +dol+ " - " +doj);
		
		System.out.println("SaveActionMvcCommand.doProcessAction()");
		
	}

}
