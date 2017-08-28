<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://eos.primeton.com/tags/logic" prefix="l"%>
<%@ taglib uri="http://eos.primeton.com/tags/bean" prefix="b"%>
<%@ taglib uri="http://eos.primeton.com/tags/dict" prefix="d"%>
<%@ taglib uri="http://eos.primeton.com/tags/html" prefix="h"%>
<%@page import="com.gotop.util.time.TimeUtil"%>
<%
	response.setContentType("application/x-msdownload;charset=UTF-8");
	//设置Excel的名称;	
	String date = TimeUtil.today()+TimeUtil.now();
	response.setHeader("Content-Disposition",
			"attachment; filename=\""+date+".xls\"");
	out.flush();
%>
<table width="98%" border="1" cellspacing="1" cellpadding="1">
	<tr height="34">
		<th height="34" width="100" align="center" class="form_label">一级支行</th>
		<th height="34" width="100" align="center" class="form_label">二级支行</th>
		<th height="34" width="100" align="center" class="form_label">一级分类</th>
		<th height="34" width="100" align="center" class="form_label">贷种分类</th>
		<th height="34" width="200" align="center" class="form_label">主调客户经理</th>
		<th height="34" width="100" align="center" class="form_label">综合岗一次派单总时长</th>
		<th height="34" width="100" align="center" class="form_label">综合岗一次派单总笔数</th>
		<th height="34" width="100" align="center" class="form_label">综合岗一次派单时间</th>
		<th height="34" width="100" align="center" class="form_label">综合岗二次派单总时长</th>
		<th height="34" width="100" align="center" class="form_label">综合岗二次派单总笔数</th>
		<th height="34" width="100" align="center" class="form_label">综合岗二次派单时间</th>
		<th height="34" width="100" align="center" class="form_label">综合岗三次派单总时长</th>
		<th height="34" width="100" align="center" class="form_label">综合岗三次派单总笔数</th>
		<th height="34" width="100" align="center" class="form_label">综合岗三次派单时间</th>
		<th height="34" width="100" align="center" class="form_label">审查审批一次作业总时长</th>
		<th height="34" width="100" align="center" class="form_label">审查审批一次作业总笔数</th>
		<th height="34" width="100" align="center" class="form_label">审查审批一次作业时间</th>
		<th height="34" width="100" align="center" class="form_label">审查审批二次作业总时长</th>
		<th height="34" width="100" align="center" class="form_label">审查审批二次作业总笔数</th>
		<th height="34" width="100" align="center" class="form_label">审查审批二次作业时间</th>
		<th height="34" width="100" align="center" class="form_label">审查审批三次以上总时长</th>
		<th height="34" width="100" align="center" class="form_label">审查审批三次以上总笔数</th>
		<th height="34" width="100" align="center" class="form_label">审查审批三次以上作业时间</th>
		<th height="34" width="100" align="center" class="form_label">全流程作业总时长1</th>
		<th height="34" width="100" align="center" class="form_label">全流程作业总笔数1</th>
		<th height="34" width="100" align="center" class="form_label">全流程作业时间1</th>
		<th height="34" width="100" align="center" class="form_label">全流程作业总时长2</th>
		<th height="34" width="100" align="center" class="form_label">全流程作业总笔数2</th>
		<th height="34" width="100" align="center" class="form_label">全流程作业时间2</th>
		<th height="34" width="100" align="center" class="form_label">资料完整后审批总时长</th>
		<th height="34" width="100" align="center" class="form_label">资料完整后审批总笔数</th>
		<th height="34" width="100" align="center" class="form_label">资料完整后审批时间</th>
		
	</tr>
	<l:iterate property="timeLimitConditionReportList" id="id1">
			<tr class="<l:output evenOutput='EOS_table_row' />" id="id1">
			  <td style="vnd.ms-excel.numberformat:@">
			    	<b:write iterateId="id1" property="orgNameOne"/>
			  </td>
			  <td style="vnd.ms-excel.numberformat:@">
			    	<b:write iterateId="id1" property="orgNameTwo"/>
			  </td>
			  <td style="vnd.ms-excel.numberformat:@">
			    <b:write iterateId="id1" property="oneCategory"/>
			  </td>
			   <td style="vnd.ms-excel.numberformat:@">
			   <b:write iterateId="id1" property="loanCategory"/>
			  </td>
			   <td style="vnd.ms-excel.numberformat:@">
			    <b:write iterateId="id1" property="zdCustManager" />
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fzOne"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fmOne"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="zhgpdTimeOne"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fzTwo"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fmTwo"/>
			  </td>
			   <td>
			   <b:write iterateId="id1" property="zhgpdTimeTwo"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fzThree"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fmThree"/>
			  </td>
			   <td>
			   <b:write iterateId="id1" property="zhgpdTimeThree"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fzFour"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fmFour"/>
			  </td>
			   <td>
			   <b:write iterateId="id1" property="reviewApprovalOneTime"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fzFive"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fmFive"/>
			  </td>
			   <td>
			   <b:write iterateId="id1" property="reviewApprovalTwoTime"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fzSix"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fmSix"/>
			  </td>
			   <td>
			   <b:write iterateId="id1" property="reviewApprovalThreeOrMoreTime"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fzSeven"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fmSeven"/>
			  </td>
			   <td>
			   <b:write iterateId="id1" property="allProcessTimeOne"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fzEight"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fmEight"/>
			  </td>
			   <td>
			   <b:write iterateId="id1" property="allProcessTimeTwo"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fzNine"/>
			  </td>
			    <td>
			   <b:write iterateId="id1" property="fmNine"/>
			  </td>
			   <td>
			   <b:write iterateId="id1" property="zlwzhApprovalTime"/>
			  </td>
			</tr>
			</l:iterate>
		</table>
   