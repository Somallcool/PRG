# 📝 PRG(Post Redirect Get) Study(feat. Session Login)
> 코드는 master 브랜치에 넣어두었습니다.

Java Servlet과 JSP, html을 활용하여 만든 백엔드 중심의 CRUD 웹 어플리케이션입니다.

<br>

---

## 🚀 기술 스택
- **Language:** Java 11
- **Framework:** Java Servlet, JSP (JSTL)
- **Security:** Session-based Authentication, Servlet Filter
- **Database:** Oracle DB
- **Tool:** IntelliJ IDEA, Tomcat 9.0

<br>

---

## ✨ 주요 구현 내용

### 1️⃣ 인증 및 보안 시스템 (Security)
- **세션 기반 인증:** `HttpSession`을 활용하여 사용자 로그인 정보를 서버에 안전하게 보관하고, JSTL을 통해 로그인 상태에 따른 동적 UI를 구현했습니다.
- **보안 필터(Filter):** `Servlet Filter`를 구현하여 로그인을 하지 않은 사용자가 `/todo/*` 경로(리스트, 등록 등)에 접근할 경우 자동으로 로그인 페이지로 리다이렉트하는 접근 제어 로직을 적용했습니다.

<br>

---

### 2️⃣ 백엔드 로직
- **PRG 패턴 적용:** 등록(Post) 후 리다이렉트(Redirect)하여 조회(Get)로 유도함으로써 새로고침 시 중복 데이터 등록 문제 해결
- **MVC 아키텍처:** Servlet(Controller), Service, DTO, VO의 역할을 분리하여 유지보수성 향상
- **인코딩 설정:** UTF-8 설정을 통해 브라우저와 로그창에서의 한글 깨짐 현상 해결

<br>

---

### 3️⃣ 디자인 및 레이아웃 (CSS)
- **Flexbox 레이아웃:** `Antiquewhite` 배경과 `Darkgoldenrod` 포인트를 사용한 테마를 적용하고, 모든 요소를 중앙 정렬하여 시각적 안정감을 주었습니다.
<img width="1915" height="985" alt="image" src="https://github.com/user-attachments/assets/1782c016-99ad-447e-8f68-626c9193e1b5" />
<br>
<img width="1916" height="986" alt="image" src="https://github.com/user-attachments/assets/d5e95f4f-fd29-4ca8-a070-27c897a2f649" />
<br>
<img width="1914" height="984" alt="image" src="https://github.com/user-attachments/assets/beab0e00-840c-4039-8b6f-47391a783864" />
<br>
<br>
- **인증 연동 메뉴:** 로그인 전(LOGIN/JOIN)과 로그인 후(LOGOUT/REGISTER/LIST)의 메뉴 구성을 동적으로 처리했습니다.
- <img width="1913" height="984" alt="image" src="https://github.com/user-attachments/assets/b676439f-8d2e-4c5c-83c7-0019da11fc0b" />
<br>
<img width="1916" height="987" alt="image" src="https://github.com/user-attachments/assets/df9a721a-2f7d-428e-a457-5535faee2194" />

<br>

---

## 💡 개발 중 마주한 문제와 해결 (Trouble Shooting)
### 1️⃣ IntelliJ Community 버전의 필터 인식 및 404 에러
- **문제:** `@WebFilter` 어노테이션이 정상적으로 로드되지 않아 보안 필터링이 무시되는 현상 발생.
- **해결:** `web.xml`에 필터를 수동으로 등록하여 해결. 이 과정에서 패키지 경로(`filter-class`)의 미세한 공백 오타가 서버 배포 실패(404 에러)를 유발함을 인지하고 전수 조사하여 수정 완료.

### 2️⃣ 톰캣 서버 한글 깨짐 이슈
- **문제:** 로그 창 및 데이터 전송 시 한글이 깨지는 현상.
- **해결:** 인텔리제이 VM Options에 `-Dfile.encoding=UTF-8` 추가 및 서블릿 내 `setCharacterEncoding("UTF-8")` 명시적 적용.

### 3️⃣ 보안을 위한 페이지 직접 접근 제한
- **문제:** 사용자가 URL을 통해 HTML 파일에 직접 접근하여 비즈니스 로직을 우회할 우려.
- **해결:** 모든 View 파일을 `WEB-INF` 폴더 하위로 이동시켜 브라우저의 직접 접근을 차단하고, 서블릿의 `forward`를 통해서만 페이지가 열리도록 설계.

<br>

---

*이 프로젝트는 백엔드 개발자로서 기초를 다지기 위해 제작되었습니다.*
