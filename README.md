# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임에 대한 [요구사항](https://nextstep.camp/courses/-KtTrisFbiAQW0Sgo7SV/-KtTwBuUZ1LpPGD3vc8o/lessons)을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
  * 자신의 github 아이디에 해당하는 브랜치가 없는 경우 [브랜치 생성 요청]() 채널을 통해 브랜치 생성을 요청한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PR을 보낸다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 코드 리뷰 과정
* 1. 프로젝트를 자신의 계정으로 fork한다.
* 2. fork한 프로젝트를 자신의 컴퓨터로 clone한다.
```
git clone https://github.com/{본인_아이디}/{저장소 아이디}
ex) https://github.com/javajigi/java-racingcar
```
* 3. clone한 프로젝트 이동
```
cd {저장소 아이디}
ex) cd java-racingcar
```
* 4. original 저장소를 등록
```
git remote add upstream {original 저장소 URL}
ex) https://github.com/code-squad/java-racingcar
```
* 5. 본인 아이디로 브랜치를 만들기 위한 checkout
```
git checkout -t origin/본인_아이디
ex) git checkout -t origin/javajigi
```
* 6. 개발 시작
```
git pull upstream 본인_아이디 
git rebase upstream/본인_아이디
```

* 7. commit
```
git status //확인
git rm 파일명 //삭제된 파일
git add 파일명(or * 모두) // 추가/변경 파일
git commit -m "메세지" // 커밋
```
* 8. 본인 원격 저장소에 올리기
```
git push origin 본인_아이디
ex) git push origin mixed
```
* 9. pull request

* 코드 리뷰 전체 과정에 대한 [영상](https://youtu.be/ZSZoaG0PqLg)을 참고한다.