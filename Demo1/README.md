# Jsp Servlet 1

- Khi tạo một đối tượng servlet mới thì hàm init() được gọi và đối tượng được lưu vào bộ nhớ heap cho đến khi gọi đến
  hàm destroy().
- Khi đối tượng servlet tồn tại trong heap thì hàm service() sẽ nhận các request từ client và trả về response cho
  client.
- tag servlet trong web.xml:
    + servlet-class: đường dẫn đến đối tượng servlet.
    + load-on-startup: khởi tạo đối tượng servlet ngay khi start server.
- tag servlet-mapping trong web.xml:
    + servlet-name: map với servlet-name của tag servlet.
    + url-pattern: đường dẫn tới servlet đó.