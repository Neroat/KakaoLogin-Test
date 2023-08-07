# Kakao 로그인 테스트 입니다.
```
프로젝트 시작 전 여러 기술들을 테스트 해보자 합니다.
```  

## 💻 Tech Stacks
---  
### BackEnd
`Java 17` `Gradle` `Spring Boot`

## 👨‍👨‍👧‍👧 Members
--- 

### BackEnd
|김광현| 
|------| 
|[Neroat](https://github.com/Neroat)
  

## application.yml 추가 해야합니다.  

```
server:
  port: 서버포트


# developers.kakao에서 Application 등록후 REST API 키와, RedirectURL이 필요
kakao:
  authUrl: https://kauth.kakao.com/oauth/token
  userApiUrl: https://kapi.kakao.com/v2/user/me
  restapiKey: RESTAPI KEY
  redirectUrl: RedirectURL

logging:
  level:
    com.example.kakaologin: debug

```


### 위와 같은 양식으로 작성해주면 됩니다.
