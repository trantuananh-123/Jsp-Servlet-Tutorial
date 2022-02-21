# Servlet-Config

- tag init-param dùng để config 1 param khi khởi tạo:
    + param-name: tên param.
    + param-value: giá trị param.
- option initParams của annotation WebServlet dùng để config param khi khởi tạo:
    + name = param-name.
    + value = param-value.
- super.getServletConfig(): lấy ra cấu hình của servlet:
    + getInitParameter(String s): lấy ra giá trị có cấu hình name = s.