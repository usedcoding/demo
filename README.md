# demo
## 1차 요구사항 구현
- [x] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [x] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [x] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [x] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [x] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [x] 게시글 상세 페이지에는 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- (추가 기능이나 구현기능설명이 필요한 경우 서술)

## 미비사항 or 막힌 부분
- 제목과 내용에 작성 글이 없어도 게시글이 등록 되는 경우 해결 해야 한다.
- 어느 정도 구성은 생각 했지만 문법 적인 부분 등 디테일한 부분을 구글과 gpt등에 의존해서 만들었기 때문에 더 많은 공부가 필요
- 

## MVC 패턴
- Model veiw controller로 리펙토링 하는 것으로 기능 간의 의존성을 줄인다.

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- @RequiredArgsConstructor @Setter @Autowired

## JPA의 장점과 단점
    table 변화 등에 유연하게 대처 가능하지만, 안정성이 부족하다.
