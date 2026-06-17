# 🔐 Java Servlet Login System

A Java Web Application implementing a complete 
**Login & Logout system** using Servlets, JSP, DAO pattern and MySQL.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Web Layer | Servlets, JSP |
| Database | MySQL |
| Pattern | DAO (Data Access Object) |
| IDE | Eclipse |

---

## 📂 Project Structure
src/main/java/

├── com/login/

│   ├── LoginServlet.java     → Handles login requests

│   └── LogoutServlet.java    → Handles logout requests

├── ConnectionFactory/

│   └── DBConnection.java     → MySQL database connection

└── LoginDao/

├── Login.java            → Login model

└── LoginDao.java         → Database operations
src/main/webapp/

├── Login.jsp                 → Login page UI

└── welcome.jsp               → Welcome page after login

---

## ✨ Features

- 🔐 User Login with MySQL validation
- 🚪 Logout functionality
- 🗄️ DAO pattern for clean code structure
- 🌐 JSP pages for frontend
- 🔌 MySQL database connectivity

---

## ⚙️ How to Run

1. Import project into **Eclipse IDE**
2. Set up **MySQL database**
3. Update credentials in `DBConnection.java`
4. Deploy on **Apache Tomcat** server
5. Open browser → `http://localhost:8080/LoginModule/Login.jsp`

---

## 👩‍💻 Developer

Made with ❤️ by [suma-dev-12](https://github.com/suma-dev-12)

