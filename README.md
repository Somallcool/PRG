# PRG
Post Redirect Get

# 📝 My Todo Web Project

Java Servlet과 JSP를 활용하여 만든 백엔드 중심의 Todo 관리 웹 어플리케이션입니다.

## 🚀 기술 스택
- **Language:** Java 11
- **Framework:** Java Servlet, JSP (JSTL)
- **Database:** Oracle DB
- **Tool:** IntelliJ IDEA, Tomcat 9.0

## ✨ 주요 구현 내용

### 1. 디자인 및 레이아웃 (CSS)
- **테마:** `Antiquewhite` 배경과 `Darkgoldenrod` 포인트를 사용한 고급스러운 테마 적용
<img width="954" height="938" alt="image" src="https://github.com/user-attachments/assets/e900e7a1-01dc-4c40-96be-2146cb7ce14a" />

- **레이아웃:** `Flexbox`를 활용하여 모든 요소의 중앙 정렬 및 반응형 버튼 구현
<img width="955" height="937" alt="image" src="https://github.com/user-attachments/assets/03367604-9cb2-41d1-8d99-248d4af1b31f" />

- **인터랙션:** `transition`과 `hover` 효과를 이용해 사용자 피드백 강화
<img width="955" height="936" alt="image" src="https://github.com/user-attachments/assets/3dfb5c16-bc27-42ed-b8d2-0da8df714dd9" />
<img width="955" height="938" alt="image" src="https://github.com/user-attachments/assets/54440932-109c-4260-8506-240e7d417fe1" />
<img width="953" height="936" alt="image" src="https://github.com/user-attachments/assets/e880b15b-f9ac-41df-9a9b-3270d3c08d4f" />

### 2. 백엔드 로직
- **PRG 패턴 적용:** 등록(Post) 후 리다이렉트(Redirect)하여 조회(Get)로 유도함으로써 새로고침 시 중복 데이터 등록 문제 해결
- **MVC 아키텍처:** Servlet(Controller), Service, DTO, VO의 역할을 분리하여 유지보수성 향상
- **인코딩 설정:** UTF-8 설정을 통해 브라우저와 로그창에서의 한글 깨짐 현상 해결

## 💡 개발 중 마주한 문제와 해결 (Trouble Shooting)
- **문제:** 톰캣 로그에서 한글이 깨지는 디버깅 이슈
- **해결:** `VM options`에 `-Dfile.encoding=UTF-8`을 추가하여 인코딩 일치화 및 doPost 메서드 내 request, response 내 setCharacterEncoding("UTF-8"); 개별 적용
- **문제:** `h1` 태그에 테두리를 설정했을 때 화면 끝까지 늘어나는 현상
- **해결:** 블록 요소의 특징을 이해하고 `display: inline-block`을 적용하여 해결

---
*이 프로젝트는 백엔드 개발자로서 기초를 다지기 위해 제작되었습니다.*
