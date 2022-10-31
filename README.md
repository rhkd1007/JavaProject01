# JavaProject01

이 게임은 배스킨라빈스31 게임입니다.<br/>
게임 실행은 BaskinRobbins2.java 를 통해 콘솔창에서 할 수 있습니다.<br/>
"게임 시작"은 기본적인 배스킨라빈스31 게임을 즐길 수 있습니다.<br/>
"게임 점수"는 게임 종료 전까지 현재 이긴 횟수와 진 횟수를 확인 할 수 있습니다.<br/>
"게임 종료"는 게임을 종료하게 되며, 점수 또한 리셋 됩니다.<br/>
"다른 숫자로 게임 시작"은 31외에 다른 숫자로 게임을 즐길 수 있습니다.(규칙은 동일합니다.)

BaskinRobbinsGame.java를 통해 게임에 관한 코드를 확인 할 수 있습니다.

BaskinRobbins.java를 통해 클론코딩한 게임을 확인 할 수 있습니다.

JFrameTest.java를 통해 윈도우창으로 구현중인 것을 확인 할 수 있습니다.<br/>
현재 "게임 시작"은 콘솔창에서 실행이 되며, 창에서 바로 실행 수 있도록 구현 중입니다.<br/>
"게임 점수"및"다른 숫자"또한 구현 중입니다.<br/>
"다른 숫자","규칙 설명" 그리고 "전적 확인"은 클릭 하면 그에 관한 설명이 뜨며, 한번더 클릭하면 화면이 돌아옵니다.<br/>
"게임 종료"는 윈도우창이 닫힙니다.

MouseListener로 윈도우창에 이벤트들을 구현하려 했으나, 오류로 인해 ActionListener로 구현함으로써 아쉬움이 남습니다.<br/>
또한, 게임을 콘솔창이 아닌 윈도우창에서 실행하지 못하는 점도 앞으로 고쳐나갈 것 입니다.

이후, 개선점을 모두 해결한 후 플레이어를 늘려서 게임을 할 수 있게 구현할 예정이고,<br/>
네트워크 연결을 통해 컴퓨터가 아닌 다른 유저와 게임을 즐길 수 있도록 할 예정입니다.<br/>
DB와 연동하여 각 유저의 점수를 연동하고, 순위 또한 볼 수 있는 게임을 최종 목표로 하고 있습니다.

아래에는 제가 프로젝트를 진행하면서 참고한 사이트들을 기술해 놓았습니다.

클론코딩한 사이트<br/>
http://yoonbumtae.com/?p=540 <br/>
Java 예제: 배스킨라빈스 31 (먼저 31을 외치면 지는 게임)<br/>
글쓴이 yoonbumtae (BGSMM) 날짜 2019년 1월 7일

Java Swing 기초<br/>
https://k4keye.tistory.com/55?category=783810 

Java Swing Layout 참고<br/>
https://improver.tistory.com/153?category=621955
