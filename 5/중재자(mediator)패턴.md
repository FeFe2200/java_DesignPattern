여러 객체(Colleague)간의 상호 작용이 많고 이 작용들이 다른 Colleague에도 영향을 줄 때 주로 UI 프로그램에서 많이 사용하는 방법
Widget 상호간에 주과 받아야하는 메세지가 많은 경우, 이를 한 객체(Mediator)에서 전담하여 메세지를 처리하도록 함
N:N의 관계가 1:N으로 줄어드는 효과 (counselor)

하나의 컨트롤 타워를 만드다고 생각하면 편하다. 모든 소통은 컨트롤타워를 통하도록 하는 것.

옵저버 패턴과의 차이는 받기만 하는 것이 아닌 전송까지 포함하고 있다.

https://www.crocus.co.kr/1542

https://gitlab.com/easyspubjava/designpattern/-/blob/main/08/8-02/README.md