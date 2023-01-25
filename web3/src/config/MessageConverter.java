package config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class MessageConverter {

	public static void convert(String data, HttpServletResponse resp) throws IOException {
		resp.setHeader("Content-type", "text/html; charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.println(data);
	}
}
