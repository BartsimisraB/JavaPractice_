<%@page import="bean.BoardBean"%>
<%@page import="java.util.Vector"%>
<%@page import="bean.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h2>전체 게시글</h2>
	<%
		int pageSize=10;
	
		String pageNum=request.getParameter("pageNum");
		if(pageNum==null){
			pageNum="1";
		}
		int count=0;
		int number=0;
		
		
		BoardDAO bdao=new BoardDAO();
		count=bdao.getAllCount(); //전체 게시글 개수 읽어오는 메소드
		
		int currentPage=Integer.parseInt(pageNum);//현재 페이지 인덱스 번호
		
		int startRow=(currentPage-1)*pageSize+1;
		//             1
		int endRow=currentPage*pageSize; //1*10
		
		Vector<BoardBean> vec=bdao.allBoard(startRow,endRow);
		
		number=count-(currentPage-1)*pageSize;
		//        13
	%>

	<table width="800" border="1" bgcolor="green">
		<tr height="40">
			<td width="50" align="center">번호</td>
			<td width="420" align="center">제복</td>
			<td width="100" align="center">작성자</td>
			<td width="150" align="center">작성날짜</td>
			<td width="80" align="center">조회수</td>
		</tr>
		<%
			for(int i = 0; i <vec.size(); i++) {
				BoardBean bean = vec.get(i);
		%>
		
		<tr height="40">
			<td width="50" align="center"><%=number-- %></td>
			<td width="50" align="center">
				<a href="boardin.jsp?num=<%=bean.getNum() %>" style="text-decoration:none">
				<%
					if(bean.getRe_step() > 1) {
						for(int j = 0; j < (bean.getRe_step() - 1) * 5; j++) {
				%>		
					&nbsp;	
				<%
						}
					}
				%>
			<%=bean.getSubject() %></a>
			</td>
			<td width="100" align="center"><%=bean.getWriter() %></td>
		 	<td width="150" align="center"><%=bean.getReg_date() %></td>
			<td width="80" align="center"><%=bean.getReadcount() %></td>
		</tr>
		<%
			}
		%>
		<tr height="40">
			<td align="center" colspan="2">
				<input type="button" value="글작성" onclick="location.href='boardform.jsp'">
			</td>
		</tr>
	</table>
	
<%
      if(count>0){      //  27/10 + (27 % 10) +1 =3
         int pageCount= count/pageSize + (count % pageSize == 0 ? 0:1);
         //총 페이지 수
         
         int startPage=1;
         
         if(currentPage % 10 !=0){ //currentPage가 11일때
            startPage = (int)(currentPage/10)*10+1; //1
         }
         else{  //currentPage가 10일때
            startPage=((int)(currentPage/10)-1)*10+1; 
         }
         
         int pageBlock=10;
         
         int endPage = startPage + pageBlock - 1;
                 
                      //1+10-1=10
         if(endPage > pageCount)
            endPage=pageCount;
                      
      //이전이라는 하이퍼링크를 만들건지 생각해야함
         if(startPage>10){
      %>      
      <a href="BoardList.jsp?pageNum='<%=startPage-10 %>'">[이전]</a>
      
   <%       
         }
         for(int i=startPage;i<=endPage;i++){
   %>
      <a href="BoardList.jsp?pageNum='<%=i %>'">[<%=i %>]</a>
   
   <%         
         }
         if(endPage<pageCount){
   %>
      <a href="BoardList.jsp?pageNum='<%=startPage+10 %>'">[다음]</a>
      
   <%         
         }      
      }
   %>
   
</center>
</body>
</html>