<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<div id="sidebar">
  <ul>
    
    <li class="submenu"> <a href="#"><i class="icon icon-th-list"></i> <span>登陆管理</span> <span class="label label-important">3</span></a>
      <ul>
        <li><a href="${pageContext.request.contextPath }/logou.actiont">退出登录</a></li>
      </ul>
    </li>
    
    <li class="submenu"> <a href="#"><i class="icon icon-lock"></i> <span>权限管理</span> <span class="label label-important">3</span></a>
      <ul>
      <sec:authorize access="hasRole('ROLE_AUTHORITY')">
        <li><a href="${pageContext.request.contextPath}/user/userList.action?page=1">用户列表</a></li>
      </sec:authorize> 
        <li><a href="${pageContext.request.contextPath}/role/roleList.action?page=1">角色列表</a></li>
        <li><a href="${pageContext.request.contextPath}/auth/authority.action?page=1">权限列表</a></li>
        <li><a href="${pageContext.request.contextPath}/resource/resourceList.action">资源列表</a></li>
      </ul>
    </li>
    <!-- 考试模块 -->
    <li class="submenu"> <a href="#"><i class="icon icon-heart"></i> <span>考试管理</span> <span class="label label-important">3</span></a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/exam/subjectList.action?page=1">科目列表</a></li>
        <li><a href="${pageContext.request.contextPath}/que/QuestionsList.action?page=1">题库列表</a></li>
        <li><a href="${pageContext.request.contextPath}/paper/paper.action?page=1">试卷模板</a></li>
        <li><a href="${pageContext.request.contextPath}/paper/paperInfo.action?page=1">试卷列表</a></li>
        <li><a href="${pageContext.request.contextPath}/exam/paperInfoScoreList.action?page=1">成绩列表</a></li>
      </ul>
    </li>
   
    <li class="submenu"> <a href="#"><i class="icon icon-info-sign"></i> <span>Error</span> <span class="label label-important">4</span></a>
      <ul>
        <li><a href="${pageContext.request.contextPath }/example/error403.action">Error 403</a></li>
        <li><a href="${pageContext.request.contextPath }/example/error404.action">Error 404</a></li>
        <li><a href="${pageContext.request.contextPath }/example/error405.action">Error 405</a></li>
        <li><a href="${pageContext.request.contextPath }/example/error500.action">Error 500</a></li>
      </ul>
    </li>
  <li class="submenu"> <a href="#"><i class="icon icon-th-list"></i> <span>案列页面</span> <span class="label label-important">4</span></a>
      <ul>
         <li><a href="${pageContext.request.contextPath }/example/table.action">Table</a></li>
        <li><a href="${pageContext.request.contextPath }/example/button_and_icons.action">Buttons & icons</a></li>
        <li><a href="${pageContext.request.contextPath }/example/form_common.action">Form common</a></li>
        <li><a href="${pageContext.request.contextPath }/example/form_validation.action">Form validation</a></li>
        <li><a href="${pageContext.request.contextPath }/example/form_wizard.action">Form wizard</a></li>
        <li><a href="${pageContext.request.contextPath }/example/gridlayout.action">Grid Layout</a></li>
        <li><a href="${pageContext.request.contextPath }/example/index_info.action">Index info</a></li>
         <li><a href="${pageContext.request.contextPath }/example/interface_elements.action">Interface elements</a></li>
      </ul>
    </li>
  </ul>
</div>