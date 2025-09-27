# Api Access Via JWT Token

---

## ⚡ Features Implemented

- **JWT Token Generation**  
  Generates a JWT token on successful login with a username/password.

- **JWT Token Validation**  
  Validates the JWT token for protected endpoints.

- **Spring Security Integration**  
  Secures APIs using Spring Security filters.

- **Sample Endpoint**
    - `/hello` → a protected endpoint returning a greeting.

---

## 🔧 How to Run

1. **Build the project** using Maven wrapper:

```bash
./mvnw clean install
```
Once the application starts, you can call the login API:

http://localhost:8080/auth/login?username=user1&password=pass

This will return a **JWT token** as part of the response.  

You can then use this token to call the protected endpoint:

```bash
curl -H "Authorization: Bearer <token>" http://localhost:8080/hello

