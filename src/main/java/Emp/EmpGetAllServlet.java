package Emp;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Emp.dao.EmpDao;
import Emp.dao.impl.EmpDaoImpl;
import Emp.vo.Emp;

@WebServlet("/emp/getAll")
public class EmpGetAllServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		EmpDao dao = new EmpDaoImpl();
		List<Emp> list = null;
		try {
			list = dao.selectAll();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Gson gson = new Gson();
		String jsonStr = gson.toJson(list);
		resp.getWriter().write(jsonStr);
		System.out.println("succes");
	}
}